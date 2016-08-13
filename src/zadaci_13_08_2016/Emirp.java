package zadaci_13_08_2016;

/*
 * Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti broj i kada ispišemo 
 * naopako. Na primjer, broj 17 i broj 71 su prosti brojevi tako da su brojevi i 17 i 71 emirp 
 * brojevi. Napisati program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji. 
 * 
 * @author ortonka
 */

public class Emirp {
	
	public static final int NUM_PER_LINE=10;
	public static final int TOTAL=100;

	public static void main(String[] args) {
		//brojac koji ce ici do 100
				int count = 0;
				//prolazi kroz brojeve
				int i = 2;
				//sve dok je brojac manji od trazenog broja brojeva
				while (count < TOTAL) {
					//ako je broj prost i ako je reverse datog broja prost broj 
					if (isPrime(reverse(i)) && isPrime(i) && reverse(i)!=i) {
						//ispisi ga
						System.out.printf("%5d ", i);
						//inkrementiraj brojac
						count++;
						//ako je ispisano 10 brojeva, predji u novi red
						if (count % NUM_PER_LINE == 0) {
							System.out.println();
						}
					}
					//provjeri naredni broj
					i++;
				}
	}
	
	// vraca broj naopako
		public static int reverse(int number) {
			int reverse = 0;
			while (number != 0) {
				reverse = reverse * 10;
				reverse = reverse + number % 10;
				number = number / 10;
			}
			return reverse;

		}
		
		// metoda za provjeru prostog broja
		public static boolean isPrime(int num) {
			int sqr_root = (int) Math.sqrt(num);
			for (int i = 2; i <= sqr_root; i++) {
				if (num % i == 0) {
					return false;
				}
			}
			return true;
		}


}
