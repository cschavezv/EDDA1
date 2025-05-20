package PilaListas;

import java.util.Scanner;

public class PrincipalPilaL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		PilaL miPila = new PilaL();
		int opcion = 0, dato = 0;
		
		do {
			System.out.println("*-----MENU-----*");
			System.out.println("1. Insertar nodo\n" + 
								"2. Eliminar nodo\n" +
								"3. Imprimir nodo\n" +
								"4. Primer elemento\n" +
								"5. Vaciar la pila\n" +
								"6. Salir\n" +
								"Elige la opción:");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("\n-INSERTAR NODO-");
				System.out.println("Ingrese el dato: ");
				dato = sc.nextInt();
				miPila.push(dato);
				break;
			case 2:
				System.out.println("\n-ELIMINAR NODO-");
				miPila.pop();
				break;
			case 3:
				System.out.println("\n-IMPRIMIR PILA-");
				miPila.imprimir();
				break;
			case 4:
				System.out.println("\n-PRIMER ELEMENTO-");
				miPila.primerElementoCima();
				break;
			case 5:
				System.out.println("-VACIAR LA PILA-");
				miPila.limpiarPila();
				break;
			case 6:
				break;
			default:
				throw new IllegalArgumentException("Unexpected value");
			}
		}while(opcion != 6);
	}

}
