package ListaCircularDoble;

public class ListaCircularD {
	private Nodo ultimo;

	public ListaCircularD() {
		this.ultimo = null;
	}
	
	//Está vacía?
	public boolean estaVacia() {
		return ultimo == null;
	}
	
	//Ingresar nodo
	public void ingresarNodo(int dato) {
		Nodo nuevo = new Nodo(dato);
		if(estaVacia()) {
			nuevo.anterior = nuevo;
			nuevo.siguiente = nuevo;
			ultimo = nuevo;
		}else{
			nuevo.siguiente = ultimo.siguiente;
			nuevo.anterior = ultimo;
			ultimo.siguiente.anterior = nuevo;
			ultimo.siguiente = nuevo;
			ultimo = nuevo;
		}
	}
	
	//Imprimir sentido horario
	public void mostrarListaH() {
		if(estaVacia()) {
			System.out.println("Lista vacia");
		}else {
			Nodo actual = ultimo.siguiente;
			do {
				System.out.print("[" + actual.dato + "] --> ");
				actual = actual.siguiente;
			}while(actual != ultimo.siguiente);
		}
	}
	
	//Imprimir sentido antihorario
	public void mostrarListaAH() {
		if(estaVacia()) {
			System.out.println("Lista vacia");
		}else {
			Nodo actual = ultimo;
			do {
				System.out.print("[" + actual.dato + "] <-- ");
				actual = actual.anterior;
			}while(actual != ultimo);
		}
	}
}
