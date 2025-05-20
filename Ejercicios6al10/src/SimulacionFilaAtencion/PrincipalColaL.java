package SimulacionFilaAtencion;

import java.util.Scanner;

public class PrincipalColaL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ColaL colaBanco = new ColaL();
		int opcion;
		String nombre;
		
		do {
			System.out.println("\n---BIENVENIDO AL BANCO PICHINCHA---");
			System.out.println("1. Ingresar persona en la cola");
			System.out.println("2. Atender persona");
			System.out.println("3. Mostrar cola");
			System.out.println("4. Salir");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
			    System.out.println("Qué persona va a ingresar?");
			    nombre = sc.next();
				
			    try {
			        int pasos = 5; // Distancia para caminar
			        for (int i = pasos; i >= 0; i--) {
			            String espacio = " ".repeat(i * 2);
			            System.out.print(espacio + " O \n");
			            System.out.print(espacio + "/|\\\n");
			            System.out.print(espacio + "/ \\\n");
			            Thread.sleep(100);
			        }
			    } catch (InterruptedException e) {
			        Thread.currentThread().interrupt();
			    }

			    colaBanco.encolarPersona(nombre);
				break;
			case 2:
			    try {
			        int pasos = 5;
			        for (int i = 0; i <= pasos; i++) {
			            String espacio = " ".repeat(i * 2);

			            System.out.print(espacio + " O \n");
			            System.out.print(espacio + "/|\\\n");
			            System.out.print(espacio + "/ \\\n");
			            Thread.sleep(100);
			        }
			    } catch (InterruptedException e) {
			        Thread.currentThread().interrupt();
			    }
			    
			    colaBanco.desencolarPersona();
				break;
			case 3:
				colaBanco.mostrarCola();
				break;
			case 4:
				System.out.println("Gracias por visitar Banco Pichincha :D");
				break;
			}
		}while(opcion != 4);
	}

}
