package MiniProjekat2_CrapsAndCreditCards;

import java.util.InputMismatchException;

/*
 * (Financial: credit card number validation) Credit card numbers follow certain patterns. 
 * A credit card number must have between 13 and 16 digits. It must start with:
 *  4 for Visa cards
 *  5 for Master cards
 *  37 for American Express cards
 *   6 for Discover cards
 *    Credit card numbers are generated following this validity check, commonly known as the 
 *    Luhn check or the Mod 10 check, which can be described as follows 
 *    (for illustration, consider the card number 4388576018402626):
 *    1. Double every second digit from right to left. If doubling of a digit results in a 
 *    two-digit number, add up the two digits to get a single-digit number.
 *    2. Now add all single-digit numbers from Step 1. 
 *    4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37 
 *    3. Add all digits in the odd places from right to left in the card number. 
 *    6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38
 *    4. Sum the results from Step 2 and Step 3. 
 *    37 + 38 = 75 
 *    5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise, 
 *    it is invalid. For example, the number 4388576018402626 is invalid, but the 
 *    number 4388576018410707 is valid. 
 *    Write a program that prompts the user to enter a credit card number as a long 
 *    integer. Display whether the number is valid or invalid. 
 *    
 *   @author ortonka
 */
public class CreditCards {
	//Constant array of integers 
	public static final int[] NUM = { 4, 5, 37, 6 };
	//Constant array of Strings
	public static final String[] TYPE = { "Visa", "Master", "American Express", "Discover" };
	
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter a credit card number as a long integer: ");
		long num = checkInput();		//number of credit card
		//Output
		if (isValid(num))
			System.out.printf("Number %d is valid %s card number.", num, typeOfCard(num));
		else
			System.out.printf("Number %d is invalid credit card number.", num);

		input.close();
	}
	//Return name of type of Credit Card
	public static String typeOfCard(long number) {
		int j = 0;
		for (int i = 0; i < NUM.length; i++) {
			if (prefixMatched(number, NUM[i]))
				j = i;
		}
		return TYPE[j];
	}

	// Return true if the card number is valid
	public static boolean isValid(long number) {
		boolean start = false;
		//Check prefix in Credit Card number
		for (int i = 0; i < NUM.length; i++) {
			if (prefixMatched(number, NUM[i]))
				start = true;
		}
		//If prefix is not matched with prefixes in array NUM, number is not valid
		if (!start)
			return false;
		//If sum is divisible by 10, number is valid
		if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)
			return true;
		return false;
	}

	// Return the sum of double digits in number at even places
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
		int digit = 0;
		long num = number;
		for (int i = 0; i < getSize(number); i++) {
			//if i is odd number(i starts from zero)
			if (i % 2 == 1) {
				digit = (int) (num % 10);
				sum += getDigit(2 * digit);
			}
			num = num / 10;
		}
		return sum;
	}

	// Return this number if it is a single digit, otherwise, return the sum
	// the two digits

	public static int getDigit(int number) {
		int num = number;
		
		if (getSize(number) > 1) {

			int sum = 0;
			while (num != 0) {
				sum += num % 10;
				num = num / 10;
			}
			num = sum;
		}
		return num;
	}

	// Return sum of odd-place digits in number
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		long digit = 0;
		long num = number;
		for (int i = 0; i < getSize(number); i++) {
			//if i is even number(i starts from zero)
			if (i % 2 == 0) {
				digit = num % 10;
				sum += digit;
			}
			num = num / 10;
		}
		return sum;
	}

	// Return true if the digit d is a prefix for number
	public static boolean prefixMatched(long number, int d) {
		//p is same-sized prefix as d of number
		long p = getPrefix(number, getSize(d));
		if (p == d)
			return true;
		return false;

	}

	// Return the number of digits in d
	public static int getSize(long d) {
		int size = 0;
		do {
			d = d / 10;
			size++;
		} while (d != 0);
		return size;
	}

	// Return the first k number of digits from number. If the number of digits
	// in number is less than k, return number.

	public static long getPrefix(long number, int k) {
		long prefix = number;
		for (int i = 0; i < (getSize(number) - k); i++) {
			prefix /= 10;
		}
		return prefix;
	}

	// Check input
	public static long checkInput() {

		long n = 0;
		boolean error = true; 
		do {
			try {
				n = input.nextLong();
				error = false;
				
				
			} catch (InputMismatchException e) {
				System.out.print("Invalid input, try again:  ");
				input.nextLine();
			}
		} while (error);
		return n;
	}

}
