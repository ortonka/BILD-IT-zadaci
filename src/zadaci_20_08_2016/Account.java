package zadaci_20_08_2016;
/*
 *
 *  A private int data field named id for the account (default 0).
 *  A private double data field named balance for the account (default 0).
 *  A private double data field named annualInterestRate that stores the current interest 
 *  rate (default 0). Assume all accounts have the same interest rate.
 *  A private Date data field named dateCreated that stores the date when the 
 *  account was created. 
 *  A no-arg constructor that creates a default account. 
 *  A constructor that creates an account with the specified id and initial balance. 
 *  The accessor and mutator methods for id, balance, and annualInterestRate. 
 *  The accessor method for dateCreated. 
 *  A method named getMonthlyInterestRate() that returns the monthly interest rate.
 *  A method named getMonthlyInterest() that returns the monthly interest. 
 *  A method named withdraw that withdraws a specified amount from the account.
 *  A method named deposit that deposits a specified amount to the account. 
 *  Draw the UML diagram for the class and then implement the class. (Hint: The 
 *  method getMonthlyInterest() is to return monthly interest, not the interest rate. 
 *  Monthly interest is balance * monthlyInterestRate. monthlyInterestRate 
 *  is annualInterestRate / 12. Note that annualInterestRate is a percentage, 
 *  e.g., like 4.5%. You need to divide it by 100.) 
 *  
 *  @author ortonka
 */

import java.time.LocalDate;

public class Account {

	private int id = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private LocalDate dateCreated;

	public Account() {
		this.dateCreated = LocalDate.now();
	}

	public Account(int id_, double balance_) {
		setId(id_);
		setBalance(balance_);
		dateCreated = LocalDate.now();
	}

	public int getId() {
		return id;
	}

	public void setId(int id_) {
		this.id = id_;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance_) {
		this.balance = balance_;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate_) {
		Account.annualInterestRate = annualInterestRate_/100;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12;
	}

	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	public void withdraw(int amount) {
		if (balance > amount){
			balance -= amount;
			}

	}

	public void deposit(int amount) {
		balance += amount;
	}

	
}
