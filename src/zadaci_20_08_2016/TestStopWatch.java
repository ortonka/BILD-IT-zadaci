package zadaci_20_08_2016;

/* Write a test program that measures the execution 
 * time of sorting 100,000 numbers using selection sort.
 *  
 *  @author ortonka
 */

public class TestStopWatch {

	public static final int NUM_OF_ELEMENTS = 100000;

	public static void main(String[] args) {
		// kreiranje niza sa 100000 elemenata
		int[] niz = new int[NUM_OF_ELEMENTS];
		// popunjavanje niza
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random() * 100);
		}
		// poziv start() metode klase StopWatch
		StopWatch.start();
		// poziv metoda za sortiranje
		SelectionSort(niz);
		// poziv stop() metode klase StopWatch
		StopWatch.stop();
		System.out
				.println("Broj milisekundi za Selection sort niza od 100000 elemenata: " + StopWatch.getElapsedTime());

	}

	// Selection sort algoritam za sortiranje niza
	public static void SelectionSort(int[] num) {

		int i, j, first, temp;
		for (i = num.length - 1; i > 0; i--) {
			first = 0;
			for (j = 1; j <= i; j++) {
				if (num[j] > num[first])
					first = j;
			}
			temp = num[first];
			num[first] = num[i];
			num[i] = temp;
		}
	}

}
