package Ejercicio3;

import java.util.Random;

public class Pila {
	Nodo cima;
	Random rd = new Random();

	public Pila() {
		this.cima = null;
	}
	
	public boolean estaVacia() {
		return cima == null;
	}
	
	public void push() {
		Nodo nuevo = new Nodo(rd.nextInt(0, 101));
		if(estaVacia()) {
			System.out.println("Ingresando el primer nodo...");
			cima = nuevo;
		}else {
			nuevo.siguiente = cima;
			cima = nuevo;
		}
	}
	
	private void pop() {
		if(!estaVacia()) {
			cima = cima.siguiente;
		}else {
			System.out.println("Pila vacía, no se pueden borrar nodos");
		}
	}
	
	public void vaciar(Pila pila) {
		if(pila.cima == null) {
			return;
		}else {
			pila.pop();
			vaciar(pila);
		}
	}
	
	public void mostrar() {
		if(!estaVacia()) {
			Nodo aux = cima;
			System.out.println("Pila:");
			while(aux != null) {
				System.out.println("[" + aux.numero + "]");
				aux = aux.siguiente;
			}
		}else {
			System.out.println("Pila vacía, no se pueden mostrar elementos.");
		}
	}
}
