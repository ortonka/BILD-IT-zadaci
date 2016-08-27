package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Date;

public class ObjectInArrayList {

	public static void main(String[] args) {
		// Kreiranje ArrayList sa Object elementima
		ArrayList<Object> lista = new ArrayList<>();

		// dodavanje razlicitih objekata
		lista.add(new Date());
		lista.add(new Triangle());
		lista.add("Ovo je String objekat.");
		lista.add(new Loan());

		// ispis
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
			System.out.println();
		}

	}

}

class Loan {
	private double loanAmount;

	Loan() {
		loanAmount = 1000;
	}

	@Override
	public String toString() {
		return "loanAmount: " + loanAmount;
	}
}
