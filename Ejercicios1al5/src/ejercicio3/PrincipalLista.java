package ejercicio3;

import java.util.Scanner;

public class PrincipalLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ListaPais miLista = new ListaPais();
		int opcion;
		String pais;
		do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar un país");
            System.out.println("2. Mostrar lista de países");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del país: ");
                    pais = sc.nextLine();
                    miLista.insertarAlFinal(pais);
                    break;
                case 2:
                    miLista.imprimirLista();
                    break;
                case 3:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 3);
        sc.close();
	}

}
