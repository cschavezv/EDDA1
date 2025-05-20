package ListaCircular;

import java.util.Scanner;

public class PrincipalListaCircular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ListaCircular miListaCircular = new ListaCircular();
		int dato = 0, opcion = 0;
		
		do {
			System.out.println("------MENU------");
			System.out.println("1. Agregar nodo\n" + 
								"2. Borrar nodo\n" +
								"3. Buscar nodo\n" +
								"4. Imprimir lista\n" + 
								"5. Salir\n");
			System.out.println("Ingrese la opción:");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("AGREGAR NODO");
				System.out.println("Ingrese el dato para agregar:");
				dato = sc.nextInt();
				miListaCircular.ingresarNodo(dato);
				System.out.println("Se ha agregado el nodo correctamente");
				break;
			case 2:
				System.out.println("BORRAR NODO");
				System.out.println("Ingrese el dato a buscar y eliminar:");
				dato = sc.nextInt();
				miListaCircular.borrarNodo(dato);
				break;
			case 3:
				System.out.println("BUSCAR NODO");
				System.out.println("Ingrese el dato a buscar:");
				dato = sc.nextInt();
				miListaCircular.buscarNodo(dato);
				break;
			case 4:
				System.out.println("IMPRIMIR LISTA");
				miListaCircular.imprimirLista();
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
