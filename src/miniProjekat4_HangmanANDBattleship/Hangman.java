package miniProjekat4_HangmanANDBattleship;

import java.util.Scanner;

public class Hangman {
	// array of word for guessing
	static String[] words = { "java", "polymorphism", "inheritance", "exception", "iteration", "loop", "method",
			"operator", "object" };
	// variable for checking guessing
	static boolean isCorrect;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String status = "y";
		while (status.equals("y")) {
			//get word from array of words
			String word = getWord();
			//get hidden word (word as ******)
			String hiddenWord = getHiddenWord(word);
			//counts incorrect letters
			int counter = 0;
			//if not guessed or if hangman is not hanged
			while (!word.equals(hiddenWord) && counter < 6) {
				//output
				System.out.print("Enter a letter in word " + hiddenWord + " : ");
				//user's input
				char ch = input.next().charAt(0);
				//if it is not already in word, add it
				if (!isAlreadyInWord(hiddenWord, ch)) {
					//set new hidden word
					hiddenWord = getGuess(word, hiddenWord, ch);
					//if letter is not in word
					if (!isCorrect) {
						counter++;
						drowHangman(counter);
						System.out.println("\'" +ch + "\' is not in the word.");
					}

				} else {
					System.out.println(ch + " is already in word.");
				}

			}
			//output
			if (counter >= 6)
				System.out.println("You lose ! Correct word was " + word);
			else
				System.out.println("The word is correct. You won ! ");
			System.out.println("Do you want to guess another word? Enter y or n :");
			status = input.next();
		}
		input.close();
	}

	// method that drow hangman in console
	public static void drowHangman(int count) {

		String[] rows = new String[6];
		rows[0] = "    ______ ";
		rows[1] = "    |    | ";
		rows[2] = ((count > 0) ? "    O    | " : "         | ");
		if (count == 2)
			rows[3] = "    |    | ";
		else if (count == 3)
			rows[3] = "   /|    | ";
		else if (count >= 4)
			rows[3] = "   /|\\   | ";
		else
			rows[3] = "         | ";
		if (count == 5)
			rows[4] = "   /     | ";
		else if (count >= 6)
			rows[4] = "   / \\   | ";
		else
			rows[4] = "         | ";
		rows[5] = "  _______| ";

		for (int i = 0; i < rows.length; i++)
			System.out.println(rows[i]);

	}

	// get word out of array randomly
	public static String getWord() {
		return words[(int) (Math.random() * words.length)];
	}

	// return words in " * "
	public static String getHiddenWord(String word) {

		String hidden = "";
		for (int i = 0; i < word.length(); i++) {
			hidden += "*";
		}
		return hidden;
	}

	// check guess
	static public String getGuess(String word, String hiddenWord, char ch) {

		isCorrect = false;
		StringBuilder s = new StringBuilder(hiddenWord);
		for (int i = 0; i < word.length(); i++) {

			if (ch == word.charAt(i) && s.charAt(i) == '*') {
				isCorrect = true;
				s = s.deleteCharAt(i);
				s = s.insert(i, ch);
			}
		}
		return s.toString();
	}
	//check if letter is already in word
	public static boolean isAlreadyInWord(String hiddenWord, char ch) {

		for (int i = 0; i < hiddenWord.length(); i++) {

			if (ch == hiddenWord.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}