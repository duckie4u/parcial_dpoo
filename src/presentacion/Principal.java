package presentacion;
import logic.Mujer;
import logic.Persona;
import logic.PesoOutOfRange;
import logic.AlturaOutOfRange;
import logic.EdadOutOfRange;
import logic.Hombre;


public class Principal {
	
	
	public void principal () {
		// Hombres: 60 <= peso <= 110; 160 <= altura <= 195; edad > 15
		// Mujeres: 40 <= peso <= 80; 140 <= altura <= 180; edad > 15
		Mujer persona1 = new Mujer(38.0, 160.5, 17); // prueba peso
		System.out.println("Altura Persona 1: " + persona1.getPeso());
		
		Mujer persona2 = new Mujer(50.0, 190.5, 17); //prueba altura
		System.out.println("Altura Persona 2: " + persona2.getAltura());
		
		Mujer persona3 = new Mujer(50.0, 160.5, 14); //prueba edad
		System.out.println("Altura Persona 3: " + persona3.getEdad());
		
		try {
			persona1.calcularTBM();
		} catch (PesoOutOfRange e) {
				System.out.println("Ingresa un peso válido");
		} catch (AlturaOutOfRange e) {
			System.out.println("Ingresa una altura válida");
		} catch (EdadOutOfRange e) {
			System.out.println("Ingresa una edad válida");
		}
		Hombre persona4 = new Hombre (50.0, 160.5, 17); // prueba peso
		System.out.println("Altura Persona 1: " + persona1.getPeso());
		
		Hombre persona5 = new Hombre(50.0, 150.5, 17); //prueba altura
		System.out.println("Altura Persona 2: " + persona2.getAltura());
		
		Hombre persona6 = new Hombre(50.0, 160.5, 14); //prueba edad
		System.out.println("Altura Persona 3: " + persona3.getEdad());
		
		try {
			persona4.calcularTBM();
		} catch (PesoOutOfRange e) {
				System.out.println("Ingresa un peso válido");
		} catch (AlturaOutOfRange e) {
			System.out.println("Ingresa una altura válida");
		} catch (EdadOutOfRange e) {
			System.out.println("Ingresa una edad válida");
		}
		
		// hacer el mismo try catch para las 6 personas
	}
	public static void main (String[] args) {
		new Principal();
	}
	
	
}


