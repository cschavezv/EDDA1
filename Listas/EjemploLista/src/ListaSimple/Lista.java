package ListaSimple;

public class Lista {
	//Crear el inicio y el fin (solo apuntan, no tienen dato)
	protected Nodo inicio, fin, auxiliar;
	int cont = 0, posicion = 0;
	
	//Constructor
	public Lista() {
		this.inicio = null;
		this.fin = null;
	}
	
	//Método verificar si lista es vacía
	public boolean esVacia() {
		return (inicio == null);
	}
	
	//Método agregar nodo al inicio
	public void agregarInicio(int dato) {
		if(esVacia()) {
			inicio = new Nodo(dato, inicio);
			fin = inicio;
		}else {
			inicio = new Nodo(dato, inicio);
			
		}
	}
	
	//Método agregar nodo al final
	public void agregarFinal(int dato) {
		if(esVacia()) {
			inicio = new Nodo(dato, inicio);
			fin = inicio;
		}else {
			fin.siguiente = new Nodo(dato);
			fin = fin.siguiente;
		}
	}
	
	//Método para imprimir la lista
	public void imprimirLista() {
		if(esVacia()) {
			System.out.println("Lista vacía. No contiene nodos.");
		}else {
			Nodo auxiliar = inicio;
			while(auxiliar != null) {
				System.out.print("[" + auxiliar.dato + "] --> ");
				auxiliar = auxiliar.siguiente;
			}
		}
	}
	
	//Borrar nodo al inicio
	public void borrarInicio() {
		if(esVacia()) {
			System.out.println("Lista vacia. No se pueden borrar nodos.");
		}else {
			if(cont == 1) {
				inicio = null;
				fin = inicio;
				cont--;
			}else {
				inicio = inicio.siguiente;
				cont--;
			}
		}
	}
	
	//Borrar nodo al final
	public void borrarFinal() {
		if(esVacia()) {
			System.out.println("Lista vacia. No se pueden borrar nodos.");
		}else {
			if(inicio == fin) {
				inicio = null;
				fin = inicio;
				cont--;
			}else {
				auxiliar = inicio;
				while(auxiliar.siguiente.siguiente != null) { //nos quedamos en el penúltimo nodo
					auxiliar = auxiliar.siguiente;
				}
				auxiliar.siguiente = null;
				fin = auxiliar;
				cont--;
			}
		}
	}
	
	//Buscar nodo
	public boolean buscarNodo(int dato) {
		posicion = 0;
		boolean encontrado = false;
		if(esVacia()) {
			System.out.println("Lista vacía. No se ha encontrado ningún nodo.");
		}else {
			auxiliar = inicio;
			while(!encontrado && auxiliar != null) {
				posicion++;
				if(dato == auxiliar.dato) {
					encontrado = true;
					System.out.println("Si se encontró el dato.\n");
					System.out.println("Posición: " + posicion);
				}else {
					auxiliar = auxiliar.siguiente;
				}
			}
		}
		return encontrado;
	}
	
	//Borrar nodo específico
	public void borrarEspecifico(int dato) {
		if(esVacia()) {
			System.out.println("Lista vacía. No se ha encontrado ningún nodo");
		}else {
			if(buscarNodo(dato)) {
				if(inicio == fin) { 
					inicio = fin = null;
				}else {
					Nodo anterior, actual;
					anterior = inicio;
					actual = inicio.siguiente;
					if(inicio.dato == dato) {
						inicio = inicio.siguiente;
						return;
					}
					while(actual != null && actual.dato != dato) {
						anterior = actual;
						actual = actual.siguiente;
					}
					if(actual != null) {
						anterior.siguiente = actual.siguiente;
						if(actual == fin) {
							actual = null;
							fin = anterior;		
						}
					}
				}
			}
		}
	}
}
