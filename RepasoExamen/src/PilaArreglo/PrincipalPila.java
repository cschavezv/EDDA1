package PilaArreglo;

import java.util.Scanner;

public class PrincipalPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		System.out.println("¿Qué tamaño de pila requiere?");
		int tamanio = sc.nextInt();
		
		Pila miPila = new Pila(tamanio);
		
		do{
			System.out.println("MENÚ");
			System.out.println("1. Insertar un nodo");
			System.out.println("2. Quitar un nodo");
			System.out.println("3. Vaciar pila");
			System.out.println("4. Elemento de la cima");
			System.out.println("5. Tamaño de la pila");
			System.out.println("6. Mostrar pila");
			System.out.println("7. Salir");
			System.out.println("Ingrese la opción:");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Dato a ingresar:");
				int dato = sc.nextInt();
				miPila.push(dato);
				break;
			case 2:
				miPila.pop();
				System.out.println("Dato eliminado con éxito");
				break;
			case 3:
				miPila.limpiarPila();
				System.out.println("Pila vaciada con éxito");
				break;
			case 4:
				miPila.obtenerElementoCima();
				break;
			case 5:
				miPila.tamanioPila();
				break;
			case 6:
				miPila.mostrarPila();
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
