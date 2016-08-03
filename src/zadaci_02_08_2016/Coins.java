package zadaci_02_08_2016;

/*
 * Napisati metodu koja prima jedan argument te simulira bacanje novcica toliko puta.
 * Nakon sto se simulacija zavrsi, program ispisuje koliko puta je novcic pokazao glavu,
 * a koliko puta pismo.
 * 
 * @author ortonka
 */

public class Coins {

	public static void main(String[] args) {
		
		coins(100);
	}
	
	//metod koji simulira bacanje novcica n puta, n prima kao argument
	public static void coins(int n) {

		int head = 0; //varijabla koja simulira broj padanja na glavu
		int coin; 

		//petljom odradi simulaciju broja bacanja
		for (int i = 0; i < n; i++) {
			coin = (int) (Math.random() * 2);
			
			if (coin == 0)
				head++;
		}
		//spis
		System.out.println("Novcic je " + head + " puta pao na pismo, a " + (n-head) + " puta na glavu.");
	}

}
