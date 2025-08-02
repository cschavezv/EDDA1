package TablaHash_DoubleHashing;

public class TablaHash {
	private Datos_TablaHash datosTabla = new Datos_TablaHash(10);
	private int[] tabla = new int[datosTabla.getTamanio()];

	public TablaHash(Datos_TablaHash datosTabla) {
		this.datosTabla = datosTabla;
	}
	
	//Primera función hash
	private int hash1(int clave) {
		return clave % datosTabla.getTamanio();
	}
	
	//Segunda función hash
	private int hash2(int clave) {
		return datosTabla.getR() - (clave % datosTabla.getR());
	}
	
	public void insertarClave(int clave) {
		insertar(clave);
	}
	
	public void eliminarClave(int clave) {
		eliminar(clave);
	}
	
	public void mostrarTabla() {
		mostrar();
	}
	
	//Insertar elementos en la tabla Hash
	private void insertar(int clave) {
		
		for(int i = 0; i < datosTabla.getTamanio(); i++) {
			int pos = (hash1(clave) + i * hash2(clave)) % datosTabla.getTamanio();
			
			//Validación para no repetir claves dentro de la tabla hash
			if(tabla[pos] == clave) {
				System.out.println("Clave " + clave + " ya existe dentro de la tabla. No se puede ingresar nuevamente.");
				return;
			}
			
			//Validación para ingresar una clave en un espacio vacío (0) o vacío por eliminación (-1)
			if(tabla[pos] == 0 || tabla[pos] == datosTabla.getELIMINADO()) {
				tabla[pos] = clave;
				System.out.println("Clave " + clave + " insertada en la posición " + pos);
				return;
			}
		}
		System.out.println("No se puede ingresar la clave " + clave + " porque la tabla está llena.");
	}
	
	public void eliminar(int clave) {
		
		for(int i = 0; i < datosTabla.getTamanio(); i++) {
			int pos = (hash1(clave) + i * hash2(clave)) % datosTabla.getTamanio();
			
			//Validación para una clave no encontrada en la posición
			if(tabla[pos] == 0) {
				System.out.println("Clave " + clave + " no encontrada en la posición " + pos);
				return;
			}
			
			//Si se encuentra la clave, se la elimina (-1 en el slot)
			if(tabla[pos] == clave) {
				tabla[pos] = datosTabla.getELIMINADO();
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
}
