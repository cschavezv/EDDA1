package ListaDoble;

import java.util.Scanner;

public class PrincipalListaDoble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dato, opcion;
		ListaDoble miListaDoble = new ListaDoble();
		
		do {
			System.out.println("\n--------MENU--------");
			System.out.println("1. Agregar el nodo al inicio\n" +
								"2. Agregar el nodo al final\n" +
								"3. Borrar nodo al inicio\n" +
								"4. Borrar nodo al final\n"+
								"5. Buscar nodo\n" +
								"6. Borrar nodo específico\n" +
								"7. Imprimir de Inicio a Fin\n" + 
								"8. Imprimir de Fin a Inicio\n" +
								"9. Salir\n" +
								"Ingrese la opción:");
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("AGREGAR NODO AL INICIO");
				System.out.println("Ingrese dato:");
				dato = sc.nextInt();
				miListaDoble.agregarInicio(dato);
				break;
			case 2:
				System.out.println("AGREGAR NODO AL FINAL");
				System.out.println("Ingrese dato:");
				dato = sc.nextInt();
				miListaDoble.agregarFinal(dato);
				break;
			case 3:
				System.out.println("BORRAR NODO AL INICIO");
				System.out.println("Se ha borrado el dato del inicio\n");
				miListaDoble.borrarInicio();
				break;
			case 4:
				System.out.println("BORRAR NODO AL FINAL");
				System.out.println("Se ha borrado el dato del final\n");
				miListaDoble.borrarFinal();
				break;
			case 5:
				System.out.println("BUSCAR NODO");
				System.out.println("Ingrese el dato que desea buscar:");
				dato = sc.nextInt();
				miListaDoble.buscarNodo(dato);
				break;
			case 6:
				System.out.println("BORRAR NODO ESPECÍFICO");
				System.out.println("Ingrese el dato que desea borrar:");
				dato = sc.nextInt();
				miListaDoble.borrarEspecifico(dato);
				System.out.println("Se ha borrado el dato " + dato + "\n");
				break;
			case 7:
				System.out.println("IMPRIMIR DE INICIO A FIN");
				miListaDoble.imprimirInicioAFin();
				break;
			case 8:
				System.out.println("IMPRIMIR DE FIN A INICIO");
				miListaDoble.imprimirFinAInicio();
				break;
			case 9:
				System.out.println("Cerrando programa...");
				break;
			default:
				System.out.println("Opción no válida, seleccione otra.");
				break;
			}
		}while(opcion != 9);
		sc.close();
	}
}
