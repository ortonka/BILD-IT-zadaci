package zadaci_02_08_2016;

public class LeapYear {

	public static void main(String[] args) {
		//brojac za provjeru je li ispisano 10 godina u liniji
		int brojac = 0;
		//brojac prijestupnih godina
		int brojac2 = 0;
		
		int godina1 = 101;
		int godina2 = 2100;
		//petlja sa uslovima koja provjerava i ispisuje da li je godina prijestupna
		for (int godina = godina1; godina < godina2; godina++) {
			if (((godina % 4 == 0) && (godina % 100 != 0)) || (godina % 400 == 0)) {

				System.out.print(godina + " ");
				brojac++;
				brojac2++;
				//ukoliko je ispisano vec 10 godina u liniji, resetujemo brojac
				if (brojac == 10) {
					System.out.println();
					brojac = 0;
				}

			}

		}
		//ispis ukupnog broja prijestupnih godina
		System.out.println("\nBroj prijestupnih godina u intervalu od 101. godine do 2100. je " + brojac2);
	}

}
