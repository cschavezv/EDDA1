package TablaHash;

public class TablaHash {
	int[] tabla;
	int R;
	final int ELIMINADO = -1;
	int tamanio;
	
	public TablaHash(int tamanio) {
		this.tabla = new int[tamanio];
		R = encontrarPrimoMenor(tamanio);
		this.tamanio = tamanio;
	}
	
	//Primo menor
	public int encontrarPrimoMenor(int tamanio) {
		for(int i = tamanio -1; i >= 2; i--) {
			if(esPrimo(i)) return i;
		}
		return 2;
	}
	
	public boolean esPrimo(int n) {
		for(int i = 2; i*i<=n; i++) {
			if(n%i == 0) return false;
		}
		return true;
	}
	
	//Primera función Hash
	public int hash1(int clave) {
		return clave%tamanio;
	}
	
	//Segunda función hash
	public int hash2(int clave) {
		return R - (clave % R);
	}
	
	public void insertar(int clave) {
		for(int i = 0; i < tamanio; i++) {
			int pos = (hash1(clave) + i * hash2(clave)) % tamanio;	
			if(tabla[pos] == clave) {
				System.out.println("La clave ya se encuentra en la tabla");
				return;
			}
			if(tabla[pos] == 0 || tabla[pos] == ELIMINADO) {
				tabla[pos] = clave;
				return;
			}
		}
	}
	
	public void eliminar(int clave) {
		for(int i = 0; i < tamanio; i++) {
			int pos = (hash1(clave) + i * hash2(clave)) % tamanio;
			if(tabla[pos] == 0) {
				System.out.println("Clave no encontrada en la posición " + pos);
				return;
			}
			if(tabla[pos] == clave) {
				tabla[pos] = ELIMINADO;
				System.out.println("Se ha eliminado la clave de la posición " + pos);
				return;
			}
		}
	}
}
