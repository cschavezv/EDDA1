package FactRecursivo;

import javax.swing.JOptionPane;

public class PrincipalFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fac = new Factorial();
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número:", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, "El factorial de " + n + " es " + fac.factorial(n));
	}
}