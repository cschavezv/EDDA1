package ejercicio4;

public class ListaNombres {
	Nodo inicio, fin;

    public ListaNombres() {
        inicio = null;
        fin = null;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public void insertarAlFinal(String nombre) {
        Nodo nuevo = new Nodo(nombre);
        if (esVacia()) {
            inicio = fin = nuevo;
        } else {
            fin.sig = nuevo;
            fin = nuevo;
        }
        System.out.println("Nombre insertado: " + nombre);
    }

    public void imprimirLista() {
        if (esVacia()) {
            System.out.println("La lista está vacía.");
        } else {
            Nodo aux = inicio;
            while (aux != null) {
                System.out.print("[" + aux.nombre + "] -> ");
                aux = aux.sig;
            }
        }
    }


	public int buscarNombre(String nombre) {
	    if (esVacia()) {
	        System.out.println("Lista vacía. No se puede buscar.");
	        return -1;
	    }

	    Nodo aux = inicio;
	    int posicion = 1;

	    while (aux != null) {
	        if (aux.nombre.equals(nombre)) {
	            return posicion; //Se encontró el nombre
	        }
	        aux = aux.sig;
	        posicion++;
	    }
	    return -1; //No se encontró ;(
	}
}
