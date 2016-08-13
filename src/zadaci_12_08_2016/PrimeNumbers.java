package zadaci_12_08_2016;
/*
 *  Napisati metodu sa sljedecim headerom: 
 *  public static int isPrime(int n)
 *   koja provjerava da li je broj prost/prime. Napisati test program koji poziva ovu metodu i 
 *   ispisuje sve proste brojeve u rasponu od 0 do 100000.
 *   
 *    @author ortonka
 */
public class PrimeNumbers {


	public static final int START_NUM = 0;
	public static final int END_NUM = 100000;
	public static final int NUM_PER_LINE = 10;

	public static void main(String[] args) {
		int count = 0; // brojac
		// ispis
		System.out.println("Prosti brojevi u intervalu 0 - 100 000 su: ");
		
		for (int i = START_NUM; i <= END_NUM; i++) {
			// ako je broj prost
			if (isPrime(i)!=-1) {
				System.out.printf("%4d ", i);	//ispis broja
				count++;
			}

			// ispis, 10 po liniji
			if (count == NUM_PER_LINE) {
				System.out.println();
				count = 0;
			}
		}
	}

	// metoda za provjeru prostog broja
	public static int isPrime(int num) {
		if(num==0 || num==1)return -1;
		int sqr_root = (int) Math.sqrt(num);
		for (int i = 2; i <= sqr_root; i++) {
			if (num % i == 0) {
				return -1;
			}
		}
		return num;
	}


}
