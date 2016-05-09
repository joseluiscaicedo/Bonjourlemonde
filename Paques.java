import java.util.Scanner;

public class Paques {

	private static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		
		int year = demanderAnnee();
		afficheDate(year, datePaques(year));
		datePaques(year);
	}

	public static int demanderAnnee() {
		System.out.println("Entrez une annee (1583-4000) :");
		int anne = clavier.nextInt();
		while (anne < 1583 || anne > 4000) {
			System.out.println("Entrez une annee (1583-4000) :");
			anne = clavier.nextInt();
		}
		return anne;
	}

	public static void afficheDate(int anne,int jours) {
		// 2 metodo que se llame muestrefecha y que ingrese un dia e imprima
		// esto "fecha de pascua en 2006 : 16 abril"
		
		String mes = "mars";
		if (jours>31){
			mes = "avril";
			jours = jours -31;
		}
		System.out.println("Date de Paques en " + anne + " : " +jours + " "+ mes);
	}

	public static int datePaques(int anne) {
		int jours=0;
		int dia = 0;
		int annee = anne;
		int siecle = annee / 100;
		int p = (13 + (8 * siecle)) / 25;
		int q = siecle / 4;
		int m = (15 - p + siecle - q) % 30;
		int n = (4 + siecle - q) % 7;
		int d = (m + (19 * (annee % 19))) % 30;
		int e = (2 * (annee % 4) + 4 * (annee % 7) + 6 * d + n) % 7;

		if ((e == 6) && (d == 29) || ( (e == 6) && (d == 28) && ((11 * (m + 1)) % 30) < 19)) {
	            dia = e + d + 22 - 7;
		 }else{
	            dia = e + d + 22;
	            }   
		return dia;
	}	
}
