package zadaci_06_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati program koji ispisuje sve prijestupne godine, 10 po liniji, 
 * u rasponu godina koje korisnik unese. Program pita korisnika da unese pocetnu godinu, 
 * krajnju godinu te ispisuje sve godine u tom rasponu. Razmak izmedju godina treba biti 
 * jedan space. 
 * 
 * @author ortonka
 */

public class LeapYears {

	static final int startLeapYear = -45;	//godina od koje se racunaju prijestupne godine

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		System.out.print(
				"Unesite raspon godina unutar kojih zelite da provjerite prijestupne godine. \nUnesite pocetak raspona: ");
		// unos sa provjerom ulaza
		int start = checkInput();
		System.out.print("Unesite kraj raspona: ");
		// unos sa provjerom ulaza
		int end = checkInput();
		// ukoliko je krajnja granica manja od pocetne, ponovi unos
		while (end < start) {
			System.out.println("Krajnja godina mora biti veca od pocetne, unesite ponovo krajnju godinu: ");
			end = checkInput();
		}

		int counter = 0; // brojac prestupnih godina

		for (int year = start; year < end; year++) {

			if (isLeapYear(year)) {

				if (counter == 0)
					System.out.println("Prijestupne godine u ovom intervalu su: ");

				System.out.printf("%3d ", year);
				counter++;

				if (counter % 10 == 0) // deset po liniji
					System.out.println();
			}
		}

		if (counter == 0)
			System.out.printf("U rasponu od %d. godine do %d. godine nema prijestupnih godina. ", start, end);

	}

	/*
	 * provjera o prestupnim godinama izvrsena ovdje
	 * http://www.wwu.edu/depts/skywise/leapyear.html prema datoj stranici
	 * postavljeni i uslovi
	 */
	public static boolean isLeapYear(int year) {

		if ((year >= 1582) && (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)))
			return true;
		else if (year >= 8 && year < 1582 && year % 4 == 0)
			return true;
		else if (year > -45 && year <= -9 && year % 3 == 0)
			return true;
		return false;
	}

	// provjera unosa
	public static int checkInput() {

		int n = 0;
		boolean error = true; // varijabla za provjeru
		// unos broja redova/kolona
		do {
			try {
				n = input.nextInt();
				if (n < startLeapYear) {
					System.out.println("Prestupne godine se racunaju od 45 godine BC.");
					throw new InputMismatchException("Nevalidan unos.");
				}
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
		} while (error);
		return n;
	}

}
