package zadaci_17_08_2016;

import java.util.InputMismatchException;

/*
 *  Napisati program koji prima ASCII kod (cijeli broj izmedju 0 i 127) te ispisuje koji je to 
 *  karakter. Na primjer, ukoliko korisnik unese 69 kao ASCII kod, program mu ispisuje da je 
 *  karakter sa tim brojem karakter E.
 *  
 *  @author ortonka
 */

public class ASCII {
	
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//broj izmedju 0 - 127
		int num = checkInput();
		//ispis ASCII karaktera
		System.out.println("ASCII karatker za broj " + num + " je \"" +(char)(num) + "\"" + ".");

	}
	
	// provjera unosa
		public static int checkInput() {
			int num = 0;
			boolean error = true;

			do {
				try {
					System.out.print("Unesite broj izmedju 0 - 127: ");
					num = input.nextInt();
					//ukoliko je unos manji od 0, a veci od 127, ponovi unos
					if (num < 0 || num > 127) {
						throw new InputMismatchException();
					}
					error = false;

				} catch (InputMismatchException e) {
					System.out.print("Pogresan unos, pokusajte ponovo. \n");
					input.nextLine();
				}
				// petlja se izvrsava dok postoji greska
			} while (error);

			return num;
		}

}
