package zadaci_01_08_2016;

/* Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela pretpostavka, znam) 
 * Napisati program koji pita korisnika da unese string te mu ispise broj samoglasnika
 * i suglasnika u datom stringu.
 * 
 * @author ortonka
 */

public class Samoglasnici {

	public static void main(String[] args) {
		// Kreiramo skener
		java.util.Scanner in = new java.util.Scanner(System.in);
		// Unos stringa
		System.out.print("Unesite string: ");
		String string = in.nextLine();
		in.close();
		// Postavljanje varijabli za brojanje suglasnika i samoglasnika na
		// pocetnu vrijednost 0
		int brojacSuglasnik = 0;
		int brojacSamoglasnik = 0;
		// Petljom proci kroz citav string i izbrojati samoglasnike i suglasnike
		for (int i = 0; i < string.length(); i++) {
			// Ako su karakteri unutar stringa mala slova, prebaciti ih u velika
			switch (Character.toUpperCase(string.charAt(i))) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				// Za svaki od samoglasnika inkrementira se varijabla
				// brojacSamoglasnika za 1
				brojacSamoglasnik++;
				break;

			case 'B':
			case 'C':
			case 'D':
			case 'F':
			case 'G':
			case 'H':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'P':
			case 'R':
			case 'S':
			case 'T':
			case 'V':
			case 'Z':
			case 'X':
			case 'Y':
			case 'Q':
			case 'W':
				// Za svaki od suglasnika inkrementira se varijabla
				// brojacSuglasnika za 1
				brojacSuglasnik++;
			}

		}
		// Ispis
		System.out.println("String \"" + string + "\" ima " + brojacSamoglasnik + " samoglasnika i " + brojacSuglasnik
				+ " suglasnika.");
	}
}