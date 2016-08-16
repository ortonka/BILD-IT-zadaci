package zadaci_15_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati metodu koja izracunava zbir svih brojeva u cijelom broju. Koristite sljedeci header: 
 * public static int sumDigits(long n). 
 * Na primjer, ako pozovemo metodu i proslijedimo joj broj 234 (sumDigits(234)) metoda treba da 
 * vrati 9. (2 + 3 + 4 = 9)
 * 
 * @author ortonka
 */
public class SumDigits {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// unos broja
		long num = checkInput();
		// ispis i poziv metode
		System.out.printf("Suma cifara broja %d iznosi %d.", num, sumDigits(num));
	}

	// metoda koja vraca sumu cifara broja
	public static int sumDigits(long n) {
		int sum = 0; // suma
		// sve dok je broj razlicit od nula
		while (n != 0) {
			// posljednju cifru broja dodaj na sumu
			sum += n % 10;
			// broj smanji za datu cifru
			n /= 10;
		}
		return sum;
	}

	// provjera unosa
	public static long checkInput() {
		long num = 0;
		boolean error = true;

		do {
			try {
				System.out.print("Unesite broj: ");
				// unos broja tipa Long
				num = input.nextLong();
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo. \n");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}
}
