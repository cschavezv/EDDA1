package TareasPendientes;

public class Nodo {
	String estado;
	int numTarea;
	Nodo siguiente;
	
	public Nodo(int numTarea) {
		this.estado = "Pendiente";
		this.numTarea = numTarea;
		this.siguiente = null;
	}
}
