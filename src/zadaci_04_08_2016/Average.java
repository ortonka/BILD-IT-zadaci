package zadaci_04_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati program koji ucitava neodredjeni broj cijelih brojeva (nula prekida unos) 
 * te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku svih unesenih brojeva, 
 * a koliko je bilo brojeva ispod prosjeka. Pretpostavimo da je maksimalan niz brojeva 
 * koje korisnik moze unijeti 100.
 * 
 * @author ortonka
 */

public class Average {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//niz u koji cemo spremati brojeve
		int[] niz = new int[100];
				
		
		System.out.print("Unesite cijele brojeve, 0 terminira unos: ");
		int index = 0;	//broj brojeva unutar niza
		double suma = 0;	//suma za racunanje prosjeka
		
		//petlja za unos elemenata u niz
		for (int i = 0; i < niz.length; i++) {

			niz[i] = checkInput();
			suma += niz[i];
			
			if (niz[i] == 0)
				break;
			index = i;

		}

		input.close();
		//racunanje prosjeka
		double prosjek = suma / (index + 1);

		int aboveAverage = 0; // ispod prosjeka
		int belowAverage = 0; // iznad prosjeka
		
		//racunanje brojeva ispod i iznad prosjeka
		for (int i = 0; i < index + 1; i++) {
			if (niz[i] > prosjek)
				aboveAverage++;
			else if (niz[i] < prosjek)
				belowAverage++;
		}
		//ispis
		System.out.printf(
				"Ispod prosjeka je %d brojeva, jednako prosjeku je %d brojeva, a iznad prosjeka je %d brojeva.",
				belowAverage, index - aboveAverage - belowAverage + 1, aboveAverage);

	}

	// provjera unosa
	public static int checkInput() {

		int n = 0;
		boolean error = true; // varijabla za provjeru

		do {
			try {

				n = input.nextInt();
				if (n == 0) {
					error = false;

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
