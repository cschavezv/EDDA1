package ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Libreria {
	int [] clave;
	int [] existencias;
	
	public Libreria(int numLibros) {
		this.clave = new int[numLibros];
		this.existencias = new int[numLibros * 2];
	}
	
	public void ingresarLibros() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < clave.length; i++) {
			clave[i] = rd.nextInt(100, 501);
		}
		for(int i = 0; i < existencias.length; i++) {
			if(i % 2 == 0) {
				System.out.println("Ingrese existencias de libros con encuadernación estandar");
				existencias[i] = sc.nextInt();
			}else {
				System.out.println("Ingrese existencias de libros con encuadernación de lujo");
				existencias[i] = sc.nextInt();
			}
		}
	}
	
	public void imprimir() {
	    int deLujo = 0, estandar = 0;
	    int libroIndice = 0;

	    for (int i = 0; i < existencias.length; i += 2) {
	        System.out.println("Libro con clave " + clave[libroIndice]);
	        System.out.println("Encuadernación estándar: " + existencias[i]);
	        System.out.println("Encuadernación de lujo: " + existencias[i + 1]);
	        System.out.println("Total existencias: " + (existencias[i] + existencias[i + 1]));
	        libroIndice++;
	    }
	}
	
	public int noTieneDeLujo() {
		int cont = 0;
		for(int i = 0; i < existencias.length; i++) {
			if(i % 2 != 0) {
				if(existencias[i] == 0) {
					cont++;
				}
			}
		}
		return cont;
	}
}

