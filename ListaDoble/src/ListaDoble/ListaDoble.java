package ListaDoble;

public class ListaDoble {
	private NodoDoble inicio, fin, auxiliar; //Tiene dos punteros esenciales, el inicio de la lista, el fin de la lista
	int cont = 0; //contador de nodos
	
	//Es vacía la lista?
	public boolean esVacia() {
		return inicio == null; //Si inicio no apunta a nada, la lista está vacía
	}
	
	//Agregar nodo al final (derecha)
	public void agregarFinal(int dato) {
		if(esVacia()) { //Comprobamos si está vacía
			fin = inicio = new NodoDoble(dato); //creamos un nodo al que apuntan fin e inicio con el constructor de lista vacía
		}else { //Si no está vacía:
			fin.siguiente = new NodoDoble(dato, fin, null); //se crea un nuevo nodo con el constructor de lista con elementos. Sus parámetros dicen que el nodo anterior será al
			// que fin está apuntando actualmente. Este nodo se enlazará a fin por el lado derecho (siguiente)
			fin = fin.siguiente; //el puntero fin pasa a apuntar al nuevo nodo
		}
		cont++; //aumenta el contador de nodos
	}
	
	//Agregar nodo al inicio (izquierda)
	public void agregarInicio(int dato) {
		if(esVacia()) { //Comprobamos si la lista está vacía
			fin = inicio = new NodoDoble(dato); //se crea un nuevo nodo con el constructor de lista vacía. Inicio y fin apuntan a este nuevo nodo.
		}else { //Si no está vacía:
			inicio.anterior = new NodoDoble(dato, null, inicio); //el nuevo nodo creado recibe como parámetro que debe enlazarse al nodo al que inicio apunta. Inicio se enlazará
			//con este nuevo nodo.
			inicio = inicio.anterior; //El puntero inicio apuntará al nuevo nodo (izquierda)
		}
		cont++; //aumenta el contador de nodos
	}
	
	//Borrar nodo al inicio
	public void borrarInicio() {
		if(esVacia()) { //Comprobamos si la lista está vacía
			System.out.println("Lista vacía. No se puede borrar ningún nodo.");
		}else { //Si no está vacía:
			if(cont == 1) { //Si contador dice que solo hay un nodo:
				fin = inicio = inicio.siguiente; //inicio.siguiente = null; fin e inicio apuntarán a null
			}else { //Si hay más de un nodo:
				inicio = inicio.siguiente; //inicio recorre a su siguiente nodo
				inicio.anterior = null; //mandamos el anterior nodo a null
			}
		}
		cont--; //decrementa el contador de nodos
	}
	
	//Borrar nodo al final
	public void borrarFinal() {
		if(esVacia()) { //Comprobamos si la lista está vacía
			System.out.println("Lista vacía. No se puede borrar ningún nodo."); 
		}else { //Si no está vacía:
			if(cont == 1) { //Si solo hay un nodo:
				fin = inicio = fin.siguiente; //fin.siguiente = null; fin e inicio apuntan a null
			}else { //Si hay más de un nodo:
				fin = fin.anterior; //fin recorre a su anterior nodo (izquierda)
				fin.siguiente = null; //mandamos el anterior nodo a null
			}
		}
		cont--; //decrementa el contador de nodos
	}
	
	//Buscar nodo
	public boolean buscarNodo(int dato) {
		boolean bandera = false; //variable bandera para indicar cuando se encuentra un nodo
		int posicion = 0; //variable posición que nos indicará la posición del nodo encontrado
		if(esVacia()) { //Comprobamos si está vacía
			System.out.println("Lista vacía. No hay nodos para buscar.");
		}else { //Si no está vacía:
			auxiliar = inicio; //Creamos un puntero auxiliar que apunta a inicio
			while(!bandera && auxiliar != null) { //mientras no se haya encontrado el nodo y el auxiliar no haya llegado al final de la lista (fin.siguiente)
				posicion++; //aumentamos la posición
				if(auxiliar.dato == dato) { //si se encontró el dato:
					bandera = true; //bandera a verdarero, se ha encontrado el nodo
					System.out.println("Se ha encontrado el nodo en la posición " + posicion); //imprimimos la posición del nodo
				}else { //si no se ha encontrado
					auxiliar = auxiliar.siguiente; //auxiliar recorre a la derecha
				}
			}
		}
		return bandera; //retornamos el valor de bandera para saber si se encontró o no
	}
	
	//Borrar nodo específico
	public void borrarEspecifico(int dato) {
		if(esVacia()) { //Comprobamos si está vacía
			System.out.println("Lista vacia, nada que borrar");
		}else { //Si no está vacía
			if(buscarNodo(dato)) { //Si se encontró el nodo (true)
				if(inicio == fin) { //Si hay un único nodo
					inicio = fin = null; //Mandamos a null todo
				}else {
					NodoDoble anterior, actual; //creamos punteros anterior y actual
					if(inicio.dato == dato) { //Si el dato está en el inicio
						inicio = inicio.siguiente; //movemos el puntero inicio a la derecha
						inicio.anterior = null; //mandamos a null el anterior nodo
						return; //se acaba el método
					}
					anterior = inicio; //anterior apunta a inicio
					actual = inicio.siguiente; //actual apunta al nodo siguiente de inicio
					while(actual.dato != dato && actual != null) { //Si el dato de actual no es igual al dato y actual aún no llega al final de la lista
						actual = actual.siguiente; //recorremos actual
						anterior = anterior.siguiente; //recorremos anterior
					}
					if(actual == fin) { //si actual está apuntando a fin
						fin = fin.anterior; //movemos fin a la izquierda
						fin.siguiente = null; //mandamos a null el nodo siguiente a fin
						return; //se acaba el método
					}else { //si no está ni en el inicio ni en el final:
						anterior.siguiente = actual.siguiente; //	
						actual.siguiente.anterior = anterior;
					}
				}
			}else { //Si no se encontró el nodo (false)
				System.out.println("No se encontró el dato a borrar");
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
