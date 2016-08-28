package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Write the following method that sorts an ArrayList of numbers: 
 * 
 * public static void sort(ArrayList<Integer> list)
 * 
 * Write a test program that prompts the user to enter 5 numbers, stores them in an 
 * array list, and displays them in increasing order.
 */

public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		try (java.util.Scanner unos = new java.util.Scanner(System.in)) {
			System.out.println("Unesite 5 brojeva: ");
			for (int i = 0; i < 5; i++) {
				list.add(unos.nextInt());
			}
			// pozivanje metode za sortiranje
			sort(list);
			// print rezultata

			for (int x : list) {
				System.out.print(x + " ");
			}
		} catch (Exception e) {
			System.err.println("Dogodila se greška ! Restartuj program !");
		}

	}

	public static void sort(ArrayList<Integer> list) {
		Collections.sort(list);
	}

}
