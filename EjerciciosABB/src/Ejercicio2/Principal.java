package Ejercicio2;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Arbol arbol = new Arbol();
		int[] listaNumeros;
		int n = 0;
		
		//Preguntamos al usuario el valor de n entre 5 y 15 (incluidos)
		while(true) {
			System.out.println("¿Cuántos números quiere que tenga el árbol binario?");
			n = sc.nextInt();
			if(n >= 5 && n <= 15) {
				break;
			}else {
				System.out.println("Número fuera de rango, vuelva a ingresar...");
			}
		}
		
		//Creamos el arreglo de números aleatorios
		listaNumeros = new int[n];
		
		for(int i = 0; i < listaNumeros.length; i++){
			listaNumeros[i] = rd.nextInt(0, 51);
			System.out.println("Valor " + (i+1) + ": " + listaNumeros[i]);
			arbol.Insertar(listaNumeros[i]);
		}
		
		//Mostramos todos los recorridos
		arbol.PreOrden();
		arbol.InOrden();
		arbol.PostOrden();
		
		//Mostramos LCI y LCE
		System.out.println();
		arbol.LCI();
		arbol.LCE();
	}

}
