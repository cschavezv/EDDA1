
public class ColaE implements ColaADT{
	NodoE frente, fin;
	
	public ColaE() {
		this.frente = null;
		this.fin = null;
	}

	@Override
	public void encolar(Object dato) {
		// TODO Auto-generated method stub
		NodoE nuevo = new NodoE((int)dato);
		if(estaVacia()) {
			frente = fin = nuevo;
		}else {
			fin.siguiente = nuevo;
			fin = nuevo;
		}
	}

	@Override
	public void decolar() {
		// TODO Auto-generated method stub
		if(estaVacia()) {
			System.out.println("La cola está vacía. No se puede eliminar.");
		}else {
			frente = frente.siguiente;
			if(frente == fin) {
				fin = null;
			}
		}
	}

	@Override
	public boolean estaVacia() {
		// TODO Auto-generated method stub
		return frente == null;
	}

	@Override
	public Object primerElemento() {
		// TODO Auto-generated method stub
		return frente.dato;
	}

	public static boolean compararColas(ColaE c1, ColaE c2) {
		NodoE auxC1 = c1.frente;
		NodoE auxC2 = c2.frente;
		boolean iguales = true;
		while(auxC1 != null && auxC2 != null) {
			if(auxC1.dato != auxC2.dato) {
				iguales = false;
				break;
			}
			auxC1 = auxC1.siguiente;
			auxC2 = auxC2.siguiente;
		}
		if(auxC1.siguiente == null || auxC2.siguiente == null) {
			System.out.println("\nColas de diferente tamaño");
			iguales = false;
		}
		return iguales;
	}
	
	public void mostrar() {
		if(estaVacia()) {
			System.out.println("Cola vacía. No se pueden mostrar elementos.");
		}else {
			NodoE aux = frente;
			while(aux != null) {
				System.out.print("[" + aux.dato + "]<--");
				aux = aux.siguiente;
			}
		}
	}
}
