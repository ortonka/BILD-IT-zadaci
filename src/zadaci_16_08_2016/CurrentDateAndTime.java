package zadaci_16_08_2016;

import java.text.SimpleDateFormat;

/*
 * Napisati metodu koja vraca datum i trenutacno vrijeme.
 * 
 * @author ortonka
 */
public class CurrentDateAndTime {

	public static void main(String[] args) {
		//ispis
		System.out.println(currentTimeAndDate());
	}

	public static String currentTimeAndDate() {
		// kreiraj instancu klase Date na osnovu broja milisekundi
		java.util.Date datum = new java.util.Date(System.currentTimeMillis());
		// kreiraj format za ispis vremena i datuma
		SimpleDateFormat sdf = new SimpleDateFormat("dd. MMMM, yyyy HH:mm:ss");
		//vrati string u formatu sdf
		return sdf.format(datum);
	}

}
