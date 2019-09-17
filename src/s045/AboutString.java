package s045;

public class AboutString {
    public static void main(String[] args) { //statico xk deve essere eseguito dalla JVM. args è array di stringhe che non ci passa niente
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u); // concateno stringhe

        System.out.println("char at position 1 in s: " + s.charAt(1)); //+s.. mi dice concatena il carattere al posto 1 della stringa s

        System.out.println("s < t: " + s.compareTo(t)); //fà confronto ordine alfabetico tra s e t. s è prima allora <0. il valore dice la differenza tra s e t
        System.out.println("t > s: " + t.compareTo(s)); //faà confronto tra t ed s e t è dopo => >0

        System.out.println("concat s and t: " + s.concat(t)); //concateva s e t, senza spazio

        System.out.println("t contains u? " + t.contains(u)); //verifica se dentro t c'è la stringa u, vero allora true

        String u2 = t.substring(1, 3); // ritorna una sotto stringa di t da 1 incluso a 3 escluso
        System.out.println("u2 = t.substring(1, 3): " + u2); //sottolinea la differenza tra metodo a metodo a seconda anche dei parametri
        System.out.println("t.substring(3): " + t.substring(3)); // con un solo parametro vuol dire da quel parametro alla fine della stringa

        System.out.println("u equals u2? " + u.equals(u2));
        System.out.println("u == u2? " + (u == u2));

        System.out.println("First index of 'l' is s: " + s.indexOf('l'));  //confronta nella stringa la posizione del carattere da cercare
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));// parte dal fondo e si ferma alla prima che c
        System.out.println("there is no 'x' in s: " + s.indexOf('x')); //-1 non c'è
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));// occhio ci sono le " e non la ', in questo caso c'è la stringa
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty()); // metodo su una stringa. crea una variabile senza nome. 

        System.out.println("s length: " + s.length());//restituisce la lunghezza di s

        String s2 = s.replace('l', 'q'); //chiama un metodo per creare una seconda stringa duplicando la prima applicando il rimpiazzo
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" "); //crea un oggetto "", chiamo split e separo dove c'è lo spazio( perchè c'è lo spazio tra la ". IMPO SPLIT NECESSITA DI UNA STRINGA. se non ci fosse stato lo spazio ma il for lo sostituivo con un a capo
        System.out.println("Splitting: ");
        for (String token : splits) {
            System.out.println(token);
        }
        String joined = String.join(" ", splits); //metodo join E' STATICO. infatti non chiama una stringa specifica ma una stringa generica. primo parametro dice il separatore, secondo l'array da unire => da array di stringhe ad una stringa unica 
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase()); //metodo che ritorna la stringa tutta maiuscola
        System.out.println("lower: " + "SHUT UP!".toLowerCase()); //metodo che torna una stringa tutta minuscola

        System.out.println("trim [" + " la la la ".trim() + "]"); //metodo che toglie gli spazi bianchi esterni della stringa
        
        String x = null; // crea una stringa x dal valore nullo. cioè gli da un reference finto, su cui non puoi chiamare un null
        System.out.println("Sort of safe toString(): " + String.valueOf(x)); //mi permette di stampare un oggetto che non sono sicura sia null o no allora uso questo metodo
    }
} //c'è un altro metodo che mi permette di stampare una rappresentazione stringa di quell'oggetto dog => dog.toString();.se Dog dog=null crash
