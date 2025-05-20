package objeto;

public class PrincipalConjunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseConjunto miConjunto1 = new ClaseConjunto();
		System.out.println("Es vacio el conjunto? " + miConjunto1.esVacio());
		
		miConjunto1.addElementos(1);
		miConjunto1.addElementos(2);
		miConjunto1.addElementos("Hola");
		System.out.println("Es vacio el conjunto? " + miConjunto1.esVacio());
		System.out.println(miConjunto1.toString());
		miConjunto1.borrarElemento(1);
		System.out.println(miConjunto1.toString());
	}

}
