package hw07;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1 = new Plane();
		Plane p2 = new Plane("에어버스", "A380", 500);
		int n = Plane.getPlanes();
		System.out.println("생성된 비행기 수: "+n);
	}

}
