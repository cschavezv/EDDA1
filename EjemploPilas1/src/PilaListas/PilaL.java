package PilaListas;

public class PilaL {
	private NodoL cima, aux;

	public PilaL() {
		this.cima = null;
	}
	
	//Es vacía?
	public boolean esVacia() {
		return cima == null;
	}
	
	//Insertar elemento
	public void push(int dato) {
		NodoL nuevo = new NodoL(dato);
		nuevo.siguiente = cima;
		cima = nuevo;
	}
	
	public void pop() {
		if(esVacia()) {
			System.out.println("Pila vacia. No se puede eliminar un elemento");
		}else {
			int dato = cima.dato;
			cima = cima.siguiente;
			System.out.println("Dato " + dato + " eliminado");
		}
	}
	
	//Mostrar elementos de la pila
	public void imprimir() {
		if(esVacia()) {
			System.out.println("Lista vacía. No se puede imprimir nada.");
		}else {
			aux = cima;
			while(aux != null) {
				System.out.println("[" + aux.dato + "]");
				aux = aux.siguiente;
			}
		}
	}
	
	public void primerElementoCima() {
		if(esVacia()) {
			System.out.println("Lista vacia. No hay elementos en la cima.");
		}else {
			System.out.println("El dato de la cima es " + cima.dato);
		}
	}
	
	public void limpiarPila() {
		if(esVacia()) {
			System.out.println("La lista ya está vacía.");
		}else {
			while(cima != null) {
				pop();
			}
		}
	}
}
