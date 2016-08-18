package zadaci_18_08_2016;

/*
 * 7.7 (Count single digits) Write a program that generates 100 random integers between 
 * 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers, 
 * say counts, to store the counts for the number of 0s, 1s, ..., 9s.)
 * 
 * @author ortonka
 */

public class CountNumbers {

	public static final int END=100;
	
	public static void main(String[] args) {
		
		//create array of 10 integers
		int[] count = new int[10];
		
		//generate 100 random numbers 0-9 and count them
		for(int i=0; i<END; i++){
			int num=(int)(Math.random()*10);
			count[num]++;
		}
		
		//output for each number
		for(int i=0; i<count.length; i++){
			System.out.printf("Broj %d se ponovio %d puta.\n",i,count[i]);
		}
		
	}

}
