package zadaci_13_08_2016;

import java.util.InputMismatchException;

/*
 * Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva razlicita pakovanja. 
 * Želimo napisati program koji uporedjuje cijene ta dva pakovanja. Program pita korisnika da 
 * unese težinu i cijenu oba pakovanja te ispisuje koje pakovanje ima bolju cijenu.
 * 
 * @author ortonka
 */

public class ComparePrices {
	
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//unos cijena i tezina za oba proizvoda
		System.out.print("Unesite cijenu prvog proizvoda: ");
		double price1=checkInput();
		System.out.print("Unesite tezinu prvog proizvoda: ");
		double weight1=checkInput();
		System.out.print("Unesite cijenu drugog proizvoda: ");
		double price2=checkInput();
		System.out.print("Unesite tezinu drugog proizvoda: ");
		double weight2=checkInput();
		
		//provjera odnosa cijene i tezine
		if(price1/weight1>price2/weight2)
			System.out.println("Drugi proizvod ima bolju cijenu.");
		else if(price1/weight1==price2/weight2)
			System.out.println("Svejedno je, oba proizvoda imaju isti odnos cijene i tezine.");
		else
			System.out.println("Prvi proizvod ima bolju cijenu.");
	}
	// provjera unosa
		public static double checkInput() {
			double num = 0;
			boolean error = true;

			do {
				try {
					num = input.nextDouble();
					if(num<0)
						throw new InputMismatchException();
					error = false;

				} catch (InputMismatchException e) {
					System.out.print("Pogresan unos, pokusajte ponovo: ");
					input.nextLine();
				}
				// petlja se izvrsava dok postoji greska
			} while (error);

			return num;
		}
}
