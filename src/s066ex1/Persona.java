package s066ex1;

public class Persona {


	/*
	 * si identifica con nome e cognome dip nome cognome + salario consu nome
	 * cognome + fattura
	 */
	private String name;
	private String surname;
//questo � il costruttore. source generate penultimo
	public Persona(String n, String s) { //questo � un oggetto  con prorpiet� nome e cognome
												//devo dichiarare le propriet� private della classe persona fuori dall'oggetto
		this.name = n;//la propriet� di QUESTA CLASSE name � = alla variabile name
		this.surname = s;
	}

	public Persona() {
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", surname=" + surname + "]";
	}
}