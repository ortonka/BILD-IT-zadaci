package zadaci_23_08_2016;

public class MyPoint {

	private double x;
	private double y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	// return the x
	public double getX() {
		return x;
	}

	// return the y
	public double getY() {
		return y;
	}

	// returns the distance from this point to a specified point of the MyPoint
	// type.
	public double distance(MyPoint a) {
		double distance = Math.sqrt(((getX() - a.x) * (getX() - a.x)) + ((getY() - a.y) * (getY() - a.y)));
		return distance;
	}

	// returns the distance from this point to another point with specified x-
	// and y-coordinates
	public double distance(double x, double y) {
		double distance = Math.sqrt(((getX() - x) * (getX() - x)) + ((getY() - y) * (getY() - y)));
		return distance;
	}

}
