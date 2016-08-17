package zadaci_17_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati metodu sa sljedecim headerom: 
 * public static String format(int number, int width) 
 * koja vraca string broja sa prefiksom od jedne ili više nula. Velicina stringa je width 
 * argument. Na primjer, ukoliko pozovemo metodu format(34, 4) metoda vraca 0034, ukoliko 
 * pozovemo format(34, 5) metoda vraca 00034. Ukoliko je uneseni broj veci nego width argument, 
 * metoda vraca samo string broja. Npr. ukoliko pozovemo format(34, 1) metoda vraca 34
 * 
 * @author ortonka
 */

public class FormatString {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Unesite broj: ");
		int num = checkInput();			//broj
		System.out.print("Unesite sirinu stringa za ispis: ");
		int width = checkInput();		//sirina ispisa
		//ukoliko je unos manji od 0, ponovi unos
		while ( width<0){
			System.out.print("Sirina ispisa ne moze biti negativan broj. Pokusajte ponovo: ");
			width=checkInput();
		}
		

		System.out.println("Ispis: " + format(num, width));

	}
	//vraca string sa vodecim nulama za proslijedjenu sirinu
	public static String format(int number, int width) {
		
		String s = String.format("%0" + width + "d", number);

		return s;

	}

	// provjera unosa
	public static int checkInput() {
		int num = 0;
		boolean error = true;

		do {
			try {
				num = input.nextInt();
				error = false;

			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, pokusajte ponovo: ");
				input.nextLine();
			}
			// petlja se izvrsava dok postoji greska
		} while (error);

		return num;
	}

}
