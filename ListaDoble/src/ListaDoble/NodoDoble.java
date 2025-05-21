package ListaDoble;

public class NodoDoble {
	public NodoDoble anterior, siguiente; //La lista doble tiene dos extremos, anterior y siguiente
	public int dato; //Almacena un dato
	
	//Si la lista está vacía
	public NodoDoble(int dato) {
		this.dato = dato;
		this.anterior = null; //anterior no apunta a nada
		this.siguiente = null; //siguiente no apunta a nada
	}
	
	//Si hay elementos en la lista
	public NodoDoble(int dato, NodoDoble anterior, NodoDoble siguiente) {
		this.dato = dato;
		this.anterior = anterior; //anterior debe apuntar al parámetro mandado, nodo anterior
		this.siguiente = siguiente; //siguiente debe apuntar al parámetro mandado, nodo siguiente
	}
}		
