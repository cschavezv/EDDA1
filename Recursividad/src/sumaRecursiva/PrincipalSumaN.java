package sumaRecursiva;

import javax.swing.JOptionPane;

public class PrincipalSumaN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumaEnteros sum1 = new SumaEnteros();
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número:", JOptionPane.INFORMATION_MESSAGE));
		JOptionPane.showMessageDialog(null, "La suma recursiva de " + n + " es " + sum1.sumaPrimerosN(n));
	}
}