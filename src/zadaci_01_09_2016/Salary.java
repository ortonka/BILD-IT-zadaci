package zadaci_01_09_2016;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;

public class Salary {

	// konstantni niz za nazive rankova
	static final String[] RANKS = { "assistant", "associate", "full" };

	public static void main(String[] args) {
		// odradi unutar try-catch bloka za moguce iznimke
		try {
			// uvoz url-a za dobijanje file-a
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Salary.txt");
			// kreiranje scannera za citanje iz filea
			java.util.Scanner input = new java.util.Scanner(url.openStream());
			//kreiranje niza za upis plata
			BigDecimal[] paycheck = new BigDecimal[RANKS.length];
			//niz za brojanje osoba u zavisnosti od ranga
			BigDecimal[] count = new BigDecimal[RANKS.length];
			for(int i=0; i<RANKS.length; i++){
				paycheck[i] = BigDecimal.ZERO;
				count[i] = BigDecimal.ZERO;
			}
			while (input.hasNextLine()) {
				//preskoci ime
				input.next();
				//preskoci prezime
				input.next();
				//provjeri koji je rang
				int k = checkRank(input.next());
				//povecaj platu za dati rang
				paycheck[k] = paycheck[k].add(BigDecimal.valueOf(input.nextDouble()));
				//inkrementiraj brojac za dati rang
				count[k]=count[k].add(BigDecimal.ONE);
			}
			//ispis totale sume plata za sve profesore po rangovima
			for (int i = 0; i < RANKS.length; i++) {
				System.out.println("The total salary for " + RANKS[i] + " professors is " + paycheck[i]);
			}
			BigDecimal totSalary = (paycheck[0].add(paycheck[1])).add(paycheck[2]);
			//ispis totalne plate za sve profesore na nivou fakulteta
			System.out.println(
					"The total salary for all faculty is " + (totSalary ) + " \n");
			//ispis prosjecne plata za sve profesore po rangovima
			for (int i = 0; i < RANKS.length; i++) {
				System.out.println("The average salary for " + RANKS[i] + " professors is "
						+ String.format("%.2f", paycheck[i].divide(count[i], 2, BigDecimal.ROUND_HALF_UP)));
			}
			//ispis prosjecne plate na nivou fakulteta
			System.out.println("The average salary for all faculty is "
					+ totSalary.divide((count[0].add(count[1])).add(count[2]), 2, BigDecimal.ROUND_HALF_UP ));
			input.close();
		} // exception pri nevalidnom url-u
		catch (MalformedURLException ex) {
			System.err.println("Invalid URL");
		} // exceeption pri nepostojanju file-a
		catch (IOException ex) {
			System.err.println("I/O Errors: No such file");
		}
	}
//vraca broj ranka za proslijedjeni string
	public static int checkRank(String s) {
		int k = -1;
		for (int i = 0; i < RANKS.length; i++) {
			if (s.equals(RANKS[i]))
				k = i;
		}
		return k;
	}

}
