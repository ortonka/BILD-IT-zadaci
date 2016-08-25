package zadaci_24_08_2016;

import java.math.BigInteger;

/*
 * Find the first ten square numbers that are greater than 
 * Long.MAX_VALUE. A square number is a number in the form of n2. For example, 
 * 4, 9, and 16 are square numbers. Find an efficient approach to run your 
 * program fast.
 */

public class SquareBigNum {

	public static void main(String[] args) {
		//korijen Long.MAX_VALUE
		long sqrt = (long) Math.sqrt(Long.MAX_VALUE);
		//spremimo taj broj kao BigInteger
		BigInteger bigNum = new BigInteger(sqrt + "");
		//povecamo za jedan jer cemo traziti kvadrate koji su veci od  Long.MAX_VALUE
		bigNum = bigNum.add(BigInteger.ONE);
		//brojac
		int count = 0;
		System.out.println("Kvadrati brojeva veci od broja " + Long.MAX_VALUE + " su:");
		//sve dok nije ispisano 10 brojeva
		while (count < 10) {
			//ispisi kvadrat broja
			System.out.println(String.format("%2d: ", count + 1) + bigNum.multiply(bigNum));
			//povecaj ga za jedan
			bigNum = bigNum.add(BigInteger.ONE);
			//povecaj brojac za jedan
			count++;
		}

	}

}
