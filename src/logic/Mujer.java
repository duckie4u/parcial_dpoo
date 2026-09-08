package logic;

public class Mujer extends Persona {
	public Mujer (double peso, double altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularTBM()
			throws EdadOutOfRange, AlturaOutOfRange, PesoOutOfRange {
		if (this.peso < 40.0 || this.peso > 80.0) {
			throw new PesoOutOfRange("Error: PesoOutOfRange");
		}
		if (this.altura < 140.0 || this.altura > 180.0) {
			throw new AlturaOutOfRange("Error: AlturaOutOfRange");
		}
		if (this.edad <= 15) {
			throw new EdadOutOfRange("Error: EdadOutOfRange");
		}
		
		double tbm  = 447.593 + (9.247 * this.peso) + (3.098 * this.altura) - (4.33 * this.edad);
		return tbm;
			
	}
	
	
	}

