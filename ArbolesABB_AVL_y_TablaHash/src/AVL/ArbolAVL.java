package AVL;

public class ArbolAVL {
	NodoAVL inicial;
	
	public void recorridos() {
		System.out.println("\nRecorrido Pre-Orden: ");
		preOrden(inicial);
		System.out.println("\nRecorrido In-Orden: ");
		inOrden(inicial);
		System.out.println("\nRecorrido Post-Orden: ");
		postOrden(inicial);
	}
	
	public void insertar(int valor) {
		inicial = insertarNodo(inicial, valor);
		System.out.println("\nSe ha añadido el nodo " + valor);
	}
	
	public void eliminar(int valor) {
		inicial = eliminarNodo(inicial, valor);
	}
	
	private void actualizarAltura(NodoAVL nodo) {
		nodo.altura = Math.max(alturaNodo(nodo.izquierdo), alturaNodo(nodo.derecho)) + 1;
	}
	
	private int alturaNodo(NodoAVL nodo) {
		if(nodo == null) return 0;
		return nodo.altura;
	}
	
	private NodoAVL insertarNodo(NodoAVL nodo, int valor) {
		if(nodo == null) return new NodoAVL(valor);
		
		if(valor < nodo.valor) {
			nodo.izquierdo = insertarNodo(nodo.izquierdo, valor);
		}else if(valor > nodo.valor){
			nodo.derecho = insertarNodo(nodo.derecho, valor);
		}else {
			System.out.println("Nodo repetido, no se puede insertar");
			return nodo;
		}
		actualizarAltura(nodo);
		return balancear(nodo);
	}
	
	private NodoAVL eliminarNodo(NodoAVL nodo, int valor) {
		if(nodo == null) return null;
		if(valor < nodo.valor) {
			nodo.izquierdo = eliminarNodo(nodo.izquierdo, valor);
		}else if(valor > nodo.valor) {
			nodo.derecho = eliminarNodo(nodo.derecho, valor);
		}else {
			if(nodo.izquierdo == null) return nodo.derecho;
			if(nodo.derecho == null) return nodo.izquierdo;
			NodoAVL sucesor = minimoSubarbol(nodo.derecho);
			nodo.valor = sucesor.valor;
			nodo.derecho = eliminarNodo(nodo.derecho, sucesor.valor);
		}
		actualizarAltura(nodo);
		return balancear(nodo);
	}
	
	//Rotaciones
	//Rotar cuando está desbalanceado a la izquierda (II)
	private NodoAVL rotacionSimpleDerecha(NodoAVL z) {
		NodoAVL y = z.izquierdo;
		NodoAVL T2 = y.derecho;
		y.derecho = z;
		z.izquierdo = T2;
		actualizarAltura(y);
		actualizarAltura(z);
		return y;
	}
	
	//Rotar cuando está desbalanceado a la derecha (DD)
	private NodoAVL rotacionSimpleIzquierda(NodoAVL z) {
		NodoAVL y = z.derecho;
		NodoAVL T2 = y.izquierdo;
		y.izquierdo = z;
		z.derecho = T2;
		actualizarAltura(y);
		actualizarAltura(z);
		return y;
	}
	
	//Factor de Equilibrio
	private int factorEquilibrio(NodoAVL nodo) {
		if(nodo == null) return 0;
		return alturaNodo(nodo.derecho) - alturaNodo(nodo.izquierdo);
	}
	
	//Balanceo
	private NodoAVL balancear(NodoAVL nodo) {
		int fe = factorEquilibrio(nodo);
		//II -> Rotar a la derecha
		if(fe > 1 && factorEquilibrio(nodo.izquierdo) >= 0) {
			return rotacionSimpleDerecha(nodo);
		}
		//DD -> Rotar a la izquierda
		if(fe < -1 && factorEquilibrio(nodo.derecho) <= 0) {
			return rotacionSimpleIzquierda(nodo);
		}
		//ID -> Primero rotar izquierda y después derecha
		if(fe > 1 && factorEquilibrio(nodo.izquierdo) < 0) {
			nodo.izquierdo = rotacionSimpleDerecha(nodo.izquierdo);
			return rotacionSimpleDerecha(nodo);
		}
		//DI -> Primero rotar derecha y después izquierda
		if(fe < -1 && factorEquilibrio(nodo.derecho) > 0) {
			nodo.derecho = rotacionSimpleDerecha(nodo.derecho);
			return rotacionSimpleIzquierda(nodo);
		}
		return nodo;
	}
	
	//Sacar el mínimo de un subárbol
	private NodoAVL minimoSubarbol(NodoAVL nodo) {
		while(nodo.izquierdo != null) {
			nodo = nodo.izquierdo;
		}
		return nodo;
	}
	
	//Recorridos
	private void preOrden(NodoAVL nodo) {
		if(nodo != null) {
			System.out.println(nodo.valor + " ");
			preOrden(nodo.izquierdo);
			preOrden(nodo.derecho);
		}
	}
	
	private void inOrden(NodoAVL nodo) {
		if(nodo != null) {
			inOrden(nodo.izquierdo);
			System.out.println(nodo.valor + " ");
			inOrden(nodo.derecho);
		}
	}
	
	private void postOrden(NodoAVL nodo) {
		if(nodo != null) {
			postOrden(nodo.izquierdo);
			postOrden(nodo.derecho);
			System.out.println(nodo.valor + " ");
		}
	}
}
