package zadaci_23_08_2016;

public class TestMyInteger {

	public static void main(String[] args) {
		// kreiranje varijable tipa int
		int num = 263;
		// kreiranje instanci klase MyInteger
		MyInteger num2 = new MyInteger(num);
		MyInteger num3 = new MyInteger(342);

		// staticki metodi klase MyInteger koji rade sa int
		System.out.println("Poziv statickih metoda za varijable tipa int:");
		System.out.println("Broj " + num + (MyInteger.isEven(num) ? " jest" : " nije") + " paran.");
		System.out.println("Broj " + num + (MyInteger.isOdd(num) ? " jest" : " nije") + " neparan.");
		System.out.println("Broj " + num + (MyInteger.isPrime(num) ? " jest" : " nije") + " prost.");
		// staticki metodi klase MyInteger koji rade sa MyInteger
		System.out.println("\nPoziv statickih metoda za varijable tipa MyInteger:");
		System.out.println("Broj " + num3 + (MyInteger.isEven(num3) ? " jest" : " nije") + " paran.");
		System.out.println("Broj " + num3 + (MyInteger.isOdd(num3) ? " jest" : " nije") + " neparan.");
		System.out.println("Broj " + num3 + (MyInteger.isPrime(num3) ? " jest" : " nije") + " prost.");
		// Nestaticki metodi nad objektima
		System.out.println("\nPoziv nestatickih metoda za varijable tipa MyInteger:");
		System.out.println("Broj " + num2 + (num2.isEven() ? " jest" : " nije") + " paran.");
		System.out.println("Broj " + num2 + (num2.isOdd() ? " jest" : " nije") + " neparan.");
		System.out.println("Broj " + num2 + (num2.isPrime() ? " jest" : " nije") + " prost.");
		// poziv public boolean equals(int number) metoda
		System.out.println("\nProvjera da li je broj " + num2 + " tipa MyInteger jednak broju " + num + " tipa int: "
				+ num2.equals(num));
		// poziv public boolean equals(MyInteger number) metoda
		System.out.println("\nProvjera da li je broj " + num2 + " tipa MyInteger jednak broju " + num3
				+ " tipa MyInteger: " + num2.equals(num3));
		// poziv public static int parseInt(char[] array) metoda
		System.out.print("\nNiz sa karakterima: ");
		char[] niz = { '3', '5', '7' };
		for (char e : niz) {
			System.out.print(e + " ");
		}
		System.out.println("predstavljen kao broj: " + MyInteger.parseInt(niz));

		// poziv public static int parseInt(String s) metoda
		String s = "1234";
		System.out.println("\nString " + s + " predstavljen kao broj: " + MyInteger.parseInt(s));

	}

}
