package zadaci_06_09_2016;

import zadaci_05_09_2016.Rational;

public class SumSeriesIFraction2iplus1 {

	public static void main(String[] args) {

		// create array for output
		Rational[] series = new Rational[10];
		for (int i = 1; i <= series.length; i++) {
			series[i - 1] = new Rational(i, (2 * i + 1));
		}
		// method call and print
		for (int i = 1; i < 11; i++) {
			SumSeries1iFraction.printElementsInArray(i, series);
			System.out.println(" = " + String.format("%.3f", sumIFraction2iplus1D(i)));
		}
	}

	// returns sum of series 1/3 + 2/5 + ... + i/(2i+1) as DOuble value
	public static double sumIFraction2iplus1D(int i) {
		if (i == 1)
			return 1.0 / 3;
		else
			return (i / (2 * i + 1.0)) + (sumIFraction2iplus1D(i - 1));
	}
}
