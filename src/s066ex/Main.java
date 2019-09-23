package s066ex;

public class Main {
	
	public static void main(String[] args) {
		
		Veicolo[] veicoli= new Veicolo[3]; //fanno parte della stessa gerarchia infatti ho visto extend
		veicoli[0]= new Car();
		veicoli[1]= new Bus();
		veicoli[2]= new MotoBike();
		
	//	MotoBike myMoto = new MotoBike();
		
		boolean rightDirection = true;
	/*	
		Car mycar = new Car();
		
		mycar.steer(rightDirection);
		rightDirection= !rightDirection;
		
		int angle= 45;
		myMoto.steerwangle(rightDirection, angle);
	*/
		
		for(Veicolo veicolo : veicoli ) {
			if(veicolo instanceof MotoBike ) {
				MotoBike mymoto = (MotoBike) veicolo;
		//	???	mymoto.steerwangle(boolean right,int angle);
			}
		}
		
		
		Climatizzabile[] climatizzabili = new Climatizzabile[2];
		climatizzabili[0] = new Bus();
		climatizzabili[1] = new Car();
		
		int temperature=20;
		
		
		
		for (Climatizzabile climatizzabile : climatizzabili ) {
		climatizzabile.setTemperature(temperature);
		temperature +=1;
		}
		
		
		for (Climatizzabile climatizzabile : climatizzabili ) {
			if(climatizzabile instanceof Car) {
				Car car= (Car)climatizzabile;
				car.steer(true);
						
			} else { System.out.println("This is not a car"); }
			
		
		//voglio far sterzare l'automobile in climatizzabile
		
	}
	}
}
