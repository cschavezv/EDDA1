package arbol1;

public class Arbol {
	private NodoArbol raiz;
	
	public NodoArbol getRaiz() {
		return this.raiz;
	}
	
	public Arbol() {
		this.raiz = null;
	}
	
	public void Insertar(int valor) {
		if(raiz == null) {
			System.out.println("Insertando nodo raíz... " + valor);
			this.raiz = new NodoArbol(valor);
		}else {
			System.out.println("Insertando un nodo no raíz... " + valor);
			this.raiz.insertarNodo(valor);
		}
	}

	//Llamada PreOrder
	public void ejecutarPreOrder() {
		this.preOrder(raiz);
	}
	
	//Recorrido PreOrder
	public void preOrder(NodoArbol nodo) {
		if(nodo == null) {
			return;
		}else {
			System.out.print(nodo.getValor() + " ");
			preOrder(nodo.getIzquierdo());
			preOrder(nodo.getDerecho());
		}
	}
}
