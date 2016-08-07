package zadaci_06_08_2016;

/*
 * Napisati program koji pita korisnika da unese neki string te mu ispisuje sve karaktere 
 * koji se nalaze na neparnim pozicijama. Na primjer, ako korisnik unese string Beijing Chicago, 
 * program vraca BiigCiao.
 * 
 * @author ortonka
 */

public class StringOddPosition {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Unesite string: ");
		//unos
		String s = input.nextLine();
		input.close();
		
		//ispis
		System.out.print("Karakteri na neparnim pozicijama stringa \"" + s + "\" su: ");
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0)	//ako je neparna pozicija, ispisi karakter
				System.out.print(s.charAt(i));
		}
	}
}
