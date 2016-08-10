package zadaci_10_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati metodu koja vraca broj dana u godini. Metoda koristi sljedeci header: 
 * public static int numberOfDayInAYear(int year). 
 * Napisati program koji pita korisnika da unese pocetnu godinu, krajnju godinu te ispisuje broj 
 * dana za svaku godinu u rasponu.
 * 
 * @author ortonka
 */

public class NumOfDaysInYear {
	
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Unesite pocetnu godinu: ");
		int startYear=checkInput();		//pocetna godina
		System.out.print("Unesite krajnju godinu: ");
		int endYear=checkInput();		//krajnja godina
		//ispis broja dana svih godina u unesenom intervalu
		for(int i=startYear; i<endYear; i++){
			System.out.printf("Godina %d ima %d dana.\n", i, numberOfDayInAYear(i));
		}
		

	}

	public static int numberOfDayInAYear(int year) {
		if (isLeapYear(year))
			return 366;
		else
			return 365;
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
					error = false;
				} catch (InputMismatchException e) {
					System.out.print("Nevalidan unos, pokusajte ponovo:  ");
					input.nextLine();
				}
			} while (error);
			return n;
		}

}
