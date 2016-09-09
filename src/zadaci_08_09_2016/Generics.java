package zadaci_08_09_2016;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		/** ZADATAK 1 */
		// create ArrayList of Integers
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(1);
		System.out.println("ZADATAK 1\n");
		System.out.println("Prije poziva metoda: " + list);
		// method call
		ArrayList<Integer> list2 = removeDuplicates(list);
		// output
		System.out.println("Nakon poziva metoda: " + list2);
		
		/** ZADATAK 2 */
		System.out.println("\nZADATAK 2\n");
		// create array of Integers
		Integer[] list3 = new Integer[10];
		System.out.print("Lista: ");
		// put elements in array
		for (int i = 0; i < list3.length; i++) {
			list3[i] = (int)(Math.random()*10);
			System.out.print(list3[i]+ " ");
		}
		// method call
		System.out.println("\nPozicija elementa 1 u listi, linearno pretrazivanje: " + linearSearch(list3, 1));
		System.out.println("Pozicija elementa 5 u listi, linearno pretrazivanje: " + linearSearch(list3, 5));
		System.out.println("Pozicija elementa 50 u listi, linearno pretrazivanje: " + linearSearch(list3, 50));
		
		/** ZADATAK 3 */
		System.out.println("\nZADATAK 3\n");
		System.out.println("Maximalan element u listi je: " + max(list3));
		
		/** ZADATAK 4 */
		System.out.println("\nZADATAK 4\n");
		Double[][] list4 = { { 1.2, 3.5 }, { 4.1, 2.2 }, { 2.0, 3.4 } };
		//print matrix
		for(int i=0; i<list4.length;i++){
			System.out.print("|");
			for(Double e: list4[i]){
				System.out.print(e +" ");
			}
			System.out.print("|\n");
		}
		//output
		System.out.println("\nMaximalan element u matrici je: " + max(list4));
		
		
		/** ZADATAK 5 */
		System.out.println("\nZADATAK 5\n");
		System.out.println("Pozicija elementa 1 u listi, binarno pretrazivanje: " + binarySearch(list3, 1));
		System.out.println("Pozicija elementa 5 u listi, binarno pretrazivanje: " + binarySearch(list3, 5));
		System.out.println("Pozicija elementa 50 u listi, binarno pretrazivanje: " + binarySearch(list3, 50));
	}

	/** ZADATAK 1 */
	// generic method that returns ArrayList<E> with removed duplicate elements
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

		ArrayList<E> list2 = new ArrayList<E>();

		for (E elem : list)
			if (!list2.contains(elem))
				list2.add(elem);

		return list2;

	}

	/** ZADATAK 2 */
	// if key is found, returns index of el in list, else returns -1
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == key) {
				return i;
			}
		}

		return -1;
	}

	/** ZADATAK 3 */
	// method returns max element in list
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for (int i = 0; i < list.length; i++) {
			if (list[i].compareTo(max) > 0)
				max = list[i];
		}
		return max;
	}

	/** ZADATAK 4 */
	// method returns max element in matrix
	public static <E extends Comparable<E>> E max(E[][] list) {
		E max = list[0][0];
		for (int i = 0; i < list.length; i++) {
			E maxList = max(list[i]);
			if (maxList.compareTo(max) > 0)
				max = maxList;
		}
		return max;
	}

	/** ZADATAK 5 */
	// if key is found, returns index of el in list, else returns -1
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {

		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			int middle = (low + high) / 2;
			if (list[middle] == key) {
				return middle;
			}
			if (list[middle].compareTo(key) < 0) {
				low = middle + 1;
			}
			if (list[middle].compareTo(key) > 0) {
				high = middle - 1;
			}
		}
		return -1;
	}

}
