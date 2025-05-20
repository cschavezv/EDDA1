package EjemploColasListas;

import java.util.Scanner;

public class PrincipalColasL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ColaLista miCola = new ColaLista();
		int opcion = 0, dato = 0;
		
		do {
			System.out.println("*-----MENU-----*");
			System.out.println("1. Insertar nodo\n" + 
								"2. Eliminar nodo\n" +
								"3. Imprimir cola\n" +
								"4. Salir\n" +
								"Elige la opción:");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("\n-INSERTAR NODO-");
				System.out.println("Ingrese el dato: ");
				dato = sc.nextInt();
				miCola.encolar(dato);
				break;
			case 2:
				System.out.println("\n-ELIMINAR NODO-");
				try {
					miCola.decolar();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;
			case 3:
				System.out.println("\n-IMPRIMIR PILA-");
				try {
					miCola.imprimir();
				} catch (Exception e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;
			case 4:
				System.out.println("Cerrando programa...");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value");
			}
		}while(opcion != 4);
	}

}
