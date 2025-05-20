package objeto;

import java.util.Arrays;

public class ClaseConjunto {
	
	static int M = 2;
	private Object [] conjunto;
	private int numElementos, capacidad;
	
	public ClaseConjunto() {
		conjunto = new Object[M];
		numElementos = 0;
		capacidad = M;
	}

	public ClaseConjunto(Object[] conjunto, int numElementos, int capacidad) {
		this.conjunto = conjunto;
		this.numElementos = numElementos;
		this.capacidad = capacidad;
	}
	
	//Es vacio?
	public boolean esVacio() {
		return (numElementos == 0);
	}
	
	//Buscar si elemento pertenece
	public boolean pertenece(Object elemento) {
		boolean encontrado = false;
		int k = 0;
		while (k < numElementos && !encontrado) {
			encontrado = conjunto[k].equals(elemento);
			k++;
		}
		return encontrado;
	}
	
	//añade elementos al conjunto
	public void addElementos(Object elemento) {
		//verificar que el elemento no está en el conjunto
		if(!pertenece(elemento)) {
			if(numElementos == capacidad) {
				System.out.println("Ampliando capacidad...");
				Object [] nuevoConjunto;
				nuevoConjunto = new Object[capacidad + M];
				for(int i = 0; i < capacidad; i++) {
					nuevoConjunto[i] = conjunto[i];
				}
				capacidad += M;
				conjunto = nuevoConjunto;
				//limpiar memoria
				System.gc(); //Garbage Colector
			}
			conjunto[numElementos++] = elemento;
		}
	}
	
	public void borrarElemento(Object elemento) {
		if(pertenece(elemento)) {
			System.out.println("Borrando elemento...");
			int auxNumElementos = numElementos;
			numElementos--;
			
			int k=0;
			//recorrer conjunto buscando elemento
			while(!conjunto[k].equals(elemento)) {
				k++;
			}
			
			for(;k < auxNumElementos; k++) {
				conjunto[k] = conjunto[k+1];
				auxNumElementos--;
			}
		}else {
			System.out.println("El elemento no existe en el conjunto");
		}
	}

	@Override
	public String toString() {
		String salida = "";
		for (Object aux : conjunto) {
			salida += "[" + aux + "]";
		}
		return salida;
	}
} 
