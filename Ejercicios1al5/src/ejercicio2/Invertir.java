package ejercicio2;

import java.util.Scanner;

public class Invertir {
	int []conjuntoNum;
	int tamaño, numeros;
	
	public Invertir(int tamaño) {
		this.conjuntoNum = new int[tamaño];
	}
	
	public void ingresar() {
		Scanner sc = new Scanner(System.in);
	    for (int i = 0; i < conjuntoNum.length; i++) {
	        System.out.println("Ingrese el numero " + (i+1) + " del conjunto:");
	        conjuntoNum[i] = sc.nextInt();
	    }
    }  
	
	public int[] invertirOrden() {
	    int tamaño = conjuntoNum.length;
	    int[] conjInvertido = new int[tamaño];

	    for (int i = 0; i < tamaño; i++) {
	        conjInvertido[i] = conjuntoNum[tamaño - 1 - i];
	    }

	    return conjInvertido;
	}

	public void imprimir() {
	    int[] conjInvertido = invertirOrden();

	    System.out.print("Conjunto Original: ");
	    for (int i = 0; i < conjuntoNum.length; i++) {
	        System.out.print("[" + conjuntoNum[i] + "]");
	    }

	    System.out.println();

	    System.out.print("Conjunto Invertido: ");
	    for (int i = 0; i < conjInvertido.length; i++) {
	        System.out.print("[" + conjInvertido[i] + "]");
	    }
	    
	    System.out.println();
	}

}