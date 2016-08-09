package zadaci_08_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati program koji ispisuje tri nasumicna cijela broja te pita korisnika da unese njihov 
 * zbir. Ukoliko korisnik pogrijesi, program ispisuje pitanje ponovo sve sa porukom da pokusa 
 * ponovo.  Ukoliko korisnik unese tacan odgovor, program mu cestita i zavrsava sa radom. 
 * 
 * @author ortonka
 */
public class SumNubers {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		// 3 random broja koja ce se koristiti u pitanjima
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		int num3 = (int) (Math.random() * 10);

		int sumaUser = 0; // korisnikov odgovor

		boolean error = true;
		// korisnikov unos sa provjerom
		do {
			try {
				System.out.printf("Koliko je %d + %d + %d ? ", num1, num2, num3);
				sumaUser = input.nextInt();
				//ukoliko je odg tacan, ispis da je tacan i zavrsi program
				//ukoliko nije tacan, ponovi pitanje
				if ((num1 + num2 + num3) == sumaUser) {
					System.out.println("Cestitamo, odgovor je tacan.");
					error = false;
				} else {
					System.out.println("Odgovor nije tacan, pokusajte ponovo.");
					error = true;
				}
			} catch (InputMismatchException e) {
				System.out.println("Nevalidan unos, pokusajte ponovo: ");
				input.nextLine();
			}
		} while (error);

		input.close();

	}

}
