package zadaci_18_08_2016;

import java.util.InputMismatchException;

/*
 * (Pattern recognition: consecutive four equal numbers) Write the following 
 * method that tests whether the array has four consecutive numbers with the same value. 
 * public static boolean isConsecutiveFour(int[] values) 
 * Write a test program that prompts the user to enter a series of integers and displays if the 
 * series contains four consecutive numbers with the same value. Your program should first prompt
 *  the user to enter the input size—i.e., the number of values in the series. 
 *  
 *  @author ortonka
 */

public class ConsecutiveFour {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter the number of values: ");
		//get number of values by user
		int numOfValues = checkInput();
		//if number is less than zero, repeat input
		while (numOfValues < 0) {
			System.out.println("Number of values must be greater than 0");
			numOfValues = checkInput();
		}
		//create array with user defined number of values
		int[] niz = new int[numOfValues];
		System.out.print("Enter the values: ");
		for (int i = 0; i < numOfValues; i++) {
			niz[i] = checkInput();
		}
		
		input.close();
		//call a method and print output
		if (isConsecutiveFour(niz)) {
			System.out.println("The list has consecutive fours.");
		} else {
			System.out.println("The list has no consecutive fours.");

		}

	}
	//method returns true if array has consecutive four number, and false if doesn't have
	public static boolean isConsecutiveFour(int[] values) {
		
		//if array doesn't have 4 values, return false
		if (values.length < 4)
			return false;
		
		int count = 0;				//set counter to zero
		int check = values[0];		//start checking from first element in array
		//check for consecutive four numbers
		for (int i = 0; i < values.length; i++) {
			if (values[i] == check) {
				count++;
				if (count == 4)
					return true;
			} else {
				check = values[i];
				count = 1;

			}

		}

		return false;
	}

	// check input
	public static int checkInput() {
		int num = 0;
		boolean error = true;

		do {
			try {
				num = input.nextInt();
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo:");
				input.nextLine();
			}
			// loop is executed while error=true
		} while (error);

		return num;
	}

}
