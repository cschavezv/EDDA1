package ejercicio5;


public class MainLista {

	public static void main(String[] args) {
		Lista lista = new Lista();
        
        lista.addInicio("Lunes");
        lista.addFinal("Martes");
        lista.addFinal("Miercoles");
        lista.addFinal("Jueves");
        lista.addFinal("Viernes");
        lista.addFinal("Sabado");
        lista.addFinal("Domingo"); 

        System.out.println("Recorrido normal:");
        lista.imprimirInicioFin();

        System.out.println("\nRecorrido inverso:");
        lista.imprimirFinInicio();
	}
}