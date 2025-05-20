package EnteroMultiplo;

import java.util.Scanner;

public class MultiplosArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] multiplosTres, multiplosCinco, sumaArreglos, sumaMultiplosTres;
		int n = 0, aux = 0, cont = 0, sumaTotal = 0;
		double prom = 0.0;
		
		//a)       El programa solicite al usuario el número de elementos (valor n)
		System.out.println("Ingrese el número de elementos de los arreglos: ");
		n = sc.nextInt();
		
		//b)       Con base en n se generan automáticamente los elementos de cada uno de los grupos.
		//Generamos el arreglo para los múltiplos de 3
		aux=3;
		multiplosTres = new int[n];
		for (int i = 0; i < multiplosTres.length; i++) {
			multiplosTres[i] += aux; 
			aux += 3;
		}
		aux = 5;
		multiplosCinco = new int[n];
		for (int i = 0; i < multiplosCinco.length; i++) {
			multiplosCinco[i] = aux;
			aux += 5;
		}
		
		//Imprimimos en pantalla
		System.out.println("\nLos múltiplos de 3 son: ");
		for (int i = 0; i < multiplosTres.length; i++) {
			System.out.print("[" + multiplosTres[i] + "]");
		}
		System.out.println("\nLos múltiplos de 5 son: ");
		for (int i = 0; i < multiplosCinco.length; i++) {
			System.out.print("[" + multiplosCinco[i] + "]");
		}
		
		//c)       Se procede a obtener un tercer grupo cuyos elementos serán la suma de los correspondientes elementos de los 2 grupos previos.
		sumaArreglos = new int[n];
		System.out.println("\nLa suma de los dos arreglos es: ");
		for (int i = 0; i < sumaArreglos.length; i++) {
			sumaArreglos[i] = multiplosTres[i] + multiplosCinco[i];
			System.out.print("[" + sumaArreglos[i] + "]");
		}
		
		//d)       Se analizara los elementos obtenidos en el tercer grupo para determinar si existe algún elemento que sea múltiplo de 3.
		//Si existen, deben presentarse uno a uno los elementos e indicar cuantos hay en total.
		sumaMultiplosTres = new int[n];
		System.out.println("\nLos números múltiplos de tres encontrados en la suma son: ");
		for (int i = 0; i < sumaArreglos.length; i++) {
			if((sumaArreglos[i] % 3) == 0) {
				sumaMultiplosTres[i] = sumaArreglos[i];
				cont += 1;
				System.out.print("[" + sumaMultiplosTres[i] + "]");
			}
		}
		if(cont != 0) {
			System.out.println("\nDe la suma de los dos arreglos, hay en total " + cont + " múltiplos de tres");
		}else {
			System.out.println("\nNo se han encontrado múltiplos de 3 en la suma de los arreglos.");
		}
		
		//e)      Calcular el promedio de los valores del tercer grupo(el grupo obtenido mediante suma).
		for (int i = 0; i < sumaArreglos.length; i++) {
			sumaTotal += sumaArreglos[i];
		}
		prom = sumaTotal/sumaArreglos.length;
		System.out.println("\nEl promedio del tercer grupo es: " + String.format("%.2f", prom));
	}
}
