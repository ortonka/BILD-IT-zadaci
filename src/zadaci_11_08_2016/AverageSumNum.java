package zadaci_11_08_2016;

/*
 * Napisati program koji ucitava neodredjen broj cijelih brojeva, odredjuje koliko je pozitivnih 
 * brojeva korisnik unio, koliko negativnih te izracunava ukupnu sumu i prosjek svih unesenih 
 * brojeva. (Korisnik prekida unos tako što unese nulu). Na primjer, ukoliko korisnik unese 
 * 1 2 -1 3 0 program treba da ispiše da je broj pozitivnih brojeva 3, negativnih brojeva 1, 
 * suma ili zbir su 5.0 a prosjek svih brojeva je 1.25.
 * 
 * @author ortonka
 */

import java.util.InputMismatchException;

public class AverageSumNum {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Unesite brojeve, 0 terminira unos: ");

		int num = checkInput(); // broj
		int count = 0; // brojac
		double sum = 0; // suma
		int poz = 0; // broj pozitivnih
		while (num != 0) {
			// suma je jednaka zbiru prethodne vrijednosti sume i novog broja
			sum += num;
			// inkrementiraj brojac
			count++;
			// ako je broj jednak maximalnom broju, inkrementiraj brojac
			if (num > 0)
				poz++;

			// broj je jednak unosu
			num = checkInput();

		}
		//ispis
		System.out.printf(
				"Broj pozitivnih brojeva je %d, negativnih brojeva %d,suma je %.1f, a prosjek svih brojeva je %.2f.", poz,
				(count - poz), sum, sum / count);

	}

	// provjera unosa
	public static int checkInput() {

		boolean error = true; // varijabla za provjeru
		int num = 0;
		do {
			try {
				num = input.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Nevalidan unos, pokusajte ponovo: ");
				input.nextLine();
			}
		} while (error);
		return num;
	}

}
