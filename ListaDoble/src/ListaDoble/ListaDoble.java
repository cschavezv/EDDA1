package ListaDoble;

public class ListaDoble {
	private NodoDoble inicio, fin, auxiliar;
	int cont = 0;
	
	//Es vacía la lista?
	public boolean esVacia() {
		return inicio == null;
	}
	
	//Agregar nodo al final
	public void agregarFinal(int dato) {
		if(esVacia()) {
			fin = inicio = new NodoDoble(dato);
			cont++;
		}else {
			fin.siguiente = new NodoDoble(dato, fin, null);
			fin = fin.siguiente;
			cont++;
		}
	}
	
	//Agregar nodo al inicio
	public void agregarInicio(int dato) {
		if(esVacia()) {
			fin = inicio = new NodoDoble(dato);
			cont++;
		}else {
			inicio.anterior = new NodoDoble(dato, null, inicio);
			inicio = inicio.anterior;
			cont++;
		}
	}
	
	//Borrar nodo al inicio
	public void borrarInicio() {
		if(esVacia()) {
			System.out.println("Lista vacía. No se puede borrar ningún nodo.");
		}else {
			if(cont == 1) {
				fin = inicio = inicio.siguiente;
				cont--;
			}else {
				inicio = inicio.siguiente;
				inicio.anterior = null;
				cont--;
			}
		}
	}
	
	//Borrar nodo al final
	public void borrarFinal() {
		if(esVacia()) {
			System.out.println("Lista vacía. No se puede borrar ningún nodo.");
		}else {
			if(cont == 1) {
				fin = inicio = fin.siguiente;
				cont--;
			}else {
				fin = fin.anterior;
				fin.siguiente = null;
				cont--;
			}
		}
	}
	
	//Buscar nodo
	public boolean buscarNodo(int dato) {
		boolean bandera = false;
		int posicion = 0;
		if(esVacia()) {
			System.out.println("Lista vacía. No hay nodos para buscar.");
		}else {
			auxiliar = inicio;
			while(!bandera && auxiliar != null) {
				posicion++;
				if(auxiliar.dato == dato) {
					bandera = true;
					System.out.println("Se ha encontrado el nodo en la posición " + posicion);
				}else {
					auxiliar = auxiliar.siguiente;
				}
			}
		}
		return bandera;
	}
	
	//Borrar nodo específico
	public void borrarEspecifico(int dato) {
		if(esVacia()) {
			System.out.println("Lista vacía. No hay nodos para borrar.");
		}else {
			if(buscarNodo(dato)) {
				if(inicio.dato == dato) {
					inicio = inicio.siguiente;
					inicio.anterior = null;
					cont--;
				}else {
					if(fin.dato == dato) {
						fin = fin.anterior;
						fin.siguiente = null;
						cont--;
					}else {
						auxiliar = inicio;
						while(auxiliar != null && auxiliar.dato != dato) {	
							auxiliar = auxiliar.siguiente;
						}
						if(auxiliar != null) {
							auxiliar.anterior.siguiente = auxiliar.siguiente;
							auxiliar.siguiente.anterior = auxiliar.anterior;
							cont--;
						}
					}
				}
			}else {
				System.out.println("No se ha encontrado el nodo a borrar");
			}
		}
	}
	
	//Imprimir lista
	public void imprimirInicioAFin() {
		if(esVacia()) {
			System.out.println("Lista vacia, no hay nada para imprimir");
		}else {
			auxiliar = inicio;
			while(auxiliar != null) {
				System.out.print("[" + auxiliar.dato + "] ---> ");
				auxiliar = auxiliar.siguiente;
			}
		}
	}
	
	public void imprimirFinAInicio() {
		if(esVacia()) {
			System.out.println("Lista vacia, no hay nada para imprimir");
		}else {
			auxiliar = fin;
			while(auxiliar != null) {
				System.out.print("[" + auxiliar.dato + "] ---> ");
				auxiliar = auxiliar.anterior;
			}
		}
	}
}
