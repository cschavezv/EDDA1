package ListaCircular;

public class Nodo {
	Nodo siguiente; //Cada nodo de una lista circular SIMPLE tiene un solo puntero, siguiente
	int dato; //Cada nodo guarda un dato

	//Constructor
	public Nodo(int dato) {
		this.dato = dato; //Se ingresa el dato en el Nodo
		this.siguiente = null; //Inicializamos ese puntero en null porque no apunta a nada al inicio
	}
}
