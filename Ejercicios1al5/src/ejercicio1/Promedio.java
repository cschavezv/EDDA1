package ejercicio1;

import java.util.Scanner;

public class Promedio {

    double[] registro;
    double promedio = 0;

    public Promedio() {
        this.registro = new double[10];
    }

    public void agregarN() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < registro.length; i++) {
        	 System.out.println("Introduzca la nota del estudiante " + (i+1) + ":");
            double notas = sc.nextDouble();

            if (notas >= 0 && notas <= 10) {
                this.registro[i] = notas;
            } else {
                System.out.println("Las notas deben estar en el rango de calificación (0-10).");
                i--;
            }
        }
    }

    public void imprimir() {
        for (int i = 0; i < registro.length; i++) {
        	System.out.println("Estudiante " + (i+1));
            System.out.println("[" + registro[i] + "] ");
        }
    }

    public void calcPromedio() {
        double suma = 0;

        for (double nota : registro) {
            suma += nota;
        }

        promedio = suma / registro.length *100/100;
        System.out.println("El promedio de las notas es: " + promedio);
    }
}

