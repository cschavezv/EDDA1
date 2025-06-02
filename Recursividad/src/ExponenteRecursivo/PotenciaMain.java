package ExponenteRecursivo;

import javax.swing.JOptionPane;

public class PotenciaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Potencia exp = new Potencia();
		double base = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número base:", JOptionPane.INFORMATION_MESSAGE));
		double exponente = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número exponente:", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, "El numero es " + exp.potenciaRecursiva(base, exponente));
	}
}
