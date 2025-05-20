package ejemplos1;

import javax.swing.JOptionPane;

public class EntradaDatosPanel {
	public static void main(String[] args) {
		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre");
		String apellido = JOptionPane.showInputDialog("Ingresa tu apellido");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
		String salida = "Su nombre es: " + nombre + " " + apellido + " tiene " + edad + " años";
		JOptionPane.showMessageDialog(null, salida);
	}
}
