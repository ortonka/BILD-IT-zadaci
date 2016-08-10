package zadaci_10_08_2016;

/*
 *  Napisati metodu koja pronalazi broj ponavljanja odredjenog karaktera u stringu. 
 *  Metoda treba da koristi sljedeci header: 
 *  public static int count(String str, char a).
 *  Na primjer, ukoliko pozovemo metodu na sljedeci nacin: count("Welcome", e) metoda treba da 
 *  vrati 2. Napisati program koji pita korisnika da unese string i koji karakter zeli da 
 *  prebroji u datom stringu te mu ispise koliko se puta odredjeni karakter ponovio u zadatom 
 *  stringu.
 *  
 *  @author ortonka
 */

public class CountInString {

	public static void main(String[] args) {
		java.util.Scanner in=new java.util.Scanner(System.in);
		//ispis
		System.out.print("Molim unesite string: ");
		String s=in.nextLine();	//string za provjeru
		System.out.print("Unesite koji karakter zelite prebrojati u unesenom stringu: ");
		//unos karaktera sa ulaza
		char a=(in.next()).charAt(0);
		//ispis
		System.out.printf("Broj slova \"%c\" u stringu \"%s\" je %d.",a,s, count(s,a));
		in.close();


	}
	//metoda koja broji broj karaktera 'a' u stringu str
	public static int count(String str, char a) {
		int num = 0;	//broj karaktera
		for (int i = 0; i < str.length(); i++) {
			//ako je karakter u stringu jednak trazenom karakteru, inkrementiraj brojac
			if (str.charAt(i)==a)
				num++;
		}

		return num;
	}

}
