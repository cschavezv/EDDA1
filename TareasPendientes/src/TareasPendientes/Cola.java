package TareasPendientes;

public class Cola {
	Nodo frente, fin;
	int numTarea;
	
	public Cola() {
		this.frente = null;
		this.fin = null;
	}
	
	//Comprobar si la cola está vacía
		public boolean estaVacia(){
			return frente == null;
		}
		
		//Ingresar tarea a la cola por el final
		public void ingresarTarea() {
			numTarea++;
			Nodo nuevaTarea = new Nodo(numTarea);
			if(estaVacia()) {
				fin = frente = nuevaTarea;
			}else {
				fin.siguiente = nuevaTarea;
				fin = nuevaTarea;
			}
			System.out.println("Se ha ingresado la tarea " + fin.numTarea + " marcada como "  + fin.estado);
		}
		
		
		//Eliminar tarea de la cola (marcar como completada)
		public void completarTarea() {
			if(estaVacia()) {
				System.out.println("No hay tareas.");
			}else {
				frente.estado = "Completada";
				System.out.println("La tarea " + frente.numTarea + " ha sido " + frente.estado);
				frente = frente.siguiente;
			}
		}
		
		//Imprimir la cola actual de tareas pendientes
		public void mostrarCola() {
			if(estaVacia()) {
				System.out.println("No hay tareas pendientes.");
			}else {
				Nodo aux = frente;
				while(aux != null) {
					System.out.print("[Tarea " + aux.numTarea + " Estado: " + aux.estado + "] --> ");
					aux = aux.siguiente;
				}
			}
		}
}
