package ABB;

public class Arbol {
	NodoArbol inicial;
	
	public boolean estaVacio() {
		return inicial == null;
	}
	
	//Insertar un árbol sin recursividad (es como usar una lista doble pero viendo si tiene que ir a la izquierda o a la derecha)
	public void insertarNodo(int valor) {
		NodoArbol nuevo = new NodoArbol(valor);
		NodoArbol aux = inicial;
		if(estaVacio()) {
			inicial = nuevo;
		}else {
			while(true) { //creamos un ciclo para que recorra el subárbol correspondiente y se coloque el nodo donde es debido
				if(valor < aux.valor) { //Si el valor es menor al valor de la raiz se recorre subárbol izquierdo
					if(aux.izquierdo == null) {
						nuevo = aux.izquierdo;
						break;
					}
					aux = aux.izquierdo;
				}else { //Si no, se recorre subárbol derecho
					if(aux.derecho == null) {
						nuevo = aux.derecho;
						break;
					}
					aux = aux.derecho;
				}
			}
		}
	}
	
	//Insertar recursivo
	public NodoArbol insertarRec(NodoArbol nodo, int valor) {
		if(nodo == null) return new NodoArbol(valor); //Si el árbol está vacío se crea un nuevo nodo y se retorna, o, si ese espació apunta a null se crea el nodo
		
		if(valor < nodo.valor) { //Si es menor se va a la izquierda
			nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
		}else { //Si es mayor o igual se va a la derecha
			nodo.derecho = insertarRec(nodo.derecho, valor);
		}
		return nodo;
	}
	
	//Buscar recursivo
	public boolean buscarRec(NodoArbol nodo, int valor) {
		if (nodo == null) return false; //Si el nodo.izquierdo o nodo.derecho o nodo inicial es null, se retorna false. En pocas, si se llegó al final y no se
		//encontró nadota
		if (valor == nodo.valor) return true; //Si los valores coinciden se retorna true
		
		return (valor < nodo.valor)? buscarRec(nodo.izquierdo, valor):buscarRec(nodo.derecho, valor); //Con esto se ve si se retorna la llamada recursiva para
		//el subárbol derecho o izquierdo
	}
	
	//Eliminar recursivo (LA MUERTE)
	public NodoArbol eliminarRec(NodoArbol nodo, int valor) {
		if(nodo == null) return null; //Si está vacío pss se retorna null
		
		//Este bloque empieza a buscar el valor dependiendo del valor, si no se encuentra no entra al siguiente bloque
		if(valor < nodo.valor) {
			//Recorrer subárbol izquierdo
			nodo.izquierdo = eliminarRec(nodo.izquierdo, valor);
		}else {
			if(valor > nodo.valor) {
				nodo.derecho = eliminarRec(nodo.derecho, valor);
			}else { //Una vez encontrado (valor == nodo.valor) entramos a los diferentes casos:
				//Caso 1: Eliminar un nodo hoja o nodo con un solo hijo
				if(nodo.izquierdo == null) return nodo.derecho;
				if(nodo.derecho == null) return nodo.izquierdo;
				
				//Caso 2: Eliminar un nodo con dos hijos (incluye nodo raíz) usando el sucesor o nodo con el valor más pequeño del subárbol derecho
				int sucesor = sucesor(nodo.derecho);
				nodo.valor = sucesor;
				nodo.derecho = eliminarRec(nodo.derecho, sucesor);
			}
		}
		return nodo;
	}
	
	private NodoArbol minimo(NodoArbol nodo) { //En el parámetro se va a mandar nodo.derecho para buscar del subárbol derecho
		while(nodo.izquierdo != null) {
			nodo = nodo.izquierdo;
		}
		return nodo;
	}
	
	public int sucesor(NodoArbol nodo) {
		if(inicial == null) throw new RuntimeException("Árbol vacío");
		return minimo(nodo).valor;
	}
	
	//Recorridos
	public void preOrden(NodoArbol nodo) { //R-I-D
		if(nodo != null) {
			System.out.println(nodo.valor + " ");
			preOrden(nodo.izquierdo);
			preOrden(nodo.derecho);
		}
	}
	
	
	public void inOrden(NodoArbol nodo) { //I-R-D
		if(nodo != null) {
			preOrden(nodo.izquierdo);
			System.out.println(nodo.valor + " ");
			preOrden(nodo.derecho);
		}
	}
	
	public void postOrden(NodoArbol nodo) { //I-D-R
		if(nodo != null) {
			preOrden(nodo.izquierdo);
			preOrden(nodo.derecho);
			System.out.println(nodo.valor + " ");
		}
	}
	
	//LCE y LCI
	public int calcularLCI(NodoArbol nodo, int profundidad) {
		if(nodo == null) return 0;
		
		if(nodo.izquierdo == null && nodo.derecho == null) {
			return 0;
		}
		
		return profundidad + calcularLCI(nodo.izquierdo, 1 + profundidad) + calcularLCI(nodo.derecho, 1 + profundidad);
	}
	
	public int calcularLCE(NodoArbol nodo, int profundidad) {
		if(nodo == null) return 0;
		
		if(nodo.izquierdo == null && nodo.derecho == null) {
			return profundidad;
		}
		
		return calcularLCE(nodo.izquierdo, 1 + profundidad) + calcularLCE(nodo.derecho, 1 + profundidad);
	}
}
