package Ejercicio2;

import java.util.Random;

public class PilaArreglo {
	private int[] elementos;
	private int cima;
	
	public PilaArreglo() {
		this.elementos = new int[5];
		this.cima = -1;
	}
	
	public boolean estaVacia() {
		return cima == -1;
	}
	
	public boolean estaLlena() {
		return cima == elementos.length - 1;
	}
	
	private void push(int valor) {
		if(!estaLlena()) {
			elementos[++cima] = valor;
		}else {
			System.out.println("La pila está llena");
		}
	}
	
	public void pop() {
		if(!estaVacia()) {
			System.out.println("Desapilando " + elementos[cima]);
			cima--;
		}else {
			System.out.println("No hay elementos para desapilar");
		}
	}
	
	public void vaciarPila(PilaArreglo pila) {
		if(pila.estaVacia()) {
			return;
		}else {
			pila.pop();
			vaciarPila(pila);
		}
	}
	
	public void mostrar() {
		if(estaVacia()) {
			System.out.println("Pila vacía");
		}else {
			System.out.println("Pila: [");
			for(int i = cima; i >= 0; i--) {
				System.out.println(elementos[i] + " ");
			}
			System.out.println("]");
		}
	}
	
	public void generarAleatorios() {
		Random rd = new Random();
		while(!estaLlena()) {
			push(rd.nextInt(0, 101));
		}
	}
}
