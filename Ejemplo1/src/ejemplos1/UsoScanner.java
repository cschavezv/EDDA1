package ejemplos1;

import java.util.Scanner;

public class UsoScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nombre, apellido;
		int edad;
		
		System.out.println("Edad:");
		edad = sc.nextInt();
		sc.nextLine(); //hacer que el programa deje de esperar un entero porque el siguiente dato será String
		
		System.out.println("Nombre:");
		nombre = sc.nextLine();
		
		System.out.println("Apellido:");
		apellido = sc.nextLine();
		
		System.out.println("Su nombre es " + nombre + " " + apellido + " tiene " + edad + " anios.");
	}
}
