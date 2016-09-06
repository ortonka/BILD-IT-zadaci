package zadaci_05_09_2016;

public class Calculator {

	public static void main(String[] args) {
		String operand1, operand2, operator;
		if (args.length == 0) {

			java.util.Scanner input = new java.util.Scanner(System.in);

			System.out.println("Unesite operanta, operaciju i drugog operanta.");

			operand1 = input.next();
			operator = input.next();
			operand2 = input.next();

			input.close();
		} else {
			if (args.length != 3) {
				System.out.println("Pogresan poziv ! Unesite java Calculator operant operacija operant");
				System.exit(0);
			}

			operand1 = args[0];
			operator = args[1];
			operand2 = args[2];
		}
		// Creating rational objects to perform operations
		Rational r = null;
		Rational r2 = null;

		String[] rArray1 = operand1.split("/");
		String[] rArray2 = operand2.split("/");

		if (rArray1.length == 1)
			r = new Rational(Long.parseLong(rArray1[0]), 1);
		else
			r = new Rational(Long.parseLong(rArray1[0]), Long.parseLong(rArray1[1]));

		if (rArray2.length == 1)
			r2 = new Rational(Long.parseLong(rArray1[0]), 1);
		else
			r2 = new Rational(Long.parseLong(rArray2[0]), Long.parseLong(rArray2[1]));

		if (operator.equalsIgnoreCase("+")) {
			System.out.println(r + " + " + r2 + " = " + r.add(r2));
		} else if (operator.equalsIgnoreCase("-")) {
			System.out.println(r + " - " + r2 + " = " + r.subtract(r2));
		} else if (operator.equalsIgnoreCase("/")) {
			System.out.println(r + " / " + r2 + " = " + r.divide(r2));
		} else if (operator.equalsIgnoreCase("*")) {
			System.out.println(r + " * " + r2 + " = " + r.multiply(r2));
		}

	}
}
