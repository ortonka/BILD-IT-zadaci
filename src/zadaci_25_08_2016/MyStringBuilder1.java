package zadaci_25_08_2016;

public class MyStringBuilder1 {

	String s;

	// ctor with String arg
	public MyStringBuilder1(String s) {
		this.s = s;
	}

	// returns MyStringBuilder1 as 2 merged Strings
	public MyStringBuilder1 append(MyStringBuilder1 s) {
		return new MyStringBuilder1(this.s += s.s);
	}

	// returns MyStringBuilder1 with number i added to String
	public MyStringBuilder1 append(int i) {
		return new MyStringBuilder1(this.s += i);
	}

	// return length of MyStringBuilder1 object
	public int length() {
		return this.s.length();
	}

	// returns char at selected index
	public char charAt(int index) {
		if (index > this.length() || index < 0)
			throw new IndexOutOfBoundsException("Nevalidan unos indeksa");
		return this.s.charAt(index);
	}

	// returns MyStringBuilder1 in lower case
	public MyStringBuilder1 toLowerCase() {
		return new MyStringBuilder1(this.s.toLowerCase());
	}

	/*
	 * Returns a MyStringBuilder1 that is a substring of this MyStringBuilder1.
	 * The substring begins at the specified beginIndex and extends to the
	 * character at index endIndex - 1. Thus the length of the substring is
	 * endIndex-beginIndex.
	 */
	public MyStringBuilder1 substring(int begin, int end) {
		String s = "";
		for (int i = begin; i <= end; i++) {
			s += this.s.charAt(i);
		}
		return new MyStringBuilder1(s);
	}

	// returns String
	public String toString() {
		return this.s;
	}

}
