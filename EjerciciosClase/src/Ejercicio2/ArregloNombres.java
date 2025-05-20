package Ejercicio2;

import javax.swing.JOptionPane;

public class ArregloNombres {
	
	private static final int longitud = 4;
	private String arreglo [];
	
	public ArregloNombres() {
		arreglo = new String[longitud];
		for(int i = 0; i < longitud; i++) {
			String variable = "";
			variable = JOptionPane.showInputDialog("Ingresa el nombre " + i + ": ");
			arreglo [i] = variable;
		}
	}
	
	public ArregloNombres(String[] arreglo) {
		
		this.arreglo = arreglo;
	}
	
	public String[] getArreglo() {
		return arreglo;
	}
	public void setArreglo(String[] arreglo) {
		this.arreglo = arreglo;
	}

	@Override
	public String toString() {
		String salida = "";
		for(String aux : arreglo) {
			salida += "[" + aux + "]";
		}		
		return salida;
	}
}
