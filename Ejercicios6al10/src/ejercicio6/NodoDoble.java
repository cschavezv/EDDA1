package ejercicio6;

public class NodoDoble {
	public int dato;
	public NodoDoble siguiente;
	public NodoDoble anterior;

	public NodoDoble(int dato) {
		this.dato = dato;
		this.siguiente = null;
		this.anterior = null;
	}
	
	public NodoDoble(int dato, NodoDoble anterior, NodoDoble siguiente) {
		this.dato = dato;
		this.anterior = anterior;
		this.siguiente = siguiente;
	}

}
