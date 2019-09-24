package s066ex2;

public abstract class Personaggio {
	
	private String nome;
	private String clan;
	private int puntivita;
	
	
	Personaggio(String nome, String clan, int puntivita) {
		
		this.nome=nome;
		this.clan=clan;
		this.puntivita=puntivita;
	}
		
	
	
	public int getPuntivita() {
			return puntivita;
		}
	
	public int Combattere() {
		int esito=0;
		return esito;
	}
	

}
