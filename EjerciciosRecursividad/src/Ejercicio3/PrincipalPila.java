package Ejercicio3;

import java.util.Scanner;

public class PrincipalPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila miPila = new Pila();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el número de nodos que desea en la pila: ");
		int numNodos = sc.nextInt();
		
		while(numNodos != 0) {
			miPila.push();
			numNodos--;
		}
		miPila.mostrar();
		
		System.out.println("Borrando todos los datos con recursividad...");
		miPila.vaciar(miPila);
		miPila.mostrar();
	}

}
