package s096;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Stringa {
	public static void main(String[] args) {

		String s = new String();
		s = "ciaaao";
		List<Character> lst = new ArrayList<>();
		
		for (int i =0; i<s.length();i++) {
			
			lst.add(s.charAt(i));
		} System.out.println(lst);
		
		TreeSet<Character> albero = new TreeSet<>(lst);
		
		System.out.println(albero);
			
		}

}