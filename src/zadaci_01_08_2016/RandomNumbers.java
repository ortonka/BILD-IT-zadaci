package zadaci_01_08_2016;

/* Napisite program koji generise 100 nasumicnih cijelih brojeva izmedju 0 i 9 
 * te ispisuje koliko se puta koji broj ponovio.
 * 
 * @author ortonka
 */

public class RandomNumbers {

	public static void main(String[] args) {

		// Kreiranje nizova, u prvi niz cemo smjestiti sto nasumicnih brojeva od
		// 0 do 9,a drugi ce sluziti da se u njega smjesti koliko se puta koji
		// broj izmedju 0 i 9 ponovio

		int[] randomNumbers = new int[100];
		int[] count = new int[10];
		// Unutar for petlje ce se odmah upisivati brojevi i provjeravati koliko
		// se puta koji broj ponovio
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = (int) (Math.random() * 10);
			for (int j = 0; j < 10; j++) {
				if (randomNumbers[i] == j)
					count[j]++;
			}
		}

		// Ova for petlja sluzi za ispis
		for (int i = 0; i < 10; i++) {
			System.out.println("Broj " + i + " se ponovio " + count[i] + " puta.");
		}
	}

}


