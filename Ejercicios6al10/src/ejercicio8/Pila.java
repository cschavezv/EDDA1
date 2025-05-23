package ejercicio8;

public class Pila {
	private Nodo cima;
	
	//Constructor vacio y sin sobrecarga de instructores -> Sobreentiende cima=null;
	
	public boolean esVacia() {
		return cima == null;
	}
	public void push(char letra) {
		Nodo nuevo = new Nodo(letra);
		nuevo.siguiente = cima;
		cima=nuevo;
	}
	public void pop() {
		if(esVacia()) {
			System.out.println("Pila vacia, nada por borrar");
		}else {
			cima = cima.siguiente;
		}
	}
	public void vaciarPila() {
		while(cima!=null) {
			pop();
		}
	}
	public void imprimir() {
		if(esVacia()) {
			System.out.println("Pila vacia, nada por imprimir");
		}else {
			Nodo aux = cima;
			while(aux!=null) {
				System.out.print(aux.letra);
				aux = aux.siguiente;
			}
		}
		System.out.println();
	}
}
