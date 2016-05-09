import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";


        int contador = 0;
        int vacio =0;
        for (int i=0; i<s.length(); ++i){
        	for (int j=0; j<ALPHABET.length(); ++j){
        		if (s.charAt(i)==ALPHABET.charAt(j)){
        			contador=j + 4;
        			if (j==22){ contador=0;}
        			if (j==23){ contador=1;}
        			if (j==24){ contador=2;}
        			if (j==25){ contador=3;}
        			chaineCodee=chaineCodee+ALPHABET.charAt(contador);
        			aCoder=aCoder+ALPHABET.charAt(j);
        		}else
        			if (s.charAt(i)==' ' && vacio!=i){
            			vacio=i;
            			chaineCodee=chaineCodee+s.charAt(vacio);
            			aCoder=aCoder+s.charAt(vacio);
        			}
        	}
        }

        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}
