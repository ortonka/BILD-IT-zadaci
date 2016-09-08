package zadaci_07_09_2016;

public class ReverseDisplayString {
	// method prints String in reverse order
	public static void reverseDisplay(String value) {
		if ((null == value) || (value.length() < 1)) {
			return;
		}
		System.out.print(value.charAt(value.length() - 1));
		reverseDisplay(value.substring(0, value.length() - 1));
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Unesite string: ");
		//method call
		reverseDisplay(input.nextLine());
		input.close();
	}

}
