package zadaci_24_08_2016;

import java.math.BigInteger;

public class PrimeBigNum {
	
	public static void main(String[] args) {

		BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
		int count = 0;
		// sve dok ne pronadjes 5 brojeva
		while (count < 5) {
			// ukoliko je broj prost, ispisi ga i inkrementiraj brojac
			if (returnPrime(bigNum)) {
				System.out.println(bigNum);
				// povecaj brojac za jedan
				count++;
			}

			// broj postavi kao naredni moguci prime broj
			bigNum = bigNum.nextProbablePrime();

		}
	}

	// vraca true ukoliko je broj prost, false ukoliko nije
	public static boolean returnPrime(BigInteger number) {
		if (BigInteger.ZERO.equals(number) || BigInteger.ONE.equals(number))
			return false;
		BigInteger two = new BigInteger("2");
		// ako broj nije 2, a djeljiv je sa 2, vrati false
		if (!two.equals(number) && BigInteger.ZERO.equals(number.mod(two)))
			return false;
		// kreni od 3 i provjeri da li postoji i jedan faktor do korijena broja,
		// povecavaj za 2 da se ne uzimaju u obzir parni faktori
		for (BigInteger i = new BigInteger("3"); i.multiply(i).compareTo(number) < 1; i = i.add(two)) {
			if (BigInteger.ZERO.equals(number.mod(i)))
				return false;
		}
		return true;
	}

	

}
