package MiniProjekat1_Kalendar;

public class Kalendar {
	// kreiranje skenera
	static java.util.Scanner input = new java.util.Scanner(System.in); 

	public static void main(String[] args) throws Exception {

		int month = checkMonth();		//unos mjeseca
		int year = checkYear();			//unos godine

		showCalendar(month - 1, year);		//prikaz kalendara za uneseni mjesec i godinu
		option(month, year);
	}

	// metoda za prikaz kalendara
	public static void showCalendar(int month, int year) {
		// kreiramo instanacu kalendara
		java.util.GregorianCalendar calendar = new java.util.GregorianCalendar();

		calendar.set(java.util.Calendar.MONTH, month); // postavljanje godine i mjeseca
		calendar.set(java.util.Calendar.YEAR, year); // na proslijedjene vrijednosti

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
	
	//metod za prikaz opcija (samo radi ispis)
	public static void showOptions() {
		System.out.println("Odabir opcija: ");
		System.out.println("1: Napravite remainder za odredjeni dan u prikazanom mjesecu");
		System.out.println("2: Pregledajte postojece remaindere");
		System.out.println("3: Prikaz kalendara za neki drugi mjesec");
		System.out.println("4: Izlaz");
		System.out.print("Unesite broj zeljene opcije: ");
	}
	
	//metoda za odabir opcija
	public static void option(int month, int year)throws Exception{
		//unos odabira opcije 
		int option;
		
		do {
			showOptions();
			while (!input.hasNextInt()) { // sve dok unos nije int
				System.out.println("Nevalidan unos pokusajte ponovo: ");
				input.next();
			}
			option = input.nextInt();

		} while (option <= 0 || option > 4);
		//provjera opcije
		switch (option) {
		case 1:
			//napravi remainder
			createRemainder(checkDate(month, year), month, year);
			System.out.println();
			option(month,year);
			break;
		case 2:
			//procitaj sve remaindere
			readRemainder();
			System.out.println();
			option(month,year);
			break;

		case 3:
			//ispisi kalendar za jos neki mjesec
			month = checkMonth();
			year = checkYear();
			showCalendar(month - 1, year);
			option(month,year);
			System.out.println();
			break;
		case 4:
			//izlaz iz programa
			System.exit(0);
		}
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

	//metod za kreiranje remaindera
	public static void createRemainder(int day, int month, int year) throws Exception {
		// datoteka za cuvanje napomena
		java.io.File file = new java.io.File("src/MiniProjekat1_Kalendar/napomene.txt");
		if (!file.exists())
			file.createNewFile();
		System.out.print("Unesite napomenu: ");
		//"ocisti" scanner
		input.nextLine();
		String s = input.nextLine();
		//ako je remainder unesen, spremi ga
		if (!s.equals("")) {

			java.io.PrintWriter output = new java.io.PrintWriter(new java.io.FileWriter(file, true));
			output.printf("%d.%d.%d.\t", day, month, year);
			output.println(s + "\n");
			output.close();
			System.out.println("Remainder unesen.");
		} else
			System.out.println("Remainder nije upisan.");

	}
//procitaj remaindere
	public static void readRemainder() throws Exception {
		//kreiraj file za citanje
		java.io.File file = new java.io.File("src/MiniProjekat1_Kalendar/napomene.txt");
		//kreiraj skener koji ce prolaziti kroz file
		java.util.Scanner in = new java.util.Scanner(file);
		//kreiraj citac file-ova
		java.io.FileReader fr =new java.io.FileReader(file);
		java.io.BufferedReader bf = new java.io.BufferedReader(fr);
		//ako file ne postoji ili ukoliko je prazan
		if (!file.exists() || !in.hasNextLine()) {
			in.close();
			bf.close();
			System.out.println("Nema unesenih napomena");
			return;
		}
		//sve dok postoji nova linija, ispisi je
		while (in.hasNextLine()) {
			String s = bf.readLine();
			
			if (s == null)
				break;
			System.out.println(s);

		}
		in.close();
		bf.close();
	}

	// provjera mjeseca
	public static int checkMonth() {
		int month = 0;
		do {
			System.out.print("Unesite mjesec za koji zelite vidjeti kalendar(broj od 1 do 12): ");
			while (!input.hasNextInt()) { // sve dok unos nije int
				System.out.print("Unesite mjesec za koji zelite vidjeti kalendar(broj od 1 do 12): "); 
				input.next();
			}
			month = input.nextInt();
		} while (month <= 0 || month > 12);
		return month;
	}

	// provjera godine
	public static int checkYear() {
		int year;
		do {
			System.out.print("Unesite godinu za koju zelite vidjeti kalendar: ");
			while (!input.hasNextInt()) { // sve dok unos nije int
				System.out.println("Unesite godinu za koju zelite vidjeti kalendar: ");
				input.next();
			}
			year = input.nextInt();
		} while (year <= 0);
		return year;
	}

	// provjera dana
	public static int checkDate(int month, int year) {
		int date;
		do {
			System.out.print("Unesite dan u mjesecu: ");
			while (!input.hasNextInt()) { // sve dok unos nije int
				System.out.println("Unesite dan u mjesecu: ");
				input.next();
			}
			date = input.nextInt();
		} while (date <= 0 || date > numOfDaysInMonth(month, year));

		return date;
	}

	
}
