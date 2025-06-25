package ArbolBinario;

public class PrincipalArbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbol arbol = new Arbol();
		
		arbol.insertarNodo(10);
		arbol.insertarNodo(5);
		arbol.insertarNodo(15);
		arbol.insertarNodo(20);
		arbol.insertarNodo(2);
		arbol.preOrder(arbol.getRaiz());
	}
}
