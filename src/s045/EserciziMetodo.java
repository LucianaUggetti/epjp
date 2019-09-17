package s045;

public class EserciziMetodo { // voglio da Bob a bob e BOB

	public static String toUpper(String s) {
		
		StringBuilder sb = new StringBuilder("BoB"); //se vuoto allora appen lo riempio se pieno lo modifico
		
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) <= 90 && s.charAt(i) >= 65) { // compreso >0 && <=
				int c = s.charAt(i) + 32; // invece di usare 32 è meglio usare delta e calcolarlo prima
				char d = (char) c;
				System.out.print(d);
			}

		
		
		
		}
		return sb.toString();

	}

	public static void main(String[] args) { // passo da B a intero
		String s = "bHeLLo";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) <= 90 && s.charAt(i) >= 65) { // compreso >0 && <=
				int c = s.charAt(i) + 32; // invece di usare 32 è meglio usare delta e calcolarlo prima
				char d = (char) c;
				System.out.print(d);
			} else {
				System.out.print(s.charAt(i));
			}

		} // per trasformare lettere in numeri int a = (int)'a'
		System.out.println(' ');

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 90) {
				int c = s.charAt(i) - 32;

				char d = (char) c; // così forzo la trasformazione di un int in d
				System.out.print(d);
			} else {
				System.out.print(s.charAt(i));
			}

		}

	}

}
