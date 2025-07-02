package Ejercicio1;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		Arbol arbol = new Arbol();
		int matriz[][] = new int[3][3];
		boolean encontrado = false;
		int valor;
		
		//Llenamos la matriz
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				matriz[i][j] = rd.nextInt(1, 51);
				//Insertamos los números en un árbol
				arbol.Insertar(matriz[i][j]);
			}
		}
		
		System.out.println("Árbol sin eliminar múltiplo de 3");
		arbol.InOrden();
		
		/*for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[0].length; j++) {
				if(matriz[i][j] % 3 == 0) {
					arbol.Eliminar(matriz[i][j]);
					encontrado = true;
					break;
				}
			}
			if(encontrado) break;
		}*/
		
		arbol.Eliminar(arbol.BuscarMult());
		
		System.out.println("Árbol con eliminación de múltiplo de 3");
		arbol.InOrden();
	}

}
