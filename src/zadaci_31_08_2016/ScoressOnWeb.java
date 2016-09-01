package zadaci_31_08_2016;

import java.net.MalformedURLException;

public class ScoressOnWeb{

	public static void main(String[] args) throws MalformedURLException{
		//odradi unutar try-catch bloka za moguce iznimke
		try{
			//uvoz url-a za dobijanje file-a
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			//kreiranje scannera za citanje iz filea
			java.util.Scanner input = new java.util.Scanner(url.openStream());
			double sum = 0;
			int counter = 0;
			//sve dok postoji varijabla u file-u
			while (input.hasNext()){
				//dodaj varijablu na sumu
				sum += input.nextInt();
				//inkrementiraj brojac
				counter++;
			}
			//ispis
			System.out.println("Suma: " + sum + "\nProsjek: " + String.format("%.2f", (sum / counter)));
		input.close();
		} catch (Exception e){
			System.err.println("Greška! Pogresno unesena putanja.");
		}
	}

}
