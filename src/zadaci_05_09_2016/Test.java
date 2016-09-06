package zadaci_05_09_2016;

public class Test {

	public static void main(String[] args) {
		/**ZADATAK 4*/
		System.out.println("Zadatak 4\n\n");
		//prvi broj
		Complex c1=new Complex(3.5, 5.5);
		//drugi broj
		Complex c2=new Complex(-3.5, 1);
		//poziv operacija i ispis
		System.out.println(c1 + " + " + c2 + " = " + c1.add(c2));
		System.out.println(c1 + " - " + c2 + " = " + Complex.subtract(c1, c2));
		System.out.println(c1 + " * " + c2 + " = " + c1.multiply(c2));
		System.out.println(c1 + " + " + c2 + " = " + c1.divide(c2));
		System.out.println("|" + c1 + "| = " + c1.abs());
		
		/**ZADATAK 5*/
		System.out.println("\n\nZadatak 4\n\n");
		System.out.println("The fraction number for num: " + 3.25 + " je " +new Rational(3.25) );
}
}