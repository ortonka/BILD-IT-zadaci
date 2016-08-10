package zadaci_09_08_2016;

import java.util.InputMismatchException;

/*
 *  Napišite program koji ucitava neodredjen broj cijelih brojeva (unos prekida nula), pronalazi 
 *  najveci od unijetih brojeva te ispisuje koliko se najveci broj puta ponovio.  Na primjer, 
 *  ukoliko unesemo 3 5 2 5 5 5 0 program ispisuje da je najveci broj 5 te ispisuje da se isti 
 *  ponavlja 4 puta. 
 */

public class MaxNumber {

	static java.util.Scanner input=new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Unesite brojeve, 0 terminira unos: ");
		
		int num = checkInput();		//broj
		int maxNum = num;			//maximalan broj
		int count = 0;				//brojac
		//sve dok je broj razlicit od nule
		while (num != 0) {
			
			//ako je broj jednak maximalnom broju, inkrementiraj brojac
			if (num == maxNum)
				count++;
			//ako je broj veci od max broja, postavi broj kao max broj
			if (num > maxNum) {

				maxNum = num;
				count = 1;	//brojac postavi na 1
			}
			//broj je jednak unosu
			num = checkInput();

		}
		//ispis
		System.out.printf("Najveci broj je %d i pojavljuje se %d puta.", maxNum, count);
		
	}
	
	//provjera unosa
	public static int checkInput(){
		
		boolean error = true; // varijabla za provjeru
		int num=0;
		do {
			try {
				num = input.nextInt();
				error = false;
			} catch (InputMismatchException e) {
				System.out.println("Nevalidan unos, pokusajte ponovo: ");
				input.nextLine();
			}
		} while (error);
		return num;
	}



}
