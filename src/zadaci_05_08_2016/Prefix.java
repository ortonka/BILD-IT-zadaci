package zadaci_05_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveci zajednicki prefix 
 * za ta dva stringa, ukoliko isti postoji. Na primjer, ukoliko korisnik unese sljedeca dva 
 * stringa "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" program treba da ispiše: Najveci 
 * zajednicki prefix za dva stringa je "Dobrodošli u". 
 * 
 * @author ortonka
 */
public class Prefix {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		// unos prvog stringa od korisnika sa provjerom unosa
		System.out.print("Unesite prvi string: ");
		String string1 = checkInput();
		// unos drugog stringa od korisnika sa provjerom unosa
		System.out.print("Unesite drugi string: ");
		String string2 = checkInput();

		in.close();
		// ispis
		if (prefix(string1, string2).equals(""))
			System.out.println("Stringovi nemaju zajednicki prefix.");
		else
			System.out.printf("Najveci zajednicki prefix za dva stringa je \"%s\".", prefix(string1, string2));

	}

	// funkcija koja nalazi najveci zajednicki prefiks
	public static String prefix(String s1, String s2) {
		String minString = s1;
		String str = s2;

		if (s1.length() > s2.length()) {
			minString = s2;
			str = s1;
		}
		// sve dok su karakteri na istim mjestima razliciti, kao prefiks postavi
		// sve karaktere do tog razlicitog karaktera u minStringu
		for (int i = minString.length() - 1; i >= 0; i--) {
			if (str.charAt(i) != minString.charAt(i))
				minString = minString.substring(0, i);
		}

		return minString;
	}
//provjera unosa
	public static String checkInput() {
		boolean error = true;
		String s = "";
		do {
			try {
				s = in.nextLine();
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo:  ");
				in.nextLine();
			}
		} while (error);
		return s;
	}

}
