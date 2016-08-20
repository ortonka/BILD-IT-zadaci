package zadaci_19_08_2016;

/*
 * (Compute the weekly hours for each employee) Suppose the weekly hours for all 
 * employees are stored in a two-dimensional array. Each row records an employee’s seven-day 
 * work hours with seven columns. For example, the following 
 * array stores the work hours for eight employees. Write a program that displays 
 * employees and their total hours in decreasing order of the total hours.
 * 
 * @author ortonka
 */
import java.util.ArrayList;

public class WeeklyHoursForEachEmployee {

	public static final int NUMOFDAYS = 7;

	public static void main(String[] args) {

		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// unos broja radnika
			System.out.println("Unesite koliko imate radnika: ");
			int numOfEmployee = input.nextInt();
			// napravi matricu numOfEmployee x NUMOFDAYS
			int[][] matrica = new int[numOfEmployee][NUMOFDAYS];
			// ispis
			System.out.println("Unesite broj sati za svakog radnika. ");
			// ispis

			System.out.print("P  U  S  C  P  S  N");

			System.out.println();
			// unos broja sati za svakog radnika u matrici
			for (int i = 0; i < matrica.length; i++) {
				for (int j = 0; j < matrica[0].length; j++) {
					matrica[i][j] = input.nextInt();
				}
			}
			// napravi listu sa brojem ukupnih sati
			ArrayList<Integer> numOfHours = new ArrayList<Integer>();
			int brojacSati = 0;

			for (int i = 0; i < matrica.length; i++) {
				for (int j = 0; j < matrica[0].length; j++) {
					brojacSati = brojacSati + matrica[i][j];
				}
				numOfHours.add(brojacSati);
				// dodaj broj sati za radnika u listu
				brojacSati = 0;
			}
			// ispis korisniku
			System.out.println();
			int counter = 1;
			for (int x : numOfHours) {
				System.out.printf("Radnik %d je radio %d sati.", counter, x);
				counter++;
				System.out.println();
			}
			// Ako se desila iznimka, restartuj program
		} catch (Exception e) {
			System.err.println("Greška! Restartuj program.");
		}
	}
}
