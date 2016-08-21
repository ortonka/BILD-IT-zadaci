package zadaci_20_08_2016;

/*
 * 
 * (Stopwatch) Design a class named StopWatch. The class contains: 
 *  Private data fields startTime and endTime with getter methods.
 *  A no-arg constructor that initializes startTime with the current time. 
 *  A method named start() that resets the startTime to the current time. 
 *  A method named stop() that sets the endTime to the current time. 
 *  A method named getElapsedTime() that returns the elapsed time for the 
 *  stopwatch in milliseconds. 
 *  Draw the UML diagram for the class and then implement the class. 
 *  
 *  @author ortonka
 */

public class StopWatch {
	//No-arg constructor that initializes startTime with the current time. 
	public StopWatch() {
		startTime = System.currentTimeMillis();
	}
	//This method resets the startTime to the current time. 
	public static void start() {
		startTime = System.currentTimeMillis();
	}
	//This method sets the endTime to the current time. 
	public static void stop() {
		endTime = System.currentTimeMillis();
	}
	//method returns the elapsed time for the stopwatch in milliseconds. 
	public static long getElapsedTime() {
		return (endTime - startTime);
	}
	//method returns startTime
	public long getStartTime() {
		return startTime;
	}
	//method returns stopTime
	public long getStopTime() {
		return endTime;
	}
	
	private static long startTime;		
	private static long endTime;

	

}
