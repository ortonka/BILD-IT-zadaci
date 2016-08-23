package zadaci_21_08_2016;

/*
 * Write a test program that creates two Fan objects. Assign maximum speed, radius 10, color
yellow, and turn it on to the first object. Assign medium speed, radius 5, color
blue, and turn it off to the second object. Display the objects by invoking their
toString method.
 */

public class TestFan {

	public static void main(String[] args) {
		
		final int SLOW = 1, MEDIUM = 2, FAST = 3;
		//kreiraj instancu klase Fan
		Fan fan1=new Fan();
		Fan fan2=new Fan();
		//dodijeli vrijednosti trazene zadatkom
		fan1.setSpeed_(FAST);
		fan1.setRadius_(10);
		fan1.setColor_("yellow");
		fan1.setOn_(true);
		
		//dodijeli vrijednosti trazene zadatkom
		fan2.setSpeed_(MEDIUM);
		fan2.setRadius_(5);
		fan2.setColor_("blue");
		fan2.setOn_(false);
		//ispisi koristeci toString metod
		System.out.println("Fan 1:" + fan1.toString());
		System.out.println("Fan 2:" + fan2.toString());
		
		
	}

}
