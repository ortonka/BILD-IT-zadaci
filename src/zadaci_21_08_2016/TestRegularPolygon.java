package zadaci_21_08_2016;

/*
 * Write a test program that creates three RegularPolygon objects, created using the no-arg 
 * constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 
 * 4, 5.6, 7.8). For each object, display its perimeter and area.
 */

public class TestRegularPolygon {

	public static void main(String[] args) {
		// kreiranje instanci klase RegularPolygon
		RegularPolygon pol1 = new RegularPolygon();
		RegularPolygon pol2 = new RegularPolygon(5, 7);
		RegularPolygon pol3 = new RegularPolygon(12, 3, 4.1, 8.4);

		System.out.println("Poligon 1: " + pol1 + "\n");
		System.out.println("Poligon 2: " + pol2 + "\n");
		System.out.println("Poligon 3: " + pol3 + "\n");

	}

}
