package zadaci_18_08_2016;

/*
 * (Random number chooser) Write a method that returns a random number between 
 * 1 and 54, excluding the numbers passed in the argument. The method header is 
 * specified as follows: 
 * public static int getRandom(int... numbers)
 * 
 * @author ortonka
 */

public class RandomNumberChooser {
	
	public static final int START = 1;		//start value
	public static final int END = 54;		//end value

	public static void main(String[] args) {
		// output
		System.out.println("Random number: " + getRandom(53, 12, 17, 19, 21));

	}

	// method returns a random number between 1 and 54
	public static int getRandom(int... numbers) {
		// generate random number
		int num = (int) (Math.random() * END) + START;
		//if there is no arguments, return num
		if (numbers.length == 0)
			return num;
		//if there is, check is random num equal to any argument, if it is, get new random num
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == num) {
				num = (int) (Math.random() * END) + START;
				//check again from beginning of array
				i = -1;
			}

		}
		return num;
	}

}
