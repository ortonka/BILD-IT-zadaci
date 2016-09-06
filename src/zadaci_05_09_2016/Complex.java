package zadaci_05_09_2016;

public class Complex implements Cloneable {
	//privatni clanovi
	private double real;
	private double imaginary;
	//no args ctor
	public Complex() {
		this(0, 0);
	}
	//ctor with one arg
	public Complex(double x) {
		this(x, 0);
	}
	//ctor with two args
	public Complex(double x, double y) {
		this.real = x;
		this.imaginary = y;
	}
	//getter
	public double getRealPart() {
		return real;
	}
	//getter
	public double getImaginaryPart() {
		return imaginary;
	}
	//static method add
	public static Complex add(Complex n1, Complex n2) {
		Complex result = new Complex();
		result.real = (n1.real + n2.real);
		result.imaginary = (n1.imaginary + n2.imaginary);
		return result;
	}
	//returns Complex num as sum of two Complex numbers
	public Complex add(Complex n) {
		Complex result = new Complex();
		result.real = (this.real + n.real);
		result.imaginary = (this.imaginary + n.imaginary);
		return result;
	}
	//static method, returns Complex num as difference of two Complex numbers
	public static Complex subtract(Complex n1, Complex n2) {
		Complex result = new Complex();
		result.real = (n1.real - n2.real);
		result.imaginary = (n1.imaginary - n2.imaginary);
		return result;
	}
	//returns Complex num as difference of two Complex numbers
	public Complex subtract(Complex n) {
		Complex result = new Complex();
		result.real = (this.real - n.real);
		result.imaginary = (this.imaginary - n.imaginary);
		return result;
	}
	//static method, returns Complex num as product of two Complex numbers
	public static Complex multiply(Complex n1, Complex n2) {
		Complex result = new Complex();
		result.real = (n1.real * n2.real - n1.imaginary * n2.imaginary);
		result.imaginary = (n1.imaginary * n2.real + n1.real * n2.imaginary);
		return result;
	}
	//returns Complex num as product of two Complex numbers
	public Complex multiply(Complex n) {
		Complex result = new Complex();
		result.real = (this.real * n.real - this.imaginary * n.imaginary);
		result.imaginary = (this.imaginary * n.real + this.real * n.imaginary);
		return result;
	}
	//static method, returns Complex num as division of two Complex numbers
	public static Complex divide(Complex n1, Complex n2) {
		Complex result = new Complex();
		result.real = (n1.real * n2.real + n1.imaginary * n2.imaginary)
				/ (n2.real * n2.real + n2.imaginary * n2.imaginary);
		result.imaginary = (n1.imaginary * n2.real - n1.real * n2.imaginary)
				/ (n2.real * n2.real + n2.imaginary * n2.imaginary);
		return result;
	}
	//returns Complex num as division of two Complex numbers
	public Complex divide(Complex n) {
		Complex result = new Complex();
		result.real = (this.real * n.real + this.imaginary * n.imaginary)
				/ (n.real * n.real + n.imaginary * n.imaginary);
		result.imaginary = (this.imaginary * n.real - this.real * n.imaginary)
				/ (n.real * n.real + n.imaginary * n.imaginary);
		return result;
	}
	//return abs value of Complex number
	public double abs() {
		double result = 0;
		result = Math.sqrt((this.real * this.real) + (this.imaginary * this.imaginary));
		return result;
	}
	//static method, return abs value of Complex number
	public static double abs(Complex num) {
		double result = 0;
		result = Math.sqrt((num.real * num.real) + (num.imaginary * num.imaginary));
		return result;
	}
	//return Complex number as String
	public String toString() {
		if (this.imaginary == 0)
			return this.real + "";
		else
			return ("(" + this.real + " + " + this.imaginary + "i)");
	}

	public Complex clone() {
		Complex c = new Complex(this.real, this.imaginary);
		return c;
	}

}
