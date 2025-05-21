package ClientesCola;

public class Nodo {
	String nombre;
	int cantidadProductos;
	Nodo siguiente;
	
	public Nodo(String nombre, int cantidadProductos) {
		this.nombre = nombre;
		this.cantidadProductos = cantidadProductos;
		this.siguiente = null;
	}
}
