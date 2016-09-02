package zadaci_01_09_2016;

public class Occurence {

	public static void main(String[] args) {
		
		String s = "";
		int[] letterCount = new int[26];
		try {
			// uvoz url-a za dobijanje file-a
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			// kreiranje scannera za citanje iz filea
			java.util.Scanner input = new java.util.Scanner(url.openStream());
			//sve dok postoji iduci string
			while (input.hasNext()) {
				s = input.nextLine();
				for (char ch : s.toCharArray()) {
					//prebaci karakter u veliko slovo
					ch = Character.toUpperCase(ch);
					//provjeri da li je slovo
					if (Character.isLetter(ch)) {
						letterCount[ch - 'A']++;
					}
				}

			}
			input.close();
		} 
		catch (java.net.MalformedURLException ex) {
			System.err.println("Invalid URL");
		} // exceeption pri nepostojanju file-a
		catch (java.io.IOException ex) {
			System.err.println("I/O Errors: No such file");
		}

		for (int i = 0; i < letterCount.length; i++) {
			System.out.println((char) (i + 'A') + " occurrence = " + letterCount[i]);
		}

	}


}
