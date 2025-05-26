package EjmColaPrioridad;

public class Cola {
	private Nodo frente, fin;

	public Cola() {
		this.frente = null;
		this.fin = null;
	}
	
	public boolean estaVacia() {
		return frente == null;
	}
	
	public void encolar(int valor) {
		Nodo nuevo = new Nodo(valor);
		if(estaVacia()) {
			frente = fin = nuevo;
		}else {
			fin.siguiente = nuevo;
			fin = nuevo;
		}
	}
	
	public void desencolar() {
		if(estaVacia()) {
			System.out.println("Cola vacía. No se puede eliminar nada");
		}else {
			frente = frente.siguiente;
			if(frente == null) {
				
			}
		}
	}
	
	public void mostrar() {
		if(estaVacia()) {
			System.out.println("Cola vacía. No se puede mostrar elementos.");
		}else {
			Nodo actual = frente;
			while(actual != null) {
				System.out.print("[" + actual.valor + "] -->");
				actual = actual.siguiente;
			}
		}
	}
}
