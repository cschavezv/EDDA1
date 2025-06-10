package Ejercicio2;

import java.util.Random;

public class TablaNotas {
    int numeroAlumnos;
    private int[][] notas;

    public TablaNotas(int n) {
        this.numeroAlumnos = n;
        this.notas = new int[n][4];
    }

    public void GenerarNotas() {
        Random random = new Random();
        for (int i = 0; i < numeroAlumnos; i++) {
            for (int j = 0; j < 4; j++) {
                notas[i][j] = random.nextInt(6) + 15;
            }
        }
    }

    public void ImprimirTabla() {
        System.out.println("\nTabla de notas.");
        System.out.println("Alumno | Materia1 | Materia2 | Materia3 | Materia4");
        for (int i = 0; i < numeroAlumnos; i++) {
            System.out.print("   " + (i + 1) + "    ");
            for (int j = 0; j < 4; j++) {
                System.out.print("   " + notas[i][j] + "      ");
            }
            System.out.println();
        }
    }

    public double PromedioMateria(int materia) {
        if (materia < 0 || materia >= 4) {
            return -1;
        }
        double suma = 0;
        for (int i = 0; i < numeroAlumnos; i++) {
            suma += notas[i][materia];
        }
        return suma / numeroAlumnos;
    }

    public int AlumnoNotaAlta(int materia) {
        if (materia < 0 || materia >= 4) {
            return -1;
        }
        int notaMax = notas[0][materia];
        int alumno = 0;
        for (int i = 1; i < numeroAlumnos; i++) {
            if (notas[i][materia] > notaMax) {
                notaMax = notas[i][materia];
                alumno = i;
            }
        }
        return alumno;
    }

    public int Nota(int alumno, int materia) {
        return notas[alumno][materia];
    }
}