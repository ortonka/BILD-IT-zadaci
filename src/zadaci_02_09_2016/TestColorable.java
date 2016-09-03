package zadaci_02_09_2016;

public class TestColorable {

	public static void main(String[] args) {
		GeometricObject[] objects = new GeometricObject[5];
		//kreiranje 5 razlicitih objekata
		objects[0] = new Rectangle();
		objects[1] = new Circle();
		objects[2] = new Square();
		objects[3] = new Rectangle(1, 3);
		objects[4] = new Square(25);
		//ispis
		for (int i = 0; i < objects.length; i++) {
			System.out.println("Object " + objects[i] + " has area " + objects[i].getArea());
			if (objects[i] instanceof Colorable) {
				System.out.print("How to color it ? ");
				objects[i].howToColor();
			}
			System.out.println();

		}

	}
}