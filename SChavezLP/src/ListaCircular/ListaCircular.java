package ListaCircular;

public class ListaCircular {
	private Nodo ultimo;

	public ListaCircular() {
		this.ultimo = null;
	}
	
	//La lista está vacía?
	public boolean esVacia() {
		return ultimo == null;
	}
	
	//Ingresar un nodo
	public void ingresarNodo(int dato) {
		Nodo nuevo = new Nodo(dato);
		if(esVacia()) {
			nuevo.siguiente = nuevo;
			ultimo = nuevo;
		}else {
			nuevo.siguiente = ultimo.siguiente;
			ultimo.siguiente = nuevo;
			ultimo = nuevo;
		}
	}
	
	//Borrar un nodo
	public void borrarNodo(int dato) {
		if(esVacia()) {
			System.out.println("Lista vacia, no se puede borrar nada.");
		}else {
			Nodo actual = ultimo.siguiente;
			Nodo anterior = ultimo;
			
			do {
				if(actual.dato == dato) {
					if(actual == ultimo && actual == ultimo.siguiente) {
						ultimo = null;
					}else {
						anterior.siguiente = actual.siguiente;
						if(actual == ultimo) {
							ultimo = anterior;
						}
					}
					System.out.println("Dato borrado exitosamente.");
					return;
				}
				anterior = actual;
				actual = actual.siguiente;
			}while(actual != ultimo.siguiente);
		}
		System.out.println("No se ha podido borrar el dato, no se lo ha encontrado.");
		return;
	}
	
	//Buscar nodo
	public void buscarNodo(int dato) {
		int posicion = 1;
		if(esVacia()) {
			System.out.println("Lista vacía, no existen nodos.");
		}else {
			Nodo actual = ultimo.siguiente;
			do {
				if(actual.dato == dato) {
					System.out.println("Se ha encontrado el " + dato + " en la posición " + posicion);
					return;
				}
				actual = actual.siguiente;
				posicion++;
			}while(actual != ultimo.siguiente);
		}
		System.out.println("No se ha encontrado ningún nodo con el dato " + dato);
		return;
	}
	
	//Imprimir lista
	public void imprimirLista() {
		if(esVacia()) {
			System.out.println("Lista vacía, no se puede imprimir nada.");
		}else {
			Nodo actual = ultimo.siguiente;
			System.out.println("Lista:");
			do {
				System.out.print(actual.dato + " <--> ");
				actual = actual.siguiente;
			}while(actual != ultimo.siguiente);
			System.out.println();
			}
		}
}
