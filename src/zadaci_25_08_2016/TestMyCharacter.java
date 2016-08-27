package zadaci_25_08_2016;

public class TestMyCharacter {

	public static void main(String[] args) {
		//instance klase MyCharacter
		MyCharacter c1 = new MyCharacter('z');
		MyCharacter c2 = new MyCharacter('a');
		//poziv metoda
		System.out.println(c2.compareTo(c1));
		

	}

}
