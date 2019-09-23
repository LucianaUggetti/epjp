package s066ex;

public class Bus extends Veicolo  implements Climatizzabile {// relazione tra classe extends non implementa
	
	@Override
	public void setTemperature(int newTemp) {
		System.out.println("Bus temperature now is " + newTemp);
	}
	
}
		
	
