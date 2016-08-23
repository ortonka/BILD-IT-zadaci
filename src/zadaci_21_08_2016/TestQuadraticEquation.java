package zadaci_21_08_2016;

public class TestQuadraticEquation {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Unesite parametre a, b i c jednacine ax^2+bx+c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();

		// kreiranje instance klase sa parametrima dobivenim od korisnika
		QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
		// ispis korijena
		System.out.println(quadraticEquation);

		input.close();

	}

}
