package hw07;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane p1 = new Plane();
		Plane p2 = new Plane("�������", "A380", 500);
		int n = Plane.getPlanes();
		System.out.println("������ ����� ��: "+n);
	}

}
