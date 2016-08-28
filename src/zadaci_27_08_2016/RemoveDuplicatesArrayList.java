package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.HashSet;

/*
 *  Write a method that removes the duplicate elements from 
 *  an array list of integers using the following header: 
 *  public static void removeDuplicate(ArrayList<Integer> list) 
 *  Write a test program that prompts the user to enter 10 integers 
 *  to a list and displays the distinct integers separated by exactly one space.
 */

public class RemoveDuplicatesArrayList {

	public static void main(String[] args) {
		// kreiranje liste
		ArrayList<Integer> list = new ArrayList<>();
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// unos u listu
			System.out.println("Unesite 10 brojeva: ");
			for (int i = 0; i < 10; i++) {
				list.add(input.nextInt());
			}
			//ispis elemenata prije poziva metoda
			System.out.println("\nLista prije poziva metoda: ");
			for (int x : list) {
				System.out.print(x + " ");
			}
			//poziv metoda
			removeDuplicate(list);
			
			//ispis nakon poziva metoda
			System.out.println("\nLista nakon poziva metoda: ");

			for (int x : list) {
				System.out.print(x + " ");
			}
		} catch (Exception e) {
			System.err.println("Dogodila se greška ! Restartuj program !");
		}
	}
//metoda iz liste izbaci duplikate
	public static void removeDuplicate(ArrayList<Integer> list) {
		HashSet<Integer> se = new HashSet<Integer>(list);
		list.clear();
		list.addAll(se);
	}

}
