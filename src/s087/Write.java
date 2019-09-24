package s087;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write {
	public static void main(String[] args) { // MAIN

		File f = new File("C:\\dev\\data.txt"); // ultimo spazio devo mettere il nome del file con l'estensione
		try {
			FileWriter fw = new FileWriter(f);
			PrintWriter pw = new PrintWriter( fw);
			pw.println("12");
			pw.println("27");
			pw.println("Bella!");
			pw.println("0");
			pw.println("51");
			
			pw.flush();
			pw.close();

		} catch

		(IOException e) {
			e.printStackTrace();
		}
	}
}