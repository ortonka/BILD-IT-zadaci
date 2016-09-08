package zadaci_07_09_2016;

import java.util.InputMismatchException;

public class SumDigits {
	// method returns sum of digits of number n
	public static int sumDigits(long n) {
		if (n == 0)
			return 0;
		else
			return (int) ((n % 10) + sumDigits(n / 10));
	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// user input
			System.out.print("Unesite broj: ");
			long n = input.nextLong();
			// output and method call
			System.out.println("Suma cifara broja " + n + " iznosi: " + sumDigits(n));
		}
		// if exception was thrown, print error message
		catch (InputMismatchException e) {
			System.err.println("Nevalidan unos. Restartujte program!");
		}
	}

}
