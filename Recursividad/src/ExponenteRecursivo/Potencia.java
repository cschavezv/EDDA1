package ExponenteRecursivo;

public class Potencia {
	public double potenciaRecursiva(double base, double exponente) {
		if(exponente == 0) {
			return 1;
		}else {
			if (exponente < 0){
				return 1/base * potenciaRecursiva(base, exponente + 1);
			}
			return base * potenciaRecursiva(base, exponente - 1);
		}
	}
}
