package zadaci_03_09_2016;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {

	private double side1 = 1.0;
	private double side2 = 1.0;

	// no-args ctor
	public Rectangle() {
		super();
	}

	// ctor with arg
	public Rectangle(double side1, double side2) {
		super("blue", false);
		this.side1 = side1;
		this.side2 = side2;

	}

	// ctor with arg
	public Rectangle(double side1, double side2, String color, boolean isFilled) {
		super(color, isFilled);
		this.side1 = side1;
		this.side2 = side2;

	}

	// return the side1
	public double getSide1() {
		return side1;
	}

	// return the side2
	public double getSide2() {
		return side2;
	}

	// returns Area of the triangle
	public double getArea() {
		return (getSide1() * getSide2());
	}

	// returns Perimeter of the triangle
	public double getPerimeter() {
		return ((2 * getSide1()) + (2 * getSide2()));
	}

	@Override
	public String toString() {
		return "Rectangle: side1 = " + getSide1() + ", side2 = " + getSide2();

	}

	// compareTo method
	public int compareTo(Rectangle o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	// returns true if areas are equals
	@Override
	public boolean equals(Object o) {
		return o instanceof Rectangle && this.compareTo((Rectangle) o) == 0;
	}
	

}
