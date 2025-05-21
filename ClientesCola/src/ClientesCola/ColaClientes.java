package ClientesCola;

public class ColaClientes {
	Nodo frente, fin;

	public ColaClientes() {
		this.frente = null;
		this.fin = null;
	}
	
	//Comprobar si la cola está vacía
	public boolean estaVacia(){
		return frente == null;
	}
	
	//Ingresar persona a la cola por el final
	public void ingresarPersona(String nombre, int cantidadProd) {
		Nodo nuevo = new Nodo(nombre, cantidadProd);
		if(estaVacia()) {
			fin = frente = nuevo;
		}else {
			fin.siguiente = nuevo;
			fin = nuevo;
		}
		System.out.println("El cliente " + nombre + " ha ingresado a la cola con " + cantidadProd + " productos");
	}
	
	//Eliminar persona de la cola (ha sido atendido)
	public void atenderPersona() {
		if(estaVacia()) {
			System.out.println("No hay clientes en la cola.");
		}else {
			System.out.println("El cliente " + frente.nombre + " ha sido atendido y se llevó " + frente.cantidadProductos + " productos" );
			frente = frente.siguiente;
		}
	}
	
	//Imprimir la cola actual de clientes
	public void mostrarCola() {
		if(estaVacia()) {
			System.out.println("No hay clientes en la cola.");
		}else {
			Nodo aux = frente;
			while(aux != null) {
				System.out.print("[" + aux.nombre + " Productos: " + aux.cantidadProductos + "] --> ");
				aux = aux.siguiente;
			}
		}
	}
}
