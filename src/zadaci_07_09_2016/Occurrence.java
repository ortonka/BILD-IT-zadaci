package zadaci_07_09_2016;

public class Occurrence {
	// method returns occurrence of char c in String s
	public static int count(String str, char a) {
		if (str.length() == 0)
			return 0;
		else if (str.charAt(0) == a)
			return 1 + count(str.substring(1, str.length()), a);
		else
			return count(str.substring(1, str.length()), a);
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// user input
		System.out.print("Unesite string: ");
		String s = input.nextLine();
		System.out.print("Unesite karakter ciju frekvenciju u stringu zelite provjeriti: ");
		char a = input.next().charAt(0);
		// method call and output
		System.out.println("Frekvencija karaktera '" + a + "' u stringu \"" + s + "\" je : " + count(s, a));
		input.close();
	}

}
