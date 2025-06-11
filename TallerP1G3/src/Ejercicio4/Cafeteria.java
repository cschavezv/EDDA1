package Ejercicio4;

//Se ha usado una bicola restringida en inserciones por el frente. Esto porque se guarda lo que es una cola como tal, usando la estructura FIFO, pero también
//se requiere que los pedidos sean atendidos por el final en el caso de que sea necesario. Se restringe que entren por el frente porque no tiene sentido hacer una cola
//de pedidos cuando una se va a meter en frente de todas las que están esperando. Esta bicola está implementada como un arreglo circular para que no haya
//problemas a la hora de una inserción de pedidos cuando se ha atentido el pedido más antiguo y se ha cancelado el último pedido agregado.

public class Cafeteria {
	
	public static void main(String[] args) {
		
		Pedidos pedidos = new Pedidos();
		
		pedidos.insertarFinal("Capuccino");
		pedidos.insertarFinal("Americano");
		pedidos.insertarFinal("Agua");
		pedidos.insertarFinal("Té");
		pedidos.insertarFinal("Latte");
		pedidos.insertarFinal("Té verde");
		pedidos.mostrarElementos();
		pedidos.eliminarFrente();
		pedidos.eliminarFinal();
		pedidos.mostrarElementos();
	}
	
}