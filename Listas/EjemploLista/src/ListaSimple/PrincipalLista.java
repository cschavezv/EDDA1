package ListaSimple;

import java.util.Scanner;

public class PrincipalLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Lista miLista1 = new Lista();
		int opcion = 0, dato;
		
		do {
			System.out.println("\n--------MENU--------");
			System.out.println("1. Agregar el nodo al inicio\n" +
								"2. Agregar el nodo al final\n" +
								"3. Imprimir lista\n" +
								"4. Borrar nodo al inicio\n" +
								"5. Borrar nodo al final\n"+
								"6. Buscar nodo\n" +
								"7. Borrar nodo específico\n" +
								"8. Salir\n" +
								"Ingrese la opción:");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("AGREGAR NODO AL INICIO");
				System.out.println("Ingrese dato:");
				dato = sc.nextInt();
				miLista1.agregarInicio(dato);
				break;
			case 2:
				System.out.println("AGREGAR NODO AL FINAL");
				System.out.println("Ingrese dato:");
				dato = sc.nextInt();
				miLista1.agregarFinal(dato);
				break;
			case 3:
				miLista1.imprimirLista();
				break;
			case 4:
				System.out.println("BORRAR NODO AL INICIO");
				miLista1.borrarInicio();
				System.out.println("Se ha borrado el dato del inicio\n");
				break;
			case 5:
				System.out.println("BORRAR NODO AL FINAL");
				miLista1.borrarFinal();
				System.out.println("Se ha borrado el dato del final\n");
				break;
			case 6:
				System.out.println("BUSCAR NODO");
				System.out.println("Ingrese el dato que desea buscar:");
				dato = sc.nextInt();
				miLista1.buscarNodo(dato);
				break;
			case 7:
				System.out.println("BORRAR NODO ESPECÍFICO");
				System.out.println("Ingrese el dato que desea borrar:");
				dato = sc.nextInt();
				miLista1.borrarEspecifico(dato);
				break;
			case 8:
				System.out.println("Cerrando programa...");
				break;
			default:
				System.out.println("Opción no válida, seleccione otra.");
				break;
			}
		}while(opcion != 8);
		sc.close();
	}

}
