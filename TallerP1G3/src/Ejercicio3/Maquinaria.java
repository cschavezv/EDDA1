package Ejercicio3;

public class Maquinaria {
	public String[] colaMaquinaria;
	public int inicio, fin;
	public final int dimension = 4;

	public Maquinaria() {
		this.colaMaquinaria = new String[this.dimension];
		this.inicio = -1;
		this.fin = -1;
	}
	
	public boolean estaLlena() {
		return fin == dimension - 1;
	}
	
	public boolean estaVacia() {
		return inicio == -1;
	}
	
	public void insertarFinal(String maquina) {
		if(estaLlena()) {
			System.out.println("La cola está llena. " + maquina + " no ha podido entrar");
			return;
		}else if(estaVacia()){
			fin = inicio = 0;
		}else {
			fin = (fin + 1) % dimension;
		}
		colaMaquinaria[fin] = maquina;
		System.out.println(maquina + " ha entrado a la cola.");
	}
	
	public void eliminarFrente() {
		String maq = colaMaquinaria[inicio];
		if(estaVacia()) {
			System.out.println("La cola está vacía, no hay maquinaria.");
			return;
		}else if(inicio == fin){
			inicio = fin = -1;
		}else {
			inicio = (inicio + 1) % dimension;
		}
		System.out.println(maq + " ha salido de la cola por el inicio (ya cumplió su turno)");
	}
	
	public void eliminarFinal() {
		String maq = colaMaquinaria[fin];
		if(estaVacia()) {
			System.out.println("La cola está vacía, no hay maquinaria.");
			return;
		}else if(inicio == fin) {
			inicio = fin = -1;
		}else {
			fin = (fin - 1 + dimension) % dimension;
		}
		System.out.println(maq + " ha salido de la cola por el final (fue llamada para otra obra)");
	}
	
	public void mostrarElementos() {
		if(estaVacia()) {
			System.out.println("La cola está vacía, no hay maquinaria");
			return;
		}else {
			int i = inicio;
			while(true) {
				System.out.print("[" + colaMaquinaria[i] + "] ");
				if(i == fin) break;
				i = (i + 1) % dimension;
			}
			System.out.println();
		}
	}
}
