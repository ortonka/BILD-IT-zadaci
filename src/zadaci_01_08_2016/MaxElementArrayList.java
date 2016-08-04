package zadaci_01_08_2016;

import java.util.ArrayList;

/* Napisati sljedecu metodu koja vraca najvecu vrijednosti u ArrayListu Integera.
 * Metoda vraca null ukoliko je lista null ili ukoliko lista sadrzi 0 elemenata.
 * public static Integer max(ArrayList<Integer> list)
 * 
 * @author ortonka
*/
public class MaxElementArrayList {

	public static void main(String[] args) {
		// Kreiranje ArrayList koja sadrzi null elemente
		ArrayList<Integer> lista1 = new ArrayList<>();
		lista1.add(null);
		lista1.add(null);
		lista1.add(null);
		System.out.println("Ako se lista sadrzi od elemenata koji su svi null, onda je max elemenat: " + max(lista1));

		// Kreiranje ArrayList koja pokazuje na null
		ArrayList<Integer> lista2 = null;
		System.out.println("Ako lista ne pokazuje ni na sta, onda je max vrijednost ustvari: " + max(lista2));

		// Kreiranje ArrayList koja sadrzi nula elemenata
		ArrayList<Integer> lista3 = new ArrayList<>();
		System.out.println("Ako je lista prazna, max elemenat je: " + max(lista3));

		// Kreiranje ArrayList koja ustvari sadrzi brojeve
		ArrayList<Integer> lista4 = new ArrayList<>();
		lista4.add(5);
		lista4.add(9);
		lista4.add(-10);
		System.out.println("Max elemenat ove liste koja sadrzi brojeve je: " + max(lista4));

	}

	// Kreiranje metoda koji vraca null ukoliko lista pokazuje na null, ili
	// ukoliko je prazna ili ukoliko su svi elementi null, a vraca vrijednost
	// ukoliko lista ima brojeve kao vrijednosti
	public static Integer max(ArrayList<Integer> list) {
		if (list == null || list.isEmpty() || isAllNull(list))
			return null;
		else {
			int max = 0;
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) > max)
					max = list.get(i);
			}
			return max;
		}

	}

	// metoda koja provjerava da li su svi elementi u ArrayList ustvari null
	public static boolean isAllNull(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++)
			if (list.get(i) != null)
				return false;
		return true;

	}

}
