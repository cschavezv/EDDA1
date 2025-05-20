package ListaSimple;

public class Nodo {
	//Atributos del nodo
	public int dato;
	public Nodo siguiente;
	
	//Constructor para agregar nodo al final
	public Nodo(int dato) {
		this.dato = dato;
		this.siguiente = null;
	}
	
	//Constructor para agregar nodo al inicio
	public Nodo(int dato, Nodo siguiente) {
		this.dato = dato;
		this.siguiente = siguiente;
	}
}
