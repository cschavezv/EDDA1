package ejercicio2;

import java.util.Scanner;

public class PrincipalInvertido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Invertir conjuntos;
		int opcion, tamaño;
		
		System.out.println("De que tamaño deseea que sea el conjunto: ");
		tamaño = sc.nextInt();
		conjuntos = new Invertir(tamaño);
		
		do {
		System.out.println("----------------------Menu-------------------------");
		System.out.println("1.Crear conjunto\n2.Invertir orden del conjunto\n3.Salir");
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1: {
			
			conjuntos.ingresar();
			break;
		}
		case 2: {
			conjuntos.invertirOrden();
			conjuntos.imprimir();
			break;
		}
		case 3: {
			System.out.println("Cerrando...............");
			System.exit(0);
			break;
		}
		default:
			System.out.println("Opción inválida. Vuelva a ingresar.");;
		}
		
		}while(opcion != 3);
	sc.close();
	}
}
