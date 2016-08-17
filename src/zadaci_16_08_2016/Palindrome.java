package zadaci_16_08_2016;

import java.util.InputMismatchException;

/*
 *  Napisati program koji pita korisnika da unese cijeli trocifreni broj te provjerava da li je 
 *  unijeti broj palindrom. Broj je palindrom ukoliko se cita isto i sa lijeva na desno i sa 
 *  desna na lijevo npr. 121, 131, itd.
 *  
 *  @author ortonka
 */

public class Palindrome {
	
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		int n=checkInput();
		if(isPalindrome(n))
			System.out.printf("Broj %d je palindrom.", n);
		else
			System.out.printf("Broj %d nije palindrom.", n);

	}
	
	//vraca broj naopako
		public static int reverse(int number) {
			int reverse = 0;
			while (number != 0) {
				reverse = reverse * 10;
				reverse = reverse + number % 10;
				number = number / 10;
			}
			return reverse;

		}
	//provjera da li je broj palindrom
		public static boolean isPalindrome(int number) {
			
			if(number<0)	//negativni brojevi nisu palindromi
				return false;

			if (reverse(number) == number)
				return true;

			return false;

		}
	
	// provjera unosa
	public static int checkInput() {
		int num = 0;
		boolean error = true;

		do {
			try {
				System.out.print("Unesite broj: ");
				num = input.nextInt();
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo. ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}

}
