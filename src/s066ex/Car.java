package s066ex;

public class Car extends Veicolo implements Climatizzabile {
	
	@Override// dico che settemperature arriva da pi� in alto. 
	public void setTemperature(int newTemp) {//cos� definisco il metodo climatizzabile
		System.out.println("Car temperature now is " + newTemp);
	}
	

}
