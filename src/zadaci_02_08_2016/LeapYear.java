package zadaci_02_08_2016;

/* Napisati program koji ispisuje sve prestupne godine, 10 po liniji,
 * od godine 101 do 2100, odvojene jednim spaceom.
 * Takodjer ispisati i ukupan broj prijestupnih godina u ovom vremenskom periodu.
 * 
 * @author ortonka
*/

public class LeapYear {

	public static void main(String[] args) {
		// brojac koji broji koliko je godina ispisano
		int brojac = 0;

		for (int godina = 101; godina < 2100; godina++) {

			if (prestupna(godina)) {

				System.out.print(godina + " ");
				brojac++;

				if (brojac % 10 == 0) // deset po liniji
					System.out.println();
			}
		}

		// ispis ukupnog broja prijestupnih godina
		System.out.println("\nBroj prijestupnih godina u intervalu od 101. godine do 2100. je " + brojac);
	}

	public static boolean prestupna(int godina) {
		if (((godina % 4 == 0) && (godina % 100 != 0)) || (godina % 400 == 0))
			return true;
		return false;
	}

}
