package TorresHanoiRecursivo;

public class TorresHanoi {
	//origen = A, auxiliar = B, destino = C
	public void resolverHanoi(int n, char origen, char auxiliar, char destino) {
		System.out.println("Valor de n: " + n);
		if(n == 1) { //caso base
			System.out.println("Mover disco 1 de " + origen + " a " + destino);
		}else {
			//1: mover n-1 discos del origen al auxiliar
			resolverHanoi(n - 1, origen, destino, auxiliar);
			
			//2: mover el disco restante al destino
			System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
			
			//3: mover los n-1 discos del auxiliar al destino
			resolverHanoi(n - 1, auxiliar, origen, destino);
		}
	}
}
