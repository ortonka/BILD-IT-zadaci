package zadaci_21_08_2016;

public class LinuarEquation {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	// Objekat sa definisanim elementima
	public LinuarEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;

	}

	// getteri za sve parametre

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	// metod vraca da li je problem rjesiv

	public boolean isSolvable() {
		return ((a * d - b * c) != 0) ? true : false;
	}

	// metod vraca rjesenje za x
	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	// metod vraca rjesenje za y
	public double getY() {
		return (a * f - e * c) / (a * d - b * c);
	}

	// toString metod
	@Override
	public String toString() {
		// ako se jednacina rjesiva, ispisi x i y
		if (isSolvable()) {
			return "\nx = " + getX() + "\ny = " + getY();
		} else {
			// ako nije, ispisi da nije rjesiva
			return "\nJednacina nije rjesiva!";
		}
	}

}
