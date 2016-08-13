package zadaci_12_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati program koji pita korisnika da unese dva cijela, pozitivna broja te ispisuje najveci 
 * i najmanji zajednicki djelilac za ta dva broja.
 * 
 * @author ortonka
 */

public class GreatestLowestDiv {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		int num1 = checkInput();
		int num2 = checkInput();

		int lowestCD = 1;		//najmanji zajednicki djelilac
		int greatestCD = 1;		//najveci zajednicki djelilac
		
		for (int i = 2; i <= Math.min(num1, num2); i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				if (lowestCD == 1) // ako lowestCD jos uvijek nije izmijenjen,
					lowestCD = i;	// prvi 'i' koji zadovoljava uslove if petlje
									// je lowestCD
					
				greatestCD = i;		//greatestCD je najveci 'i' koji zadovoljava uslove if petlje
			}
		}
		//ispis
		System.out.printf(
				"Najmanji zajednicki djelilac brojeva %d i %d je broj %d, a najveci zajednicki djelilac je %d.", num1,
				num2, lowestCD, greatestCD);

	}

	// provjera unosa
	public static int checkInput() {
		int num = 0;
		boolean error = true;

		do {
			try {
				System.out.print("Unesite pozitivan cijeli broj: ");
				num = input.nextInt();
				if (num < 0)// ukoliko unos nije cijeli pozitivan broj
					throw new InputMismatchException();
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo. ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}

}
