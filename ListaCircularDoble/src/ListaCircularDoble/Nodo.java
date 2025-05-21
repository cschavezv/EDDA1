package ListaCircularDoble;

public class Nodo {
	int dato;
	Nodo siguiente, anterior;
	
	//Constructor para lista vacía
	public Nodo(int dato) {
		this.dato = dato;
		this.siguiente = null;
		this.anterior = null;
	}

	//Constructor para lista con elementos
	public Nodo(int dato, Nodo siguiente, Nodo anterior) {
		this.dato = dato;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}
}
