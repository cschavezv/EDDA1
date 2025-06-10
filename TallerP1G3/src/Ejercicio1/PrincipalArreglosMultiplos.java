package Ejercicio1;

import java.util.Scanner;

public class PrincipalArreglosMultiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		System.out.println("Ingrese la dimensión de los arreglos: ");
		n = sc.nextInt();
		
		ArreglosMultiplos arreglos = new ArreglosMultiplos(n);
		arreglos.llenarArreglos();
		System.out.println("Arreglo de números múltiplos de 3:");
		arreglos.mostrarArreglo(arreglos.multiplosTres);
		System.out.println("Arreglo de números múltiplos de 5:");
		arreglos.mostrarArreglo(arreglos.multiplosCinco);
		System.out.println("Arreglo con la suma de los dos arreglos anteriores:");
		arreglos.sumarArreglos();
		arreglos.mostrarArreglo(arreglos.sumaArreglos);
		arreglos.comprobarMultiplosTres();
		System.out.println("El promedio del tercer arreglo es: " + arreglos.promedioSuma());
	} 	
}
