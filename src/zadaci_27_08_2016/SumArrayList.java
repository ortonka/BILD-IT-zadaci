package zadaci_27_08_2016;

import java.util.ArrayList;

/*
 * Write the following method that returns the sum of all numbers in an ArrayList: 
 * public static double sum(ArrayList<Double> list) 
 * Write a test program that prompts the user to enter 5 numbers, stores them in an 
 * array list, and displays their sum.
 */

public class SumArrayList {

	public static void main(String[] args) {
		//kreiranje liste
		ArrayList<Double> list = new ArrayList<>();
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			//unos u listu
			System.out.println("Unesite 5 brojeva: ");
			for (int i = 0; i < 5; i++) {
				list.add(input.nextDouble());
			}
			// pozivanje metode za sabiranje
			double sum = sum(list);
			// print rezultata

			System.out.println("Suma elemenata u listi iznosi " + String.format("%.2f.", sum));
		} catch (Exception e) {
			System.err.println("Dogodila se greška ! Restartuj program !");
		}
	}
	
	public static double sum(ArrayList<Double> list) {
		double sum=0;
		for(double x : list) {
			sum+=x;
		}
		return sum;
	}

}
