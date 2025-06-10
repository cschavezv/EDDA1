package Ejercicio3;

public class GestionTurnos {
	public int[] colaMaquinaria;
	public int inicio, fin;
	public final int dimension = 5;

	public GestionTurnos() {
		this.colaMaquinaria = new int[dimension];
		this.inicio = -1;
		this.fin = -1;
	}
	
	public boolean estaLlena() {
		return fin == dimension - 1;
	}
	
	public boolean estaVacia() {
		return inicio == -1;
	}
	
	public void insertarFinal() {
		if(estaLlena()) {
			
		}
	}
}
