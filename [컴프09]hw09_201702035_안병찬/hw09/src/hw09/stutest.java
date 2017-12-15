package hw09;

public class stutest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<학부생>");
		Undergraduate und = new Undergraduate("안병찬", 201702035, "컴퓨터공학과", 1, 16, "프로브레인");
		und.uShow();
		System.out.println("<대학원생>");
		Graduate gra = new Graduate("홍길동", 201102034, "컴퓨터공학과", 2, 10, "교육 조교", 0.3);
		gra.gShow();
	}

}
