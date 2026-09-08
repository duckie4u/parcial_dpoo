package presentacion;
import logic.Mujer;
import logic.Persona;
import logic.Hombre;


public class Principal {
	
	
	public void principal () {
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
	}
	public static void main (String[] args) {
		new Principal();
	}
	
	
}


