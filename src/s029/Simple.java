package s029;

public class Simple {
    public static void main(String[] args) {
        String s = new String("hello");
        System.out.println(s);

        String t = "hello"; //meglio string perch� immutabile
        System.out.println(t);
        
        StringBuilder sb = new StringBuilder("hello"); // � mutabile
        System.out.println(sb); // abbreviato syso(sb)
    }
}
