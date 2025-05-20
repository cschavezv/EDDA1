package ContadorTurnos;

import java.util.Scanner;

public class PrincipalColaL {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ColaL cola = new ColaL();
		int opcion;
		
		do {
			System.out.println("\n---BIENVENIDO/A---");
			System.out.println("1. Ingresar persona en la cola");
			System.out.println("2. Atender persona");
			System.out.println("3. Mostrar cola");
			System.out.println("4. Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				cola.encolarPersona();
				break;
			case 2:
				cola.atenderPersona();
				break;
			case 3:
				cola.mostrarCola();
				break;
			case 4:
				System.out.println("Gracias por visitarnos :D");
				break;
			}
		}while(opcion != 4);
	}
}