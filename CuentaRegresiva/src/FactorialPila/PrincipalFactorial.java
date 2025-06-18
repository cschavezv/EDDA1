package FactorialPila;

public class PrincipalFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = 5;
		int resultado = factorialPila(numero);
		
		System.out.println("El factorial de " + numero + " es " + resultado);
	}
	
	public static int factorialPila(int n) {
		Pila pila1 = new Pila();
		//Apilar los valores desde el n hasta 1
		while(n > 0) {
			System.out.println("Apilando n: " + n);
			pila1.push(n);
			n--;
		}
		
		//Desapilar y calcular el factorial
		int resultado = 1;
		while(!pila1.estaVacia()) {
			//Multiplicando valores desapilados
			System.out.println("Multiplicando valores desapilados...");
			resultado = resultado * pila1.pop();
			System.out.println("Resultado = " + resultado);
		}
		return resultado;
	}

}
