package s091;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		System.out.println("Please, enter a few numbers");

		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNext()) { // ti hanno inserito qualcosa?! BOOL

				if (scanner.hasNextInt()) {
					int num = scanner.nextInt();

					if (num == 0) { // in questo caso non � un eccezione, non mi darebbe errore, � un valore appeso
						System.out.println("ciao");
						break;
					} else if (num % 2 == 0) {
						System.out.println("Il numero da te inserito � pari!");
					} else if (num % 2 != 0) {
						System.out.println("Il numero da te inserito � dispari!");

					}

				} else { //altrimenti leggi la stringa!
					
					String s = scanner.next();//necessario senn� loop, continua a leggere il valore inserito. gli devo dire leggi la nuova stringa 
					System.out.println("Devi inserire un numero! E non " + s );

				}
			}
		}
	}
}