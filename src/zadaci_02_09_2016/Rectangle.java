package zadaci_02_09_2016;

public class Rectangle extends GeometricObject implements Colorable {

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

	public void howToColor() {
		System.out.println("Color 2 same sides with one color, and other two sides with other color.");
		
	}

}
