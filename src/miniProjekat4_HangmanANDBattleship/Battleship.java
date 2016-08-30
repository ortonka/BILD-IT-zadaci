package miniProjekat4_HangmanANDBattleship;

import java.util.Scanner;

public class Battleship {
	Scanner input = new Scanner(System.in);
	// pogledaj pozicije prodova postavljanjem ove varijable na true
	public static final boolean NIKOLA_CHECK = false;

	// ispis linija
	public static void breakln() {
		System.out.println("_____________________________________");
		System.out.println("");
	}

	// metoda kreira tabelu igre
	public static void createBoard(String[][] board) {
		for (int r = 0; r < board.length; r++) {
			for (int c = 0; c < board[0].length; c++) {
				board[r][c] = "~";
			}
		}
	}

	// metoda prikazuje tabelu
	public static void showBoard(String[][] board) {
		breakln();
		for (int r = 0; r < board.length; r++) {
			if (NIKOLA_CHECK == true) {
				for (int c = 0; c < board[0].length; c++) {
					System.out.print(" " + board[r][c]);
				}
				System.out.println("");
			} else {
				for (int c = 0; c < board[0].length; c++) {
					if (board[r][c].equals("S")) {
						System.out.print(" " + "~");
					} else {
						System.out.print(" " + board[r][c]);
					}
				}
				System.out.println("");
			}
		}
		breakln();
	}

	// metoda za kreiranje pojedicnog broda
	public static void createShip(String[][] board, int size) {
		// kreiranje broda vertikalno
		if (Math.random() < 0.5) {
			boolean check = false;
			do {
				int col = (int) (Math.random() * (board.length - size + 1));
				int row = (int) (Math.random() * (board.length - 1));
				for (int i = 0; i < size; i++) {
					if (board[row][col + i].equals("S"))
						check = true;
				}
				if (!check) {
					for (int i = 0; i < size; i++) {
						board[row][col + i] = "S";
					}
				}
			} while (check);
			// kreiranje broda horizontalno
		} else {
			boolean check = false;
			do {
				int col = (int) (Math.random() * (board.length - 1));
				int row = (int) (Math.random() * (board.length - size + 1));
				for (int i = 0; i < size; i++) {
					if (board[row + i][col].equals("S"))
						check = true;
				}
				if (!check) {
					for (int i = 0; i < size; i++) {
						board[row + i][col] = "S";
					}
				}
			} while (check);
		}
	}

	public static int userFire(String[][] board, int hits, int torps) {
		Scanner input = new Scanner(System.in);
		int row, col;
		System.out.println("You have: " + torps + " torpedos left!");
		System.out.println("Select a row to fire in: ");
		row = input.nextInt();
		while (row > 8 || row < 1) // Error checking for row
		{
			System.out.println("Enter a valid row (1 -> 8)");
			row = input.nextInt();
		}
		System.out.println("Select a column to fire in: ");
		col = input.nextInt();
		while (col > 8 || col < 1) // provjera unosa
		{
			System.out.println("Enter a valid col (1 -> 8)");
			col = input.nextInt();
		}
		if (board[row - 1][col - 1].equals("S")) {
			hits++;
			System.out.println("~~~~~~~ HIT ~~~~~~~");
			board[row - 1][col - 1] = "!";
		} else if (board[row - 1][col - 1].equals("!") || board[row - 1][col - 1].equals("M")) {
			System.out.println("You already try that field ! ");
		} else {
			System.out.println("~~~~~~~ MISS ~~~~~~~");
			board[row - 1][col - 1] = "M";
		}
		return hits;
	}

	// ispis pri zavrsetku igre
	public static void finall(int hits, int torps) {
		if (hits < 15)
			System.out.println("GAME OVER, you lost, you didn't sink all the ships.");
		if (torps < 1)
			System.out.println("GAME OVER, you have lost all your torpedos");
		else if (hits >= 15) {
			System.out.println("You have beaten the game battleship, Thanks for playing!");
		}
		System.out.println("Good game, well played!");
	}

	// postavljanje brodova na polje
	public static String[][] putShips() {
		String[][] board = new String[8][8];
		createBoard(board);
		for (int i = 1; i < 6; i++) {
			createShip(board, i);
		}
		return board;
	}

	// kreiranje igre
	public static void game() {
		String[][] board = putShips();
		int torps = 30;
		int hits = 0;
		while (torps > 0 && hits < 15) {
			showBoard(board);
			hits = userFire(board, hits, torps);
			torps--;
		}
		finall(hits, torps);
	}

	public static void main(String[] arg) {
		game();
	}
}