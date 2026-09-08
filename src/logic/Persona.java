package logic;

public abstract class Persona {
	protected double peso;
	protected double altura;
	protected int edad;
	
	public Persona (double peso_kg, double altura_cm, int edad_anios) {
		this.peso = peso_kg;
		this.altura = altura_cm;
		this.edad = edad_anios;
	}
	public abstract float calcularTBM (double peso, double altura, int edad) throws EdadOutOfRange, AltruraOutOfRange, PesoOutOfRange;
}
