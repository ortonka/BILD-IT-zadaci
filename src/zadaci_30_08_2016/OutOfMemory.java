package zadaci_30_08_2016;

public class OutOfMemory {

	public static void main(String[] args) {
		try {
			// pokusaj kreiranja niza sa ovakvim brojem elemenata ce dovesti do
			// OutOfMemoryError
			int[] array = new int[Integer.MAX_VALUE];
		} catch (OutOfMemoryError e) {
			// Uhvatimo i ispisemo
			System.err.println("Out of memory !");
		}
	}
}
