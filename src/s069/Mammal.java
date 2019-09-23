package s069;

public abstract class Mammal { //classe astratta, non posso creare un oggetto mammal. 
								// nel main sto creando un array di mammal, con dentro car e dog. 
								//perchè costruttore new è con dog e cat non con mammal
    protected int gestation; //poteva essere anche privato

    public Mammal(int gestation) {
        this.gestation = gestation;
    }

    @Override
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
}
