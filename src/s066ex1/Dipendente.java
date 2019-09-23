package s066ex1;

public class Dipendente extends Persona {
	
	private int salario; //ha la proprietà salario, è la proprietà di una classe => privato
	
	public Dipendente(String name, String surname, int salary) {
		super (name,surname);
		this.salario = salary;
		
	}
	public int getSalario() { //voglio che nel main posso vedere salario => getSalario
		return salario; 
	}
	
	@Override
	public String toString() {
		return "Dipendente " + super.toString();
	}
	
}
	
