package Ejercicio4;

public class Pedidos {
	public String[] colaPedidos;
	public int inicio, fin;
	public final int dimension = 5; //agregamos una constante para usarla en todos los métodos

	public Pedidos() {
		this.colaPedidos = new String[this.dimension]; //Se inicializa el arreglo con la constante dimension
		this.inicio = -1;
		this.fin = -1;
	}
	
	public boolean estaLlena() {
		return fin == dimension - 1;
	}
	
	public boolean estaVacia() {
		return inicio == -1;
	}
	
	public void insertarFinal(String bebida) {
		if(estaLlena()) {
			System.out.println("La cola está llena. No se puede preparar el " + bebida);
			return;
		}else if(estaVacia()){
			fin = inicio = 0;
		}else {
			fin = (fin + 1) % dimension;
		}
		colaPedidos[fin] = bebida;
		System.out.println("Se ha pedido un " + bebida);
	}
	
	public void eliminarFrente() {
		String beb = colaPedidos[inicio];
		if(estaVacia()) {
			System.out.println("La cola está vacía, no hay clientes.");
			return;
		}else if(inicio == fin){
			inicio = fin = -1;
		}else {
			inicio = (inicio + 1) % dimension;
		}
		System.out.println("Se ha entregado el " + beb + " (pedido más antiguo)");
	}
	
	public void eliminarFinal() {
		String beb = colaPedidos[fin];
		if(estaVacia()) {
			System.out.println("La cola está vacía, no hay clientes.");
			return;
		}else if(inicio == fin) {
			inicio = fin = -1;
		}else {
			fin = (fin - 1 + dimension) % dimension;
		}
		System.out.println("Se ha entregado el " + beb + " (se canceló el último pedido agregado)");
	}
	
	public void mostrarElementos() {
		if(estaVacia()) {
			System.out.println("La cola está vacía, no hay clientes");
			return;
		}else {
			int i = inicio;
			while(true) {
				System.out.print("[" + colaPedidos[i] + "] ");
				if(i == fin) break;
				i = (i + 1) % dimension;
			}
			System.out.println();
		}
	}
}