package Ejercicio3;

import java.util.Scanner;

//Se ha usado una bicola restringida en inserciones por el frente. Esto porque se guarda lo que es una cola como tal, usando la estructura FIFO, pero también
//se requiere que la maquinaria salga por el final en el caso de que sea necesario. Se restringe que entren por el frente porque no tiene sentido hacer una cola
//de maquinaria cuando una se va a meter en frente de todas las que están esperando. Esta bicola está implementada como un arreglo circular para que no haya
//problemas a la hora de una inserción de maquinaria cuando se ha atendido maquinaria cuando ya cumplió su turno y por el final cuando fue llamada para otra
//obra

public class ObraPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maquinaria maquinaria = new Maquinaria();
		maquinaria.insertarFinal("Excavadora1");
		maquinaria.insertarFinal("Grua");
		maquinaria.insertarFinal("Mezcladora");
		maquinaria.insertarFinal("Excavadora2");
		maquinaria.insertarFinal("Excavadora3");
		maquinaria.mostrarElementos();
		maquinaria.eliminarFrente();
		maquinaria.eliminarFinal();
		maquinaria.mostrarElementos();
	}
}

