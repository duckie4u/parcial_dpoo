package logic;

public class Hombre extends Persona{
	public Hombre (double peso, double altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularTBM()
			throws EdadOutOfRange, AlturaOutOfRange, PesoOutOfRange {
		if (this.peso < 60.0 || this.peso > 110.0) {
			throw new PesoOutOfRange("Error: PesoOutOfRange");
		}
		if (this.altura < 160.0 || this.altura > 195.0) {
			throw new AlturaOutOfRange("Error: AlturaOutOfRange");
		}
		if (this.edad <= 15) {
			throw new EdadOutOfRange("Error: EdadOutOfRange");
		}
		
		double tbm  = 88.362 + (13.397 * this.peso) + (4.799 * this.altura) - (5.677 *  this.edad);
		return tbm;
			
	}
	
}
