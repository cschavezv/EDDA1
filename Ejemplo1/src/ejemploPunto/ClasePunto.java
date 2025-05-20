package ejemploPunto;

public class ClasePunto {
	private int x, y, z;
	private String dimension;
	
	//Constructores
	public ClasePunto() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public ClasePunto(int x, int y, String dimension) {
		this.x = x;
		this.y = y;
		this.dimension = dimension;
	}
	
	public ClasePunto(int x, int y, int z, String dimension) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.dimension = dimension;
	}
	
	//Setters
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setZ(int z) {
		this.z = z;
	}
	
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	
	//Getters
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getZ() {
		return this.z;
	}
	
	public String getDimension() {
		return this.dimension;
	}
	
	//Metodos
	public void imprimir() {
		if(getZ() == 0) {
			System.out.println("Coordenada X = " + getX() + "\nCoordenada Y = " + getY() + "\nDimension = " + getDimension());
		}else {
			System.out.println("Coordenada X = " + getX() + "\nCoordenada Y = " + getY() + "\nCoordenada Z = " + getZ() + "\nDimension = " + getDimension());
		}
		
	}
	
	
	
	@Override
	public String toString() {
		return "x = " + x + "\ny = " + y + "\nDimension = " + dimension;
	}
}
