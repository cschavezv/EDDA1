package TablaHash_DoubleHashing;

import java.util.Scanner;

public class PrincipalTablaHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		Datos_TablaHash datos = new Datos_TablaHash(10);
		TablaHash tabla = new TablaHash(datos);
		int clave = 0;
		boolean claveCorrecta = true;
		
		do{
			System.out.println("---MENÚ TABLA HASH---");
			System.out.println("1. Insertar una clave");
			System.out.println("2. Eliminar una clave");
			System.out.println("3. Mostrar contenido de la tabla");
			System.out.println("4. Salir");
			System.out.println("Elija la opción: ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				do {
					System.out.println("Ingrese la clave: ");
					clave = sc.nextInt();
					if(clave <= 0) {
						System.out.println("Solo se permiten claves mayores a 0.");
						claveCorrecta = false;
					}
				}while(!claveCorrecta);
				tabla.insertarClave(clave);
				break;
			case 2:
				do {
					System.out.println("Ingrese la clave a eliminar: ");
					clave = sc.nextInt();
					if(clave <= 0) {
						System.out.println("Solo se permiten claves mayores a 0.");
						claveCorrecta = false;
					}
				}while(!claveCorrecta);
				tabla.eliminarClave(clave);
				break;
			case 3:
				tabla.mostrarTabla();
				break;
			case 4:
				System.out.println("¡Gracias por usar Tabla Hash!");
				break;
			default:
				System.err.println("Opción no válida. Ingresa nuevamente...");
				break;
			}
		}while(opcion < 4);
	}
}
