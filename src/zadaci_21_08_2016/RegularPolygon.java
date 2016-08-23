package zadaci_21_08_2016;
/*
 * In an n-sided regular polygon, all sides have the same length and all angles have the same 
 * degree (i.e., the polygon is both equilateral and equiangular). 
 * Design a class named RegularPolygon.
 */

public class RegularPolygon {

	private int n=3; 			// broj stranica poligona
	private double side = 1; 	// duzina stranice
	private double x=0; 		// x koordinata
	private double y=0;			// y koordinata

	// no-arg ctor
	public RegularPolygon() {

	}

	// ctor sa brojem stranica i duzinom
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
	}

	// ctor sa svim parametrima
	public RegularPolygon(int n, double side, double x, double y) {
		this(n, side);
		this.x = x;
		this.y = y;
	}

	
	//getter za n
	public int getN() {
		return n;
	}
	//setter za n, ako je manji od nule, pomnozi sa -1 
	public void setN(int n) {
		if (n < 0) {
			n *= -1;
		}
		this.n = n;
	}
	//getter za duzinu stranice side
	public double getSide() {
		return side;
	}
	//setter za duzinu stranice side
	public void setSide(double side) {
		this.side = side;
	}
	//getter za koordinatu x
	public double getX() {
		return x;
	}
	//setter za koordinatu x
	public void setX(double x) {
		this.x = x;
	}
	//getter za koordinatu y
	public double getY() {
		return y;
	}
	//setter za koordinatu y
	public void setY(double y) {
		this.y = y;
	}

	// metoda koja vraca obim
	public double getPerimeter() {
		return n * side;
	}

	// metoda koja vraca povrsinu
	public double getArea() {
		return (n * Math.pow(side, 2)) / 4 * Math.tan(Math.PI / n);
	}

	// Metoda koja vraca info o polygon
	@Override
	public String toString() {
		return "\nObim: " + getPerimeter() +"\nPovršina: " +  String.format("%.3f",getArea()) ;
	}
}