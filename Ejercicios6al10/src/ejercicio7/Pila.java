package ejercicio7;

public class Pila {
	private Nodo cima;
	//Constructor vacio y sin sobrecarga de instructores -> Sobreentiende cima=null;
	public boolean esVacia() {
		return cima==null;
	}
	public void push(char parentesis) {
		Nodo nuevo = new Nodo(parentesis);
		nuevo.siguiente = cima;
		cima=nuevo;
	}
	public void pop() {
		if(esVacia()) {
			System.out.println("Pila vacia, nada por borrar");
		}else {
			cima=cima.siguiente;
		}
	}
	public void vaciarPila() {
		while(cima!=null) {
			pop();
		}
	}
	
}
