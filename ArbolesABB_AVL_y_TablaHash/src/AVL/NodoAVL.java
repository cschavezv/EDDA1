package AVL;

public class NodoAVL {
	NodoAVL izquierdo, derecho;
	int altura; //La altura de un nodo es el número de niveles desde ese nodo hasta la hoja más profunda
	int valor;
	
	public NodoAVL(int valor) {
		this.izquierdo = null;
		this.derecho = null;
		this.altura = 1; //Un nodo tiene altura 1
		this.valor = valor;
	}
}
