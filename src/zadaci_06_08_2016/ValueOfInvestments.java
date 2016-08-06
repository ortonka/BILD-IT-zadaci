package zadaci_06_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati program koji ucitava iznos investicije, godisnju interesnu stopu i broj godina 
 * te vraca buducu vrijednost investicije koristeci se sljedecom formulom: 
 * buducaVrijednostInvesticije = iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. 
 * Na primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godisnju interesnu stopu i 1 
 * kao broj godina program vam vraca 1032.98 kao buducu vrijednost investicije.
 *
 * @author ortonka
 */

public class ValueOfInvestments {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Unesite iznos investicije: ");
		double investment=checkInput();	//iznos investicije
		System.out.print("Unesite godisnju intresnu stopu: ");
		double godIntStopa=checkInput();	//iznos godisnje stope
		System.out.print("Unesite broj godina: ");
		int numOfYears=checkInputInt();		//broj godina

		//ispis
		System.out.printf("Vrijednost buduce investicije je %.2f.",valueOfInvestment(investment, godIntStopa, numOfYears));
	}

	//metoda za racunanje vrijednosti buduce investicije prema uslovima zadatka
	public static double valueOfInvestment(double iznosInvesticije, double godIntStopa, int brojGod) {
		return java.lang.Math.pow((1 + godIntStopa / (12 * 100)), brojGod * 12) * iznosInvesticije;
	}

	// provjera unosa za tip double
	public static double checkInput() {

		double n = 0;
		boolean error = true; // varijabla za provjeru

		do {
			try {
				n = input.nextDouble();
				if (n < 0)
					throw new InputMismatchException("Nevalidan unos.");
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
		} while (error);
		return n;
	}
	
	// provjera unosa za tip Int
		public static int checkInputInt() {

			int n = 0;
			boolean error = true; // varijabla za provjeru

			do {
				try {
					n = input.nextInt();
					if (n < 0)
						throw new InputMismatchException("Nevalidan unos.");
					error = false;
				} catch (InputMismatchException e) {
					System.out.print("Nevalidan unos, pokusajte ponovo:  ");
					input.nextLine();
				}
			} while (error);
			return n;
		}

}
