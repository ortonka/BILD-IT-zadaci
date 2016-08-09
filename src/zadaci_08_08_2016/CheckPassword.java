package zadaci_08_08_2016;

public class CheckPassword {

	/*
	 * Neke web stranice forsiraju odredjena pravila za passworde. Napisati
	 * metodu koja provjerava da li je unijeti string validan password. Pravila
	 * da bi password bio validan su sljedeca: 1. Password mora biti sacinjen od
	 * najmanje 8 karaktera. 2. Password smije da se sastoji samo od slova i
	 * brojeva. 3. Password mora sadrzati najmanje 2 broja. Napisati program
	 * koji pita korisnika da unese password te mu ispisuje
	 * "password je validan" ukoliko su sva pravila ispostovana ili
	 * "password nije validan" ukoliko pravila nisu ispostovana.
	 * 
	 * @author ortonka
	 */

	static final int MIN_NUM_OF_CHARS=8;
	
	public static void main(String[] args) {
		java.util.Scanner input=new java.util.Scanner(System.in);
		//ispis
		System.out.print("Unesite password: ");
		//Unos passworda
		String pw=input.next();
		
		//krajnji ispis
		if(isValid(pw))
			System.out.println("Password je validan.");
		else
			System.out.println("Password nije validan.");
		
		input.close();
	}
//metoda koja vraca da li je pw validan
	public static boolean isValid(String pass) {
		//ako je duzina pw manja od 8 karaktera, pw nije validan
		if (pass.length() < MIN_NUM_OF_CHARS)
			return false;
		int count = 0;
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isDigit(pass.charAt(i)))
				count++;
			//ako neki od karaktera nije slovo ili broj, pw nije validan
			if (!Character.isLetterOrDigit(pass.charAt(i)))
				return false;
		}
		//ako pw ima manje od 2 broja, pw nije validan
		if (count < 3)
			return false;

		return true;
	}

}
