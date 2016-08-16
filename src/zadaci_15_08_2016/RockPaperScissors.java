package zadaci_15_08_2016;

import java.util.InputMismatchException;

/*
 * Napisati program koji igra sa protivnikom rock-paper-scissors. 
 * Program nasumicno generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program 
 * pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik pobijedio, 
 * da li je racunar pobijedio ili je bilo neriješeno. 
 * 
 * @author ortonka
 */
public class RockPaperScissors {

	public static final String[] GAME = { "\"papir\"", "\"bunar\"", "\"makaze\"" };
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {

		int comp = (int) (Math.random() * 3); // nasumican broj 0-2
		int user = checkInput(); // korisnikov unos
		// ispis rezultata
		System.out.printf("Vas izbor je %s, a racunar je izabrao %s, ", GAME[user], GAME[comp]);
		if (compareMoves(comp, user) == 0)
			System.out.printf("isti odabir, dakle nerijeseno je. ", GAME[comp]);
		else if (compareMoves(comp, user) == 1)
			System.out.printf("%s pobjedjuje %s, vasa pobjeda.", GAME[user], GAME[comp]);
		else
			System.out.printf("%s pobjedjuje %s, vi ste izgubili.", GAME[comp], GAME[user]);
	}

	// vraca 0 za nerijeseno, -1 za gubitak, i 1 za pobjedu
	public static int compareMoves(int comp, int user) {
		//ako su unos korisnika i racunarski odabir isti, nerijeseno je
		if (comp == user) {
			return 0;
		}
		// uporedi unos korisnika sa racunarskim odabirom za odredjivanje
		// pobjede ili gubitka
		switch (comp) {
		case 0:
			return (user == 1) ? -1 : 1;
		case 1:
			return (user == 2) ? -1 : 1;
		case 2:
			return (user == 0) ? -1 : 1;
		default:
			return 0;
		}
	}

	// provjera unosa
	public static int checkInput() {
		int num = 0;
		boolean error = true;

		do {
			try {
				System.out.print("Unesite broj, 0-papir, 1-bunar, 2-makaze: ");
				num = input.nextInt();
				//ukoliko je unos manji od 0, a veci od 2, ponovi unos
				if (num < 0 || num > 2) {
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
