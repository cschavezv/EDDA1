package Ejercicio1;

public class ArreglosMultiplos {
	public int[] multiplosTres, multiplosCinco, sumaArreglos;
	public int dimension;
	
	
	public ArreglosMultiplos(int dimension) {
		this.dimension = dimension;
		multiplosTres = new int[dimension];
		multiplosCinco = new int[dimension];
		sumaArreglos = new int[dimension];
	}

	public void llenarArreglos() {
		multiplosTres[0] = 3;
		multiplosCinco[0] = 5;
		for(int i = 1; i < dimension; i++) {
			multiplosTres[i] = multiplosTres[i-1] + 3;
			multiplosCinco[i] += multiplosCinco[i-1] + 5;
		}
	}
	
	public void mostrarArreglo(int[] arregloAMostrar) {
		for(int i = 0; i < dimension; i++) {
			System.out.print("[" + arregloAMostrar[i] + "]");
		}
		System.out.println();
	}
	
	public void sumarArreglos() {
		for(int i = 0; i < dimension; i++) {
			sumaArreglos[i] = multiplosTres[i] + multiplosCinco[i];
		}
	}
	
	public void comprobarMultiplosTres() {
		int cont = 0;
		for(int i = 0; i < dimension; i++) {
			if(sumaArreglos[i] % 3 == 0) {
				System.out.println("El número " + sumaArreglos[i] + " es múltiplo de 3");
				cont++;
			}
		}
		System.out.println("Se han encontrado " + cont + " múltiplos de 3");
	}
	
	public int promedioSuma() {
		int sumaTotal = 0, promedio = 0;
		for(int i = 0; i < dimension; i++) {
			sumaTotal += sumaArreglos[i];
		}
		return promedio = sumaTotal / dimension;
	}
}
