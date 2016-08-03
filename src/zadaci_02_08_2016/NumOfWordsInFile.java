package zadaci_02_08_2016;

/* Napisite program koji ce brojati broj karaktera, rijeci i linija teksta u nekom fileu.
 * Rijeci trebaju biti odvojene jednim spaceom. Ime file proslijediti kao argument u vas program.
 * 
 * @author ortonka
 */

import java.io.IOException;
import java.util.Scanner;

public class NumOfWordsInFile {

	public static void main(String[] args) throws IOException {

		java.io.File file = new java.io.File("src/zadaci_02_08_2016/test.txt");
		file.createNewFile();
		Scanner in = new Scanner(file); // kreiranje skenera
		int lines = 0; // broj linija
		int words = 0; // broj rijeci
		int chars = 0; // broj karaktera
		
		//sve dok postoji naredna linija teksta
		while (in.hasNextLine()) {
			int wordsT = words;
			lines++; 
			Scanner lineScanner = new Scanner(in.nextLine());
			//sve dok postoji naredni string u liniji
			while (lineScanner.hasNext()) {
				words++;
				chars += lineScanner.next().length(); 
			}
			
			/*ako postoji nova linija, a broj rijeci se nije promijenio, ne
			 * uzimaj tu liniju u obzir 
			 */
			if (wordsT == words)
				lines--;
			lineScanner.close();
		}
		//ispis
		System.out.println("Number of words: " + words);
		System.out.println("Number of chars: " + chars);
		System.out.println("Number of lines: " + lines);
		
		in.close(); 

	}

}
