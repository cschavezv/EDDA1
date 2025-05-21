//Una tienda atiende a los clientes en el orden en que llegan. Cada cliente tiene un nombre y una cantidad de productos. Crea un programa que:

//Agregue clientes a la cola.
//Atienda al cliente en turno (elimina de la cola).
//Muestre la cola actual de clientes.
//Cree un menú de inicio que le permita al usuario decidir qué acción va a realizar.
//Cree la solución en Java y suba el archivo .zip correspondiente.



package ClientesCola;

import java.util.Scanner;

public class PrincipalColaClientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ColaClientes cola = new ColaClientes();
		String nombre;
		int cantidadProductos, opcion;
		
		do {
			System.out.println("\n--MENÚ--");
			System.out.println("1. Ingresar cliente");
			System.out.println("2. Atender cliente");
			System.out.println("3. Mostrar cola de clientes");
			System.out.println("4. Salir");
			System.out.println("Ingresa la opción:");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("INGRESAR CLIENTE A LA COLA");
				System.out.println("Ingresa el nombre de la persona:");
				nombre = sc.next();
				System.out.println("Ingresa la cantidad de productos que lleva:");
				cantidadProductos = sc.nextInt();
				cola.ingresarPersona(nombre, cantidadProductos);
				break;
			case 2:
				System.out.println("ATENDER CLIENTE");
				cola.atenderPersona();
				break;
			case 3:
				System.out.println("MOSTRAR COLA DE CLIENTES");
				cola.mostrarCola();
				break;
			case 4:
				System.out.println("Gracias por visitar :D");
				break;
			default:
				System.out.println("Opción incorrecta. Ingresa nuevamente");
			}
		}while(opcion != 4);
	}

}
