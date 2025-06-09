package ListaDoble;

public class ListaD {
	private NodoDoble inicio, fin;

	public ListaD() {
		this.inicio = null;
		this.fin = null;
	}
	
	public boolean estaVacia() {
		return inicio == null;
	}
	
	public void ingresarInicio(int dato) {
		NodoDoble nuevo = new NodoDoble(dato);
		if(estaVacia()) {
			inicio = fin = nuevo;
		}else {
			inicio.anterior = nuevo;
			nuevo.siguiente = inicio;
			inicio = nuevo;
		}
	}
	
	public void ingresarFin(int dato) {
		NodoDoble nuevo = new NodoDoble(dato);
		if(estaVacia()) {
			inicio = fin = nuevo;
		}else {
			fin.siguiente = nuevo;
			nuevo.anterior = fin;
			fin = nuevo;
		}
	}
	
	public void mostrarListaInicioFin() {
		if(estaVacia()) {
			System.out.println("Lista vacía. No hay elementos para mostrar.");
		}else {
			NodoDoble aux = inicio;
			while(aux != null) {
				System.out.print("[" + aux.dato + "]-->");
				aux = aux.siguiente;
			}
			System.out.println();
		}
	}
	
	public void mostrarListaFinInicio() {
		if(estaVacia()) {
			System.out.println("Lista vacía. No hay elementos para mostrar.");
		}else {
			NodoDoble aux = fin;
			while(aux != null) {
				System.out.print("[" + aux.dato + "]<--");
				aux = aux.anterior;
			}
			System.out.println();
		}
	}
	
	public void buscarNodo() {
		if(estaVacia()) {
			System.out.println("Lista vacia. No se ha podido buscar un nodo");
		}else {
			
		}
	}
	
	public void eliminarNodoEspecifico() {
		
	}
}
