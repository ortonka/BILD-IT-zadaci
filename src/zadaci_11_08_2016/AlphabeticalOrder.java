package zadaci_11_08_2016;


/*
 *  Napisati program koji pita korisnika da unese imena tri grada te ih ispise u abecednom redu. 
 *  Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, program vraca 
 *  Atlanta, Chicago, Los Angeles.
 *  
 *  @author ortonka
 */

public class AlphabeticalOrder {

	public static void main(String[] args) {
		
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		//Ispis i unos 3 stringa
		System.out.print("Unesite prvi grad: ");
		String city1 = in.nextLine();
		System.out.print("Unesite drugi grad: ");
		String city2 = in.nextLine();
		System.out.print("Unesite treci grad: ");
		String city3 = in.nextLine();
		//varijabla za provjeru
		boolean swapped = false;
		do {
		  swapped = false;	//ako ne udje ni u jednu petlju, redoslijed je vec sortiran
		  //Ako metod compareTo vrati negativnu vrijednost, zamijeni redoslijed
		  if (city2.compareTo(city1) < 0) {
		    String tmp = city2;
		    city2 = city1;
		    city1 = tmp;
		    swapped = true;
		  }
		//Ako metod compareTo vrati negativnu vrijednost, zamijeni redoslijed
		  if (city3.compareTo(city2) < 0) {
		    String tmp = city3;
		    city3 = city2;
		    city2 = tmp;
		    swapped = true;
		  }
		} while (swapped);
		//ispis
		System.out.printf("Sortirani gradovi izgledaju ovako: %s, %s, %s.",city1, city2, city3);
		  
		  in.close();

}
}