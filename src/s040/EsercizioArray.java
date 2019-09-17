package s040;

/* array boolenas 1. loop stampare tuttii valori
*2. Loop cambiare i false in true con for
*3. stampare nuovo array
*4. loop cambiare tutti in false con for each
/*
 * 
 */
public class EsercizioArray {

	public static void main(String[] args) { // main mi dice che inizia e dentro ho un array di stringhe
		boolean[] flags = { true, false, false }; // ho un array di booleani

		for (boolean flag : flags) { // for each con quello corrente di chiama flag
			System.out.println(flag);
		}

		System.out.println("cambio F in T");

		for (int i = 0; i < flags.length; i++) { //inti=0 sto identificando la variabile i, poi gli dico fino a quando, poi come mi muovo ++= 1 alla volta
			if (flags[i]==false) {  // così sto usando i come indice di flags
				flags[i]=true;
			}
		}

		System.out.println("Nuovi valori");
		for (boolean flag : flags) { 
			System.out.println(flag);
		}

	}

}
