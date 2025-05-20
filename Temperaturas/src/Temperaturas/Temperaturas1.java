package Temperaturas;

import java.util.Iterator;
import java.util.Scanner;

public class Temperaturas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Declarar y crear el arreglo bidimensional, filas= ciudad, colum= dia
		
        double[][] temperaturas = new double[2][3];
        double promTotal=0.0, sumaTotal=0.0, aux = 0.0, temperatura = 0.0;
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        int numCiudad = 0, numDia = 0;

        //filas
        for (int ciudad = 0; ciudad < temperaturas.length; ciudad++) {
        //columnas
        	for (int dia = 0; dia < temperaturas[ciudad].length; dia++) {
        		temperaturas[ciudad][dia] = Math.round((17 + Math.random() * (28 - 17)) * 100.0) / 100.0;
            }
        }

        // Imprimir tabla de temperaturas
        System.out.println("Registro de temperaturas máximas por ciudad y semana \n");
        for (int ciudad = 0; ciudad < temperaturas.length; ciudad++) {
            System.out.print("Ciudad " + (ciudad + 1) + ": ");
            for (int dia = 0; dia < temperaturas[ciudad].length; dia++) {
                System.out.print(temperaturas[ciudad][dia] + "°C ");
            }
            System.out.println();
        }
        
        
        do {
        	System.out.println("\n¿Qué cálculo desea hacer?");
        	System.out.println("1. Promedio de temperaturas");
        	System.out.println("2. Promedio de temperaturas de una ciudad");
        	System.out.println("3. Temperatura más baja de una ciudad");
        	//Practicar con 3 cosas más
        	System.out.println("4. Temperatura de un dia y ciudad específicos");
        	System.out.println("5. Promedio de temperaturas en un dia");
        	System.out.println("6. Temperatura más alta");
        	System.out.println("7. Salir");
        	opcion = sc.nextInt();
        	
        	switch (opcion) {
				case 1:
					promTotal = sumaTotal/(temperaturas.length*temperaturas[0].length); //esto devuelve el número de filas*
			        System.out.println("\nPromedio de temperaturas: " + String.format("%.2f", promTotal) + "°C");
					break;
				case 2:
					System.out.println("Ingrese el número de la ciudad: ");
					numCiudad = sc.nextInt();
					sumaTotal = 0;
					promTotal = 0;
					for (int dia = 0; dia < temperaturas[0].length; dia++) {
						sumaTotal += temperaturas[numCiudad-1][dia];
					}
					promTotal = sumaTotal/temperaturas[0].length;
					System.out.println("El promedio de la ciudad " + numCiudad + " es: " + String.format("%.2f", promTotal) + "°C");
					break;
				case 3:
					System.out.println("Ingrese el número de la ciudad: ");
					numCiudad = sc.nextInt();
					aux = temperaturas[0][0];
					for (int dia = 1; dia < temperaturas[0].length; dia++) {
						if(aux > temperaturas[numCiudad-1][dia]) {
							aux = temperaturas[numCiudad-1][dia];
						}
					}
					System.out.println("\nLa temperatura más baja de la ciudad" + numCiudad + " es: " + String.format("%.2f", aux) + "°C");
					break;
				case 4:
					System.out.println("¿Qué ciudad quieres revisar?");
					numCiudad = sc.nextInt();
					System.out.println("¿Qué día de la semana? (Del 1 al 3)");
					numDia = sc.nextInt();
					temperatura = temperaturas[numCiudad-1][numDia-1];
					System.out.println("La temperatura de la ciudad " + numCiudad + " en el dia " + numDia + " es: " + String.format("%.2f", temperatura) + "°C");
					break;
				case 5:
					System.out.println("¿De qué día quieres saber el promedio?");
					numDia = sc.nextInt();
					sumaTotal = 0;
					promTotal = 0;
					for (int ciudad = 0; ciudad < temperaturas.length; ciudad++) {
						sumaTotal += temperaturas[ciudad][numDia-1];
					}
					promTotal = sumaTotal/temperaturas.length;
					System.out.println("La temperatura promedio del dia " + numDia + " en todas las ciudades es: " + String.format("%.2f", promTotal) + "°C");
					break;
				case 6:
					aux = temperaturas[0][0];
					for (int ciudad = 1; ciudad < temperaturas.length; ciudad++) {
						for (int dia = 1; dia < temperaturas[0].length; dia++) {
							if(aux < temperaturas[ciudad][dia]) {
								aux = temperaturas[ciudad][dia];
							}
						}
					}
					System.out.println("La temperatura más alta de todas las ciudades es: " + String.format("%.2f", aux) + "°C");
					break;
				case 7:
					break;
				default:
					throw new IllegalArgumentException("Unexpected value: " + opcion);
	        	}
        	}while(opcion != 7);
  
	}
}
