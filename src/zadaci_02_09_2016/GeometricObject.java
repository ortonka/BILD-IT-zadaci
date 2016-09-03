package zadaci_02_09_2016;

public abstract class GeometricObject implements Comparable<GeometricObject>, Colorable {

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

	//compareTo method
	public int compareTo(GeometricObject o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	//returns larger of two GeometricObject
	public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}
	
	public void howToColor(){
		
	}

}
