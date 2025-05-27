public class PrincipalColaE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaE c1 = new ColaE();
		ColaE c2 = new ColaE();
		
		//Comprobar que son iguales
		System.out.println("Comprobar que son iguales");
		
		c1.encolar(1);
		c1.encolar(3);
		c1.encolar(5);
		c1.encolar(7);
		c1.encolar(8);
		System.out.println("Cola 1");
		c1.mostrar();
		
		c2.encolar(1);
		c2.encolar(3);
		c2.encolar(5);
		c2.encolar(7);
		System.out.println("\nCola 2");
		c2.mostrar();
		
		System.out.println(ColaE.compararColas(c1, c2)?"\nLas colas son iguales":"\nLas colas son diferentes");
		
		c2.decolar();
		c2.decolar();
		c2.decolar();
		c2.decolar();
		
		//Comprobar que no son iguales
		
		System.out.println("\nComprobar que no son iguales");
		
		c2.encolar(1);
		c2.encolar(3);
		c2.encolar(6);
		c2.encolar(7);
		c2.encolar(8);
		
		System.out.println("Cola 1");
		c1.mostrar();
		
		System.out.println("\nCola 2");
		c2.mostrar();
		
		System.out.println(ColaE.compararColas(c1, c2)?"\nLas colas son iguales":"\nLas colas son diferentes");
	}

}
