package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

/*Napisati program koji ucitava niz brojeva, pronalazi najveci broj
 *  te ispisuje koliko se puta taj broj ponavlja. Pretpostavimo da 
 *  se unos brojeva zavrsava sa nulom.
 *  
 * @author ortonka
*/
public class MaxElementArray {

	public static void main(String[] args) {

		// kreiraj listu za dodavanje brojeva
		ArrayList<Integer> lista = new ArrayList<>();
		// kreiranje skenera za unos
		java.util.Scanner unos = new java.util.Scanner(System.in);
		// varijabla kojom se kontrolise unos
		boolean error = true;
		//ispis
		System.out.print("Unesite cijele brojeve, 0 terminira unos: ");
		// unutar petlje odradjeno rukovanje exception-ima, unos traje sve dok
		// se ne unese 0
		while (error) {
			try {
				int broj = unos.nextInt();
				while (broj != 0) {
					lista.add(broj);
					broj = unos.nextInt();

				}
				error = false;

			} catch (InputMismatchException ex) {
				System.out.println("Pogrešan unos, pokusajte ponovo. 0 terminira unos.");
				unos.next();
			}
		}
		// zatvaranje skenera
		unos.close();

		// ispis
		if (lista.isEmpty())
			System.out.println("Lista nema elemenata");
		else
			System.out.println("Maksimalan elemenat unesenog niza je " + max(lista) + " i ponavlja se "
					+ count(lista, max(lista)) + " puta.");

	}

	// Metod vraca najvecu vrijednost u listi brojeva
	public static Integer max(ArrayList<Integer> list) {

		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max)
				max = list.get(i);
		}
		return max;

	}

	// Metod koji vraca koliko se puta neki element ponovio u odredjenoj listi

	public static int count(ArrayList<Integer> lista, int num) {
		int count = 0;
		for (int i = 0; i < lista.size(); i++) {
			if ((lista.get(i)).equals(num))
				count++;
		}
		return count;
	}

}