package zadaci_24_08_2016;

import java.math.BigDecimal;

/*
 * Find the first ten numbers with 50 decimal digits that are divisible by 2 or 3.
 */

public class BigDecimal2or3 {

	public static void main(String[] args) {
		// kreiranje pedesetocifrenog broja
		BigDecimal bigNum = new BigDecimal("100000000000000000000000000000000000000000000");
		// brojac
		int counter = 0;
		// sve dok nije ispisano 10 brojeva
		while (counter < 10) {
			// ako je broj djeljiv ili sa 2 ili sa 3, ispisi ga, inkrementiraj
			// brojac
			if (bigNum.remainder(new BigDecimal(2)).equals(BigDecimal.ZERO)
					|| bigNum.remainder(new BigDecimal(3)).equals(BigDecimal.ZERO)) {
				counter++;
				System.out.println(String.format("%2d: ", counter) + bigNum);
			}
			// povecaj broj za jedan
			bigNum = bigNum.add(BigDecimal.ONE);
		}
	}

}
