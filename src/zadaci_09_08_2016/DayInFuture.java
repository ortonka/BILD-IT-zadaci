package zadaci_09_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati program koji pita korisnika da unese cijeli broj za danasnji dan u sedmici 
 * (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon danasnjeg dana te mu ispise 
 * koji je to dan u buducnosti. (Primjer: ako korisnik unese 1 kao danasnji dan a 3 kao dan u 
 * buducnosti program mu ispisuje da je danas utorak a dan u buducnosti je petak.) 
 * 
 * @author ortonka
 */

public class DayInFuture {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// broj koji oznacava danasnji dan (0 za pon, 1 za uto ...)
		int today = checkInputDays();
		// broj koji oznacava broj dana nakon danasnjeg dana
		int dayInFuture = checkInputNumOfDays();
		// metoda za ispis rezultata
		showDayInFuture(today, dayInFuture);
	}

	// prikaz danasnjeg dana i dana u buducnosti
	public static void showDayInFuture(int firstDay, int secondDay) {
		// niz sa nazivima dana
		String[] days = { "ponedjeljak", "utorak", "srijeda", "cetvratak", "petak", "subota", "nedjelja" };
		// dan u buducnosti je jednak modulu zbira danasnjeg dana i broja dana
		// sa 7
		int dayInFuture = (firstDay + secondDay) % 7;
		// ispis
		System.out.printf("Danas je %s, a dan u buducnosti je %s. ", days[firstDay], days[dayInFuture]);
	}

	// provjera unosa
	public static int checkInputDays() {

		int n = 0;
		boolean error = true; // varijabla za provjeru
		// unos broja redova/kolona
		do {
			try {
				System.out.print("Unesite broj(0 za ponedjeljak, 1 za utorak...): ");
				n = input.nextInt();
				error = false;
				// ukoliko je broj za danasnji dan manji od nula ili veci od 6,
				// ponovi unos
				if (n < 0 || n > 6) {
					System.out.print("Broj mora biti izmedju 0 i 6 ! ");
					error = true;
				}

			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo ! ");
				input.nextLine();
			}
		} while (error);
		return n;
	}

	// provjera unosa
	public static int checkInputNumOfDays() {

		int n = 0;
		boolean error = true; // varijabla za provjeru
		// unos broja redova/kolona
		do {
			try {
				System.out.print("Unesite broj dana nakon danasnjeg dana: ");
				n = input.nextInt();
				error = false;
				// broj dana u buducnosti mora biti pozitivan broj
				if (n < 0) {
					System.out.print("Broj dana mora biti pozitivan broj. ");
					error = true;
				}

			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo ! ");
				input.nextLine();
			}
		} while (error);
		return n;
	}

}
