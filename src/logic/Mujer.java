package logic;

public class Mujer extends Persona {
	public Mujer (float peso, float altura, int edad) {
		super(peso, altura, edad);
	}
	
	@Override
	public abstract float calcularTBM (float peso, float altura, int edad) throws EdadOutOfRange, AltruraOutOfRange, PesoOutOfRange{
		if (peso < 40.0 || peso > 110.0) {
			throw new PesoOutOfRange("Error: PesoOutOfRange");
		}
		if (altura < 160.0 || altura > 195.0)
			
	}
}
