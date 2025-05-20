package bicolaArreglos;

public class BicolaARestrin {
	private int[] arreglo;
	private int frente, fin, tamanio;
	
	public BicolaARestrin(int capacidad) {
		this.arreglo = new int[capacidad];
		this.frente = -1;
		this.fin = -1;
		this.tamanio = capacidad;
	}
	
	//Comprobar si la cola está llena
	public boolean estaVacia() {
		return frente == -1;
	}
	
	//Comprobar si la cola está vacía
	public boolean estaLlena() {
		return (fin + 1) % tamanio == frente;
	}
	
	//Insertar nodo al final
	public void insertarFinal(int dato) throws Exception{
		if(estaLlena()) { //Si está llena, no se pueden ingresar más datos en la bicola
			throw new Exception("La bicola está llena.");
		}
		
		if(estaVacia()) { 
			frente = fin = 0; //si está vacía, fin y frente son la primera casilla del arreglo
		}else {
			fin = (fin + 1) % tamanio; //si está con nodos adentro, se usa esta fórmula para mostrar el índice en donde se tiene que llenar
		}
		arreglo[fin] = dato; //insertamos el dato en el índice sacado anteriormente
		System.out.println("Insertado al final: " + dato);
	}
	
	//Eliminar nodo del frente
	public int eliminarFrente() throws Exception{
		if(estaVacia()) { //Si la bicola está vacía no se puede eliminar nada
			throw new Exception("La bicola está vacía"); //
		}
		
		int valor = arreglo[frente]; //guardamos el valor de frente
		if(frente == fin) { //Si solo hay un elemento en la cola
			frente = fin = -1; //Mandamos frente y fin igual a -1 para indicar que no hay elementos en la cola (eliminación lógica)
		}else {
			frente = (frente + 1) % tamanio; //usamos esta fórmula para recorrer un nodo a la derecha y eliminar lógicamente a ese nodo.
		}
		System.out.println("Eliminado del frente: " + valor);
		return valor; //retornamos el valor que se ha eliminado
	}
	
	//Eliminar nodo del final
	public int eliminarFinal() throws Exception{
		if(estaVacia()) {
			throw new Exception("La bicola está vacía."); //Si la cola está vacía no se pueden borrar elementos
		}
		
		int valor = arreglo[fin]; //guardamos el valor del fin
		if(frente == fin) { //si solo hay un nodo
			frente = fin = -1; //ponemos los valores frente y fin igual a -1 para indicar que no hay elementos en la cola (eliminación lógica)
		}else {
			fin = (fin -1 + tamanio) % tamanio; //usamos esta fórmula para recorrer espacios a la izquierda y eliminar lógicamente a ese nodo
		}
		System.out.println("Eliminiado del final: " + valor);
		return valor; //retornamos el valor que se ha eliminado
	}
	
	//Imprimir cola
	public void mostrar() {
		if(estaVacia()) {
			System.out.println("La bicola está vacía."); //si la bicola está vacía no se puede imprimir nada
			return;
		}
		
		System.out.println("Contenido de la bicola: ");
		int i = frente; //usamos un auxiliar i igualado a frente para que vaya recorriendo toda la cola
		while(true) { //ciclo infinito hasta que algo (break) lo detenga
			System.out.print("[" + arreglo[i] + "] ");
			if(i == fin) break; //si i llega a la posición fin, se termina el ciclo
			i = (i + 1) % tamanio; //si no, se sigue usando la fórmula para recorrer a la derecha
		}
	}
}
