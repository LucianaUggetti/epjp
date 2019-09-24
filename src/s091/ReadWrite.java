package s091;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadWrite {

	public static void main(String[] args) throws FileNotFoundException { // midava errore => eccezione se non esiste

		File read = new File("C:\\dev\\data.txt");
		//Per leggere un file devo usare scanner

		try (Scanner scanner = new Scanner(read)) {

			while (scanner.hasNext()) {
				if (scanner.hasNextInt()) {

					int numero = scanner.nextInt();
					if (numero == 0) {
						System.out.println("ciao");
						break;
					} else if (numero % 2 == 0) {

						System.out.println( numero + " è pari!");
					} else if (numero % 2 != 0) {
						System.out.println( numero + " è dispari!");
					}

				} else {
					String str = scanner.next();
					System.out.println( str + " non è un numero!");
				}
			}

		}

	}
}
