package AVL;

public class Nodo {
	Nodo derecho, izquierdo;
	int altura, valor;
	
	public Nodo(int valor) {
		this.derecho = null;
		this.izquierdo = null;
		this.altura = 1;
		this.valor = valor;
	}
}
