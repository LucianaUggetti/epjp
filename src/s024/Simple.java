/*
 * A simple Java source file = COMMENTO MULTIRIGA
 */
package s024; //PRIMA RIGA DI CODICE=Indicazione in che classe trovo i file, meglio non usare package di default

import java.lang.Math; //acesso a classi di altri package, li importo. not required = COMMENTO 

/**
 * @author manny
 */
// COMMENTO MULTIRIGA SERVE PER LA RIGERAZIONE AUTOMATICA DEL DOCUMENTO
public class Simple { // crea relazione con file sorgente
    public static void main(String[] args) { //main è il primo mtodo che viene chiamato quando voglio eseguire codice
        System.out.println(Math.PI); // println=stampa una riga. è un metodo evocato/eseguito
    } //{=delimita blocchi,(=metodo, al loro interno ci sono i parametri,[=array cioè un vettore, elementi omogenei
}

class PackageClass {
    // TBD
} //ogni comando/statement finisce con un ;