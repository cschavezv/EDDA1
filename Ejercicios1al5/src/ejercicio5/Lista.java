package ejercicio5;

public class Lista {
	protected Nodo inicio,fin;
	
	public Lista() {
		this.inicio=null;
		this.fin=null;
	}

	public Lista(Nodo inicio, Nodo fin) {
		this.inicio = inicio;
		this.fin = fin;
	}


	public boolean esVacia() {
		return (inicio==null);
	}
	
	public void addInicio(String dato) {
		if(esVacia()) {
			inicio = new Nodo(dato,inicio);
			fin=inicio;
		}else {
			inicio = new Nodo(dato,inicio);
		}
	}
	
	public void addFinal (String dato) {
		if(esVacia()) {
			inicio = new Nodo(dato,inicio);
			fin=inicio;
		}else {
			fin.siguiente = new Nodo(dato);
			fin = fin.siguiente;
		}
	}
	
	public void imprimirInicioFin() {
		if(esVacia()) {
			System.out.println("Lista vacia");
		}else {
			Nodo aux=inicio;
			while (aux!=null) {
				System.out.print("["+aux.dato+"] -->");				
				aux=aux.siguiente;
			}
		}
	}
	
	public void imprimirFinInicio() {
	    Nodo actual = fin;
	    
	    while (actual != inicio) {
	        System.out.print("[" + actual.dato + "] <--");
	        Nodo anterior = inicio;
	        while (anterior.siguiente != actual) {
	            anterior = anterior.siguiente;
	        }
	        actual = anterior;
	    }
	    System.out.print("[" + actual.dato + "]");
	}
}
