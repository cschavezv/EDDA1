package ejercicio6;


public class ListaDoble {
	private NodoDoble inicio,fin;
	int cont;

	public ListaDoble() {
		this.inicio = null;
		this.fin = null;
	}

	public ListaDoble(NodoDoble inicio, NodoDoble fin) {
		this.inicio = inicio;
		this.fin = fin;
	}

	public boolean esVacia() {
		return(inicio==null);
	}

	public void addInicio(int dato) {
		if (esVacia()) {
			inicio = new NodoDoble(dato);
			fin = inicio;
		} else {
			NodoDoble nuevo = new NodoDoble(dato, null, inicio);
			inicio.anterior = nuevo;
			inicio = nuevo;
		}
		cont++;
	}

	public void addFinal(int dato) {
		if (esVacia()) {
			inicio = new NodoDoble(dato);
			fin = inicio;
		} else {
			NodoDoble nuevo = new NodoDoble(dato, fin, null);
			fin.siguiente = nuevo;
			fin = nuevo;
		}
		cont++;
	}

	public void imprimir() {
		if(esVacia()) {
			System.out.println("Lista vacia");
		}else {
			NodoDoble aux=inicio;
			while (aux!=null) {
				System.out.print("["+aux.dato+"] -->");				
				aux=aux.siguiente;
			}
			System.out.print("\nCantidad de nodos: "+cont);
		}
	}

	public void borrarEspecifico(int dato) {
		if(esVacia()) {
			System.out.println("Lista vacia");
		} else {
			NodoDoble actual = inicio;

			while(actual != null && actual.dato != dato) {
				actual = actual.siguiente;
			}

			if(actual != null) { 
				if(inicio == fin) {
					inicio = null;
					fin = null;
				} 
				else if(actual == inicio) {
					inicio = inicio.siguiente;
					inicio.anterior = null;
				} 
				else if(actual == fin) {
					fin = fin.anterior;
					fin.siguiente = null;
				}
				else {
					actual.anterior.siguiente = actual.siguiente;
					actual.siguiente.anterior = actual.anterior;
				}
				cont--;
				System.out.println("El dato "+dato+" se eliminó");
			} else {
				System.out.println("Dato no existe");
			}
			System.out.print("\nCantidad de nodos: "+cont);
		}
	}


	public void imprimirFinInicio() {
		if(esVacia()) {
			System.out.println("Lista vacia");
		}else {
			NodoDoble aux=fin;
			while (aux!=null) {
				System.out.print("["+aux.dato+"] -->");				
				aux=aux.anterior;
			}
			System.out.print("\nCantidad de nodos: "+cont);
		}
	}
}
