package zadaci_23_08_2016;

public class MyInteger {

	// int data field named value that stores the int value represented by this
	// object.
	private int value;

	// constructor that creates a MyInteger object for the specified int value
	public MyInteger(int value_) {
		this.value = value_;
	}

	// getter method that returns the int value
	public int getValue() {
		return value;
	}

	// method returns true if number is even
	public boolean isEven() {
		if (this.value % 2 == 0)
			return true;
		else
			return false;
	}

	// method returns true if number is odd
	public boolean isOdd() {
		if (isEven())
			return false;
		else
			return true;
	}

	// method returns true if number is prime
	public boolean isPrime() {
		if (this.value == 0 || this.value == 1)
			return false;
		int sqr_root = (int) Math.sqrt(this.value);
		for (int i = 2; i <= sqr_root; i++) {
			if (this.value % i == 0) {
				return false;
			}
		}
		return true;
	}

	// method returns true if int is even
	public static boolean isEven(int number) {
		if (number % 2 == 0)
			return true;
		else
			return false;
	}

	// method returns true if int is odd
	public static boolean isOdd(int number) {
		if (isEven(number))
			return false;
		else
			return true;
	}

	// method returns true if int is prime
	public static boolean isPrime(int num) {
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	// static method that returns true if MyInteger is even
	public static boolean isEven(MyInteger number) {
		if ((number.getValue()) % 2 == 0)
			return true;
		else
			return false;
	}

	// static method that returns true if MyInteger is odd
	public static boolean isOdd(MyInteger number) {
		if (isEven(number.getValue()))
			return false;
		else
			return true;
	}

	// static method that returns true if MyInteger is prime
	public static boolean isPrime(MyInteger number) {
		boolean isPrime = true;
		for (int i = 2; i < number.getValue(); i++) {
			if (number.getValue() % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	// check if number of type MyInteger is equal to number of type int
	public boolean equals(int number) {
		if (this.value == number)
			return true;
		else
			return false;
	}

	// check if number of type MyInteger is equal to number of type MyInteger
	public boolean equals(MyInteger number) {
		if (this.value == number.value)
			return true;
		else
			return false;
	}

	// return int from array of chars
	public static int parseInt(char[] array) {
		int num = 0;
		for (int i = array.length; i > 0; i--) {
			int cifra = Character.getNumericValue(array[i - 1]);
			int exp = (int) Math.pow(10, (array.length - i));
			num = num + cifra * exp;
		}
		return num;
	}

	// return int from String
	public static int parseInt(String s) {
		int num = 0;
		for (int i = s.length(); i > 0; i--) {
			int cifra = Character.getNumericValue(s.charAt(i - 1));
			int exp = (int) Math.pow(10, (s.length() - i));
			num = num + cifra * exp;
		}
		return num;
	}

	@Override
	public String toString() {
		return "" + value + "";
	}
	
	

}
