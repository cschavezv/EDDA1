package arbolAVL;

public class ArbolAVL {
	private Nodo raiz; //El árbol empieza desde una raíz. Es un puntero que nunca se moverá para no perder la referencia a la estructura
	
	//Método para insertar nodos en el árbol
	private Nodo insertar(Nodo nodo, int valor) {
		if(nodo == null) { //Condición 1: Si el nodo mandado (raíz) apunta a nulll, es decir, está vacío:
			return new Nodo(valor); //Retornamos la instancia de un nodo nuevo
		}
		if(valor < nodo.valor) { //Condición 2: Si el valor (parámetro) es menor al valor del nodo actual:
			nodo.izquierdo = insertar(nodo.izquierdo, valor); //Recorremos el subárbol izquierdo y se insertará el nodo cuando se cumpla Condición 1 (recursividad)
		}else if(valor > nodo.valor) { //Condición 3: Si el valor (parámetro) es mayor al valor del nodo actual:
			nodo.derecho = insertar(nodo.derecho, valor); //Recorremos el subárbol izquierdo y se insertará el nodo cuando se cumpla Condición 1 (recursividad)
		}else { //Condición 4: (Por descarte) Si el valor (parámetro) es igual al valor de nodo actual:
			return nodo; //Se retorna el nodo actual
		}
		nodo.altura = Math.max(alturaNodo(nodo.izquierdo), alturaNodo(nodo.derecho)) + 1; /*Se calcula la altura del nodo (raíz) actual con la mayor de las 
		alturas del subárbol derecho e izquierdo y sumando 1 porque se añade un nuevo nodo*/
		return null; //Cambiar por el método para balancear el árbol (OJO GENTEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE :D)
	}
	
	//Método para obtener la altura del nodo padre cuando se añade un nodo hijo
	private int alturaNodo(Nodo nodo) {
		if(nodo == null) { //Si el nodo hijo es null, es decir, si no tiene hijo derecho o izquierdo:
			return 0; //Retorna 0. Por definición, la altura de un nodo inexistente es 0.
		}//Si el padre si tiene nodo hijo (izquierda o derecha)
		return nodo.altura; //Retorna la altura del padre
	}
	
	//Método para rotar cuando un nodo está desbalanceado a la izquierda (II / LL)
	private Nodo rotacionSimpleDerecha(Nodo z) { //Parámetro: "z" es el nodo desbalanceado (FE = 2 o FE = -2)
		Nodo y = z.izquierdo; //"y" es el nodo hijo izquierdo de "z", se va a convertir en la nueva raíz del subárbol
		Nodo T2 = y.derecho; //"T2" es el nodo hijo derecho de "y" (si no existe es null)
		y.derecho = z; //"z" pasa a ser el hijo derecho de "y"
		z.izquierdo = T2; //"T2" pasa a ser hijo izquierdo de "z" una vez se ha movido
		z.altura = (Math.max(alturaNodo(z.izquierdo), alturaNodo(z.derecho)) + 1); //Se actualiza la altura del nodo "z" porque se ha movido abajo
		y.altura = (Math.max(alturaNodo(y.izquierdo), alturaNodo(y.derecho)) + 1); //Se actualiza la altura del nodo "y" porque se ha quedado arriba
		return y; //Retorna el nodo "y" debido a que es la nueva raíz del subárbol
	}
	
	//Método para rotar cuando un nodo está desbalanceado a la derecha (DD / RR)
	private Nodo rotacionSimpleIzquierda(Nodo z) { //Parámetro: "z" es el nodo desbalanceado (FE = 2 o FE = -2)
		Nodo y = z.derecho; //"y" es el nodo hijo derecho de "z", se va a convertir en la nueva raíz del subárbol
		Nodo T2 = y.izquierdo; //"T2" es el nodo hijo izquierdo de "y" (si no existe es null)
		y.izquierdo = z; //"z" pasa a ser el hijo izquierdo de "y"
		z.derecho = T2; //"T2" pasa a ser hijo derecho de "z" una vez se ha movido
		z.altura = (Math.max(alturaNodo(z.izquierdo), alturaNodo(z.derecho)) + 1); //Se actualiza la altura del nodo "z" porque se ha movido abajo
		y.altura = (Math.max(alturaNodo(y.izquierdo), alturaNodo(y.derecho)) + 1); //Se actualiza la altura del nodo "y" porque se ha quedado arriba
		return y; //Retorna el nodo "y" debido a que es la nueva raíz del subárbol
	}
}
