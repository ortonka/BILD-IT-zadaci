package zadaci_20_08_2016;
/*  Write a test program that creates an Account object with an account ID of 1122, 
 *  a balance of $20,000, and an annual interest rate of 4.5%. Use the withdraw 
 *  method to withdraw $2,500, use the deposit method to deposit $3,000, and print 
 *  the balance, the monthly interest, and the date when this account was created.
 *  
 */

public class TestAccount {
	
	public static void main(String[] args) {
		//kreiraj instancu klase
		Account racun = new Account(1122, 20000);
		//postavi vrijednosti za datu instancu
		racun.setAnnualInterestRate(4.5);
		racun.withdraw(2500);
		racun.deposit(3000);
		//ispisi vrijednosti vezane za datu instancu
		System.out.println("Balance: " + racun.getBalance());
		System.out.printf("Monthly Interest: %3.3f\n",racun.getMonthlyInterest());
		System.out.println("Date: " + racun.getDateCreated());

	}

}
