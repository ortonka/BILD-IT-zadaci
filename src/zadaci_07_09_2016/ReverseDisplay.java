package zadaci_07_09_2016;

public class ReverseDisplay {
	//method prints reverse value of int value in console
	public static void reverseDisplay(int value){
		if(value>=1){
			System.out.print(value%10);
			reverseDisplay(value/10);
		}
	}
	
	public static void main(String[] args) {
		//method call
		reverseDisplay(12345);
	}

}
