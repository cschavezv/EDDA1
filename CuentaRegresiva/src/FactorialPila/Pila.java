package FactorialPila;

public class Pila {
	private Nodo cima;

	public Pila() {
		this.cima = null;
	}
	
	public boolean estaVacia() {
		return cima == null;
	}
	
	public void push(int dato) {
		Nodo nuevo = new Nodo(dato);
		nuevo.siguiente = cima;
		cima = nuevo;
	}
	
	public int pop() {
		if(estaVacia()) {
			System.out.println("No hay datos en la pila");
			return -1;
		}
		int valorCima = peek();
		cima = cima.siguiente;
		return valorCima;
	}
	
	public int peek() {
		if(estaVacia()) {
			System.out.println("Pila vacía");
			return -1;
		}
		return cima.dato;
	}
}
