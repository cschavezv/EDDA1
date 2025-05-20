package EjemploColasListas;

public class ColaLista {
	private NodoCola frente, fin;
	
	//Constructor
	
	public ColaLista() {
		this.frente = null;
		this.fin = null;
	}
	
	//Está vacío?
	
	public boolean esVacia() {
		return (frente == null);
	}
	
	//Encolar
	public void encolar(int dato) {
		NodoCola nuevo = new NodoCola(dato);
		if(esVacia()) {
			frente = fin = nuevo;
		}else {
			fin.siguiente = nuevo;
			fin = nuevo;
		}
		System.out.println("El dato " + dato + " se ha encolado");
	}
	
	//Decolar
	public void decolar() throws Exception{
		if(esVacia()) {
			throw new Exception("Cola vacía. No se puede eliminar dato.");
		}else {
			int valorEliminar = frente.dato;
			frente = frente.siguiente;
			if(frente == null) {
				fin = frente;
			}
			System.out.println("Se ha eliminado el dato " + valorEliminar + " con éxito");
		}
	}
	
	//Mostrar
	public void imprimir() throws Exception{
		if(esVacia()) {
			throw new Exception("Cola vacía. No se pueden mostrar datos.");
		}else {
			NodoCola aux = frente;
			while(frente != null) {
				System.out.print("[" + aux.dato + "]-->");
				aux = aux.siguiente;
			}
		}
		System.out.println();
	}
}
