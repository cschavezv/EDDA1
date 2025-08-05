package ABB;

public class ArbolBinario {
	Nodo inicial;
	int nivel = 0;
	
	public void insertar(int valor) {
		inicial = insertarNodo(inicial, valor);
		System.out.println("\nSe ha añadido el nodo " + valor);
	}
	
	public void buscar(int valor) {
		nivel = 0;
		if(buscarNodo(inicial ,valor)) {
			System.out.println("\nNodo encontrado en el nivel " + nivel);
		}else {
			System.out.println("\nNodo no encontrado");
		}
	}
	
	public void eliminar(int valor) {
		inicial = eliminarNodo(inicial, valor);
	}
	
	public void recorridos() {
		System.out.println("\nRecorrido Pre-Orden: ");
		preOrden(inicial);
		System.out.println("\nRecorrido In-Orden: ");
		inOrden(inicial);
		System.out.println("\nRecorrido Post-Orden: ");
		postOrden(inicial);
	}
	
	private Nodo insertarNodo(Nodo nodo, int valor) {
		if(nodo == null) return new Nodo(valor);
		
		if(valor < nodo.valor) {
			nodo.izquierdo = insertarNodo(nodo.izquierdo, valor);
		}else {
			nodo.derecho = insertarNodo(nodo.derecho, valor);
		}
		
		return nodo;
	}
	
	private boolean buscarNodo(Nodo nodo, int valor) {
		if(nodo == null) return false;
		if(valor == nodo.valor) return true;
		nivel++;
		return (valor < nodo.valor)? buscarNodo(nodo.izquierdo, valor):buscarNodo(nodo.derecho, valor);
	}
	
	private Nodo eliminarNodo(Nodo nodo, int valor) {
		if(nodo == null) return null;
		
		if(valor < nodo.valor) {
			nodo.izquierdo = eliminarNodo(nodo.izquierdo, valor);
		}else if(valor > nodo.valor) {
			nodo.derecho = eliminarNodo(nodo.derecho, valor);
		}else {
			//Caso: nodo sin hijos o un solo hijo
			if(nodo.izquierdo == null) return nodo.derecho;
			if(nodo.derecho == null) return nodo.izquierdo;
			
			//Caso: nodo con dos hijos
			Nodo sucesor = minimoSubarbolDerecho(nodo.derecho);
			nodo.valor = sucesor.valor;
			nodo.derecho = eliminarNodo(nodo.derecho, sucesor.valor);
		}
		return nodo;
	}
	
	private Nodo minimoSubarbolDerecho(Nodo nodo) {
		while(nodo.izquierdo != null) {
			nodo = nodo.izquierdo;
		}
		return nodo;
	}
	
	//Recorridos
	private void preOrden(Nodo nodo) { //R-I-D
		if(nodo != null) {
			System.out.print(nodo.valor + " ");
			preOrden(nodo.izquierdo);
			preOrden(nodo.derecho);
		}
	}
	
	private void inOrden(Nodo nodo) { //I-R-D
		if(nodo != null) {
			inOrden(nodo.izquierdo);
			System.out.print(nodo.valor + " ");
			inOrden(nodo.derecho);
		}
	}
	
	private void postOrden(Nodo nodo) { //I-D-R
		if(nodo != null) {
			postOrden(nodo.izquierdo);
			postOrden(nodo.derecho);
			System.out.print(nodo.valor + " ");
		}
	}
}
