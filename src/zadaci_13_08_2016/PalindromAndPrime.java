package zadaci_13_08_2016;

/*
 * Palindrome prime je prosti broj koji je takodjer i palindrom. Na primjer, 131 je palindrome 
 * prime, kao i brojevi 313 i 757. Napisati program koji ispisuje prvih 100 palindrome prime 
 * brojeva, 10 brojeva po liniji. 
 * 
 * @author ortonka
 */

public class PalindromAndPrime {
	
	public static final int NUM_PER_LINE=10;
	public static final int TOTAL=100;

	public static void main(String[] args) {
		//brojac koji ce ici do 100
		int count = 0;
		//prolazi kroz brojeve
		int i = 2;
		//sve dok je brojac manji od trazenog broja brojeva
		while (count < TOTAL) {
			//ako je broj palindrom i prost
			if (isPalindrome(i) && isPrime(i)) {
				//ispisi ga
				System.out.printf("%5d ", i);
				//inkrementiraj brojac
				count++;
				//ako je ispisano 10 brojeva, predji u novi red
				if (count % NUM_PER_LINE == 0) {
					System.out.println();
				}
			}
			//provjeri naredni broj
			i++;
		}

	}

	// vraca broj naopako
	public static int reverse(int number) {
		int reverse = 0;
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		return reverse;

	}

	// provjera da li je broj palindrom
	public static boolean isPalindrome(int number) {

		if (number < 0) // negativni brojevi nisu palindromi
			return false;

		if (reverse(number) == number)
			return true;

		return false;

	}

	// metoda za provjeru prostog broja
	public static boolean isPrime(int num) {
		int sqr_root = (int) Math.sqrt(num);
		for (int i = 2; i <= sqr_root; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
