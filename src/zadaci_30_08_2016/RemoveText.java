package zadaci_30_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RemoveText {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		java.io.File file = new File("File.txt");
		System.out.println("Unesite vas text: ");
		//Unos teksta u file
		String tekst = input.nextLine();
		java.io.PrintWriter printInFile = new java.io.PrintWriter(file);
		try {
			printInFile.println(tekst);
		} catch (Exception e) {
			System.err.println("Pisanje u file neuspjesno.");
		} finally {
			printInFile.close();
		}
		//unos stringa koji ce biti uklonjen
		System.out.println("Unesite rijec koju zelite ukloniti :");
		String rijec = input.next();
		removeText("File.txt", rijec);

		input.close();
	}

	// metod uklanja proslijedjeni string iz filea
	public static void removeText(String getFile, String remove) {
		java.io.File file = new File(getFile);
		try {
			String procitano = null;
			String s = null;
			// citanje iz file-a
			Scanner read = new Scanner(file);
			while (read.hasNext()) {
				procitano = read.nextLine();
			}
			// Ako linija sadrzi proslijedjeni string, zamijeni ga sa ""
			s = procitano.replace(remove, "");
			System.out.println(s);
			read.close();
			// upisivanje u file
			java.io.PrintWriter pisanje = new java.io.PrintWriter(file);
			pisanje.print(s);
			pisanje.close();
		} catch (FileNotFoundException e) {
			System.out.println("Trazeni file ne postoji.");
		}

	}

}
