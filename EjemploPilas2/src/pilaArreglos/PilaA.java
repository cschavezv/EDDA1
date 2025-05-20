package pilaArreglos;

public class PilaA {
	private NodoA[] pila;
	private int cima, tamanio;
	
	public PilaA(int tamanio) {
		this.cima = -1;
		this.tamanio = tamanio;
		this.pila = new NodoA[tamanio];
	}
	
	public boolean esVacia() {
		return cima == -1;
	}
	
	//Está llena la pila?
	public boolean estaLlena() {
		return cima == tamanio - 1;
	}
	
	//Ingresar datos
	public void push(int dato) {
		if(estaLlena()) {
			System.out.println("La pila está llena, no se pueden ingresar más datos.");
		}else {
			cima++;
			pila[cima] = new NodoA(dato);
			pila[cima].dato = dato;
		}
	}
	
	//Borrar datos
	public void pop() {
		if(esVacia()) {
			System.out.println("Pila vacía. No se pueden borrar datos");
		}else {
			System.out.println("Se ha eliminado el dato " + pila[cima].dato);
			pila[cima] = null;
			cima--;
		}
	}
	
	//Primer elemento
	public void primerElemento() {
		if(esVacia()) {
			System.out.println("Pila vacía, no hay un primer elemento");
		}else {
			System.out.println("El primer dato de la pila es " + pila[cima].dato);
		}
	}
	
	//Vaciar pila
	public void vaciarPila() {
		if(esVacia()) {
			System.out.println("Pila vacía. No se pueden borrar los elementos");
		}else {
			while(cima != -1) {
				pop();
			}
		}
	}
	
	//Imprimir pila
	public void imprimir() {
		if(esVacia()) {
			System.out.println("Pila vacía. No hay elementos para imprimir");
		}else {
			for(int i = cima; i >= 0; i--) {
				System.out.println("[" + pila[i].dato + "]");
			}
		}
	}
}
