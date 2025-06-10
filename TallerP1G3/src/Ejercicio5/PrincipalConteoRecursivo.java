package Ejercicio5;

import java.util.Scanner;

public class PrincipalConteoRecursivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ConteoRecursivo cont = new ConteoRecursivo();
		int n = 0;
		
		System.out.println("Ingrese el número: ");
		n = sc.nextInt();
		cont.cuentaRegresiva(n);
	}

}
