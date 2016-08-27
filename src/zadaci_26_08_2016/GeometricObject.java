package zadaci_26_08_2016;

public abstract class GeometricObject {

	private String color = "white";
	private boolean filled;

	// no-args ctor
	protected GeometricObject() {

	}

	// ctor with args
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// getter for color
	public String getColor() {
		return color;
	}

	// setter for color
	public void setColor(String color) {
		this.color = color;
	}

	// getter for isFilled
	public boolean isFilled() {
		return filled;
	}

	// setter for isFilled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// this methods have to be implemented in inherited classes
	public abstract double getArea();

	public abstract double getPerimeter();

}