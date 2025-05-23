package ejercicio4;

import java.util.Scanner;

public class PrincipalLista {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
        ListaNombres lista = new ListaNombres();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Insertar nombre");
            System.out.println("2. Imprimir lista");
            System.out.println("3. Buscar nombre");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    lista.insertarAlFinal(nombre);
                    break;
                case 2:
                    lista.imprimirLista();
                    break;
                case 3:
                    System.out.print("Ingrese nombre a buscar: ");
                    String buscado = sc.nextLine();
                    int pos = lista.buscarNombre(buscado);
                    if (pos != -1) {
                        System.out.println("Nombre encontrado en la posición: " + pos);
                    } else {
                        System.out.println("Nombre no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        sc.close();
    
    } 
}
