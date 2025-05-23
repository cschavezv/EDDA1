package ejercicio6;

import java.util.Scanner;

public class MainListaDoble {

	public static void main(String[] args) {
		ListaDoble miLista1 = new ListaDoble();
		int opcion=0;
		int dato;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n_____________Menu____________");
			System.out.println("1. Agregar nodo al inicio");
			System.out.println("2. Agregar nodo al final");
			System.out.println("3. Imprimir lista de inicio a fin");
			System.out.println("4. Imprimir lista de fin a inicio");
			System.out.println("5. Eliminar nodo específico");
			System.out.println("6. Salir");
			System.out.println();
			System.out.print("Ingrese opcion: ");
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Agregar nodo al inicio.......");
				System.out.print("Ingrese dato: ");
				dato=sc.nextInt();
				miLista1.addInicio(dato);
				break;
			case 2:
				System.out.println("Agregar nodo al final.......");
				System.out.print("Ingrese dato: ");
				dato=sc.nextInt();
				miLista1.addFinal(dato);
				break;
			case 3:
				System.out.println("Imprimiendo.......");
				miLista1.imprimir();
				break;
			case 4:
				System.out.println("Imprimiendo.......");
				miLista1.imprimirFinInicio();
				break;
			case 5:
				System.out.println("Borrar un nodo especifico");
				System.out.println("Ingrese un dato a eliminar");
				dato=sc.nextInt();
				miLista1.borrarEspecifico(dato);
				break;
			case 6:
				System.out.println("Saliendo.......");
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
		} while (opcion!=6);
		sc.close();

	}

}
