package mySQLTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	static java.util.Scanner input = new java.util.Scanner(System.in);

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");

		// Connect to a database
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost/world?autoReconnect=true&useSSL=false", "korisnik", "iteracija");
		System.out.println("Database connected");

		// Create a statement
		Statement statement = connection.createStatement();

		int result = search();
		if (result < 0 || result > 3) {
			System.out.println("Nevalidan unos ! Pokusajte ponovo! ");
		}
		switch (result) {
		case 1:
			System.out.print("Unesite ime drzave: ");
			String country = input.nextLine();
			// Execute a statement
			ResultSet resultSet = statement.executeQuery(
					"select country.Name, Continent, Region, SurfaceArea, IndepYear, country.Population, LocalName, city.Name from country JOIN city ON country.Capital=city.ID where country.Name = '"
							+ country + "'");
			int check = showCountry(resultSet);
			if (check < 0) {
				System.out.println("Ne postoje podaci za trazeni unos!");
				break;
			}
			ResultSet resultSet4 = statement.executeQuery(
					"select Language, isOfficial, Percentage from country JOIN countrylanguage ON country.Code=countrylanguage.CountryCode where Name = '"
							+ country + "'");
			int i = 0;
			while (resultSet4.next()) {
				i++;
				System.out.println();
				System.out.println("Jezik " + i + " : " + resultSet4.getString(1) + "\t");
				System.out.println("Da li je oficijalni jezik ? " + resultSet4.getString(2) + "\t");
				System.out.println("Procenat ljudi koji ga govore: " + resultSet4.getString(3) + "\t");

			}
			break;
		case 2:
			System.out.println("Unesite broj stanovnika: ");
			int num = input.nextInt();
			// Execute a statement
			ResultSet resultSet2 = statement.executeQuery(
					"select country.Name, Continent, Region, SurfaceArea, IndepYear, country.Population, LocalName, city.Name from country JOIN city ON country.Capital=city.ID where country.Population = '"
							+ num + "'");
			check = showCountry(resultSet2);

			ResultSet resultSet3 = statement.executeQuery(
					"select city.Name, District, country.Name, Continent, city.Population from city JOIN country ON country.Code=city.CountryCode where city.Population = '"
							+ num + "'");
			check += showCity(resultSet3);

			if (check < -1)
				System.out.println("Ne postoje podaci za traženi unos.");
			break;

		case 3:
			System.out.print("Unesite ime grada: ");
			String city = input.nextLine();
			// Execute a statement
			ResultSet resultSet5 = statement.executeQuery(
					"select city.Name, District, country.Name, Continent, city.Population from city JOIN country ON country.Code=city.CountryCode where city.Name = '"
							+ city + "'");
			check = showCity(resultSet5);
			if (check < 0)
				System.out.println("Ne postoje podaci za traženi unos.");
			break;
		}
		// Close the connection
		connection.close();

	}

	public static int search() {
		System.out.println("Unesite broj zavisno od izbora pretrazivanja: ");
		System.out.println("1 - naziv drzave");
		System.out.println("2 - broj stanovnika");
		System.out.println("3 - naziv grada");
		int choice = -1;
		try {
			choice = input.nextInt();
			input.nextLine();
		} catch (Exception e) {
			System.err.println("Molimo unesite broj izmedju 1 - 3!");
		}
		return choice;
	}

	public static int showCountry(ResultSet resultSet) throws SQLException {
		int i = -1;
		// Iterate through the result and print
		while (resultSet.next()) {
			i++;
			System.out.println();
			System.out.println("Naziv drzave: " + resultSet.getString(1) + "\t");
			System.out.println("Kontinent: " + resultSet.getString(2) + "\t");
			System.out.println("Region: " + resultSet.getString(3) + "\t");
			System.out.println("Površina: " + resultSet.getString(4) + "\t");
			System.out.println("Godina nezavisnosti: " + resultSet.getString(5) + "\t");
			System.out.println("Stanovnistvo: " + resultSet.getString(6) + "\t");
			System.out.println("Lokalni naziv drzave: " + resultSet.getString(7) + "\t");
			System.out.println("Glavni grad: " + resultSet.getString(8) + "\t");
		}
		return i;
	}

	public static int showCity(ResultSet resultSet) throws SQLException {
		int check = -1;
		// Iterate through the result and print
		while (resultSet.next()) {
			check++;
			System.out.println();
			System.out.println("Naziv grada: " + resultSet.getString(1) + "\t");
			System.out.println("Distrikt: " + resultSet.getString(2) + "\t");
			System.out.println("Naziv drzave: " + resultSet.getString(3) + "\t");
			System.out.println("Kontinent: " + resultSet.getString(4) + "\t");
			System.out.println("Stanovnistvo: " + resultSet.getString(5) + "\t");
		}
		return check;
	}

}