package MiniProjekat2_CrapsAndCreditCards;

/*
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program 
 * to play a variation of the game, as follows: 
 * Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively. 
 * Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you 
 * lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value 
 * (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either 
 * a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win. 
 * Your program acts as a single player. 
 * 
 * @author ortonka
 */

public class Craps {

	public static void main(String[] args) {
		game();
	}
	
	public static void game(){
		// zbir bacanja dviju kockica
				int score = roll();
				// ako je zbir 7 ili 12, pobjeda
				if (score == 7 || score == 11) {
					System.out.println("You win");
					// ako je zbir 2, 3 ili 12, gubitak
				} else if (score == 2 || score == 3 || score == 12) {
					System.out.println("You lose");
				} else {
					// Ciljana vrijednost za pobjedu
					int point = score;
					System.out.println("Point is " + point);
					System.out.println();
					boolean check = true;
					// Bacaj kockice dok ne pobijedis ili izgubis
					while (check) {
						score = roll();
						if (score == point) {
							System.out.println("You win");
							check = false;
						}
						if (score == 7) {
							System.out.println("You lose");
							check = false;
						}
					}
				}
	}

	public static int roll() {

		int num1 = (int) (Math.random() * 6) + 1;
		int num2 = (int) (Math.random() * 6) + 1;

		int score = num1 + num2;
		System.out.printf("You rolled %d + %d = %d\n", num1, num2, score);

		return score;
	}

}
