package zadaci_31_08_2016;

import java.io.IOException;
import java.net.MalformedURLException;

public class CountWords {

	public static void main(String[] args) {
		//odradi unutar try-catch bloka za moguce iznimke
		try {
			// uvoz url-a za dobijanje file-a
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			// kreiranje scannera za citanje iz filea
			java.util.Scanner input = new java.util.Scanner(url.openStream());
			int wordCount = 0;
			// sve dok postoji varijabla u file-u
			while (input.hasNext()) {
				String w = input.next();
				/*
				 * narednih 6 linija koda provjerava da li se neka rijec sastoji
				 * samo od znakova, i ne uzima je u obzir, kao sto je u tekstu
				 * slucaj sa "--", ako je i to trebalo uzimati kao rijeci,
				 * komentiraj narednih 6 linija
				 */
				boolean check = false;
				for (int i = 0; i < w.length(); i++) {
					if (Character.isAlphabetic(w.charAt(i)))
						check = true;
				}
				if (check)
					wordCount++;
			}
			input.close();
			// ispis
			System.out.println(url + " has " + wordCount + " words.");
		} // exception pri nevalidnom url-u
		catch (MalformedURLException ex) {
			System.err.println("Invalid URL");
		} // exceeption pri nepostojanju file-a
		catch (IOException ex) {
			System.err.println("I/O Errors: No such file");
		}

	}

}
