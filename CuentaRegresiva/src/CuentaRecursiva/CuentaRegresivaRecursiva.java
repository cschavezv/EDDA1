package CuentaRecursiva;

public class CuentaRegresivaRecursiva {
	public void conteo(int n) {
		if(n == 0) {
			System.out.println("Cuenta terminada");
		}else {
			System.out.println(n);
			conteo(n-1);
		}
	}
}
