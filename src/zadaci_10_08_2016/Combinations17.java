package zadaci_10_08_2016;

/*
 * Napisati program koji ispisuje sve moguce kombinacije za biranje dva broja u rasponu od 1 do 7. 
 * Takodjer, program ispisuje broj svih mogucih kombinacija.  Dakle, program treba da ispise sve 
 * moguce parove brojeva u datom rasponu, krenuvsi sa 1 2, 1 3, 1 4, itd. Broj mogucih 
 * kombinacija je 21. 
 * 
 * @author ortonka
 */
public class Combinations17 {

	public static void main(String[] args) {

		int count = 0; // brojac
		
		// ispisivanje kombinacija sa dvije for petlje
		for (int i = 1; i <= 7; i++) {
			for (int j = i + 1; j <= 7; j++) {
				count++;
				System.out.printf("%d  %d		 ", i, j);

				// ispis 3 kombinacije po liniji
				if (count % 3 == 0)
					System.out.println();
			}
		}
		// ispis
		System.out.println("Broj svih kombinacija je " + count);

	}

}
