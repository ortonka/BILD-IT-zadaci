package zadaci_03_09_2016;

public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
	private double side = 1.0;

	// no-args ctor
	public Octagon() {
		super();
	}

	// ctor with arg
	public Octagon(double side) {
		super("blue", false);
		this.side = side;
	}

	// ctor with arg
	public Octagon(double side, String color, boolean isFilled) {
		super(color, isFilled);
		this.side = side;
	}

	// return the side
	public double getSide() {
		return side;
	}

	// returns Area of the octagon
	public double getArea() {

		return 2 * (Math.sqrt(2) + 1) * (side * side);
	}

	@Override
	public double getPerimeter() {

		return 8 * getSide();
	}

	@Override
	public String toString() {
		return "Octagon: side = " + getSide();

	}

	// returns true if radius are equals
	@Override
	public boolean equals(Object o) {
		return o instanceof Octagon && this.compareTo((Octagon) o) == 0;
	}

	// compareTo method
	public int compareTo(Octagon o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	// returns clone of Object
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			System.err.println("Nije izvrseno kloniranje!");
			return null;
		}
	}

}
