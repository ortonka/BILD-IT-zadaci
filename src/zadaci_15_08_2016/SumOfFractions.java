package zadaci_15_08_2016;

/*
 * Napisati program koji sabira sljedecu seriju 
 * 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99.
 * 
 * @author ortonka
 */

public class SumOfFractions {

	public static void main(String[] args) {
		double sum = 0;	//suma
		//u for petlji dodaj na sumu vrijednost svakog razlomka
		for (int i = 1; i < 98; i += 2) {
			sum += ((double) i / (i + 2));
		}
		//ispis
		System.out.printf("Suma serije 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 ..... + 95/97 + 97/99 iznosi %.2f.", sum);
	}

}
