package zadaci_06_09_2016;

import zadaci_05_09_2016.Rational;

public class SumSeries1iFraction {

	/**
	 * Testni program je bio m(i) for i = 1, 2, . . ., 10 Da se trazila
	 * vrijednost veca od i = 10, ne bih koristila Rational, obzirom da je jako
	 * sporo, ali ovdje je podnosljiva duzina cekanja ispisa ( 5-10 s)
	 */
	public static void main(String[] args) {
		// create array for output
		Rational[] series = new Rational[10];
		for (int i = 0; i < series.length; i++) {
			series[i] = new Rational(1, i + 1);
		}
		// method call and print
		for (int i = 1; i < 11; i++) {
			printElementsInArray(i, series);
			System.out.println(" = " + sum1FractionI(i));
		}
	}

	// returns sum of series 1 + 1/2 + ... + 1/i
	public static Rational sum1FractionI(int i) {
		if (i == 1)
			return new Rational(1);
		else
			return (new Rational(1, i).add(sum1FractionI(i - 1)));
	}

	// print n (n < array.length) elements in array
	public static void printElementsInArray(int n, Rational[] array) {
		if (n < 0 || n > array.length)
			return;
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
			if (i != n - 1)
				System.out.print("+ ");
		}
	}

}
