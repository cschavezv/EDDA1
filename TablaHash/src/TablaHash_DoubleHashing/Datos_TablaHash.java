package TablaHash_DoubleHashing;

public class Datos_TablaHash {
	private int tamanio;
	private int R;
	private final int ELIMINADO = -1;
	
	public Datos_TablaHash(int tamanio) {
		this.tamanio = tamanio;
		R = encontrarPrimoMenor(tamanio);
	}

	public int getTamanio() {
		return tamanio;
	}

	public int getR() {
		return R;
	}

	public int getELIMINADO() {
		return ELIMINADO;
	}

	//Función para encontrar el primer índice primo menor del tamaño del arreglo
	private int encontrarPrimoMenor(int tamanio) {
		for(int i = tamanio - 1; i >= 2 ; i--) {
			if(esPrimo(i)) return i; //Se retorna el número primo
		}
		return 2; //Si no hay ningún número primo > 2, retornamos el 2
	}
	
	private boolean esPrimo(int n) {
		if(n < 2) return false;
		for(int i = 2; i * i <= n; i++) { //Probar divisores hasta la raíz cuadrada
			if(n % i == 0) return false; //En el caso de que el módulo sea 0 (no es primo) se retorna false
		}
		return true; //Si nunca sucedió el false, quiere decir que si es primo (retorna true)
	}
}
