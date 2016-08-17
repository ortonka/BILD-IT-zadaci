package zadaci_17_08_2016;

import java.util.InputMismatchException;

/*
 *  U javi, short vrijednost se sprema u samo 16 bita. Napisati program koji pita korisnika da 
 *  unese short broj te mu ispiše svih 16 bita za dati cijeli broj. Na primjer, ukoliko korisnik 
 *  unese broj 5 - program mu ispisuje 0000000000000101
 *  
 *  @author ortonka
 */
public class Short {

	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		// unos broja tipa short
		short x = checkInput();
		// format stringa za ispis, dodavanje vodecih nula
		String s = String.format("%16s", Integer.toBinaryString(x)).replace(' ', '0');
		// ukoliko je broj manji od 0, koristi zadnjih 16 bita broja (metod
		// Integer.toBinaryString vraca 32 bita za negativan broj))
		if (x < 0)
			s = s.substring(s.length() - 16);
		//ispis
		System.out.printf("Binarna reprezentacija broja %d u 16 bita je %s.", x, s);
	}

	// provjera unosa
	public static short checkInput() {
		short num = 0;
		boolean error = true;

		do {
			try {
				System.out.print("Unesite broj izmedju  -32,768 - 32,767: ");
				num = input.nextShort();
				// ukoliko je unos manji od -32,768, a veci od 32,767, ponovi unos
				if (num < -32768 || num > 32767) {
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
