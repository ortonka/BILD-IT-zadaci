package zadaci_21_08_2016;

public class QuadraticEquation {
	
	// parametri a, b i c jednacine ax^2+bx+c
	private double a, b, c;

	// konstruktor sa parametrima
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	//getteri za parametre a, b i c jednacine ax^2+bx+c
	
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	// metoda za racunanje diskriminante
	public double getDiscriminant() {
		return Math.pow(b, 2) - (4 * a * c);
	}

	// metoda vraca korijen kvadratne jednacine
	public double getRoot1() {
		if(getDiscriminant()<0)
			return 0;
		else
		return ((-b) + Math.sqrt(getDiscriminant())) / (2 * a);
	}

	// metoda vraca korijen kvadratne jednacine
	public double getRoot2() {
		if(getDiscriminant()<0)
			return 0;
		else
		return ((-b) - Math.sqrt(getDiscriminant())) / (2 * a);
	}
	
	// informacije
	@Override
	public String toString() {
		// ako je diskriminanta pozitivna, prikazuju se oba korijena
		if (getDiscriminant() > 0) {
			return "Prvi korijen: " + String.format("%.3f",getRoot1()) + 
					"\nDrugi korijen: " + String.format("%.3f",getRoot2()) + "\n";
			// ako je diskriminanta nula
		} else if (getDiscriminant() == 0) {
			return "Jednacina ima samo 1 korijen: " + String.format("%.3f",getRoot1()) + "\n";
			// ako je diskriminanta negativna
		} else {
			return "Jednacina nema realnih korijena.\n";
		}
	}

}
