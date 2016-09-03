package zadaci_02_09_2016;

public class Circle extends GeometricObject implements Colorable {

	private double r = 1.0;

	// no-args ctor
	public Circle() {
		super();
	}
	
	// ctor with arg
		public Circle(double r) {
			super("blue", false);
			this.r = r;
		}

	// ctor with arg
	public Circle(double r, String color, boolean isFilled) {
		super(color, isFilled);
		this.r = r;
	}

	// return the r
	public double getR() {
		return r;
	}

	// returns Area of the triangle
	public double getArea() {

		return Math.PI * (r * r);
	}

	// returns Perimeter of the triangle
	public double getPerimeter() {
		return (2 * r * Math.PI);
	}

	@Override
	public String toString() {
		return "Circle: r = " + getR();

	}

	public void howToColor() {
		System.out.println("Fill circle with color.");
	}

}
