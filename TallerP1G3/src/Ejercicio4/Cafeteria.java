package Ejercicio4;

public class Cafeteria {
	
	public static void main(String[] args) {
		
		Pedidos pedidos = new Pedidos();
		
		pedidos.InsertarFinal("Capuchino");
		pedidos.InsertarFinal("Latte");
		pedidos.InsertarFinal("Té Verde");
		pedidos.InsertarFinal("Capuchino");
		pedidos.InsertarFinal("Latte");
		pedidos.InsertarFinal("Té Verde");
		
		pedidos.EliminarInicio();
		pedidos.EliminarFinal();
		
		pedidos.MostrarCola();
	}
	
}