package Ejercicios;

public class ArregloEnteros {
	
	private static final int longitud = 8;
	private int arreglo [];
	
	public ArregloEnteros() {	
		int aux = 0;
		arreglo = new int[longitud];
		for(int i = 0; i < longitud; i++) {
			aux += 10;
			arreglo[i] = aux;
		}
	}
	
	public ArregloEnteros(int[] arreglo) {
		this.arreglo = arreglo;
	}

	public int[] getArreglo() {
		return arreglo;
	}
	
	public void setArreglo(int[] arreglo) {
		this.arreglo = arreglo;
	}

	@Override
	public String toString() {
		String salida = "";
		for(int aux : arreglo) {
			salida += "[" + aux + "]";
		}
		return salida;
	}
}
