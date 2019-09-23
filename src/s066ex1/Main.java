package s066ex1;



public class Main {
	public static void main(String[] args) {
		Persona [] persone= new Persona[3];
		
		persone[0]= new Dipendente("Mario", "Rossi", 1000);
		persone[1]= new Consulente("Luca", "Verdi", 9000);
		persone[2]= new Dipendente("Mirko", "Blu", 5000);
		

		
		for (Persona persona : persone ) {
			if(persona instanceof Dipendente) {
				Dipendente dipendente= (Dipendente)persona;
				System.out.println(dipendente.toString()+ " Il suo salario è: "+  dipendente.getSalario());
			//	dipendente.dip_ToString(name,surname,salario);
						
			} else 
				{
				Consulente consulente = (Consulente) persona;
				System.out.println(consulente.toString() + " Il suo fatturato è: " + consulente.getfattura());
			//consulente.cons_ToString(name, surname, fattura);
				}

		
	}
	}	
}
