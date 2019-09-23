package s066ex1;

public class Persona {


	/*
	 * si identifica con nome e cognome dip nome cognome + salario consu nome
	 * cognome + fattura
	 */
	private String name;
	private String surname;
//questo è il costruttore. source generate penultimo
	public Persona(String n, String s) { //questo è un oggetto  con prorpietà nome e cognome
												//devo dichiarare le proprietà private della classe persona fuori dall'oggetto
		this.name = n;//la proprietà di QUESTA CLASSE name è = alla variabile name
		this.surname = s;
	}

	public Persona() {
	}

	@Override
	public String toString() {
		return "Persona [name=" + name + ", surname=" + surname + "]";
	}
}