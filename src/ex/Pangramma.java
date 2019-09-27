package ex;

public class Pangramma {

	public boolean pangramma(String s) {
		s = s.toUpperCase();
		int[] array = new int[26];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {

				array[s.charAt(i) - 'A'] = array[(s.charAt(i) - 'A')] + 1;
			}
			
		}
		for(int test:array) {
			if (test == 0) {
				return false;
			}
		}

		return true;

	}
}
