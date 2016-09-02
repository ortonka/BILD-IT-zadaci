package zadaci_01_09_2016;

import java.util.ArrayList;

public class Sort {
	// metod sortira ArrayList sa objektima tipa Number (Bubble sort)
	public static void sort(ArrayList<Number> list) {

		for (int i = 0; i < (list.size() - 1); i++) {
			for (int j = 1; j < list.size(); j++) {
				if (list.get(j).doubleValue() < list.get(j - 1).doubleValue()) {
					Number pom = list.get(j).doubleValue();
					list.set(j, list.get(j - 1).doubleValue());
					list.set((j - 1), pom);
				}
			}
		}
	}

	public static void main(String[] args) {

		// kreiraj ArrayList sa objektima tipa Number
		ArrayList<Number> list = new ArrayList<>();
		// stavi elemente u listu
		for (int i = 0; i < 20; i++) {
			list.add(i);
		}
		// poziv metoda
		Shuffle.shuffle(list);
		// ispis nakon shuffle
		System.out.println("Prije sortiranja: \n" + list);
		// poziv sort metoda
		sort(list);
		// ispis nakon sorta
		System.out.println("Poslije sortiranja: \n" + list);

	}

}
