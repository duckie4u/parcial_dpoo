package presentacion;
import logic.Mujer;
import logic.Persona;
import logic.Hombre;

public class Principal {
	
	
	public void principal () {
		Persona persona1 = new Mujer(50.0, 160.5, 17);
		System.out.println("Altura Persona 1: " + persona1.getAltura());
	}
	public static void main (String[] args) {
		new Principal();
	}
	
	
}


