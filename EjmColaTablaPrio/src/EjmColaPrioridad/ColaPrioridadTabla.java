package EjmColaPrioridad;

public class ColaPrioridadTabla {
	private Cola[] tabla; //tabla/arreglo de colas
	private int nivelesPrioridad;
	
	public ColaPrioridadTabla(int nivelesPrioridad) {
		this.nivelesPrioridad = nivelesPrioridad;
		this.tabla = new Cola[nivelesPrioridad];
		for(int i = 0; i < nivelesPrioridad; i++) {
			tabla[i] = new Cola();
		}
	}
	
	public void insertar(int valor, int prioridad) {
		if(prioridad < 0 || prioridad >= nivelesPrioridad) {
			System.out.println("Prioridad fuera de rango");
			return;
		}
		tabla[prioridad].encolar(valor);
	}
	
	public void eliminar() {
		
	}
	
	public void mostrar2() {
		for(int i = 0; i < nivelesPrioridad; i++){
			System.out.println("Prioridad " + i + ": ");
			tabla[i].mostrar();
			System.out.println();
		}
	}
}
