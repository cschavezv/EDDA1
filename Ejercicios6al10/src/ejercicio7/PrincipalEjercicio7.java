package ejercicio7;

import java.util.Scanner;


public class PrincipalEjercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String expresion;
		int opcion;
		Pila parentesis = new Pila();
		do {
			System.out.println("---Balance de parentesis---");
			System.out.println("1. Comprobar parentesis");
			System.out.println("2. Salir");
			opcion = sc.nextInt();
			sc.nextLine();
			switch(opcion) {
			case 1:
				System.out.println("Ingrese la expresion matematica a comprobar");
				expresion = sc.next();
				
				for(int i=0; i<expresion.length(); i++) {
					if(expresion.charAt(i)=='(') {
						parentesis.push(expresion.charAt(i));
					}else if(expresion.charAt(i)==')') {
						if(!parentesis.esVacia()) {	
							parentesis.pop();
						}
					}
				}
				if(parentesis.esVacia()) {
					System.out.println("Balance de parentesis correcto "+expresion);
				}else {
					System.out.println("Balance incorrecto de parentesis");
				}
				break;
			case 2:
				System.out.println("Gracias por usar el programa");
				break;
			default:
				System.out.println("Opcion invalida, intentelo de nuevo");
				break;
			}
			parentesis.vaciarPila();
		}while(opcion!=2);
		
		sc.close();
	}

}
