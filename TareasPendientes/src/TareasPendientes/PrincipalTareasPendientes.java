//Una aplicación de tareas pendientes almacena las tareas diarias como una estructura lineal y enlazada. Cada tarea tiene un nombre y un estado (pendiente o completada). Implemente un programa que:

//Agregue tareas secuenciales según su orden de llegada.
//Permita marcar una tarea como completada (lo que equivale a sacarla de la lista de tareas pendientes).
//Muestre todas las tareas pendientes.
//Cree un menú de inicio que le permita al usuario decidir que tarea va a realizar.
//Cree la solución en Java y suba el archivo .zip correspondiente.


package TareasPendientes;

import java.util.Scanner;

public class PrincipalTareasPendientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Cola colaTareas = new Cola();
		int opcion;
		
		do {
			System.out.println("\n--MENÚ--");
			System.out.println("1. Ingresar tarea");
			System.out.println("2. Completar tarea");
			System.out.println("3. Mostrar tareas");
			System.out.println("4. Salir");
			System.out.println("Ingresa la opción:");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("INGRESAR TAREA A LA COLA");
				colaTareas.ingresarTarea();
				break;
			case 2:
				System.out.println("COMPLETAR TAREA");
				colaTareas.completarTarea();
				
				break;
			case 3:
				System.out.println("MOSTRAR COLA DE CLIENTES");
				colaTareas.mostrarCola();
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción incorrecta. Ingresa nuevamente");
			}
		}while(opcion != 4);
	}
}

