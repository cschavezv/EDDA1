package Ejercicio2;

import java.util.Scanner;

public class PrincipalTablaNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de alumnos:");
        int numAlumnos = sc.nextInt();

        TablaNotas tabla = new TablaNotas(numAlumnos);
        tabla.GenerarNotas();

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
                    int alumno = tabla.AlumnoNotaAlta(max);
                    if (alumno != -1) {
                        int nota = tabla.Nota(alumno, max);
                        System.out.println("Alumno: " + (alumno + 1) + " tiene la nota más alta: " + nota + " en la materia: " + (max + 1));
                    } else {
                        System.out.println("Materia inválida");
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