package Ejercicio2;

import java.util.Scanner;

public class PrincipalTablaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de alumnos:");
        int numAlumnos = sc.nextInt();

        TablaNotas tabla = new TablaNotas(numAlumnos);
        tabla.GenerarNotas();
        tabla.ImprimirTabla();

        int opcion;

        do {
            System.out.println("\n¿Qué cálculo desea ejecutar?");
            System.out.println("1. Promedio de notas por materia");
            System.out.println("2. Alumno con la nota más alta en una materia");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de la materia (1-4): ");
                    int promedio = sc.nextInt() - 1;
                    tabla.ImprimirTabla();
                    double prom = tabla.PromedioMateria(promedio);
                    if (prom != -1) {
                        System.out.println("Promedio de la materia " + (promedio + 1) + ": " + prom);
                    } else {
                        System.out.println("Materia inválida");
                    }
                    break;

                case 2:
                	System.out.print("Ingrese el número de la materia (1-4): ");
                	int max = sc.nextInt() - 1;
                	int[] alumnos = tabla.AlumnosNotaAlta(max);
                	if (alumnos == null) {
                	    System.out.println("Materia inválida");
                	} else {
                	    int nota = tabla.Nota(alumnos[0], max);
                	    System.out.println("Los alumnos con la nota más alta (" + nota + ") en la materia " + (max + 1) + " son:");
                	    for (int i = 0; i < alumnos.length; i++) {
                	        System.out.println(" - Alumno " + (alumnos[i] + 1));
                	    }
                	}
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }
}