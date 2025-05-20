package ejemploPrismaRectangular;

public class PrismaRectangular {
	 
	private double lado1, lado2, altura;

	public PrismaRectangular() {
	}
	
	public PrismaRectangular(double lado1, double lado2, double altura) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.altura = altura;
	}
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double longitud) {
		this.lado1 = longitud;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double ancho) {
		this.lado2 = ancho;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double areaBase() {
		return lado1 * lado2;
	}
	
	public double volumen() {
		return areaBase() * altura;
	}

	@Override
	public String toString() {
		return "Área = " + String.format("%.2f" ,areaBase()) + "\nVolumen = " + String.format("%.2f" ,volumen());
	}
}
