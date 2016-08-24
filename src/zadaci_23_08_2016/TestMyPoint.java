package zadaci_23_08_2016;

public class TestMyPoint {
	public static void main(String[] args) {
		// kreiranje instanci klase MyPoint
		MyPoint m1 = new MyPoint();
		MyPoint m2 = new MyPoint(10, 30.5);
		
		// poziv metoda public double distance(MyPoint a)
		System.out.println("Udaljenost izmedju tacke1 i tacke2 = " + String.format("%.3f.",m2.distance(m1)));
		// poziv metoda public double distance(double x, double y)
		System.out.println("Udaljenost izmedju tacke1 i tacke2 = " + String.format("%.3f.",m1.distance(10, 30.5)));

	}

}
