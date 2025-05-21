package ListaCircular;

public class ListaCircular {
	private Nodo ultimo; //Tenemos un puntero que nos indica cuál es el último nodo ingresado. Esto para saber en qué nodo estamos en la actualidad y poder ingresar más.

	public ListaCircular() {
		this.ultimo = null; //Creamos el constructor de la clase en donde se inicializa último a null debido a que todavía no hay ningún nodo a que apuntar.
	}
	
	//La lista está vacía?
	public boolean esVacia() {
		return ultimo == null; //Determinamos si está vacía cuando ultimo es igual a null debido a que no apunta a ningún nodo
	}
	
	//Ingresar un nodo
	public void ingresarNodo(int dato) {
		Nodo nuevo = new Nodo(dato); //Creamos un objeto tipo Nodo
		if(esVacia()) { //Si la lista está vacía
			nuevo.siguiente = nuevo; //El nodo se apunta a sí mismo
			ultimo = nuevo; //El puntero ultimo apunta al nuevo nodo
		}else {
			nuevo.siguiente = ultimo.siguiente; //El nuevo nodo apunta al siguiente del último nodo dentro de la lista circular
			ultimo.siguiente = nuevo; //El último nodo apunta al nuevo nodo creado
			ultimo = nuevo; //El puntero último pasa al nuevo nodo creado
		}
	}
	
	//Borrar un nodo
	public void borrarNodo(int dato) {
		if(esVacia()) { //Comprobamos si está vacía
			System.out.println("Lista vacia, no se puede borrar nada."); 
		}else { //Si no está vacía:
			Nodo actual = ultimo.siguiente; //Creamos un puntero llamado actual y se le asigna apuntar al siguiente nodo del último
			Nodo anterior = ultimo; //Creamos un puntero llamdo anterior que se le asigna al último nodo
			
			do { //Hacer:
				if(actual.dato == dato) { //Si el dato del puntero actual es igual al dato recibido como parámetro
					if(actual == ultimo && actual == ultimo.siguiente) { //Si el nodo actual es igual al último nodo e igual siguiente nodo del último, es decir, solo hay un nodo:
						ultimo = null; //Mandamos el único nodo (ultimo) igual a null para que se borre
					}else { //Si hay mas de un nodo:
						anterior.siguiente = actual.siguiente; //Desconectamos el nodo anterior del actual y empieza a puntar al siguiente del actual
						if(actual == ultimo) { //Si coincide que actual apunta a ultimo
							ultimo = anterior; //El puntero ultimo pasa a apuntar a anterior para que desvincularlo de la lista
						}
					}
					System.out.println("Dato borrado exitosamente.");
					return;
				} //Si aún no encuentra el dato
				anterior = actual; //Anterior pasa a apuntar a actual
				actual = actual.siguiente; //actual recorre un espacio al siguiente nodo
			}while(actual != ultimo.siguiente); //Mientras actual no regrese a la posición en donde empezó
		}//Si recorrió toda la lista y no encontró el dato
		System.out.println("No se ha podido borrar el dato, no se lo ha encontrado.");
		return;
	}
	
	//Buscar nodo
	public void buscarNodo(int dato) {
		int posicion = 1; //Creamos un dato que nos indica la posición del nodo
		if(esVacia()) { //Comprobamos si la lista está vacía
			System.out.println("Lista vacía, no existen nodos.");
		}else { //Si no está vacía:
			Nodo actual = ultimo.siguiente; //Creamos un puntero llamado actual que empieza en el siguiente nodo de último
			do { //Hacer:
				if(actual.dato == dato) { //Si se encontró el dato:
					System.out.println("Se ha encontrado el " + dato + " en la posición " + posicion); //Imprimimos el dato
					return; //Se acaba el ciclo do-while
				} //Si no se encuentra el dato:
				actual = actual.siguiente; //actual recorre una posición
				posicion++; //posición aumenta
			}while(actual != ultimo.siguiente); //Mientras el puntero actual no regrese a su posición incial
		} //Si no se encontró el dato:
		System.out.println("No se ha encontrado ningún nodo con el dato " + dato);
		return;
	}
	
	//Imprimir lista
	public void imprimirLista() {
		if(esVacia()) { //Comprobamos si la lista está vacía
			System.out.println("Lista vacía, no se puede imprimir nada.");
		}else { //Si no está vacía:
			Nodo actual = ultimo.siguiente; //Creamos un puntero llamado actual que empieza en el siguiente nodo de último
			System.out.println("Lista:");
			do { //Hacer:
				System.out.print(actual.dato + " <--> "); //Imprimimos el dato
				actual = actual.siguiente; //actual recorre una posición 
			}while(actual != ultimo.siguiente); //Mientras actual no regrese a su posición inicial
			System.out.println();
			}
		}
}
