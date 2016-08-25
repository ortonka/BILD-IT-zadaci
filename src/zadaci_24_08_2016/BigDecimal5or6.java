package zadaci_24_08_2016;

import java.math.BigInteger;

/*
 *  Find the first ten numbers greater than Long.MAX_VALUE that are divisible by 5 or 6.
 */

public class BigDecimal5or6 {

	public static void main(String[] args) {
		// broj
		BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
		// brojac
		int counter = 0;
		// sve dok nije ispisano 10 brojeva
		while (counter < 10) {
			// ako je broj djeljiv ili sa 5 ili sa 6, ispisi ga, inkrementiraj
			// brojac
			if ((bigNum.remainder(new BigInteger(2 + "")).equals(BigInteger.ZERO)
					&& bigNum.remainder(new BigInteger(3 + "")).equals(BigInteger.ZERO))
					|| bigNum.remainder(new BigInteger(5 + "")).equals(BigInteger.ZERO)) {
				counter++;
				System.out.println(String.format("%2d: ", counter) + bigNum);
			}
			// povecaj broj za jedan
			bigNum = bigNum.add(BigInteger.ONE);
		}
	}

}
