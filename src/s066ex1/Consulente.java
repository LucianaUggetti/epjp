package s066ex1;

public class Consulente extends Persona {

	private int fattura;

	public Consulente(String name, String surname, int fatt) {
		super(name, surname);
		this.fattura = fatt;

	}
	
	public int getfattura() {
		return fattura;
	}

	@Override
	public String toString() {
		return "Consulente " + super.toString();
	}

}