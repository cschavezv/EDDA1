package ejercicio3;

public class Nodo {
	String pais;
	Nodo next;
	public Nodo(String pais) {
		this.pais=pais;
		this.next=null;
	}
	public Nodo(String pais, Nodo next) {
		this.pais=pais;
		this.next=next;
	}
}
