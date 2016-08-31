package zadaci_30_08_2016;

import java.io.File;
import java.util.Scanner;

public class Scoress {

	public static void main(String[] args) {
		try (Scanner unos = new Scanner(System.in)) {

			double sum = 0;
			int counter = 0;
			// za korisnicki unos putanje, odkomentirati linije
			/**
			 * System.out.println("Unesite putanju do datoteke: "); String path
			 * = unos.nextLine();
			 */

			// a komentirati ovu liniju
			String path = "src/zadaci_30_08_2016/scores";
			File file = new File(path);
			try (Scanner reader = new Scanner(file)) {
				while (reader.hasNext()) {
					sum += reader.nextInt();
					counter++;
				}
				System.out.println("Suma: " + sum + "\nProsjek: " + String.format("%.2f", (sum / counter)));
			} catch (Exception e) {
				System.err.println("Greška! Pogresno unesena putanja.");
			}
		}
	}

}
