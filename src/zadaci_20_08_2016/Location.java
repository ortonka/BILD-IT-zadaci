package zadaci_20_08_2016;


/*
 * (The Location class) Design a class named Location for locating a maximal 
 * value and its location in a two-dimensional array. The class contains public data 
 * fields row, column, and maxValue that store the maximal value and its indices 
 * in a two-dimensional array with row and column as int types and maxValue as 
 * a double type. 
 * Write the following method that returns the location of the largest element in a 
 * two-dimensional array: 
 * public static Location locateLargest(double[][] a) 
 * The return value is an instance of Location. Write a test program that prompts 
 * the user to enter a two-dimensional array and displays the location of the largest 
 * element in the array. 
 *  */

public class Location {

	public int row_;			//indeks reda
	public int column_;			//indeks kolone
	public double maxValue_;	//maksimalna vrijednost

	public Location(int row, int column, double maxValue) {
		row_ = row;
		column_ = column;
		maxValue_ = maxValue;
	}

	public static Location locateLargest(double[][] a) {
		double maxValue = a[0][0];
		int row = 0, column = 0;
		// prodji kroz matricu, ukoliko je element veci od maxValue, taj element
		// je onda maxValue
		// postavi nove vrijednosti indeksa
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {

				if (a[i][j] > maxValue) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}
		//vrati instancu klase 
		return new Location(row, column, maxValue);
	}

	
}
