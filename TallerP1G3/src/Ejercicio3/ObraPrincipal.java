package Ejercicio3;

import java.util.Scanner;

//Se ha usado una bicola restringida en inserciones por el frente. Esto porque se guarda lo que es una cola como tal, usando la estructura FIFO, pero también
//se requiere que la maquinaria salga por el final en el caso de que sea necesario. Se restringe que entren por el frente porque no tiene sentido hace una cola
//de maquinaria cuando una se va a meter en frente de todas las que están esperando.

public class ObraPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Maquinaria bicolaMaquinaria = new Maquinaria(5);
		int opcion;
		String maquina;
		do {
			System.out.println("\n--- BIENVENIDO A LA OBRA ---");
			System.out.println("1. Insertar al final");
			System.out.println("2. Eliminar al frente");
			System.out.println("3. Eliminar al final");
			System.out.println("4. Mostrar bicola");
			System.out.println("5. Salir");
			System.out.println("Eliga la opción:");
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("¿Qué máquina va a ingresar a la cola?");
				maquina = sc.next();
				bicolaMaquinaria.insertarFinal(maquina);
				break;
			case 2:
				bicolaMaquinaria.eliminarFrente();
				break;
			case 3:
				bicolaMaquinaria.eliminarFinal();
				break;
			case 4:
				bicolaMaquinaria.mostrarElementos();
				break;
			case 5:
				System.out.println("Saliendo de la construcción...");
				break;
			default:
				System.out.println("Opción inválida.");
				break;
			}
		}while(opcion != 5);
		sc.close();
	}
}

