package TablaHash_DoubleHashing;

public class TablaHash {
	private int tamanio;
	private int R;
	private final int ELIMINADO = -1;
	private int[] tabla;
	
	public TablaHash(int tamanio) {
		this.tamanio = tamanio;
		this.R = encontrarPrimoMenor(tamanio);
		this.tabla = new int[tamanio];
	}
	
	//Métodos públicos para llamar a los métodos privados
	public void insertarClave(int clave) {
		insertar(clave);
	}
	
	public void eliminarClave(int clave) {
		eliminar(clave);
	}
	
	public void mostrarTabla() {
		mostrar();
	}
	
	//Métodos de la Tabla Hash
	
	//Primera función hash
	private int hash1(int clave) {
		return clave % tamanio;
	}
	
	//Segunda función hash
	private int hash2(int clave) {
		return R - (clave % R);
	}
	
	//Insertar elementos en la tabla Hash
	private void insertar(int clave) {
		
		for(int i = 0; i < tamanio; i++) {
			int pos = (hash1(clave) + i * hash2(clave)) % tamanio;
			
			//Validación para no repetir claves dentro de la tabla hash
			if(tabla[pos] == clave) {
				System.out.println("Clave " + clave + " ya existe dentro de la tabla. No se puede ingresar nuevamente.");
				return;
			}
			
			//Validación para ingresar una clave en un espacio vacío (0) o vacío por eliminación (-1)
			if(tabla[pos] == 0 || tabla[pos] == ELIMINADO) {
				tabla[pos] = clave;
				System.out.println("Clave " + clave + " insertada en la posición " + pos);
				return;
			}
		}
		System.out.println("No se puede ingresar la clave " + clave + " porque la tabla está llena.");
	}
	
	public void eliminar(int clave) {
		
		for(int i = 0; i < tamanio; i++) {
			int pos = (hash1(clave) + i * hash2(clave)) % tamanio;
			
			//Validación para una clave no encontrada en la posición
			if(tabla[pos] == 0) {
				System.out.println("Clave " + clave + " no encontrada en la posición " + pos);
				return;
			}
			
			//Si se encuentra la clave, se la elimina (-1 en el slot)
			if(tabla[pos] == clave) {
				tabla[pos] = ELIMINADO;
				System.out.println("Clave " + clave + " eliminada en la posición " + pos);
				return;
			}
		}
		System.out.println("Clave " + clave + " no encontrada.");
	}
	
	private void mostrar() {
		System.out.println("Contenido de la tabla Hash: ");
		for(int i = 0; i < tabla.length; i++){
			System.out.print("[" + i + "]: ");
			
			//Si el contenido de la posición i es 0 quiere decir que está vacío
			if(tabla[i] == 0) {
				System.out.println("VACÍO");
			}else if (tabla[i] == -1) { //Si el contenido de la posición i es -1 quiere decir que está vacío por eliminación
				System.out.println("ELIMINADO");
			}else {
				System.out.println(tabla[i]); //Se imprime el contenido de la posición i
			}
		}
	}
	
	//Función para encontrar el primer índice primo menor del tamaño del arreglo
		private int encontrarPrimoMenor(int tamanio) {
			for(int i = tamanio - 1; i >= 2 ; i--) {
				if(esPrimo(i)) return i; //Se retorna el número primo
			}
			return 2; //Si no hay ningún número primo > 2, retornamos el 2
		}
		
		public static boolean esPrimo(int n) {
			if(n < 2) return false;
			for(int i = 2; i * i <= n; i++) { //Probar divisores hasta la raíz cuadrada
				if(n % i == 0) return false; //En el caso de que el módulo sea 0 (no es primo) se retorna false
			}
			return true; //Si nunca sucedió el false, quiere decir que si es primo (retorna true)
		}
}
