package ABB;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArbolBinario arbol = new ArbolBinario();
		
		arbol.insertar(10);
		arbol.insertar(15);
		arbol.insertar(7);
		arbol.insertar(19);
		arbol.insertar(9);
		arbol.insertar(5);
		
		arbol.recorridos();
		
		arbol.eliminar(19);
		arbol.eliminar(8);
		arbol.eliminar(5);
		
		arbol.recorridos();
		
		arbol.buscar(15);
		arbol.buscar(9);
	}
}
