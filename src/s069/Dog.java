package s069;

public class Dog extends Mammal {
    private Tail tail; //gli dico che ha una Coda(classe) chiamata coda.

    public Dog(int gestationDays, int tailLen) { //lunghezza della coda
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {
        return "Dog [tail=" + tail + ", gestation=" + gestation + "]";
    }
}
