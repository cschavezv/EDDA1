package ejercicio8;

import java.util.Scanner;

public class PrincipalEjercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String palabra;
		int opcion;
		Pila palabraInvertida = new Pila();
		do {
			System.out.println("---Inversor de palabra---");
			System.out.println("1. Invertir palabra");
			System.out.println("2. Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			switch(opcion) {
			case 1:
				System.out.println("Ingrese la palabra a invertir");
				palabra = sc.next();
				
				for(int i=0; i<palabra.length(); i++) {
					palabraInvertida.push(palabra.charAt(i));
				}
				
				System.out.println("La palabra invertida es: ");
				palabraInvertida.imprimir();
				break;
			case 2:
				System.out.println("Gracias por usar el programa");
				break;
			default:
				System.out.println("Opcion invalida, intentelo de nuevo");
				break;
			}
			palabraInvertida.vaciarPila();
		}while(opcion!=2);
		
		sc.close();
	}

}
