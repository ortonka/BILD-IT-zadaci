package zadaci_26_08_2016;

public class Triangle extends GeometricObject {
	
	private double side1=1.0;
	private double side2=1.0; 
	private double side3=1.0;
	//no-args ctor
	public Triangle(){
		super();
	}

	// ctor with arg
	public Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
		super(color, isFilled);
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// return the side1
	public double getSide1() {
		return side1;
	}

	// return the side2
	public double getSide2() {
		return side2;
	}

	// return the side3
	public double getSide3() {
		return side3;
	}

	// returns Area of the triangle
	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt((s * (s - getSide1()) * (s - getSide2()) * (s - getSide3())));
	}

	// returns Perimeter of the triangle
	public double getPerimeter() {
		return (getSide1() + getSide2() + getSide3());
	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + getSide1() + ", side2 = " + getSide2() + ", side3 = " + getSide3();

	}

}
