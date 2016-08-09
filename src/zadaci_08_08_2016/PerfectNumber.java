package zadaci_08_08_2016;

/*
 *  Pozitivni cijeli broj je savrsen broj ukoliko je jednak zbiru svih svojih pozitivnih 
 *  djelilaca, iskljucujuci sebe. Na primjer, 6 je prvi savrseni broj jer 6 = 3 + 2 + 1. 
 *  Sljedeci savrseni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. Samo 4 savrsena broja postoje 
 *  u rasponu od 0 do 10.000. Napisite program koji ispisuje sva 4.
 *  
 *  @author ortonka
 */

public class PerfectNumber {

	public static void main(String[] args) {
		//ispis
		System.out.println("Savrseni brojevi u rasponu 0-1000 su: ");
		//vanjska petlja koja ide od 1 do 10000
		for (int i = 1; i < 10000; i++) {
			int n = 0;	//suma djelilaca nekog broja	
			//unutrasnja petlja u kojoj sabiremo sve djelioce svakog broja 
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					n += j;
			}
			//ukoliko je broj jednak zbiru njegovih djelilaca, ispisi ga
			if (n == i)
				System.out.println(i);
		}
	}

}
