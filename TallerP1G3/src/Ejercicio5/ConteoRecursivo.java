package Ejercicio5;

public class ConteoRecursivo {
	public void cuentaRegresiva(int n) {
		if(n == 0) {
			System.out.println("¡Vamos a empezar!");
		}else {
			System.out.println(n);
			cuentaRegresiva(n - 1);
		}
	}
}