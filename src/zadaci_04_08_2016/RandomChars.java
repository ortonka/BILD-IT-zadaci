package zadaci_04_08_2016;

/*
 * Napisati metodu koja printa 100 nasumicnih uppercase karaktera i 100 nasumicnih brojeva, 
 * 10 po liniji.
 * 
 * @author ortonka
 */
public class RandomChars {

	public static final int MAX = 100;
	public static final int NUM_PER_LINE = 10;
	public static final int UPPERCASE = 65;
	public static final int NUM_OF_LETTERS = 26;

	public static void main(String[] args) {

		randomChars();
	}

	// metoda za ispis nasumicnih karaktera i nasumicnih brojeva
	public static void randomChars() {

		int count = 0; // postavi brojac na 0
		// u for petlji ispisi nasumicne karaktere
		for (int i = 0; i < MAX; i++) {
			count++;
			if (count % NUM_PER_LINE == 0)
				System.out.println((char) (Math.random() * NUM_OF_LETTERS + UPPERCASE));
			else
				System.out.print((char) (Math.random() * NUM_OF_LETTERS + UPPERCASE) + " ");

		}

		count = 0; // vrati brojac na 0
		// u for petlji ispisi brojeve
		for (int i = 0; i < MAX; i++) {
			count++;
			if (count % NUM_PER_LINE == 0)
				System.out.println((int) (Math.random() * 10));
			else
				System.out.print((int) (Math.random() * 10) + " ");

		}
	}

}
