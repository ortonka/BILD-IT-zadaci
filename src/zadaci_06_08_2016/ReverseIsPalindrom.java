package zadaci_06_08_2016;

import java.util.InputMismatchException;

/*
 *  Napisati metode sa slijedecim headerima: 
 *  public static int reverse(int number) i 
 *  public static boolean isPalindrome(int number). 
 *  Prva metoda prima cijeli broj kao argument i vraca isti ispisan naopako. 
 *  (npr. reverse(456) vraca 654.) Druga metoda vraca true ukoliko je broj palindrom, 
 *  a false ukoliko nije. Koristite reverse metodu da implementirate isPalindrome metodu. 
 *  Napisite program koji pita korisnika da unese broj te mu vrati da li je broj palindrome 
 *  ili ne. 
 *  
 *  @author ortonka
 */

public class ReverseIsPalindrom {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//unos broja
		System.out.print("Unesite broj koji zelite provjeriti da li je palindrom : ");
		int num = checkInput();
		//ispis
		if (isPalindrome(num))
			System.out.printf("Broj %d je palindrom.", num);
		else
			System.out.printf("Broj %d nije palindrom.", num);

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

		int n = 0;
		boolean error = true; // varijabla za provjeru
		// unos broja redova/kolona
		do {
			try {
				n = input.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo:  ");
				input.nextLine();
			}
		} while (error);
		return n;
	}

}
