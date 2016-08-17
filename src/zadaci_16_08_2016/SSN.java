package zadaci_16_08_2016;

/*
 * Napisati program koji pita korisnika da unese Social Security Number (SSN) u formatu 
 * DDD-DD-DDDD gdje D predstavlja broj. Program treba da provjerava da li je broj unesešen u 
 * ispravnom formatu. Ukoliko nije, program pita korisnika da pokuša ponovo. Ukoliko jeste 
 * unešen u pravom formatu, program završava sa radom.
 * 
 * @author ortonka
 */

public class SSN {

	public static final int L = 11; // duzina SSN broja

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// ispis
		System.out.print("Unesite string: ");
		// unos stringa
		String s = input.nextLine();
		// sve dok je format nevalidan, trazi ponovni unos
		while (!isValidFormatSSN(s)) {
			System.out.print("Nevalidan format, pokusajte ponovo. Koristite format DDD-DD-DDDD: ");
			s = input.nextLine();
		}
		// ispis
		System.out.println("Vas SSN je: " + s);
		input.close();
	}

	public static boolean isValidFormatSSN(String s) {
		// provjeri duzinu, ako duzina nije odgovorajuca, vrati false
		if (s.length() != L)
			return false;
		// google knows everything (otherwise it would be 11 'if' conditions)
		if (s.matches("\\d{3}-\\d{2}-\\d{4}"))
			return true;
		return false;

	}

}
