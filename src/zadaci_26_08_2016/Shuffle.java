package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {

	public static void shuffle(ArrayList<Integer> list) {
		//ispis pocetne liste
		System.out.println("\nOrginalna lista : " + list.toString());
		// preraspodjela elemenata
		Collections.shuffle(list);
		//ispis liste nad kojom je izvrsen shuffle
		System.out.println("\nPrerasporedjene vrijednosti : " + list.toString());

	}

	public static void main(String[] args) {
		// kreiranje ArrayList sa elementima tipa Integer
		ArrayList<Integer> list = new ArrayList<>();
		
		//dodavanje elemenata u listu
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
	
		// poziv metoda
		shuffle(list);
	}

}
