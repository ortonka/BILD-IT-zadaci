package zadaci_21_08_2016;

public class TestLinearEquation {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		double[] param = new double[6];
		for (int i = 0; i < 6; i++) {
			System.out.printf("Unesite %d parametar: ", i + 1);
			param[i] = input.nextDouble();
		}

		// kreiranje instanci klase LinearEquation
		LinuarEquation jednacina1 = new LinuarEquation(param[0], param[1], param[2], param[3], param[4], param[5]);

		// ispis

		System.out.println(jednacina1);

		input.close();
	}

}
