package zadaci_08_08_2016;

import java.util.Calendar;

/*
 * Napisati program koji pita korisnika da unese mjesec i godinu te mu ispise broj dana u 
 * datom mjesecu. Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, program 
 * treba ispisati da je Februar 2012 imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a 
 * kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan.  * 
 */

public class DaysInMonth {

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		//unos mjeseca sa provjerom unosa
		int month = 0;
		do {
			System.out.print("Unesite mjesec(broj od 1 do 12): ");
			while (!input.hasNextInt()) { // sve dok unos nije int
				System.out.print("Unesite mjesec(broj od 1 do 12): ");
				input.next();
			}
			month = input.nextInt();
		} while (month <= 0 || month > 12);
		//unos godine sa provjerom unosa
		int year = 0;
		do {
			System.out.print("Unesite godinu: ");
			while (!input.hasNextInt()) { // sve dok unos nije int
				System.out.println("Unesite godinu: ");
				input.next();
			}
			year = input.nextInt();
		} while (year <= 0);
		
		//ispis
		printNumOfDays(month-1, year);
		

		input.close();

	}

	// metod koji vraca broj dana u mjesecu
	public static int numOfDaysInMonth(int month, int year) {
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// ako je godina prestupna i mjesec je februar, vrati 29
		// za ostale vrati broj dana odredjen nizom int[] daysInMonth
		if (isLeapYear(year) && month == 1)
			return 29;
		else
			return daysInMonth[month];
	}

	// metod koji provjerava da li je godina prijestupna
	public static boolean isLeapYear(int year) {

		if ((year >= 1582) && (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)))
			return true;
		else if (year >= 8 && year < 1582 && year % 4 == 0)
			return true;
		else if (year > -45 && year <= -9 && year % 3 == 0)
			return true;
		return false;
	}

	public static void printNumOfDays(int month, int year) {

		//niz imena mjeseci
		String[] monthsName = { "Januar", "Februar", "Mart", "April", "Maj", "Juni", "Juli", "August", "Septembar",
				"Oktobar", "Novembar", "Decembar" };
		//niz stringova koji ce se koristiti pri ispisu
		String[] has = { "je imao", "ima", "ce imati" };
		//broj dana u mjesecu, rezultat dobijen od metoda numOfDaysInMonth
		int numOfDays = numOfDaysInMonth(month, year);
		//ispis u zavisnosti je li mjesec iz proslosti ili je trenutni mjesec ili je u buducnosti
		if (Calendar.getInstance().get(Calendar.MONTH) > month && Calendar.getInstance().get(Calendar.YEAR)>=year)
			System.out.printf("%s %d. %s %d %s.", monthsName[month], year, has[0], numOfDays, day(numOfDays));
		else if (Calendar.getInstance().get(Calendar.MONTH) == month && Calendar.getInstance().get(Calendar.YEAR)==year )
			System.out.printf("%s %d. %s %d %s.", monthsName[month], year, has[1], numOfDays, day(numOfDays));
		else
			System.out.printf("%s %d. %s %d %s.", monthsName[month], year, has[2], numOfDays, day(numOfDays));
	}
	//vraca string koji ce se koristiti pri ispisu
	public static String day(int days) {
		if (days == 31)
			return "dan";
		else
			return "dana";

	}

}
