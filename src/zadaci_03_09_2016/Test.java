package zadaci_03_09_2016;

public class Test {
	// vraca sumu povrsina svih objekata proslijedjenog niza a
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (GeometricObject e : a) {
			sum += e.getArea();
		}
		return sum;
	}

	public static void main(String[] args) {
		/** TEST zadatak 1 */
		System.out.println("ZADATAK 1\n");
		// kreiranje dva kruga
		Circle c1 = new Circle(4);
		Circle c2 = new Circle(4);
		if (c1.equals(c2))
			System.out.println(c1 + " i " + c2 + " su jednaki.");
		else
			System.out.println(c1 + " i " + c2 + " nisu jednaki.");

		/** TEST zadatak 2 */
		System.out.println("\n\nZADATAK 2\n");
		// kreiranje dva pravougaonika
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(0.2, 0.5);

		if (r1.equals(r2))
			System.out.println(r1 + " i " + r2 + " su jednaki.");
		else
			System.out.println(r1 + " i " + r2 + " nisu jednaki.");

		/** TEST zadatak 3 */
		System.out.println("\n\nZADATAK 3\n");
		Octagon o1 = new Octagon(5);
		Octagon o2 = (Octagon) o1.clone();
		System.out.println("1st " + o1 + "\n2nd " + o2);
		System.out
				.println("Octagon area: " + String.format("%.2f", o1.getArea()) + ", perimeter: " + o1.getPerimeter());
		if (o1.compareTo(o2) == -1)
			System.out.println("Povrsina prvog oktagona je manja od povrsine drugog.");
		else if (o1.compareTo(o2) == 1)
			System.out.println("Povrsina prvog oktagona je veca od povrsine drugog.");
		else
			System.out.println("Oba oktagona imaju jednake povrsine.");

		/** TEST zadatak 4 */
		System.out.println("\n\nZADATAK 4\n");
		GeometricObject[] objects = { c1, c2, r1, r2 };
		System.out.println(
				"Ukupna povrsina oba kruga i oba pravougaonika je: " + String.format("%.2f", sumArea(objects)));

		/** TEST zadatak 5 */
		System.out.println("\n\nZADATAK 5\n");
		Course course1 = new Course("Course1");
		course1.addStudent("student1");
		course1.addStudent("student2");
		Course course2 = (Course) course1.clone();
		// Checking if any of the members have the same reference
		System.out.println("Da li su course1 i course2 isti objekat ? " + (course1 == course2));
		System.out.println("Da li course1 i course2 dijele istu referencu za polje courseName ? "
				+ (course1.getCourseName() == course2.getCourseName()));
		System.out.println("Da li course1 i course2 dijele istu referencu za niz students ? "
				+ (course1.getStudents() == course2.getStudents()));
	}

}
