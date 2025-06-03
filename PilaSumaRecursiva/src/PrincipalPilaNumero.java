import java.util.Scanner;

public class PrincipalPilaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila pila = new Pila();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el número de elementos: ");
		int numNodos = sc.nextInt();
		
		while(numNodos > 0) {
			pila.pushNumero();
			numNodos--;
		}
		
		pila.mostrarPila();
		System.out.println("La suma de la pila es " + pila.sumar());
	}
}
