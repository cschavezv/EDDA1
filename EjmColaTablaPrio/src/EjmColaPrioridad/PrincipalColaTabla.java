package EjmColaPrioridad;

public class PrincipalColaTabla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaPrioridadTabla cola1 = new ColaPrioridadTabla(3);
		cola1.insertar(10, 0);
		cola1.insertar(20, 0);
		cola1.insertar(30, 1);
		cola1.insertar(40, 2);
		cola1.mostrar2();
	}
}

