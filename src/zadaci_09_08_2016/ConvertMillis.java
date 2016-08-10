package zadaci_09_08_2016;

/*
 *  Napisati metodu koja pretavara milisekunde u sate, minute i sekunde. Metoda treba da koristi 
 *  sljedeci header: 
 *  public static String convertMillis(long millis). 
 *  Metoda treba da vraca vrijeme kao string u formatu sati:minute:sekunde.  
 *  Na primjer convertMillis(100000) treba da vrati 0:1:40.
 *  
 *  @author ortonka
 */

public class ConvertMillis {

	public static void main(String[] args) {
		
		System.out.println(convertMillis(100000));
	}
	
	public static String convertMillis(long millis){
		long sec = millis / 1000; 	//pretvaranje milisekundi u sekunde
		long min = sec / 60;		//pretvaranje sekundi u minute
		long hours = min / 60;		//pretvaranje minuta u sate
		min = min % 60;				//preostali broj minuta
		sec = sec % 60;				//preostali broj sekundi
		
		return (hours + ":" + min +":" + sec);
	}

}
