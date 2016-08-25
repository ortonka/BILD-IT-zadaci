package zadaci_24_08_2016;

import java.math.BigInteger;

public class MersennePrime {

	public static void main(String[] args) {
		//ispis zaglavlja
		System.out.println("p     2^p-1\n");
		//pronalazak svih Mersenne-ovih prime brojeva sa p do 100
		for(int p=0; p<=100; p++){
			//pronadji broj sa datim p
			BigInteger broj = getMersennePrime(p);
			//provjeri je li prost
			if (PrimeBigNum.returnPrime(broj)) {
				System.out.println(p + "	" + broj);
			}
		}
	}
	
	public static BigInteger getMersennePrime(int p) {
		return new BigInteger(2+"").pow(p).subtract(BigInteger.ONE);
	}

}
