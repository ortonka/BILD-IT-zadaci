package zadaci_10_08_2016;

/*
 * Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. Na primjer, 
 * brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takodjer twin primes. 
 * Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji.
 * 
 * @author ortonka
 */

public class TwinNumbers {

	public static final int END_NUM = 10000;
	public static final int NUM_PER_LINE = 10;

	public static void main(String[] args) {
		int prime = 1; // prosti broj dobiven prethodnom iteracijom for petlje
		int count = 0; // brojac
		// ispis
		System.out.println("Twin prosti brojevi su: ");

		for (int i = 2; i < END_NUM; i++) {
			// ako je broj prost
			if (isPrime(i)) {
				// ako je razlika izmedju prethodnog prostog broja i trenutnog
				// prostog broja 2, ispisi ga
				if (i - prime == 2) {
					System.out.printf("%4d i %-4d  ", prime, i);
					count++;
				}
				// postavi varijablu prime na prosti broj
				prime = i;

				// ispis, 10 po liniji
				if (count == NUM_PER_LINE) {
					System.out.println();
					count = 0;
				}
			}
		}
	}

	// metoda za provjeru prostog broja
	public static boolean isPrime(int num) {
		int sqr_root = (int) Math.sqrt(num);
		for (int i = 2; i <= sqr_root; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
