package zadaci_23_08_2016;

public class PrimeNumbers {

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);

			// kreiranje instance klase StackOfIntegers
			StackOfIntegers stack = new StackOfIntegers();

			// Unos broja
			System.out.print("Unesite broj: ");
			int broj = input.nextInt();

			System.out.print("\nProsti brojevi do broja " + broj + " u obrnutom redoslijedu su: \n");

			// Petlja za pronalazak prostih brojeva
			for (int i = 0; i <= broj; i++) {
				if (isPrime(i))
					stack.push(i);
			}
			// Printanje elemenata stacka od zadnjeg ka prvom
			System.out.print(stack);
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske! ");
			main(args);
		}

	}

	// vraca true ukoliko je broj prost, false ukoliko nije
	public static boolean isPrime(int num) {
		if (num == 0 || num == 1)
			return false;
		int sqr_root = (int) Math.sqrt(num);
		for (int i = 2; i <= sqr_root; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
