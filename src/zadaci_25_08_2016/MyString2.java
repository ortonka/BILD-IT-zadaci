package zadaci_25_08_2016;

public class MyString2 implements Comparable<String> {

	private String s;

	// ctor with String arg
	public MyString2(String s) {
		if (s == null) {
			throw new IllegalArgumentException();
		}
		this.s = s;
	}

	// Returns -1 if the current object comes lexicographically before s.
	// Returns 0 if the current object equals s.
	// Returns 1 if the current object comes lexicographically after s.
	@Override
	public int compareTo(String s) {
		return this.s.compareTo(s);
	}

	// Returns a string that is a substring of this string. The substring begins
	// with the character at the specified index and extends to the end of this
	// string.
	public MyString2 substring(int begin) {
		MyString2 result = new MyString2("");
		result.s = this.s.substring(begin);
		return result;
	}

	// Converts all of the characters in this String to upper
	public MyString2 toUpperCase() {
		MyString2 result = new MyString2("");
		result.s = this.s.toUpperCase();
		return result;
	}

	// Converts this string to a new character array.
	public char[] toChars() {
		return this.s.toCharArray();
	}

	// Returns the string representation of the boolean argument.
	public static MyString2 valueOf(boolean b) {
		MyString2 result = new MyString2("");
		;
		if (b)
			result.s = "true";
		else
			result.s = "false";
		return result;

	}

	public String toString() {
		return this.s;
	}

}
