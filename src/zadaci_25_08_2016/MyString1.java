package zadaci_25_08_2016;

/*
 * The String class is provided in the Java library. 
 * Provide your own implementation for the following methods.
 */

public class MyString1 {

	private char[] charArray;

	// no-arg ctor
	public MyString1() {
		charArray = null;
	}

	// ctor with char[] arg
	public MyString1(char[] chars) {
		charArray = new char[chars.length];
		for (int i = 0; i < chars.length; i++)
			charArray[i] = chars[i];
	}

	// returns char at selected index
	public char charAt(int index) {
		if (index < 0 || index >= charArray.length)
			throw new IndexOutOfBoundsException();
		else
			return charArray[index];
	}

	public int length() {
		return charArray.length;
	}

	/*
	 * Isto ponasanje kao substring metoda kod String klase
	 * 
	 * Returns a string that is a substring of this string. The substring begins
	 * at the specified beginIndex and extends to the character at index
	 * endIndex - 1. Thus the length of the substring is endIndex-beginIndex.
	 */
	public MyString1 substring(int begin, int end) {
		// ako nije ispunjeni uslovi za indekse, throw exception
		if (begin < 0 || end < 0 || begin == charArray.length || end == charArray.length || end < begin)
			throw new IndexOutOfBoundsException();
		else {

			MyString1 result = new MyString1();
			// ako je pocetni indeks, jednak krajenjem, vrati prazan MyString1
			if (begin == end) {
				result.charArray = new char[] {};
				return result;
			}
			// od prvog do zadnjeg, ne ukljucujuci zadnji
			result.charArray = new char[end - begin];

			for (int i = 0; i < (end - begin); i++)
				result.charArray[i] = this.charArray[begin + i];

			return result;
		}
	}

	// vraca sadrzaj MyString1 kao mala slova
	public MyString1 toLowerCase() {
		MyString1 result = new MyString1();
		result.charArray = new char[this.length()];

		for (int i = 0; i < (result.length()); i++)
			result.charArray[i] = Character.toLowerCase(this.charArray[i]);

		return result;
	}

	// provjerava da li je proslijedjeni objekat jednak objektu nad kojim se
	// vrsi poredjenje
	public boolean equals(MyString1 s) {
		// ako se vrši poredjenje istog objekta
		if (s == this)
			return true;
		// ako je jedan null ili oba null
		if (s.charArray == null) {
			return (this.charArray == null) ? true : false;
		}
		if (this.charArray == null) {
			return (s.charArray == null) ? true : false;
		}
		// ako im duzine nisu jednake, vrati false
		if (s.length() != this.length()) {
			return false;
		}
		// provjera jesu li svi karakteri isti
		for (int i = 0; i < (s.length()); i++) {
			if (s.charArray[i] != this.charArray[i]) {
				return false;
			}
		}
		return true;
	}

	// returns the string representation of the int argument.
	public static MyString1 valueOf(int i) {
		MyString1 result = new MyString1();
		int n = i;
		int noOfDigit = 1;
		// pronadji broj cifara broja
		while ((i = i / 10) != 0)
			++noOfDigit;
		// napravi niz sa brojem elemenata kao brojem cifara
		result.charArray = new char[noOfDigit];
		// dodijeli svakom elementu niza cifru
		for (int j = noOfDigit - 1; j >= 0; j--) {
			result.charArray[j] = Character.forDigit((n % 10), 10);
			n /= 10;
		}
		return result;

	}

	// info string za print char[]
	public String toString() {
		String infoString = "";
		if (this.charArray != null)
			for (int i = 0; i < this.length(); i++) {
				infoString += this.charArray[i];
			}
		return infoString;
	}

}
