package ListaDoble;

import java.util.Scanner;

public class PrincipalListaD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaD miListaDoble = new ListaD();
		Scanner sc = new Scanner(System.in);
		int opcion = 0, dato = 0;
		
		do{
			System.out.println("MENÚ");
			System.out.println("1. Insertar un nodo por el inicio");
			System.out.println("2. Insertar un nodo por el final");
			System.out.println("3. Mostrar lista de inicio a fin");
			System.out.println("4. Mostrar lista de fin a inicio");
			System.out.println("5. Buscar nodo");
			/*System.out.println("6. Mostrar pila");
			System.out.println("7. Salir");*/
			System.out.println("Ingrese la opción:");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Dato a ingresar por el inicio:");
				dato = sc.nextInt();
				miListaDoble.ingresarInicio(dato);
				break;
			case 2:
				System.out.println("Dato a ingresar por el final:");
				dato = sc.nextInt();
				miListaDoble.ingresarFin(dato);
				break;
			case 3:
				System.out.println("Mostrar pila de inicio a fin");
				miListaDoble.mostrarListaInicioFin();
				break;
			case 4:
				System.out.println("Mostrar pila de fin a inicio");
				miListaDoble.mostrarListaFinInicio();
				break;
			case 5:
				System.out.println("Dato a buscar:");
				dato = sc.nextInt();
				System.out.println("El dato " + dato + " se encuentra en la posición " + miListaDoble.buscarNodo(dato));
				break;
			case 6:

				break;
			case 7:
				System.out.println("Saliendo del programa...");
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
		}while(opcion != 7);
	}

}
