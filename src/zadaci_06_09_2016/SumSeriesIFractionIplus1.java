package zadaci_06_09_2016;

import zadaci_05_09_2016.Rational;

public class SumSeriesIFractionIplus1 {

	public static void main(String[] args) {

		// create array for output
		Rational[] series = new Rational[10];
		for (int i = 1; i <= series.length; i++) {
			series[i - 1] = new Rational(i, (i + 1));
		}
		// method call and print
		for (int i = 1; i < 11; i++) {
			SumSeries1iFraction.printElementsInArray(i, series);
			System.out.println(" = " + String.format("%.3f", sumIFractionIplus1(i)));
		}
	}

	// returns sum of series 1/2 + 2/3 + ... + i/(i+1) as DOuble value
	public static double sumIFractionIplus1(int i) {
		if (i == 1)
			return 1.0 / 2;
		else
			return (i / (i + 1.0)) + (sumIFractionIplus1(i - 1));
	}

}
