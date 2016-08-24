package zadaci_23_08_2016;

/*
 * Write a test program that creates two Time objects (using new Time() and new 
 * Time(555550000)) and displays their hour, minute, and second in the format 
 * hour:minute:second.
 */

public class TestTime{
	
	public static void main(String[] args) {
		Time vrijeme = new Time();
		Time vrijeme2 = new Time(555550000);

		System.out.println(vrijeme.getHour() + ":" + vrijeme.getMinute() + ":"
				+ vrijeme.getSecond());
		System.out.println(vrijeme2.getHour() + ":" + vrijeme2.getMinute()
				+ ":" + vrijeme2.getSecond());

	}
}