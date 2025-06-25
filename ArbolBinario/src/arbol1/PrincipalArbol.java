package arbol1;

public class PrincipalArbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arbol arbol1 = new Arbol();
		
		arbol1.Insertar(10);
		arbol1.Insertar(5);
		arbol1.Insertar(15);
		arbol1.Insertar(20);
		arbol1.Insertar(2);
		arbol1.ejecutarPreOrder();
	}

}
