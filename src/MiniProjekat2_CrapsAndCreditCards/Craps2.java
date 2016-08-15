package MiniProjekat2_CrapsAndCreditCards;

/*
 * (Game: chance of winning at craps) Revise Exercise Craps to run it 10,000 times 
 * and display the number of winning games.
 * 
 * @author ortonka
 */

public class Craps2 {
	public static final int NUM_OF_GAMES = 10000;

	public static void main(String[] args) {
		int win = 0;
		//ponovi bacanja 10000 puta
		for (int i = 0; i < NUM_OF_GAMES; i++) {
			System.out.println();
			if (game() == 0) {
				win++;
			}
		
		}
		//ispisi koliko je puta ostvarena pobjeda
		System.out.printf("You won %d out of %d games. ", win, NUM_OF_GAMES);
	}

	public static int game() {
		int win = 0;
		// zbir bacanja dviju kockica
		int score = roll();
		// ako je zbir 7 ili 12, pobjeda
		if (score == 7 || score == 11) {
			System.out.println("You win\n");
			win = 0;
			// ako je zbir 2, 3 ili 12, gubitak
		} else if (score == 2 || score == 3 || score == 12) {
			System.out.println("You lose\n");
			win = -1;
		} else {
			// Ciljana vrijednost za pobjedu
			int point = score;
			System.out.println("Point is " + point);
			boolean check = true;
			// Bacaj kockice dok ne pobijedis ili izgubis
			while (check) {
				score = roll();
				if (score == point) {
					System.out.println("You win\n");
					check = false;
					win = 0;
				}
				if (score == 7) {
					System.out.println("You lose\n");
					check = false;
					win = -1;
				}
			}
		}
		//ukoliko je pobijeda vraca 0, a ukoliko je gubitak vraca -1
		return win;
	}

	public static int roll() {
		//dva nasumicna broja od 1-6
		int num1 = (int) (Math.random() * 6) + 1;
		int num2 = (int) (Math.random() * 6) + 1;
		//zbir dvaju nasumicnih brojeva
		int score = num1 + num2;
		//ispis
		System.out.printf("You rolled %d + %d = %d\n", num1, num2, score);

		return score;
	}

}
