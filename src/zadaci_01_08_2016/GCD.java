package zadaci_01_08_2016;

/* Napisati metodu koja prima dva cijela broja kao argumente te vraca najveci zajednicki
 * djelilac za ta dva broja.
 *
 * PRIMJER:
 *
 * Unesite prvi broj: 125
 * Unesite drugi broj: 2525
 * Najveci zajednicki djelilac za brojeve 125 i 2525 je 25.
 *
 * @author ortonka
 * 
*/

import java.util.InputMismatchException;

public class GCD {

	public static void main(String[] args) {
		// kreiranje skenera
		java.util.Scanner in = new java.util.Scanner(System.in);
		// varijabla koja cuva vrijednost da li se dogodila iznimka
		boolean error = true;
		int num1 = -1, num2 = -1;
		do {
			// Unutar try-catch bloka se odradjuje unos kako bi se mogao
			// tretirati pogresan unos
			try {
				System.out.print(
						"Unesite dva cijela broja kako biste pronasli njihov najveci zajednicki djelilac!\nUnesite prvi broj: ");

				num1 = in.nextInt();
				System.out.print("Unesite drugi cijeli broj: ");
				num2 = in.nextInt();
				// Ako se nije desila pogreska pri unosu, postavi varijablu
				// error na false
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Pogrešan unos, pokušajte ponovo: ");
				in.nextLine();
			}
		} while (error);
		// Zatvaranje skenera
		in.close();

		// Ispis
		System.out.println("Najveci zajednicki djelilac brojeva " + num1 + " i " + num2 + " je " + findGCD(num1, num2));
	}

	// Metod koji pronalazi najveci zajedniciki djelilac dva broja
	public static int findGCD(int num1, int num2) {
		// Ako je jedan od brojeva 0, najveci zajednicki djelilac je drugi broj
		if (num1 == 0)
			return num2;
		else if (num2 == 0)
			return num1;
		// Dio koda unutar else bloka radi u slucaju ako su oba broja nula (
		// vraca nulu
		// kao NZD) ili ako ni jedan nije nula (nalazi NZD)
		else {
			int greatestCD = 0;
			for (int i = 2; i <= num2 && i <= num1; i++) {
				if (num1 % i == 0 && num2 % i == 0) {
					greatestCD = i;
				}
			}
			return greatestCD;
		}
	}

}
