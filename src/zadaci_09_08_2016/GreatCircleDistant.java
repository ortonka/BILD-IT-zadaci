package zadaci_09_08_2016;

import java.util.InputMismatchException;

/*
 * Great circle distance predstavlja udaljenost izmedju dvije tacke na povrsini sfere. 
 * Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku sirinu i duzinu dvije tacke. 
 * Great circle distance izmedju ove dvije tacke moze biti izracunata koristeci se sljedecom 
 * formulom: d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
 * Napisati program koji pita korisnika da unese geografsku sirinu i duzinu u stepenima dvije 
 * tacke na povrsini zemlje te mu ispisuje great circle distance. Prosjecni radius zemlje je 
 * 6.371.01 km. Stepene koje korisnik unese trebamo promijeniti u radianse koristeci se 
 * Math.toRadians metodom jer Java trigonometrijske metode koriste radianse. Sirina i duzina u 
 * ovoj formuli se odnose na zapad i sjever. Koristimo negativne vrijednosti da oznacimo istok i 
 * jug. 
 * 
 * @author ortonka
 */
public class GreatCircleDistant {
	
	public static final double RADIUS=6371.007;
	
	static java.util.Scanner input=new java.util.Scanner(System.in);

	public static void main(String[] args) {
		//ispis
		System.out.print("Unesite geografsku sirinu prve tacke: ");
		double x1=Math.toRadians(checkInput());	//latitude prve tacke u rad
		System.out.print("Unesite geografsku duzinu prve tacke: ");
		double y1=Math.toRadians(checkInput());	//longitude prve tacke u rad
		System.out.print("Unesite geografsku sirinu druge tacke: ");
		double x2=Math.toRadians(checkInput());	//latitude druge tacke u rad
		System.out.print("Unesite geografsku duzinu druge tacke: ");
		double y2=Math.toRadians(checkInput());	//longitude druge tacke u rad
		//racunanje udaljenosti prema dobivenoj formuli
		double gcd=(RADIUS * Math.acos (Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		//ispis
		System.out.printf("Udaljenost izmedju dvije tacke iznosi %.2f km", gcd);
		
		
	}
	
	
	//provjera unosa
		public static double checkInput(){
			
			boolean error = true; // varijabla za provjeru
			double num=0;
			do {
				try {
					num = input.nextDouble();
					error = false;
				} catch (InputMismatchException e) {
					System.out.print("Nevalidan unos, pokusajte ponovo: ");
					input.nextLine();
				}
			} while (error);
			return num;
		}

}
