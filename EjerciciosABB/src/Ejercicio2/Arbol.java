package Ejercicio2;

import Ejercicio2.NodoArbol;

public class Arbol {
	private NodoArbol inicial;
	private boolean eliminado = false;
	
	/**
     * Inserta un nuevo valor en el árbol.
     * @param valor Valor a insertar.
     */
    public void Insertar(int valor) {
    	inicial = InsertarRec(inicial, valor);
    }

    private NodoArbol InsertarRec(NodoArbol nodo, int valor) {
        if (nodo == null) return new NodoArbol(valor);

        if (valor < nodo.valor) {
            nodo.izquierdo = InsertarRec(nodo.izquierdo, valor);
        } else {
            nodo.derecho = InsertarRec(nodo.derecho, valor);
        }

        return nodo;
    }

    /**
     * Verifica si un valor existe en el árbol.
     * @param valor Valor a buscar.
     * @return true si existe, false en caso contrario.
     */
    public boolean Buscar(int valor) {
        return BuscarRec(inicial, valor);
    }

    private boolean BuscarRec(NodoArbol nodo, int valor) {
        if (nodo == null) return false;
        if (valor == nodo.valor) return true;
        return valor < nodo.valor
            ? BuscarRec(nodo.izquierdo, valor)
            : BuscarRec(nodo.derecho, valor);
    }
    
    /**
     * Elimina un valor del árbol.
     * @param valor Valor a eliminar.
     */
    public void Eliminar(int valor) {
        inicial = EliminarRec(inicial, valor); //En tal caso de "eliminar" la raíz se apunta al nuevo nodo (dudas)
    }

    private NodoArbol EliminarRec(NodoArbol nodo, int valor) {
    	//System.out.println("imprimiendo nodo.derecho valor: " + nodo.valor + ", " + valor);
        if (nodo == null) return null; //Se ha llegado a un nodo hoja sin encontrar el valor

        if (valor < nodo.valor) { //Si el valor a eliminar es menor al del nodo actual se busca por la rama izquierda
            nodo.izquierdo = EliminarRec(nodo.izquierdo, valor); //En caso de una eliminación se conecta el nodo.izquierdo al nodo que retorne la llamada recursiva
        } else{ 
        	
        	if (valor > nodo.valor) { //Si el valor a eliminar es mayor al del nodo actual se busca por la rama derecha
        		nodo.derecho = EliminarRec(nodo.derecho, valor); //En caso de una eliminación se conecta el nodo.derecho al nodo que retorne la llamada recursiva
        	} else { //Si el valor coincide hay entra a este bloque
            // Caso: nodo sin hijos o un solo hijo
            if (nodo.izquierdo == null) return nodo.derecho; //Quiere decir que el nodo tiene solo un nodo derecho o no tiene hijos (retorna el nodo o null)
            if (nodo.derecho == null) return nodo.izquierdo; //Quiere decir que el nodo tiene solo un nodo izquierdo o no tiene hijos (retorna el nodo o null) 
            //Esto retorna el valor a la llamada recursiva por lo que se conecta con el árbol
            
            
            // Caso: nodo con dos hijos
            NodoArbol sucesor = Minimo(nodo.derecho); //Se busca el nodo más pequeño del subárbol derecho (sucesor)
            nodo.valor = sucesor.valor; //Se copia el valor del nodo sucesor en el nodo actual
            //System.out.println("valor de nodo.derecho que envío a eliminar: " + nodo.valor); 
            nodo.derecho = EliminarRec(nodo.derecho, sucesor.valor); //Se elimina ese nodo sucesor con otra llamada recursiva y lo conectamos al nodo derecho
            
        	}
        }
        return nodo; //Retorna un nodo para la siguiente llamada recursiva o para la llamada final
    }

    /**
     * Retorna el valor mínimo del árbol.
     * @return Valor mínimo.
     * @throws RuntimeException si el árbol está vacío.
     * método público que da el valor mínimo (un int).
     */
    public int Minimo() {
        if (inicial == null) throw new RuntimeException("Árbol vacío");
        //Minimo(inicial) obtiene una referencia al nodo mínimo, no el entero del valor.
        return Minimo(inicial).valor;
    }
    
    /**
     * método privado recursivo que da el nodo mínimo (NodoArbol).
     * @param nodo: es el nodo.derecho del nodo a eliminar
     * @return nodo mínimo (NodoArbol)
     */
    private NodoArbol Minimo(NodoArbol nodo) {
    	//System.out.println("Nodo......................: " + nodo.valor);
    	while (nodo.izquierdo != null) {
        	//System.out.println("Valor de nodo.izq: " + nodo.valor + ", ");
            nodo = nodo.izquierdo;
        }
        return nodo;
    }

    /**
     * Retorna el valor máximo del árbol.
     * @return Valor máximo.
     * @throws RuntimeException si el árbol está vacío.
     */
    public int Maximo() {
        if (inicial == null) throw new RuntimeException("Árbol vacío");
        NodoArbol actual = inicial;
        while (actual.derecho != null) {
            actual = actual.derecho;
        }
        return actual.valor;
    }

    /**
     * Verifica si el árbol está vacío.
     * @return true si está vacío, false en caso contrario.
     */
    public boolean EstaVacio() {
        return inicial == null;
    }

    /**
     * Retorna la cantidad de nodos del árbol.
     * @return Número de nodos.
     */
    public int Tamaño() {
        return TamañoRec(inicial);
    }

    private int TamañoRec(NodoArbol nodo) {
        if (nodo == null) return 0;
        return 1 + TamañoRec(nodo.izquierdo) + TamañoRec(nodo.derecho);
    }

    /**
     * Recorrido InOrder.
     */
    public void InOrden() {
        System.out.println("\nRecorrido In-Orden: ");
    	InOrdenRec(inicial);
        System.out.println();
    }

    private void InOrdenRec(NodoArbol nodo) { //I-R-D
        if (nodo != null) { //Si el nodo no es hoja
            InOrdenRec(nodo.izquierdo); //Recorremos hasta el nodo más izquierdo del árbol
            System.out.print(nodo.valor + " "); //Cuando la llamada recursiva llegue aquí se imprime el nodo
            InOrdenRec(nodo.derecho); //Una vez impreso el nodo raíz se recorre el nodo derecho
        }
      //El método se va llamando a sí mismo hasta llegar a un punto en donde el nodo actual es null, ahí empieza a retornar a sus llamadas recursivas anteriores
    }
    
    /**
     * Recorrido PreOrder.
     */
    public void PreOrden() {
    	System.out.println("\nRecorrido Pre-Orden: ");
        PreOrdenRec(inicial);
        System.out.println();
    }

    private void PreOrdenRec(NodoArbol nodo) { //R-I-D
        if (nodo != null) { 
            System.out.print(nodo.valor + " "); //Se imprime el nodo actual (empieza por la raíz)
            PreOrdenRec(nodo.izquierdo); //Llamada recursiva para recorrer el nodo izquierdo
            PreOrdenRec(nodo.derecho); //Llamada recursiva para recorre el nodo derecho
        }
        //El método se va llamando a sí mismo hasta llegar a un punto en donde el nodo actual es null, ahí empieza a retornar a sus llamadas recursivas anteriores
    }

    /**
     * Recorrido PostOrder.
     */
    public void PostOrden() {
    	System.out.println("\nRecorrido Post-Orden: ");
    	PostOrdenRec(inicial);
        System.out.println();
    }

    private void PostOrdenRec(NodoArbol nodo) { //I-D-R
        if (nodo != null) {
            PostOrdenRec(nodo.izquierdo); //Recorremos hasta el nodo más izquierdo del árbol
            PostOrdenRec(nodo.derecho); //Se recorre el nodo derecho una vez ya recorrido el izquierdo
            System.out.print(nodo.valor + " "); //Se imprime el nodo actual
        }
      //El método se va llamando a sí mismo hasta llegar a un punto en donde el nodo actual es null, ahí empieza a retornar a sus llamadas recursivas anteriores
    }
    
    private int calcularLCI(NodoArbol nodo, int profundidad) { //Suma de las longitudes de los nodos internos (No nodos hoja)
    	if(nodo == null) return 0; //Si llegamos a null se retorna 0
    	
    	if(nodo.izquierdo == null && nodo.derecho == null) { //Si ambos brazos del nodo apuntan a null (es decir, es nodo hoja)
    		return 0; //Los nodos hoja no suman nada
    	}
    	return profundidad + calcularLCI(nodo.izquierdo, profundidad + 1) + calcularLCI(nodo.derecho, profundidad + 1);
    	//Sumamos la profundidad de la raíz (1) + llamada recursiva para que recorra el subárbol izquierdo (profunidad aumenta en cada nivel) +
    	//llamada recursiva para que recorra el subárbol derecho (profunidad aumenta en cada nivel)
    }
    
    private int calcularLCE(NodoArbol nodo, int profundidad) { //Suma de las longitudes de los nodos externos (Nodos hoja)
    	if(nodo == null) return 0; //Si llegamos a null se retorna 0
    	
    	if(nodo.izquierdo == null && nodo.derecho == null) { //Si ambos brazos del nodo apuntan a null (es decir, es nodo hoja)
    		return profundidad; //Los nodos hoja suman la profundidad y la retornan para la llamada recursiva
    	}
    	return calcularLCE(nodo.izquierdo, profundidad + 1) + calcularLCE(nodo.derecho, profundidad + 1);
    	//(Ya no se toma en cuenta la profundidad de la raíz = 0) + llamada recursiva para que recorra el subárbol izquierdo (profunidad aumenta en cada nivel) +
    	//llamada recursiva para que recorra el subárbol derecho (profunidad aumenta en cada nivel)
    }
    
    public void LCI() {
    	System.out.println("El LCI del árbol es: " + 
    	calcularLCI(inicial, 1) //Empezamos desde la raíz con profundidad 1
    	);
    }
    
    public void LCE() {
    	System.out.println("El LCE del árbol es: " + 
    	    	calcularLCE(inicial, 1) //Empezamos desde la raíz con profundidad 1
    	    	);
    }
}
