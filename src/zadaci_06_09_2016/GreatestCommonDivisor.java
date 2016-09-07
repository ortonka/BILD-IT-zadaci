package zadaci_06_09_2016;

public class GreatestCommonDivisor {
	// returns greatest common divisor for two integers
	public static int gcd(int m, int n) {

		if (m % n == 0)
			return n;
		else
			return gcd(n, m % n);
	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			System.out.print("Unesite prvu vrijednost: ");
			int m = Math.abs(input.nextInt());
			System.out.print("Unesite drugu vrijednost: ");
			int n = Math.abs(input.nextInt());
			System.out.println("Najveci zajednicki djelilac brojeva '" + m + "' i '" + n + "' je '" + gcd(m, n) +"'.");

		} catch (Exception e) {
			System.err.println("Dogodila se greska, pokusajte ponovo.");
		}
	}

}
