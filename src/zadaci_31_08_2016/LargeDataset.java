package zadaci_31_08_2016;

import java.io.PrintWriter;

public class LargeDataset {
	//konstantni niz za nazive rankova
	static final String[] RANKS = { "assistant", "associate", "full" };

	public static void main(String[] args) throws Exception {
		// koristenje try-with resources kako bi se PrintWriter automatski
		// zatvorio nakon upotrebe
		try (PrintWriter print = new PrintWriter("Salary.txt")) {
			// Kreiraj hiljadu linija u file-u
			for (int i = 1; i <= 1000; i++) {
				// assistant, associate or full
				String rank = getRandomRank();
				// kreiranje plate sa 2 mjesta iza decimalne tacke
				String salary = String.format("%.2f", getRandomSalaryByRank(rank));
				// upis u file sa formatiranjem
				print.print("FirstName" + String.format("%-4d", i) + " LastName" + String.format("%-4d", i) + " ");
				print.print(" " + String.format("%-10s", rank) + " " + salary);
				if (i != 1000) {
					print.println();
				}

			}
		}

		System.out.println("Izvrseno.");

	}

	// random odabir stringa iz konstantnog niza RANKS
	private static String getRandomRank() {
		return RANKS[(int) (Math.random() * RANKS.length)];
	}

	// random odabir plate na osnovu ranka
	private static double getRandomSalaryByRank(String rank) {

		int max = 0;
		int min = 0;
		switch (rank) {
		case "assistant":
			min = 50000;
			max = 80000;
			break;
		case "associate":
			min = 60000;
			max = 110000;
			break;
		case "full":
			min = 75000;
			max = 130000;
			break;
		}
		return getRandomSalary(min, max + 1); 
	}

	// vraca random vrijednost u proslijedjenom opsegu
	private static double getRandomSalary(int min, int max) {
		int range = max - min;

		return Math.random() * range + min;
	}
}
