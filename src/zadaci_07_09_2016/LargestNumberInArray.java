package zadaci_07_09_2016;

import java.util.InputMismatchException;

public class LargestNumberInArray {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//counter
		int count = 0;
		//array
		int[] array = new int[8];
		//enter numbers from user in array with input validation
		while (count < array.length) {
			System.out.print("Unesite " + (count + 1) + ". element u niz: ");
			array[count] = checkInput();
			count++;
		}
		//output
		System.out.println("Najveci element u nizu je: " + largestNum(array));
	}
	//returns largest num in array
	public static int largestNum(int[] array) {
		return findMax(array, 0);
	}
	private static int findMax(int[] a, int i) {
		return i < a.length ? Math.max(a[i], findMax(a, i + 1)) : Integer.MIN_VALUE;
	}

	// Input validation
	public static int checkInput() {

		boolean error = true;
		int num = 0;
		do {
			try {
				num = input.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo: ");
				input.nextLine();
			}
		} while (error);
		return num;
	}

}
