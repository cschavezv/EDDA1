package Arreglos;

public class UsoArreglo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Crear un arreglo de longitud 5 que guarde los números múltiplos de diez. 
		
		int [] numeros = {10, 20, 30, 40, 50};
		
		//Imprima los elementos almacenados en los subindices 3 y 5.
		
		System.out.println("Elemento subíndice 3: " + numeros[3] + "\nElemento subíndice 4: " + numeros[4]);
		
		//Modifique el elemento del subíndice 1
		
		numeros[1] = 99;
		System.out.println("Elemento subíndice 1: " + numeros[1]);
		
		//Recorra e imprima en consola el contenido del arreglo. 
		
		System.out.println("Los elementos del arreglo son:\n");
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Indice " + i + ": " + numeros[i]);
		}
		
		//Busque un elemento entre los enteros guardados en el arreglo. En caso de encontrarlo
		//imprima por consola un mensaje que indique que el elemento ha sido encontrado. Caso
		//contrario imprima un mensaje que indique que el elemento no se encuentra entre los
		//datos almacenados en el arreglo.
		
		int buscado = 100;
		boolean bandera = false;
		for(int i = 0; i < numeros.length; i++) {
			if(buscado == numeros[i]) {
				bandera = true;
			}
		}
		
		if(bandera) {
			System.out.println("\nSe ha encontrado el número\n");
		}else {
			System.out.println("\nNo se ha encontrado el número\n");
		}
		
		//Declare un arreglo de enteros que se llene automáticamente con los múltiplos de 5.
		
		int numeros2 [] = new int[5];
		for(int i = 0; i < numeros2.length; i++) {
			numeros2[i] = (i+1)*5;
		}
		
		for(int i = 0; i < numeros2.length; i++) {
			System.out.println("Indice " + i + ": " + numeros2[i]);
		}
		
		//Declare un arreglo de enteros que se llene automáticamente con números aleatorios entre
		//1 y 100.
		
		int numeros3 [] = new int[5];
		for(int i = 0; i < numeros3.length; i++) {
			numeros3[i] = (int) (Math.random()*100);
			System.out.println("[" + numeros3[i] + "]");
		}
	}
}
