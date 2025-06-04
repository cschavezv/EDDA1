package ejercicio2;

public class MCD {
	
	int aux = 0;
	
	public int calcularMCD(int a, int b) {
		if(b != 0) {
			aux = a;
			a = b;
			b = aux % b; //para llegar al caso base (b = 0)
			return calcularMCD(a, b);
		}else {
			return a;
		}
	}
}