package s029;

public class Simple {
    public static void main(String[] args) {
        String s = new String("hello");
        System.out.println(s);

        String t = "hello"; //meglio string perchè immutabile
        System.out.println(t);
        
        StringBuilder sb = new StringBuilder("hello"); // è mutabile
        System.out.println(sb); // abbreviato syso(sb)
    }
}
