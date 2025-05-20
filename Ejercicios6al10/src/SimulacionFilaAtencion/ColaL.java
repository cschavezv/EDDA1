package SimulacionFilaAtencion;

public class ColaL {
	private NodoL frente, fin;
	
	public ColaL() {
		this.fin = null;
		this.frente = null;
	}
	
	//Verficar si la cola está vacía
	public boolean estaVacia() {
		return frente == null;
	}
	
	//Encolar una persona (encolar desde el final)
	public void encolarPersona(String nombre) {
		NodoL nuevo = new NodoL(nombre);
		if(estaVacia()) {
			fin = frente = nuevo; //fin y frente apuntan al nuevo nodo
		}else {
			fin.siguiente = nuevo; //enlazamos el nodo fin actual con el nuevo nodo creado
			fin = nuevo; //el puntero fin pasa a apuntar al nuevo nodo
		}
		System.out.println(nombre + " ha entrado a la fila");
	}
	
	//Desencolar persona (desencolar desde el frente)
	public void desencolarPersona() {
		if(estaVacia()) {
			System.out.println("Cola vacía, no hay personas.");
			return;
		}else {
			System.out.println(frente.dato + " ha sido atendido/a");
			frente = frente.siguiente; //El puntero frente pasa a apuntar a la siguiente persona a la derecha
		}
	}
	
	//Mostrar la cola
	public void mostrarCola() {
		if(estaVacia()) {
			System.out.println("Cola vacía, no hay personas");
			return;
		}else {
	        NodoL actual;
			System.out.println("\nFila actual:");
	        
	        // Línea 1: Cabezas
	        for (actual = frente; actual != null; actual = actual.siguiente) {
	            System.out.print("  O   ");
	        }
	        System.out.println();

	        // Línea 2: Brazos y torso
	        for (actual = frente; actual != null; actual = actual.siguiente) {
	            System.out.print(" /|\\  ");
	        }
	        System.out.println();

	        // Línea 3: Piernas
	        for (actual = frente; actual != null; actual = actual.siguiente) {
	            System.out.print(" / \\  ");
	        }
	        System.out.println();

	        // Línea 4: Nombres
	        for (actual = frente; actual != null; actual = actual.siguiente) {
	            System.out.printf("%-6s", actual.dato + "→");
	        }
		}
	}
}
