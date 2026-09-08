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
	
	public double getPeso () {
		return this.peso;
	}
	
	public double getAltura () {
		return this.altura;
	}
	
	public int getEdad () {
		return this.edad;
	}
	
	// no hay setters porque la persona se crea en el constructor
	
	public abstract double calcularTBM (double peso, double altura, int edad) throws EdadOutOfRange, AlturaOutOfRange, PesoOutOfRange;
}
