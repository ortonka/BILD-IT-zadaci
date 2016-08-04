package zadaci_04_08_2016;

import java.util.InputMismatchException;

/*
 *  ISBN-10 (International Standard Book Number) se sadrzi od 10 brojeva:
 *  d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, sluzi kao checksum
 *  i njega izracunavamo iz prvih devet brojeva koristeci se sljedecom formulom:
 *  (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11.
 *  Ukoliko je checksum 10, zadnji broj oznacavamo sa X u skladu sa ISBN-10 konvencijom.
 *  Napisati program koji pita korisnika da unese prvih 9 brojeva te ispise desetocifreni
 *  ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9 brojeva, 013601267 program nam
 *  ispisuje 0136012671 kao ISBN-10 broj. Ukoliko unesemo 013031997 kao prvih 9 brojeva,
 *  program nam ispisuje 013031997X kao ISBN-10 broj)
 *  
 *  @author ortonka
 */

public class ISBN {

	static java.util.Scanner input=new java.util.Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.print("Unesite prvih devet cifara ISBN broja: ");
		
		String unos=checkInput();
		
		isbn(unos);
		

	}
	


	public static void isbn(String broj) {
				

			int suma = 0;

			for (int i = 9; i > 0; i--) {
				int n = Character.getNumericValue(broj.charAt(i - 1));
				suma += n * i;
			}
			
			if (suma % 11 == 10)
				System.out.println(broj + 'X');
			else
				System.out.println(broj + (suma % 11));

		}

		
	
	//provjera unosa
	public static String checkInput() {

		String s = "";
		boolean error = true; // varijabla za provjeru
		
		do {
			try {
				s = input.next();
				if(s.length()!=9){
					throw new InputMismatchException("Unos mora sadrzavati 9 karaktera. ");
					
				}
				//provjera da li je unos sacinjen od brojeva
				 Integer.parseInt(s); 
				error = false;
			} catch (InputMismatchException e) {
				System.out.print("Nevalidan unos, pokusajte ponovo: ");
				input.nextLine();
			}
			catch(NumberFormatException nfe)  
			  {  
			    System.out.print("Nevalidan unos, pokusajte ponovo:  ");  
			  }  
		} while (error);
		
		return s;
	}

}
