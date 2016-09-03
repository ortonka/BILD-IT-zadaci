package zadaci_02_09_2016;

public class TestGeometricObject {

	public static void main(String[] args) {
		//kreiranje dva kruga
		GeometricObject c1=new Circle(5);
		GeometricObject c2=new Circle(6);
		System.out.println("Veci od dva kruga je onaj sa poluprecnikom: " + GeometricObject.max(c1, c2));
		//kreiranje dva pravougaonika
		GeometricObject r1=new Rectangle();
		GeometricObject r2=new Rectangle(0.2, 0.5);
		System.out.println("Veci od dva pravougaonika je onaj sa stranicama: " + GeometricObject.max(r1, r2));
	}

}
