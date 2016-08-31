package zadaci_30_08_2016;

public class BinToDec {

	public static void main(String[] args) {
		
		//System.out.println(bin2Dec("1j0101"));
		System.out.println(bin2Dec("10101"));

	}
	//returns double value of binary String
	public static double bin2Dec(String binaryString) throws NumberFormatException {
			double power =1;
			double value = 0;
			if(isValid(binaryString)){
				for(int i=binaryString.length()-1; i>=0; i--){
					if(binaryString.charAt(i)=='1')
						value+=power;
					power*=2;
				}
				return value;
			}
			else throw new NumberFormatException("Nevalidan format");

	}
	//check if input is valid
	public static boolean isValid(String s){
		try{
			Double.parseDouble(s);
			return true;
		}
		catch(Exception e){
			System.out.println("String nije broj.");
			return false;
		}
	}

}
