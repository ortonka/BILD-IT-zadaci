package zadaci_02_09_2016;

public class TestComparableCircle {

	public static void main(String[] args) {
		ComparableCircle c1=new ComparableCircle(4);
		ComparableCircle c2=new ComparableCircle(5);
		
		if(c1.compareTo(c2)>0)
			System.out.println("Veci krug je " + c1);
		else if(c1.compareTo(c2)<0)
			System.out.println("Veci krug je " + c2);
		else 
			System.out.println("Krug " + c1 + " i krug " + c2 + " su jednaki.");
	}

}
