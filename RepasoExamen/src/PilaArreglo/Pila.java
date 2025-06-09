package PilaArreglo;

public class Pila {
	private Nodo[] pila;
	private int cima, tamanio;
	
	public Pila(int tamanio) {
		this.pila = new Nodo[tamanio]; //crear pila arreglo
		this.cima = -1;
		this.tamanio = tamanio;
	}
	
	public boolean estaVacia() {
		return cima == -1;
	}
	
	public boolean estaLlena() {
		return cima == tamanio - 1;
	}
	
	public void push(int dato) {
		if(estaLlena()) {
			System.out.println("Pila llena. No se pueden añadir más nodos");
			return;
		}else {
			Nodo nuevo = new Nodo(dato);
			cima++;
			pila[cima] = nuevo;
		}
	}
	
	public void pop() {
		if(estaVacia()) {
			System.out.println("Pila vacía. No se pueden quitar nodos.");
			return;
		}else {
			cima--;
		}
	}
	
	public void obtenerElementoCima() {
		if(estaVacia()) {
			System.out.println("Pila vacía. No hay elementos en la cima");
		}else {
			System.out.println("El elemento de la cima es " + pila[cima].dato);
		}
	}
	
	public void limpiarPila() {
		if(cima == -1) {
			System.out.println("Pila completamente vacía.");
			return;
		}else {
			while(cima != -1) {
				pop();
			}
		}
	}
	
	public void tamanioPila() {
		System.out.println("Tamaño actual de la pila " + (cima + 1));
		System.out.println("Tamaño máximo de la pila " + pila.length);
	}
	
	public void mostrarPila() {
		int aux = cima;
		if(estaVacia()) {
			System.out.println("Pila vacía. No se pueden mostrar datos.");
		}else {
			while(aux != -1) {
				System.out.println("[" + pila[aux].dato + "]");
				aux--;
			}
		}
	}
}
