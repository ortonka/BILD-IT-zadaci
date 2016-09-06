package zadaci_05_09_2016;

import java.math.BigInteger;

public class RationalBigInt extends Number implements Comparable<RationalBigInt> {

	// Data fields for numerator and denominator
	private BigInteger numerator = BigInteger.ZERO;
	private BigInteger denominator = BigInteger.ONE;

	/** Construct a rational with default properties */
	public RationalBigInt() {
		this(BigInteger.ZERO, BigInteger.ONE);
	}

	/** Construct a rational with specified numerator and denominator */
	public RationalBigInt(BigInteger numerator, BigInteger denominator) {
		BigInteger gcd = gcd(numerator, denominator);
		this.numerator = ((denominator.compareTo(BigInteger.ZERO) == 1) ? BigInteger.ONE : (BigInteger.ONE).negate())
				.multiply(numerator).divide(gcd);
		this.denominator = (denominator.abs()).divide(gcd);
	}

	/** Find GCD of two numbers */
	private static BigInteger gcd(BigInteger n, BigInteger d) {
		return n.gcd(d);
	}

	/** Return numerator */
	public BigInteger getNumerator() {
		return numerator;
	}

	/** Return denominator */
	public BigInteger getDenominator() {
		return denominator;
	}

	/** Add a rational number to this rational */
	public RationalBigInt add(RationalBigInt secondRational) {
		BigInteger n = (numerator.multiply(secondRational.getDenominator()))
				.add(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBigInt(n, d);
	}

	/** Subtract a rational number from this rational */
	public RationalBigInt subtract(RationalBigInt secondRational) {
		BigInteger n = (numerator.multiply(secondRational.getDenominator()))
				.subtract(denominator.multiply(secondRational.getNumerator()));
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBigInt(n, d);
	}

	/** Multiply a rational number by this rational */
	public RationalBigInt multiply(RationalBigInt secondRational) {
		BigInteger n = numerator.multiply(secondRational.getNumerator());
		BigInteger d = denominator.multiply(secondRational.getDenominator());
		return new RationalBigInt(n, d);
	}

	/** Divide a rational number by this rational */
	public RationalBigInt divide(RationalBigInt secondRational) {
		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());
		return new RationalBigInt(n, d);
	}

	@Override
	public String toString() {
		if (denominator == BigInteger.ONE)
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override // Override the equals method in the Object class
	public boolean equals(Object other) {
		if ((this.subtract((RationalBigInt) (other))).getNumerator() == BigInteger.ZERO)
			return true;
		else
			return false;
	}

	@Override // Implement the abstract intValue method in Number
	public int intValue() {
		return (int) doubleValue();
	}

	@Override // Implement the abstract floatValue method in Number
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override // Implement the doubleValue method in Number
	public double doubleValue() {
		double x = this.getNumerator().doubleValue();
		double y = this.getDenominator().doubleValue();
		return x / y;
	}

	@Override // Implement the abstract longValue method in Number
	public long longValue() {
		return (long) doubleValue();
	}

	public int compareTo(RationalBigInt o) {
		if ((this.subtract(o).getNumerator()).compareTo(BigInteger.ZERO) == 1)
			return 1;
		else if ((this.subtract(o).getNumerator()).compareTo(BigInteger.ZERO) == -1)
			return -1;
		else
			return 0;
	}
}
