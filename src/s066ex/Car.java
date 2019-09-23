package s066ex;

public class Car extends Veicolo implements Climatizzabile {
	
	@Override// dico che settemperature arriva da più in alto. 
	public void setTemperature(int newTemp) {//così definisco il metodo climatizzabile
		System.out.println("Car temperature now is " + newTemp);
	}
	

}
