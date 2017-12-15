package hw09;

public class cusTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer cus = new Customer("안병찬", "대전", "01083836272", 12, 3456);
		System.out.println("이름:"+cus.getName());
		System.out.println("주소:"+cus.getAddress());
		System.out.println("전화번호:"+cus.getNumber());
		System.out.println("고객번호:"+cus.getPnumber());
		System.out.println("마일리지:"+cus.getMileage());
	
	}

}
