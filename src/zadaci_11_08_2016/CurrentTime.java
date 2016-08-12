package zadaci_11_08_2016;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
 * Ako pozovemo metodu System.currentTimeMillis() dobijemo broj milisekundi od 1. januara 1970 
 * do trenutka pozivanja metode. Napisati program koji ispisuje trenutacni datum i vrijeme u 
 * formatu "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
 * 
 * @author ortonka
 */

public class CurrentTime {

	public static void main(String[] args) {
		//postavi srpski jezik kao default
		Locale locale = new Locale.Builder().setLanguage("sr").setRegion("BA").setScript("Latn").build();
		Locale.setDefault(locale);
		//broj milisekundi koje vrati metod System.currentTimeMillis()
		long milliseconds = System.currentTimeMillis();
		//kreiraj format za ispis vremena i datuma
		SimpleDateFormat sdf = new SimpleDateFormat( "dd. MMMM, yyyy HH:mm:ss");    
		//kreiraj instancu klase Date na osnovu broja milisekundi 
		Date resultdate = new Date(milliseconds);
		//ispisi prema kreiranom formatu za ispis
		System.out.println("Trenutni datum i vrijeme: " + sdf.format(resultdate));
		
		
		
	}

}
