package ListaDoble;

public class NodoDoble {
	public NodoDoble anterior, siguiente;
	public int dato;
	
	//Si la lista está vacía
	public NodoDoble(int dato) {
		this.dato = dato;
		this.anterior = null;
		this.siguiente = null;
	}
	
	//Si hay elementos en la lista
	public NodoDoble(int dato, NodoDoble anterior, NodoDoble siguiente) {
		this.dato = dato;
		this.anterior = anterior;
		this.siguiente = siguiente;
	}
}		
