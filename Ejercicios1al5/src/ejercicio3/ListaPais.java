package ejercicio3;

public class ListaPais {
	
    private Nodo inicio, fin;

    public ListaPais() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean esVacia() {
        return inicio == null;
    }

	
	public void insertarAlFinal(String pais) {
        Nodo nuevo = new Nodo(pais);
        if (esVacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.next = nuevo;
            fin = nuevo;
        }
    }

    public void imprimirLista() {
        if (esVacia()) {
            System.out.println("La lista está vacía.");
        } else {
            Nodo aux = inicio;
            System.out.println("Países en la lista:");
            while (aux != null) {
                System.out.print("[" + aux.pais+"] --> ");
                aux = aux.next;
            }
        }
    }

}
