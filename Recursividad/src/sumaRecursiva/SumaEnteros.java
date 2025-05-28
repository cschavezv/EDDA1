package sumaRecursiva;

public class SumaEnteros {
	
	public int sumaPrimerosN(int n) {
		return ((n == 1)?1:n + sumaPrimerosN(n-1));
	}
}