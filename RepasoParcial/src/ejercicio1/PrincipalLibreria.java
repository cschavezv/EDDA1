package ejercicio1;

import java.util.Scanner;

public class PrincipalLibreria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuántos libros quiere ingresar?");
		int numLibros = sc.nextInt();
		Libreria lib = new Libreria(numLibros);
		lib.ingresarLibros();
		lib.imprimir();
		System.out.println("Número de libros sin existencias de lujo: " + lib.noTieneDeLujo());
	}

}
