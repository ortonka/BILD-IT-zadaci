package zadaci_25_08_2016;

public class MyCharacter implements Comparable<MyCharacter> {
	
	public static final char MIN_VALUE = '\u0000';
	public static final char MAX_VALUE = '\uFFFF';

	char karakter;

	// konstruktor koji prima korisnicki karakter
	public MyCharacter(char karakter) {
		this.karakter = karakter;
	}

	// metoda pretvara karakter u malo slovo
	public MyCharacter toLowerCase() {
		String str = this.karakter + "";
		char ch = str.toLowerCase().charAt(0);
		return new MyCharacter(ch);
	}

	// metoda pretvara karakter u veliko slovo
	public MyCharacter toUpperCase() {
		String str = this.karakter + "";
		char ch = str.toUpperCase().charAt(0);
		return new MyCharacter(ch);
	}

	// metoda za prebacivanje znaka u integer
	public static int toInt(char karakter) {
		return Integer.parseInt(karakter + "");
	}

	// print karaktera
	public String toString() {
		return this.karakter + "";
	}

	// the value 0 if the argument MyCharacter is equal to this MyCharacter; a
	// value
	// less than 0 if this MyCharacter is numerically less than the MyCharacter
	// argument; and a value greater than 0 if this MyCharacter is numerically
	// greater than the MyCharacter argument
	@Override
	public int compareTo(MyCharacter c) {
		return (c.karakter - this.karakter);
	}

}
