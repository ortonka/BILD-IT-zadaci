package zadaci_13_08_2016;

import java.util.InputMismatchException;

/*
 * Napišite metodu sa sljedecim headerom koja vraca naopako ispisan broj koji joj je proslijedjen 
 * kao argument: 
 * public static void reverse(int number). 
 * Na primjer, reverse(3456) treba da vrati 6543. Napisati program koji pita korisnika da unese 
 * neki cijeli broj te mu vrati isti ispisan naopako. 
 * 
 * @author ortonka
 */

public class ReverseNumber {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//unos broja
		int num = checkInputI();
		//ispis
		System.out.printf("Broj %d naopako je ", num);
		// pozivanje metoda
		reverse(num);
	}

	// zadatak zahtjeva samo ispis broja
	public static void reverse(int n) {
		// sve dok broj nije 0, uzimaj posljednju cifru i ispisi
		while (n != 0) {
			int digit = n % 10;
			System.out.print(digit);
			n = n / 10;
		}
	}

	// provjera unosa
	public static int checkInputI() {
		int num = 0;
		boolean error = true;

		do {
			try {
				System.out.println("Unesite cijeli broj: ");
				num = input.nextInt();
				if (num < 0)
					throw new InputMismatchException();
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo: ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}

}
