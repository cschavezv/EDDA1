package arbol1;

import java.util.Scanner;

public class PrincipalArbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbol arbol1 = new Arbol();
		Scanner sc = new Scanner(System.in);
		int opcion = 0, valor = 0;
		
		
		do {
			System.out.println("\n--MENÚ--");
			System.out.println("1. Insertar nodo");
			System.out.println("2. Buscar nodo");
			System.out.println("3. Imprimir Pre Order");
			System.out.println("4. Imprimir In Order");
			System.out.println("5. Imprimir Post Order");
			System.out.println("6. Salir");
			System.out.println("¿Qué opción desea?");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("--Insertar un nodo--");
					System.out.println("Ingrese el valor a insertar: ");
					valor = sc.nextInt();
					arbol1.Insertar(valor);
					break;
				case 2:
					System.out.println("--Buscar un nodo--");
					System.out.println("Ingrese el valor a buscar: ");
					valor = sc.nextInt();
					arbol1.ejecutarBusqueda(valor);
					break;
				case 3:
					arbol1.ejecutarPreOrder();
					break;
				case 4:
					arbol1.ejecutarInOrder();
					break;
				case 5:
					arbol1.ejecutarPostOrder();
					break;
				case 6:
					System.out.println("Gracias por usar el programa");
					break;
				default:
					System.out.println("Opción incorrecta.");
			}
		}while(opcion != 6);
	}
	
}
