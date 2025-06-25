package ArbolBinario;

public class NodoDoble {
	private int valor;
	private NodoDoble izquierda, derecha;
	
	public NodoDoble(int valor) {
		this.valor = valor;
		this.izquierda = null;
		this.derecha = null;
	}

	public int getValor() {
		return valor;
	}

	public NodoDoble getIzquierda() {
		return izquierda;
	}

	public NodoDoble getDerecha() {
		return derecha;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setIzquierda(NodoDoble izquierda) {
		this.izquierda = izquierda;
	}

	public void setDerecha(NodoDoble derecha) {
		this.derecha = derecha;
	}
}
