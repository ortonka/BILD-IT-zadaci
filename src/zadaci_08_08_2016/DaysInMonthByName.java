package zadaci_08_08_2016;

import java.util.Calendar;

/*
 * Napisati program koji pita korisnika da unese godinu i prva tri slova imena mjeseca 
 * (prvo slovo uppercase) te mu ispiše broj dana u tom mjesecu. Na primjer, ukoliko korisnik 
 * kao godinu unese 2001 a kao mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.
 * 
 * @author ortonka
 */

public class DaysInMonthByName {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) {
		int month=checkMonth();
		
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
		printNumOfDays(month, year);
		

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
//ispis broja dana u mjesecu
	public static void printNumOfDays(int month, int year) {

		//niz imena mjeseci
		String[] monthsName = { "Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul", "Aug", "Sep",
				"Okt", "Nov", "Dec" };
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
	//provjeri unos
	public static int checkMonth(){
		String[] months={"Jan", "Feb", "Mar", "Apr", "Maj", "Jun", "Jul","Aug", "Sep", "Okt", "Nov", "Dec"};
		//unos mjeseca sa provjerom unosa
		boolean error = true;
				String month ="";
				do {
					System.out.print("Unesite ime mjeseca,(Prva 3 slova, s tim da je prvo slovo veliko): ");
					while (!input.hasNext()) { 
						System.out.print("Unesite mjesec,(Prva 3 slova, s tim da je prvo slovo veliko): ");
						input.next();
					}
					month = input.next();
					for(int i=0; i<months.length; i++){
						if(month.equals(months[i]))
							return i;
					}
					error = true;
				} while (error);
				return -1;
		
	}


}
