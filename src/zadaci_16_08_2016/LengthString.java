package zadaci_16_08_2016;

/*
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje dužinu tog stringa 
 * kao i prvo slovo stringa. 
 * 
 * @author ortonka
 */

public class LengthString {

	public static void main(String[] args) {
		java.util.Scanner input= new java.util.Scanner(System.in);
		//ispis
		System.out.print("Unesite string: ");
		//unos stringa
		String s=input.nextLine();
		//ispis koristenjem metoda length() i charAt(i)
		System.out.printf("Duzina stringa je %d, a prvi karakter je \'%c\'. ", s.length(), s.charAt(0));
		input.close();

	}

}
