package ArbolBinario;

public class Arbol {
	private NodoDoble raiz;

	public Arbol() {
		this.raiz = null;
	}
	
	public NodoDoble getRaiz() {
		return raiz;
	}

	public boolean arbolVacio() {
		return raiz == null;
	}
	
	public void insertarNodo(int valor) {
		if(arbolVacio()) {
			raiz = new NodoDoble(valor);
		}else {
			NodoDoble aux = this.raiz;
			while(true) {
				if(valor < aux.getValor()) { //Si el valor del nodo a insertar es menor al valor de aux (empezando por raíz) 
					// Insertar nodo por la izquierda
					if(aux.getIzquierda() == null) { //Si la izquierda del auxiliar está vacía
						aux.setIzquierda(new NodoDoble(valor)); //Añadimos el nodo a la izquierda del actual
						return;
					}
					aux = aux.getIzquierda();
				}else {
					//Lo mismo pero con la derecha xd
					if(aux.getDerecha() == null) {
						aux.setDerecha(new NodoDoble(valor));
						return;
					}
					aux = aux.getDerecha();
				}
			}
		}
	}
	
	public void preOrder(NodoDoble nodo) {
		if(nodo == null) {
			return;
		}else {
			System.out.print("[" + nodo.getValor() + "] ");
			preOrder(nodo.getIzquierda());
			preOrder(nodo.getDerecha());
		}
	}
}
