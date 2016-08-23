package zadaci_21_08_2016;

public class InterSectingPoint {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try{
			System.out.println("Unesite x1, y1: ");
			int x1 = input.nextInt();
			int y1 = input.nextInt();
			System.out.println("Unesite x2, y2: ");
			int x2 = input.nextInt();
			int y2 = input.nextInt();
			System.out.println("Unesite x3, y3: ");
			int x3 = input.nextInt();
			int y3 = input.nextInt();
			System.out.println("Unesite x4, y4: ");
			int x4 = input.nextInt();
			int y4 = input.nextInt();

			double a = y1 - y2;
			double b = x2 - x1;
			double c = y3 - y4;
			double d = x4 - x3;
			double e = (y1 - y2) * x1 - ((x1 - x2) * y1);
			double f = (y3 - y4) * x3 - ((x3 - x4) * y3);
			
			// kreiranje objekta i pozivanje klase

			LinuarEquation jednacina = new LinuarEquation(a, b, c, d, e, f);
			// ako se jednacina može riješiti, ispisuje rezultat
			if (jednacina.isSolvable()) {
				System.out.println("Presjecna tacka je: "+jednacina);
			} else {
				// ako ne može, ispisuje da su paralelne
				System.out.println("Linije su paralelne!");
			}
			
		} catch (Exception e) {
			System.err.println("Greška! Pokusaj ponovo.");
		}
input.close();
	}

}
