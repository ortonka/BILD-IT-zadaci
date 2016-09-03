package zadaci_02_09_2016;

class Square extends GeometricObject implements Colorable {

	private double side;

	// no-arg ctor
	Square() {
		this(1);
	}

	// ctor with args
	Square(double side) {
		this.side = side;
	}

	// get area
	@Override
	public double getArea() {
		return side * side;
	}

	// get perimeter
	@Override
	public double getPerimeter() {
		return side * 4;
	}

	public void howToColor() {
		System.out.println("Color all four sides.");
	}

	// getter
	public double getSide() {
		return side;
	}

	// setter
	public void setSide(double side) {
		this.side = side;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	
}