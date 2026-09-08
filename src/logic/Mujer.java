package logic;

public class Mujer extends Persona {
	public Mujer (double peso, double altura, int edad) {
		super(peso, altura, edad);
	}

	@Override
	public double calcularTBM(double peso, double altura, int edad)
			throws EdadOutOfRange, AltruraOutOfRange, PesoOutOfRange {
		if (peso < 40.0 || peso > 110.0) {
			throw new PesoOutOfRange("Error: PesoOutOfRange");
		}
		if (altura < 160.0 || altura > 195.0) {
			throw new AltruraOutOfRange("Error: AlturaOutOfRange");
		}
		if (edad <= 15) {
			throw new EdadOutOfRange("Error: EdadOutOfRange");
		}
		
		double tbm  = 447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad);
		return tbm;
			
	}
	
	
	}

