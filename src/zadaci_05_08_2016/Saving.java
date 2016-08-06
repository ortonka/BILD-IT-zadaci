package zadaci_05_08_2016;

import java.util.Scanner;

/*
 *  Pretpostavimo da uplatimo $100 svaki mjesec na stedni racun koji ima godisnju interesnu stopu
 *  od 5%. Mjesecna interesna stopa je stoga 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost
 *  na racunu postaje 100 * (1 + 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na racunu 
 *  postaje (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon treceg mjeseca, vrijednost na racunu 
 *  postaje (100 + 201.252) * (1 + 0.00417) = 302.507 i tako dalje. Napisati program koji pita
 *  korisnika da unese mjesecni iznos stednje te broj mjeseci nakon kojeg bi zelio znati stanje
 *  racuna.
 *  
 *  @author ortonka
 */

public class Saving {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double amount = 0;
		// provjera unosa
		do {
			System.out.print("Unesite mjesecni iznos uplate: ");
			while (!input.hasNextDouble()) { // sve dok unos nije double
				System.out.print("Nevalidan unos! Pokusajte ponovo: ");
				input.next();
			}
			amount = input.nextDouble();
		} while (amount < 0);

		int numOfMonth = 0;
		// provjera unosa
		do {
			System.out.print("Unesite broj mjeseci nakon kojeg zelite vidjeti iznos stednje: ");
			while (!input.hasNextInt()) { // sve dok unos nije int
				System.out.print("Nevalidan unos! Pokusajte ponovo: ");
				input.next();
			}
			numOfMonth = input.nextInt();
		} while (numOfMonth <= 0);
		// ispis
		System.out.printf("Iznos na vasem stednom racunu je %.3f.\n", saving(amount, numOfMonth));

		input.close();
	}

	// metoda za racunanje stednje
	public static double saving(double amount, int numOfMoths) {
		double sum = 0;	//iznos na racunu
		for (int i = 0; i < numOfMoths; i++) {
			sum = (sum + amount) * (1 + 0.00417);
		}
		return sum;
	}

}
