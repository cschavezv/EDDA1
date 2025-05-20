package TablaNotas;

import java.util.Random;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double[][] tablaNotas;
		double sumaTotal = 0, prom = 0, aux = 0;
		int n = 0, numMateria = 0;
		
		//1.       El usuario proporcione el número de alumnos (valor de n).
		System.out.println("Ingrese el número de alumnos: ");
		n = sc.nextInt();
		
		// Las notas que muestra la tabla se generen de forma aleatoria. Sus valores deben fluctuar entre 15 y 20 y  La tabla de notas se imprima en consola
		System.out.println("Las notas son las siguientes:");
		Random rd = new Random();
		tablaNotas =  new double[4][n];
		for (int i = 0; i < tablaNotas.length; i++) {
			System.out.print("Materia " + (i+1) + ":");
			for(int j = 0; j < tablaNotas[0].length; j++) {
				tablaNotas[i][j] = rd.nextDouble(15, 20);
				System.out.print("[" + String.format("%.2f", tablaNotas[i][j]) + "]");
			}
			System.out.println();
		}
		
		//Menu
		do {
			System.out.println("Ingrese la opción:");
			System.out.println("1. Promedio de notas por materia");
			System.out.println("2. Alumno con mayor nota en una materia");
			System.out.println("3. Salir");
			n = sc.nextInt();
			switch (n) {
			case 1:
				System.out.println("Ingrese la materia de la que se quiere saber el promedio: ");
				numMateria = sc.nextInt();
				for (int j = 0; j < tablaNotas[0].length; j++) {
					sumaTotal += tablaNotas[numMateria-1][j];	
				}
				prom = sumaTotal/tablaNotas[0].length;
				System.out.println("El promedio de la materia " + numMateria + " es: " + String.format("%.2f", prom));
				break;
			case 2:
				System.out.println("Ingrese la materia de la que se quiere saber la nota mas alta: ");
				numMateria = sc.nextInt();
				aux = tablaNotas[numMateria-1][0];
				for (int j = 0; j < tablaNotas[0].length; j++) {
					if(aux < tablaNotas[numMateria-1][j]) {
						aux = tablaNotas[numMateria-1][j];
					}
				}
				System.out.println("La nota más alta es: " + String.format("%.2f", aux));
				break;
			default:
				break;
			}
		}while(n != 3);
			
	}

}
