package bicolaArreglos;

import java.util.Scanner;

public class PrincipalBicolaARestrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BicolaARestrin bicolaRestrin = new BicolaARestrin(3);
		int opcion, valor;
		do {
			System.out.println("\n--- MENÚ BICOLA (RE) ---");
			System.out.println("1. Insertar al final");
			System.out.println("2. Eliminar al frente");
			System.out.println("3. Eliminar al final");
			System.out.println("4. Mostrar bicola");
			System.out.println("5. Verificar si está vacía");
			System.out.println("6. Verificar si está llena");
			System.out.println("7. Salir");
			System.out.println("Eliga la opción:");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Valor a insertar: ");
				valor = sc.nextInt();
				try {
					bicolaRestrin.insertarFinal(valor);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				try {
					bicolaRestrin.eliminarFrente();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				try {
					bicolaRestrin.eliminarFinal();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				bicolaRestrin.mostrar();
				break;
			case 5:
				System.out.println(bicolaRestrin.estaVacia()? "La bicola está vacía" : "La bicola no está vacía");
				break;
			case 6:
				System.out.println(bicolaRestrin.estaLlena()? "La bicola está llena" : "La bicola no está llena");
				break;
			case 7:
				System.out.println("Saliendo...");
				break;
				default:
					System.out.println("Opción inválida.");
			}
		}while(opcion != 7);
		sc.close();
	}
}