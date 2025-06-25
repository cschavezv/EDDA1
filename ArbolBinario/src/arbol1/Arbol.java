package arbol1;

public class Arbol {
	private NodoArbol raiz;
	
	public NodoArbol getRaiz() {
		return this.raiz;
	}
	
	public Arbol() {
		this.raiz = null;
	}
	
	public boolean estaVacio() {
		return raiz == null;
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
		System.out.println("Recorrido Pre Order: ");
		this.preOrder(raiz);
	}
	
	//Llamada InOrder
	public void ejecutarInOrder() {
		System.out.println("\nRecorrido In Order: ");
		this.inOrder(raiz);
	}
	
	//Llamada PostOrder
	public void ejecutarPostOrder() {
		System.out.println("\nRecorrido Post Order: ");
		this.postOrder(raiz);
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
	
	//Recorrido InOrder
	public void inOrder(NodoArbol nodo) {
		if(nodo == null) {
			return;
		}else {
			inOrder(nodo.getIzquierdo());
			System.out.print(nodo.getValor() + " ");
			inOrder(nodo.getDerecho());
		}
	}
	
	//Recorrido PostOrder
	public void postOrder(NodoArbol nodo) {
		if(nodo == null) {
			return;
		}else {
			postOrder(nodo.getIzquierdo());
			postOrder(nodo.getDerecho());
			System.out.print(nodo.getValor() + " ");
		}
	}
	
	//Buscar elemento dentro del árbol
	public void buscarElemento(NodoArbol nodo, int valor, int nivel) {
		if(estaVacio()) {
			System.out.println("Árbol vacío, no se puede buscar.");
			return;
		}
		if(nodo == null) {
			System.out.println("Elemento " + valor + " no encontrado");
		}else {
			if(valor == nodo.getValor()) {
				System.out.println("Elemento " + valor + " encontrado en el nivel " + nivel);
			}else {
				if(valor < nodo.getValor()) {
					//Buscar en el subárbol izquierdo
					System.out.println("Árbol izquierdo");
					buscarElemento(nodo.getIzquierdo(), valor, ++nivel);
				}else if(valor >= nodo.getValor()){
					//Buscar en el subárbol derecho
					System.out.println("Árbol derecho");
					buscarElemento(nodo.getDerecho(), valor, ++nivel);
				}
			}
		}
	}
	
	public void ejecutarBusqueda(int valor) {
		System.out.println("\nBuscando el elemento...");
		this.buscarElemento(this.raiz, valor, 0);
	}
}
