public interface ColaADT <T>{
	public void encolar(T dato);
    public void decolar();
    public boolean estaVacia();
    public T primerElemento();
}
