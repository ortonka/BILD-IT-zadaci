package zadaci_03_08_2016;

import java.util.InputMismatchException;

public class StrictlyIdenticalArrays {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Unesite broj elemenata prvog niza: ");
		
		int size = checkInput(); //velicina prvog niza
		int[] list1 = new int[size]; //prvi niz
		
		//Unos elemenata u prvi niz
		for (int i = 0; i < size; i++) {
			System.out.printf("Unesite %d. broj u nizu: ", i + 1);
			//provjera elemenata te dodjela elemenata u niz
			list1[i] = checkInput();
		}
		
		System.out.print("Unesite broje elemenata drugog niza: ");
		
		size = checkInput();  //velicina drugog niza
		
		int[] list2 = new int[size]; //drugi niz
		
		//Unos elemenata u drugi niz
				for (int i = 0; i < size; i++) {
					System.out.printf("Unesite %d. broj u nizu: ", i + 1);
					//provjera elemenata te dojela elemenata u niz
					list2[i] = checkInput();
				}

		//provjera da li su nizovi striktno identicni		
		if (equals(list1, list2)) {
			System.out.println("Nizovi su striktno identicni.");
		} else {
			System.out.println("Nizovi nisu striktno identicni.");
		}
		
		input.close();
	}
//metoda koja provjerava da li su nizovi striktno identicni
	public static boolean equals(int[] array1, int[] array2) {

		if (array1.length != array2.length)
			return false;

		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i])
				return false;
		}

		return true;
	}
	
	//provjera unosa
		public static int checkInput() {

			int n = 0;
			boolean error = true; // varijabla za provjeru
			// unos brojeva u nizu
			do {
				try {
					n = input.nextInt();
					if(n<0)
						throw new InputMismatchException("Negativan broj");
					error = false;
				} catch (InputMismatchException e) {
					System.out.print("Nevalidan unos, pokusajte ponovo:  ");
					input.nextLine();
				}
			} while (error);
			
			return n;
		}
}
