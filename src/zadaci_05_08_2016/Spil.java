package zadaci_05_08_2016;

/*
 * Napisati program koji simulira nasumicno izvlacenje karte iz špila od 52 karte.
 * Program treba ispisati koja karta je izvucena (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q ili K)
 * te znak u kojem je data karta (Srce, Pik, Djetelina, Kocka). Primjer: Karta koju ste izvukli
 * je 10 u znaku kocke.
 * 
 * @author ortonka
 */

public class Spil {

	public static void main(String[] args) {
		//pozivanje metoda
		izvuciKartu();

	}
	//kreiranje metoda
	public static void izvuciKartu() {
		//niz karata
		String[] karta = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		//niz znakova
		String[] znak = { "Srce", "Pik", "Djetelina", "Kocka" };
		//ispis
		System.out.println(
				"Izvucena karta je " + karta[((int) (Math.random() * 13))] + " u znaku " + znak[((int) (Math.random() * 4))] + ".");
	}

}
