package ejercicio1;

import java.util.Scanner;

public class PrincipalPromedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Promedio prom = new Promedio();
		int opcion = 0;
		
		do {
		System.out.println("-------------------MENU-------------------");
		System.out.println("1.Añadir notas\n2.Ver registro\n3.calcular promedio de estudiante\n4.Salir");
		
		opcion = sc.nextInt();
		
		switch (opcion) {
		case 1: {
			prom.agregarN();
			break;
		}
		case 2: {
			prom.imprimir();
			break;
		}
		case 3: {
			prom.calcPromedio();
			break;
		}
		case 4:{
			System.out.println("Cerrando..................");
			System.exit(0);
			break;
		}
		default:
			throw new IllegalArgumentException();
		}
		}while (opcion!=4);
		sc.close();
	}
}
