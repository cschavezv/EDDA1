package ABB;

public class Nodo {
	Nodo izquierdo, derecho;
	int valor;
	
	public Nodo(int valor) {
		this.izquierdo = null;
		this.derecho = null;
		this.valor = valor;
	}
}
