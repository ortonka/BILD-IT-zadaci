package zadaci_15_08_2016;

/*
 *  Napisati program koji nasumicno generiše cijeli broj izmedju 1 i 12 te ispisuje ime mjeseca 
 *  za taj broj. (Januar za 1, Ferbruar za 2....)
 *  
 *  @author ortonka
 */

public class RandomMonth {

	public static void main(String[] args) {
		//niz stringova koji su imena mjeseci
		String[] monthsName = { "Januar", "Februar", "Mart", "April", "Maj", "Juni", "Juli", "August", "Septembar",
				"Oktobar", "Novembar", "Decembar" };
		//num je nasumicni broj od 1 - 12
		int num = (int) (Math.random() * 12) + 1;
		//ispis naziva mjeseca za nasumicni broj
		System.out.println(monthsName[num - 1]);

	}

}
