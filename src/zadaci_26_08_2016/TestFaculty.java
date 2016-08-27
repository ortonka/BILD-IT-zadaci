package zadaci_26_08_2016;

import java.util.Calendar;
import java.util.Date;

public class TestFaculty {

	public static void main(String[] args) {
		// Kreiranje instanci klasa
		Person osoba = new Person("Jasmina", "Prvi mart", "061/637-299", "jasmina@outlook.com");
		Student student = new Student("Anita", "Viteska", "061/455-709", "anita@outlook.com", "freshman");
		Employee zaposlenik = new Employee("Damir", "Antuna Hangina", "0603500109", "damir@outlook.com");
		Faculty osoblje = new Faculty("Sara", "SOC 12/3", "0603463798", "sara@outlook.com");
		Staff staff = new Staff("Toni", "Ulica", "032604015", "toni@outlook.com");
		// ispis
		System.out.println(osoba.toString() + "\n");
		System.out.println(student.toString() + "\n");
		System.out.println(zaposlenik.toString() + "\n");
		System.out.println(osoblje.toString() + "\n");
		System.out.println(staff.toString() + "\n");

	}

}

/*
 * A person class has a name, address, phone number, and email address.
 */
class Person {

	public String name;
	public String address;
	public String phoneNum;
	public String email;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String address, String phoneNum, String email) {
		this.setName(name);
		this.setAddress(address);
		;
		this.setPhoneNum(phoneNum);
		;
		this.setEmail(email);
		;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Class name: " + this.getClass().getSimpleName() + ", Person's name: " + getName();
	}

}

/*
 * An employee has an office, salary, and date hired. Use the MyDate class
 * defined in Programming Exercise 10.14 to create an object for date hired.
 */

class Employee extends Person {

	private String office, salary;
	private MyDate DATE_HIRED;

	public Employee() {
	}

	public Employee(String name, String address, String phoneNum, String email) {
		super(name, address, phoneNum, email);
	}

	public Employee(String name, String address, String phoneNum, String email, String office, String salary,
			MyDate DATE_HIRED) {

		super(name, address, phoneNum, email);
		this.office = office;
		this.salary = salary;
		this.DATE_HIRED = DATE_HIRED;
	}

	public String office() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public MyDate getMyDate() {
		return DATE_HIRED;
	}

}

/*
 * A faculty member has office hours and a rank
 */

class Faculty extends Employee {

	private String office_hours;
	private String rank;

	public Faculty() {
	}

	public Faculty(String name, String address, String phoneNum, String email) {
		super(name, address, phoneNum, email);
	}

	public Faculty(String name, String address, String phoneNum, String email, String office_hours, String rank) {
		super(name, address, phoneNum, email);
		this.office_hours = office_hours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return office_hours;
	}

	public void setOfficeHours(String office_hours) {
		this.office_hours = office_hours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

}

class MyDate {

	private int year;
	private int month;
	private int day;

	public MyDate() {
		java.util.Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		day = cal.get(Calendar.DAY_OF_MONTH);

	}

	public MyDate(long elapsedTime) {
		setDate(elapsedTime);
	}

	public MyDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}

	public void setDate(long elapsedTime) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(elapsedTime);

		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH);
		day = calendar.get(Calendar.DAY_OF_MONTH);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "MyDate [year=" + year + ", month=" + month + ", day=" + day + "]";
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

}

/*
 * A staff member has a title.
 */

class Staff extends Employee {

	private String title;

	public Staff(String name, String address, String phoneNum, String email) {
		super(name, address, phoneNum, email);
	}

	public Staff(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}

/*
 * A student has a class status (freshman, sophomore, junior, or senior). Define
 * the status as a constant.
 */

class Student extends Person {

	private final String CLASS_STATUS;

	public Student(String name, String address, String phoneNum, String email, String CLASS_STATUS) {
		super(name, address, phoneNum, email);
		this.CLASS_STATUS = CLASS_STATUS;

	}

	public String getClassStatus() {

		return CLASS_STATUS;

	}

}
