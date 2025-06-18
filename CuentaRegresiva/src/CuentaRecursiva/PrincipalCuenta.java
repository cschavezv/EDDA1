package CuentaRecursiva;

import java.util.Scanner;

public class PrincipalCuenta {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		CuentaRegresivaRecursiva cont = new CuentaRegresivaRecursiva();
		
		System.out.println("Ingrese le número limite: ");
		int limite = sc.nextInt();
		
		cont.conteo(limite);
	}
}
