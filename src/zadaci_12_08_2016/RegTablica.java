package zadaci_12_08_2016;

/*
 *  Pretpostavimo da se registarska tablica za auto sastoji od tri uppercase karaktera i 4 
 *  broja u sljedecem formatu AAA-1234. Napisati program koji nasumicno generise tablicu.
 *  
 *  @author ortonka
 */

public class RegTablica {

	public static void main(String[] args) {
		//ispis tablice
		System.out.println("Nasumicno generisana tablica: "+getLicensePlate());

	}
//metod koji vraca String koji je ustvari registarska tablica
	public static String getLicensePlate() {
		//koristeci Math.random, dobiju se nasumicni brojevi koje pretvorimo u karaktere
		return "" + (char) (Math.random() * 26 + 'A') + (char) (Math.random() * 26 + 65)
				+ (char) (Math.random() * 26 + 65) + "-" + (int) (Math.random() * 10) + (int) (Math.random() * 10)
				+ (int) (Math.random() * 10)+ (int) (Math.random() * 10);
	}

}
