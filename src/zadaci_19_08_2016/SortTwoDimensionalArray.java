package zadaci_19_08_2016;

/*
 * (Sort two-dimensional array) Write a method to sort a two-dimensional array 
 * using the following header: 
 * public static void sort(int m[][]) 
 * The method performs a primary sort on rows and a secondary sort on columns. 
 * For example, the following array 
 * {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}} 
 * will be sorted to 
 * {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.
 */
public class SortTwoDimensionalArray {

	public static void main(String[] args) {
		//kreiraj matricu kao u test primjeru zadatka
		int[][] matrix = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };
		//ispis prije pozivanja sort metoda
		System.out.println("Matrica prije sortiranja:");
		printMatrix(matrix);
		//ispis nakon pozivanja sort metoda
		System.out.println("Matrica nakon sortiranja:");
		sort(matrix);


	}
	
	// isprintaj matricu
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}	
	//vraca sortiranu matricu po redovima
	public static void sort(int m[][]) {
		//napravi niz za minimalan red i minimalnu kolonu
		int[] min = new int[2];
		for (int row = 0; row < m.length - 1; row++) {
			//postavi minimalan elemenat reda kao prvi elemenat reda row
			min[0] = m[row][0]; 
			//postavi minimalan elemenat kolone kao drugi elemenat reda row
			min[1] = m[row][1]; 
			int index = row;
			for (int i = row + 1; i < m.length; i++) {
				//ukoliko je minimalan element ustvari neki drugi clan matrice
				if (m[i][0] <= min[0] && (m[i][0] < min[1] || 
					 m[i][1] < min[0] || m[i][1] < min[1])) { 
					//promijeni min elemenat reda, kolone kao i index
					min[0] = m[i][0];
					min[1] = m[i][1];
					index = i;
				}
			}
			//postavi minimalne elemente
			if (index != row){
				m[index][0] = m[row][0];
				m[index][1] = m[row][1];
				m[row][0] = min[0];
				m[row][1] = min[1]; 
			}
		}
		//ispisi matricu
		printMatrix(m);
	}

}
