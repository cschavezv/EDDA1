import java.util.Random;

public class Pila {
	NodoNumero cima;
	Random rd = new Random();
	
	public Pila() {
		this.cima = null;
	}
	
	public boolean estaVacia() {
		return cima == null;
	}
	
	public void pushNumero() {
		int nuevoNumero = rd.nextInt(0, 10);
		NodoNumero nuevo = new NodoNumero(nuevoNumero);
		if(estaVacia()) {
			System.out.println("Agregando el primer nodo...");
			cima = nuevo;
		}else {
			nuevo.siguiente = cima;
			cima = nuevo;
		}
	}
	
	public void popNumero() {
		if(estaVacia()) {
			System.out.println("Pila vacía, no se puede eliminar");
		}else {
			cima = cima.siguiente;
		}
	}
	
	public void mostrarPila() {
		if(estaVacia()) {
			System.out.println("Pila vacía. No hay que mostrar nada.");
		}else {
			NodoNumero aux = cima;
			while(aux != null) {
				System.out.println("[" + aux.dato + "]");
				aux = aux.siguiente;
			}
		}
	}
	
	public int sumar() {
		return sumaRecursiva(cima);
	}
	
	private int sumaRecursiva(NodoNumero nodo) {
		if(nodo == null) {
			return 0; //caso base
		}else {
			return nodo.dato + sumaRecursiva(nodo.siguiente);
		}
	}
}