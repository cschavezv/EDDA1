package ejercicio2;

import java.util.Scanner;

public class PrincipalMCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MCD mcd = new MCD();
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese el valor de a: ");
		int a = sc.nextInt();
		
		System.out.println("Ingrese el valor de b: ");
		int b = sc.nextInt();
		
		System.out.println("El MCD de los valores " + a + " y " + b + " es: " + mcd.calcularMCD(a, b));
	}
}
