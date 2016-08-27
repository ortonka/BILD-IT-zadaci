package zadaci_25_08_2016;

public class TestMyString1 {

	public static void main(String[] args) {
		char[] niz2 = { 'C', 'h', 'e', 'c', 'k' };
		char[] niz3 = { 'C', 'h', 'e', 'c', 'k' };
		char[] niz4 = { 'C', 'H', 'E', 'C', 'K' };
		// null instanca
		MyString1 s = new MyString1();
		// instance sa arg array
		MyString1 s2 = new MyString1(niz2);
		MyString1 s3 = new MyString1(niz3);
		MyString1 s4 = new MyString1(niz4);
		// provjera metoda valueOf(int n) i length()
		MyString1 s5 = MyString1.valueOf(5432);
		System.out.println("Duzina MyString1 instance \"" + s5 + "\" je " + s5.length() + " karaktera.");

		// provjera equals(MyString1 s) metoda
		System.out.println("Provjera da li je instanca \"" + s + "\" jednaka instanci \"" + s3 + "\": " + s.equals(s3));
		System.out
				.println("Provjera da li je instanca \"" + s2 + "\" jednaka instanci \"" + s3 + "\": " + s2.equals(s3));
		System.out
				.println("Provjera da li je instanca \"" + s2 + "\" jednaka instanci \"" + s4 + "\": " + s2.equals(s4));

		// provjera toLowerCase(MyString1 s) metoda:
		System.out.println("Ispis MyString1 objekta \"" + s4 + "\" u lower case verziji \"" + s4.toLowerCase() + "\"");

		// provjera substring metoda
		System.out.println("Ispis substringa MyString1 objekta \"" + s4 + "\" i to na indeksima (2,4) \""
				+ s4.substring(2, 4) + "\"");
		System.out.println("Ispis substringa MyString1 objekta \"" + s4 + "\" i to na indeksima (2,2) \""
				+ s4.substring(2, 2) + "\"");
		
		
	}
	

}
