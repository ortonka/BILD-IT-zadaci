package zadaci_05_09_2016;

public class Calculator {

	public static void main(String[] args) {
		//kreiraj stringove za operatore
		String operand1, operand2, operator;
		
		//ukoliko nisu uneseni argumenti sa komandne linije, trazi unos iz konzole
		if (args.length == 0) {

			java.util.Scanner input = new java.util.Scanner(System.in);

			System.out.println("Unesite operanta, operaciju i drugog operanta.");

			operand1 = input.next();
			checkFormat(operand1);
			operator = input.next();
			checkOperator(operator);
			operand2 = input.next();
			checkFormat(operand2);

			input.close();
		} else {
			//ukoliko nisu unesena 3 stringa, prekini izvodjenje programa
			if (args.length != 3) {
				System.out.println("Pogresan poziv ! Unesite java Calculator operant operacija operant");
				System.exit(0);
			}
			//unos sa komandne linije
			operand1 = args[0];
			operator = args[1];
			operand2 = args[2];
			checkFormat(operand1);
			checkOperator(operator);
			checkFormat(operand2);
		}
		
		//kreiranje razlomaka
		Rational r = null;
		Rational r2 = null;
		
		//razdvajanje brojnika i nazivnika razlomaka
		String[] rArray1 = operand1.split("/");
		String[] rArray2 = operand2.split("/");
		
		//provjerava je li unesen cijeli broj ili razlomak
		if (rArray1.length == 1)
			r = new Rational(Long.parseLong(rArray1[0]), 1);
		else
			r = new Rational(Long.parseLong(rArray1[0]), Long.parseLong(rArray1[1]));
		
		//provjerava je li unesen cijeli broj ili razlomak
		if (rArray2.length == 1)
			r2 = new Rational(Long.parseLong(rArray2[0]), 1);
		else
			r2 = new Rational(Long.parseLong(rArray2[0]), Long.parseLong(rArray2[1]));
		
		//provjerava operator i izvrsava operaciju na osnovu operatora
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
	//provjerava da li su brojevi validno uneseni (prihvata razlomke i cijele brojeve)
	public static void checkFormat(String s) {
		if (s.matches("\\d/\\d|\\d")){
			return;
		}
		System.out.println("Pogresan unos/poziv. Koristite format: operant operacija operant");
		System.exit(0);
	}
	//provjerava da li je operator validno unesen
	public static void checkOperator(String s){
		if(s.matches("[+-/*]")){
			return;
	}
		System.out.println("Pogresan unos/poziv. Koristite format: operant operacija operant");
		System.exit(0);
	}
}
