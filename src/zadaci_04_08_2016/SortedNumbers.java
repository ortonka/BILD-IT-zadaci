package zadaci_04_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati metodu sa sljedecim headerom koja ispisuje tri broja u rastucem redoslijedu: 
 * public static void displaySortedNumbers(double num1, double num2, double num3). 
 * Napisati program koji pita korisnika da unese tri broja te ispiše ta tri broja u rastucem
 * redoslijedu. 
 * 
 * @author ortonka
 */

public class SortedNumbers {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Unesite prvi broj: ");
		int num1 = checkInput();
		System.out.print("Unesite drugi broj: ");
		int num2 = checkInput();
		System.out.print("Unesite treci broj: ");
		int num3 = checkInput();
		displaySortedNumbers(num1, num2, num3);

	}

	// metoda za prikaz sortiranih brojeva
	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double temp1 = num1, temp2 = num2, temp3 = num3; // pomocne varijable za
															// ispis

		if (num1 > num2) {
			temp1 = num2;
			temp2 = num1;
		}

		if (num2 > num3) {
			temp2 = num3;
			temp3 = num2;
		}

		if (num1 > num2) {
			temp1 = num2;
			temp2 = num1;
		}
		// ispis nakon sortiranja
		System.out.println("Nakon sortiranja:  " + temp1 + " " + temp2 + " " + temp3);
	}

	// provjera unosa
	public static int checkInput() {

		int n = 0;
		boolean error = true; // varijabla za provjeru

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
