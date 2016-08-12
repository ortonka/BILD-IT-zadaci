package zadaci_11_08_2016;

/*
 * Napisati program koji ispisuje sve proste brojeve od 2 do 1000, ukljucujuci i 2 i 1000. 
 * Program treba da ispise 8 brojeva po liniji te razmak izmedju brojeva treba da bude jedan space.
 * 
 * @author ortonka
 */

public class PrimeNumbers {

	public static final int START_NUM = 2;
	public static final int END_NUM = 1000;
	public static final int NUM_PER_LINE = 8;

	public static void main(String[] args) {
		int count = 0; // brojac
		// ispis
		System.out.println("Prosti brojevi u intervalu 2-1000 su: ");
		
		for (int i = START_NUM; i <= END_NUM; i++) {
			// ako je broj prost
			if (isPrime(i)) {
				System.out.printf("%4d ", i);	//ispis broja
				count++;
			}

			// ispis, 10 po liniji
			if (count == NUM_PER_LINE) {
				System.out.println();
				count = 0;
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
