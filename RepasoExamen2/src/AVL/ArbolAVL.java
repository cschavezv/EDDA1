package AVL;

public class ArbolAVL {
	Nodo inicial;
	
	//Rotaciones
	//Caso DD, rotar a la izquierda
	public Nodo rotacionSimpleIzquierda(Nodo z) {
		Nodo y = z.derecho;
		Nodo T2 = y.izquierdo;
		y.izquierdo = z;
		z.derecho = T2;
		actualizarAltura(y);
		actualizarAltura(z);
		return y;
	}
	
	//Caso II, rotar a la derecha
	public Nodo rotacionSimpleDerecha(Nodo z) {
		Nodo y = z.izquierdo;
		Nodo T2 = y.derecho;
		y.derecho = z;
		z.izquierdo = T2;
		actualizarAltura(y);
		actualizarAltura(z);
		return y;
	}
	
	//Actualización de altura
	public int alturaNodo(Nodo nodo) {
		if(nodo == null) return 0;
		return nodo.altura;
	}
	
	public void actualizarAltura(Nodo nodo) {
		nodo.altura = Math.max(alturaNodo(nodo.izquierdo), alturaNodo(nodo.derecho)) + 1;
	}
	
	
	//Balanceo y factor de equilibrio
	public int factorEquilibrio(Nodo nodo) {
		if(nodo == null) return 0;
		return alturaNodo(nodo.derecho) - alturaNodo(nodo.izquierdo);
	}
	
	public Nodo balanceo(Nodo nodo) {
		int fe = factorEquilibrio(nodo);
		//II -- rotar a la derecha
		if(fe > 1 && factorEquilibrio(nodo.izquierdo) >= 0) {
			return rotacionSimpleDerecha(nodo);
		}
		//DD -- rotar a la izquierda
		if(fe < -1 && factorEquilibrio(nodo.derecho) <= 0) {
			return rotacionSimpleIzquierda(nodo);
		}
		//ID -- primero rotar a la izquierda y luego a la derecha
		if(fe > 1 && factorEquilibrio(nodo.izquierdo) < 0) {
			nodo.izquierdo = rotacionSimpleIzquierda(nodo.izquierdo);
			return rotacionSimpleDerecha(nodo);
		}
		//DI -- primero rotar a la derecha y luego a la izquierda
		if(fe < -1 && factorEquilibrio(nodo.derecho) > 0) {
			nodo.derecho = rotacionSimpleDerecha(nodo.derecho);
			return rotacionSimpleIzquierda(nodo);
		}
		return nodo;
	}
	
	//Insertar nodo
	public Nodo insertar(Nodo nodo, int valor) {
		if(nodo == null) return new Nodo(valor);
		if(valor < nodo.valor) {
			nodo.izquierdo = insertar(nodo.izquierdo, valor);
		}else if(valor > nodo.valor) {
			nodo.derecho = insertar(nodo.derecho, valor);
		}else {
			System.out.println("No se puede ingresar un nodo repetido");
			return nodo;
		}
		actualizarAltura(nodo);
		return balanceo(nodo);
	}
	
	//Eliminar nodo
	public Nodo eliminar(Nodo nodo, int valor) {
		if(nodo == null) return null;
		if(valor < nodo.valor) {
			nodo.izquierdo = eliminar(nodo.izquierdo, valor);
		}else if(valor > nodo.valor) {
			nodo.derecho = eliminar(nodo.derecho, valor);
		}else {
			if(nodo.izquierdo == null) return nodo.derecho;
			if(nodo.derecho == null) return nodo.izquierdo;
			Nodo sucesor = minimoSubarbol(nodo.derecho);
			nodo.valor = sucesor.valor;
			nodo.derecho = eliminar(nodo.derecho, sucesor.valor);
		}
		actualizarAltura(nodo);
		return balanceo(nodo);
	}
	
	public Nodo minimoSubarbol(Nodo nodo) {
		while(nodo.izquierdo != null) {
			nodo = nodo.izquierdo;
		}
		return nodo;
	}
	
	//Recorridos
	public void preOrden(Nodo nodo) { //R-I-D
		if(nodo != null) {
			System.out.println(nodo.valor + " ");
			preOrden(nodo.izquierdo);
			preOrden(nodo.derecho);
		}
	}
	
	public void inOrden(Nodo nodo) { //I-R-D
		if(nodo != null) {
			inOrden(nodo.izquierdo);
			System.out.println(nodo.valor + " ");
			inOrden(nodo.derecho);
		}
	}
	
	public void postOrden(Nodo nodo) { //I-D-R
		if(nodo != null) {
			postOrden(nodo.izquierdo);
			postOrden(nodo.derecho);
			System.out.println(nodo.valor + " ");
		}
	}
}
