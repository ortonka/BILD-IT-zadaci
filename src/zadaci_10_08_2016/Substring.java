package zadaci_10_08_2016;

/*
 *  Napisati program koji pita korisnika da unese dva stringa te provjerava i ispisuje da li je 
 *  drugi string substring prvog stringa. Na primjer, ukoliko korisnik unese ABCD kao prvi string 
 *  a BC kao drugi string program mu ispisuje da je BC substring ABCD stringa.
 *  
 *  @author ortonka
 */

public class Substring {

	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		// ispis
		System.out.print("Unesite prvi string: ");
		String string1 = in.next(); // prvi string
		// ispis
		System.out.print("Unesite drugi string: ");
		String string2 = in.next(); // drugi string
		in.close();
		// indexOf vraca index prve pojave substringa, ukoliko postoji ili vrati -1
		// ukoliko ne postoji
		if (string1.indexOf(string2) > 0)
			System.out.printf("\"%s\" je podstring stringa \"%s\".", string2, string1);
		else
			System.out.printf("\"%s\" nije podstring stringa \"%s\".", string2, string1);

	}
}
