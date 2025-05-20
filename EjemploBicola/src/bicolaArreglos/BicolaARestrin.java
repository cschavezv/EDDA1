package bicolaArreglos;

public class BicolaARestrin {
	private int[] arreglo;
	private int frente, fin, tamanio;
	
	public BicolaARestrin(int capacidad) {
		this.arreglo = new int[capacidad];
		this.frente = -1;
		this.fin = -1;
		this.tamanio = capacidad;
	}
	
	public boolean estaVacia() {
		return frente == -1;
	}
	
	public boolean estaLlena() {
		return (fin + 1) % tamanio == frente;
	}
	
	public void insertarFinal(int dato) throws Exception{
		if(estaLlena()) {
			throw new Exception("La bicola está llena.");
		}
		
		
	}
}
