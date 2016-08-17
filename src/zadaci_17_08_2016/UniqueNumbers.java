package zadaci_17_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati program koji ucitava 10 brojeva te ispisuje koilko je jedinstvenih brojeva unijeto 
 * te sve jedinstvene brojeve koji su unijeti, razmaknute jednim spaceom. Ukoliko se neki broj 
 * pojavljuje više puta, broj treba ispisati samo jednom.
 * 
 * @author ortonka
 */

public class UniqueNumbers {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		int[] niz = new int[10]; // niz
		int count = 0; // brojac
		// unos u niz
		for (int i = 0; i < niz.length; i++) {
			try {
				System.out.printf("Unesite %d. elemenat niza: ", i + 1);
				niz[i] = input.nextInt();

				// ukoliko korisnik unese nesto sto nije integer
			} catch (InputMismatchException e) {
				System.out.println("Pogresan unos! Unesite cijeli broj!");
				input.nextLine();
				i--; // ukoliko se desila greska, smanji brojac
			}

		}
		// ispis
		System.out.print("Jedinstveni brojevi su: ");

		// provjera koji su brojevi jedistveni
		for (int i = 0; i < niz.length; i++) {
			boolean unique = true;

			for (int j = 0; j < i; j++) {
				// ako takav broj vec postoji, unique = false
				if (niz[i] == niz[j]) {
					unique = false;
					break;
				}
			}
			// ako je jedinstven, ispisi ga i inkrementiraj brojac
			if (unique) {
				System.out.print(niz[i] + " ");
				count++;
			}
		}
		// ispis
		System.out.printf("\nJedinstvenih brojeva u unijetom nizu je %d. ", count);
	}

}
