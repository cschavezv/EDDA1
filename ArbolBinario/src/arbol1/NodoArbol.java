package arbol1;

public class NodoArbol {
	public int valor;
	private NodoArbol izquierdo, derecho;
	
	
	public NodoArbol(int dato) {
		this.valor = dato;
		this.izquierdo = null;
		this.derecho = null;
	}

	public int getValor() {
		return valor;
	}

	public NodoArbol getIzquierdo() {
		return izquierdo;
	}


	public NodoArbol getDerecho() {
		return derecho;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setIzquierdo(NodoArbol izquierdo) {
		this.izquierdo = izquierdo;
	}

	public void setDerecho(NodoArbol derecho) {
		this.derecho = derecho;
	}

	public void insertarNodo(int valor) {
		if(valor < this.valor) {
			//Insertar hijo izquierdo
			if(this.izquierdo == null) {
				this.izquierdo = new NodoArbol(valor);
			}else {
				this.izquierdo.insertarNodo(valor);
			}
		}else {
			//Insertar el hijo derecho
			if(this.derecho == null) {
				this.derecho = new NodoArbol(valor);
			}else {
				this.derecho.insertarNodo(valor);
			}
		}
	}
	
	// ¿Es nodo hoja?
	public boolean esHoja() {
		return(this.derecho == null && this.izquierdo == null);
	}
}
