package s045;

public class EserciziMetodo { // voglio da Bob a bob e BOB

	public static void main(String[] args) {

		System.out.println(toUpper("bOB"));
		System.out.println("toUpper():" + toUpper2("bOB"));

	}

	public static String toUpper(String s) {

		StringBuilder sb = new StringBuilder("bOB"); // se vuoto allora appen lo riempio se pieno lo modifico

		for (int i = 0; i < sb.length(); i++) {

			if (sb.charAt(i) <= 122 && sb.charAt(i) >= 97) { // compreso >0 && <=

				int c = sb.charAt(i) - 32; // invece di usare 32 è meglio usare delta e calcolarlo prima
				char d = (char) c;
				String x = Character.toString(d); // meglio cambiare nome della stringa. COSI' ho cambiato un carattere
													// in string
				sb.replace(i, i + 1, x); // non è ottimizzato perchè passo a stringa

			}
		}
		return sb.toString();

	}

	public static String toUpper2(String s) {
		if (s == null) { //l'ho fatto perchè l'errore mi dà l'errore con null
			return null;
		}
		
		StringBuilder sb = new StringBuilder(s); // allora ho fatto una stringa modificabile = ad s. è come il mio
													// scrivere bob
		for (int i = 0; i < s.length(); i++) {
			char cur = s.charAt(i);
			if (cur >= 'a' && cur <= 'z') {
				sb.setCharAt(i, (char) (cur - 32));
			}
		}
		return sb.toString();
	}
}

/*
 * public static void
 * 
 * for (int i = 0; i<s.length(); i++) {
 * 
 * if (s.charAt(i) <= 90 && s.charAt(i) >= 65) { // compreso >0 && <= int c =
 * s.charAt(i) + 32; // invece di usare 32 è meglio usare delta e calcolarlo
 * prima char d = (char) c; System.out.print(d);
 * 
 * } else {
 * 
 * System.out.print(s.charAt(i)); }
 * 
 * } // per trasformare lettere in numeri int a = (int)'a' System.out.println('
 * ');**for( int i = 0;i<s.length();i++)
 * 
 * {
 * 
 * if (s.charAt(i) >= 90) { int c = s.charAt(i) - 32;
 * 
 * char d = (char) c; // così forzo la trasformazione di un int in d
 * System.out.print(d); } else { System.out.print(s.charAt(i)); }
 * 
 * } } }
 */