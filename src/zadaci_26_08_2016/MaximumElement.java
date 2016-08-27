package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumElement {

	public static Integer max(ArrayList<Integer> list) {
		// ako lista nije prazna, vrati max elemenat, inace vrati null
		if (list.size() > 0) {
			return Collections.max(list);
		} else {
			return null;
		}
	}

	public static void main(String[] args) {
		try {
			// kreiranje ArrayList
			ArrayList<Integer> list = new ArrayList<>();
			// unos od korisnika
			System.out.println("Unesite niz brojeva, 0 terminira unos: ");
			java.util.Scanner input = new java.util.Scanner(System.in);
			// unos vrijednosti u listu
			int num = input.nextInt();
			while (num != 0) {
				list.add(num);
				num = input.nextInt();

			}
			// poziv metoda
			System.out.println("Maximalna vrijednost u unesenom nizu je : " + max(list));
			input.close();
		} catch (Exception e) {
			System.out.println("Greska. Pokusajte ponovo ! ");
			main(args);
		}
	}

}