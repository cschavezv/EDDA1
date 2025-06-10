package Ejercicio3;

public class Maquinaria {
	public String[] colaMaquinaria;
	public int inicio, fin;
	public final int dimension = 5;

	public Maquinaria(int dimension) {
		this.colaMaquinaria = new String[dimension];
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
			System.out.println("La cola está llena. Espere a que se desocupe.");
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
		System.out.println(maq + " ha salido de la cola por el inicio.");
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
		System.out.println(maq + " ha salido de la cola por el final.");
	}
	
	public void mostrarElementos() {
		if(estaVacia()) {
			System.out.println("La cola está vacía, no hay maquinaria");
			return;
		}else {
			int i = inicio;
			while(true) {
				System.out.print(colaMaquinaria[i] + " ");
				if(i == fin) break;
				i = (i + 1) % dimension;
			}
			System.out.println();
		}
	}
}
