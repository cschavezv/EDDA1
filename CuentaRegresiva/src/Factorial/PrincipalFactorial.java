package Factorial;

import java.util.Scanner;

public class PrincipalFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FactorialRecursivo fact =  new FactorialRecursivo();
		int n = 0;
		
		System.out.println("Ingresa el número del que quieres el factorial: ");
		n = sc.nextInt();
		
		System.out.println("El factorial de " + n + " es " + fact.factorial(n));
	}
}
