package zadaci_23_08_2016;

public class PrimeFactors {

	public static void main(String[] args) {
		try {
			java.util.Scanner input = new java.util.Scanner(System.in);
			int min = 0;
			// kreiranje instance klase StackOfIntegers
			StackOfIntegers stack = new StackOfIntegers();

			// Unos broja
			System.out.print("Unesite broj: ");
			int broj = input.nextInt();

			System.out.print("\nFaktori broja " + broj + " u obrnutom redoslijedu su: ");
			
			// Petlja za pronalazak faktora broja
			for (int i = 2; i <= broj; i++) {
				while (broj % i == 0) {
					min = i;
					stack.push(min);
					broj /= i;
				}
			}
			// Printanje elemenata stacka od zadnjeg ka prvom
			System.out.print(stack);
			input.close();
		} catch (Exception e) {
			System.out.println("Doslo je do greske! ");
			main(args);
		}
	}
}
