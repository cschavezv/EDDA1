package TablaHash;

public class TablaHash {
	int tamanio;
	int R;
	final int ELIMINADO = -1;
	int[] tabla;
	
	public TablaHash(int tamanio) {
		this.tamanio = tamanio;
		this.R = encontrarPrimoMenor(tamanio);
		this.tabla = new int[tamanio];
	}
	
	//Primera función hash
	public int hash1(int clave) {
		return clave % tamanio;
	}
	
	public int hash2(int clave) {
		return R - (clave % R);
	}
	
	public int encontrarPrimoMenor(int tamanio) {
		for(int i = tamanio - 1; i >= 2; i--) {
			if(esPrimo(i)) return i;
		}
		return 2;
	}
	
	public static boolean esPrimo(int n) {
		if(n < 2) return false;
		for(int i = 2; i * i <= n; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
	
	public void insertar(int clave) {
		for(int i = 0; i < tamanio; i++) {
			int pos = (hash1(clave) + i*hash2(clave)) % tamanio;
			if(tabla[pos] == clave) {
				System.out.println("La clave " + clave + " ya se encuentra en la tabla, no se puede ingresar");
				return;
			}
			if(tabla[pos] == 0 || tabla[pos] == ELIMINADO) {
				tabla[pos] = clave;
				System.out.println("Clave " + clave + " ingresada en la posición " + pos);
				return;
			}
		}
	}
	
	public void eliminar(int clave) {
		for(int i = 0; i < tamanio; i++) {
			int pos = (hash1(clave) + i*hash2(clave)) % tamanio;
			if(tabla[pos] == 0) {
				System.out.println("Clave no encontrada en la posición " + pos);
				return;
			}
			if(tabla[pos] == clave) {
				tabla[pos] = ELIMINADO;
				System.out.println("Clave " + clave + " eliminada en la posición " + pos);
				return;
			}
		}
	}
}
