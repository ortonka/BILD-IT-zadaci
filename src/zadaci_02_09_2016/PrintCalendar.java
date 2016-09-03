package zadaci_02_09_2016;

public class PrintCalendar {

	// kreiranje skenera
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) throws Exception {
		/*
		 * You can run the program without the year. In this case, the year is
		 * the current year. If you run the program without specifying a month
		 * and a year, the month is the current month.
		 */
		int month = 0, year = 0;
		
		java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();
		
		if (args.length == 0) {
			
			month = calendar.get(java.util.Calendar.MONTH);
			year = calendar.get(java.util.Calendar.YEAR);
		} else if (args.length == 1) {
			
			month = (Integer.parseInt(args[0])) - 1;
			year = calendar.get(java.util.Calendar.YEAR);
		} else {
			try {

				month = (Integer.parseInt(args[0])) - 1; // unos mjeseca
				year = Integer.parseInt(args[1]); // unos godine
			} catch (Exception e) {
				System.err.println("Nevalidan poziv !");
			}
		}

		showCalendar(month, year); // prikaz kalendara za uneseni mjesec i
									// godinu
	}

	// metoda za prikaz kalendara
	public static void showCalendar(int month, int year) {
		// kreiramo instanacu kalendara
		java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();

		calendar.set(java.util.Calendar.MONTH, month); // postavljanje godine i
														// mjeseca
		calendar.set(java.util.Calendar.YEAR, year); // na proslijedjene
														// vrijednosti
		calendar.set(java.util.Calendar.DATE, 1);
		// nazivi mjeseci
		String[] monthsName = { "JANUAR", "FEBRUAR", "MART", "APRIL", "MAJ", "JUNI", "JULI", "AUGUST", "SEPTEMBAR",
				"OKTOBAR", "NOVEMBAR", "DECEMBAR" };
		// ispis
		System.out.printf("%13s, %d\n", monthsName[month], year);
		System.out.println("----------------------------");
		System.out.println(" NED PON UTO SRI CET PET SUB");

		// redni broj dana kojim pocinje mjesec
		int counter = calendar.get(java.util.Calendar.DAY_OF_WEEK) - 1;

		for (int i = 0; i < counter; i++) {
			System.out.print("    ");
		}

		for (int i = 1; i <= numOfDaysInMonth(month, year); i++) {
			// ako su ispisani dani jedne sedmice, predji u novi red
			if (counter % 7 == 0) {
				System.out.println();
			}

			System.out.printf("  %2d", i); // ispis dana
			counter++; // inkrementiraj brojac
		}
		System.out.println();
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

}
