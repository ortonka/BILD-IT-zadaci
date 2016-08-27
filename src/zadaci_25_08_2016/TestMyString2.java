package zadaci_25_08_2016;

public class TestMyString2 {

	public static void main(String[] args) {
		String str = "jasmina";
		// instanca klase
		MyString2 s = new MyString2(str);
		// poziv metoda implementiranih u klasi
		System.out.println(s.toUpperCase());
		System.out.println(str.compareTo(str));
		System.out.println(MyString2.valueOf(true));
		System.out.println(s.substring(3));
	}

}
