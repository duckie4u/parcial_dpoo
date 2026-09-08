package logic;

public abstract class Persona {
	protected float peso;
	protected float altura;
	protected int edad;
	
	public Persona (float peso_kg, float altura_cm, int edad_anios) {
		this.peso = peso_kg;
		this.altura = altura_cm;
		this.edad = edad_anios;
	}
	public abstract float calcularTBM (float peso, float altura, int edad);
}
