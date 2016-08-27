package zadaci_26_08_2016;

public class TestGO {

	public static void main(String[] args) {
		//create instance of Triangle
		GeometricObject trougao = new Triangle(5, 4, 3, "Blue", true);
		System.out.println(trougao);
		System.out.println("Povrsina: " + String.format("%.2f ", trougao.getArea()) + ", obim: " + trougao.getPerimeter() + ", boja: "
				+ trougao.getColor() + ", is filled: " + trougao.isFilled());
		
		System.out.println();
		//create instance of Triangle
		Triangle trougao2 = new Triangle();
		System.out.println(trougao2);
		System.out.println("Povrsina: " + String.format("%.2f ", trougao2.getArea()) + ", obim: " + trougao2.getPerimeter() + ", boja: "
				+ trougao2.getColor() + ", is filled: " + trougao2.isFilled());
	}

}
