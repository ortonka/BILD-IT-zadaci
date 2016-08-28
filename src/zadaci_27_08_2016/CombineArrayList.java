package zadaci_27_08_2016;

import java.util.ArrayList;

/*
 * Write a method that returns the union of two array lists of 
 * integers using the following header: 
 * public static ArrayList<Integer> union( ArrayList<Integer> list1, ArrayList<Integer> list2)
 */
public class CombineArrayList {

	public static void main(String[] args) {
		//kreiranje listi
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();

		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			//unos u listu 1
			System.out.println("Unesite 10 brojeva prve liste: ");
			for (int i = 0; i < 10; i++) {
				list1.add(input.nextInt());
			}
			//unos u listu 2
			System.out.println("Unesite 10 brojeva druge liste: ");
			for (int i = 0; i < 10; i++) {
				list2.add(input.nextInt());
			}
			//poziv metoda
			ArrayList<Integer> union = union(list1, list2);
			//ispis
			System.out.println("Lista sa spojenom prvom i drugom listom: ");
			for (int x : union) {
				System.out.print(x + " ");
			}
		} catch (Exception e) {
			System.err.println("Dogodila se greška ! Restartuj program !");
		}
	}
	//metoda vraca listu koja je spoj proslijedjenih listi
	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		ArrayList<Integer> union = new ArrayList<Integer>();
		for (int x : list1) {
			union.add(x);
		}
		for (int y : list2) {
			union.add(y);
		}
		return union;
	}

}
