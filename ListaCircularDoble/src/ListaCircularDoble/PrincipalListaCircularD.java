package ListaCircularDoble;

import java.util.Scanner;

public class PrincipalListaCircularD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ListaCircularD miListaCircularD = new ListaCircularD();
		int dato = 0, opcion = 0;
		
		do {
			System.out.println("\n------MENU------");
			System.out.println("1. Agregar nodo\n" + 
								"2. Borrar nodo\n" +
								"3. Imprimir lista horario\n" +
								"4. Imprimir lista antihorario\n" + 
								"5. Salir\n");
			System.out.println("Ingrese la opción:");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("AGREGAR NODO");
				System.out.println("Ingrese el dato para agregar:");
				dato = sc.nextInt();
				miListaCircularD.ingresarNodo(dato);
				System.out.println("Se ha agregado el nodo correctamente");
				break;
			case 2:
				System.out.println("BORRAR NODO");
				System.out.println("Ingrese el dato a buscar y eliminar:");
				dato = sc.nextInt();
				break;
			case 3:
				System.out.println("IMPRIMIR LISTA EN SENTIDO HORARIO");
				miListaCircularD.mostrarListaH();
				break;
			case 4:
				System.out.println("IMPRIMIR LISTA EN SENTIDO ANTIHORARIO");
				miListaCircularD.mostrarListaAH();
				break;
			case 5:
				System.out.println("Cerrando el programa...");
				break;
			default:
				System.out.println("Opción inválida, ingrese nuevamente.");
				break;
			}
		}while(opcion != 5);
	}

}
