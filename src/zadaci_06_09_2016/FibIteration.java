package zadaci_06_09_2016;

public class FibIteration {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		int n = -1;
		int temp = 0;
		// provjera unosa sa ulaza, unesena vrijednost mora biti nenegativni
		// cijeli broj
		while (n == -1) {
			System.out.print("Unesite index (index mora biti nenegativni cijeli broj): ");
			if (input.hasNextInt()) {
				temp = input.nextInt();
				n = (temp < 0) ? n : temp;
			} else {
				input.next();
			}
		}
		// ispis
		System.out.println("Vrijednost Fibbonacievog niza na indexu '" + n + "' je " + fib(n) + ".");
		input.close();
	}

	// returns fibbonaci value for index n
	public static int fib(int n) {
		if (n <= 1)
			return n;
		int grandparent = 0;
		int parent = 1;
		int me = 0;
		for (int i = 1; i < n; i++) {
			me = parent + grandparent;
			grandparent = parent;
			parent = me;
		}
		return me;
	}

}
