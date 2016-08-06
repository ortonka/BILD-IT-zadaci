package zadaci_05_08_2016;

/*
 * Napisati metodu koja broji slova u stringu. Metoda treba koristiti sljedeci header: 
 * public static int countLetters(String s). 
 * Napisati program koji pita korisnika da unese neki string te mu vrati koliko taj string 
 * ima slova.
 * 
 * @author ortonka
 */

public class CountLettersInString {
	
public static void main(String[] args) {
		
		java.util.Scanner in=new java.util.Scanner(System.in);
		//ispis
		System.out.print("Molim unesite string: ");
		//unos u string
		String s=in.nextLine();
		//ispis
		System.out.println("Broj slova u stringu \"" + s + "\" je: " + countLetter(s));
		in.close();

	}
	
	public static int countLetter(String s){
		int count=0;	//pocetna vrijednost brojaca je nula
		//prodji kroz string i provjeri da li je karakter slovo
		for(int i=0; i<s.length(); i++){
			if(Character.isLetter(s.charAt(i)))
				count++;	//ako je karakter slovo, inkrementiraj brojac
		}
			
		
		return count;
	}

	

}
