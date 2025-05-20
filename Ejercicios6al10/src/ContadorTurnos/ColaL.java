package ContadorTurnos;

public class ColaL {
	private NodoL frente, fin;
	private int turno;
	
	public ColaL() {
		this.frente = null;
		this.fin = null;
	}
	
	//Comprobar si está vacía
	public boolean estaVacia() {
		return frente == null;
	}
	
	//Encolar persona (asignar turno)
	public void encolarPersona() {
		if(turno == 100){
			System.out.println("¡Han pasado 100 turnos ya! Reiniciando...");
			turno = 0;
		}
		turno++;
		NodoL nuevo = new NodoL(turno);
		if(estaVacia()) {
			fin = frente = nuevo;
		}else {
			fin.siguiente = nuevo;
			fin = nuevo;
		}
		System.out.println("¡Bienvenido/a! Eres el turno " + nuevo.dato);
	}
	
	public void atenderPersona() {
		if(estaVacia()) {
			System.out.println("La cola está vacía, no hay personas.");
		}else {
			System.out.println("Se ha atendido al turno " + frente.dato);
			frente = frente.siguiente;
		}
	}
	
	public void mostrarCola() {
		if(estaVacia()) {
			System.out.println("La cola está vacía, no hay personas.");
		}else {
			NodoL aux = frente;
			while(aux != null) {
				System.out.print("[T" + aux.dato + "]");
				aux = aux.siguiente;
			}
		}
	}
}
