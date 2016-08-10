package zadaci_09_08_2016;

/*
 * Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po liniji, 
 * koji su djeljivi i sa 5 i sa 6. Razmak izmedju brojeva treba biti tacno jedan space. 
 * 
 * @author ortonka
 */

public class Mod5ANDMod6 {

	public static final int START_NUMBER = 100;
	public static final int END_NUMBER = 1000;
	public static final int NUM_PER_LINE=10;

	public static void main(String[] args) {

		int count = 0;

		for (int i = START_NUMBER; i < END_NUMBER; i++) {
			// ako je broj djeljiv i sa 5 i sa 6, ispisi ga
			if (i % 5 == 0 && i % 6 == 0) {
				count++; // inkrementiraj brojac
				System.out.print(i + " ");
			}
			// ako je brojac dosegnuo vrijednost 10, prebaci u novi red
			if (count == NUM_PER_LINE) {
				System.out.println();
				count = 0; // vrati brojac na nulu
			}
		}

	}

}
