package zadaci_03_08_2016;

import java.util.InputMismatchException;

/*
 *  Napisati metodu koja prima 2 argumenta: pocetni broj i krajnji broj te printa sve proste
 *  brojeve u zadanom rangu. BONUS: metoda moze primati i treci argument, broj brojeva za
 *  isprintati po liniji.
 *  
 *   * @author ortonka
 */

public class PrimeNumbers {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		int n1 = 0, n2 = 0, numPerLine = 10;

		System.out.print("Unesite donju granicu intervala unutar kojeg zelite da vam se ispisu prosti brojevi: ");
		n1 = checkInput();
		System.out.print("Unesite gornju granicu intervala unutar kojeg zelite da vam se ispisu prosti brojevi: ");
		n2 = checkInput();
		System.out.println("Unesite koliko brojeva po liniji zelite da ispisete: ");
		numPerLine = checkInput();

		printPrimeNumbers(n1, n2, numPerLine);

		input.close();

	}

	public static void printPrimeNumbers(int n1, int n2, int numPerLine) {
		
		int totals = 0; //broj primarnih brojeva
		
		if (n1 < 2)  // ako je pocetna granica intervala manja od 2, stavi pocetnu granicu
			n1 = 2;	 // da je 2, jer je min primarni broj 2
		
		// nadji primarne brojeve
		for (int current = n1; current <= n2; current++) {
			long sqr_root = (long) Math.sqrt(current);
			boolean is_prime = true;
			for (long i = 2; i <= sqr_root; i++) {
				if (current % i == 0) {
					is_prime = false; // current nije primarni broj
				}
			}
			// ako je broj primaran, ispisi ga
			if (is_prime) {

				totals++;

				if (totals % numPerLine == 0)
					System.out.printf("%3d\n", current);
				else
					System.out.printf("%3d", current);

			}

		}

	}

	// provjera unosa
	public static int checkInput() {

		int n = 0;
		boolean error = true; // varijabla za provjeru

		do {
			try {
				n = input.nextInt();
				if (n < 0)
					throw new InputMismatchException("Negativan broj");
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
		} while (error);

		return n;
	}

}
