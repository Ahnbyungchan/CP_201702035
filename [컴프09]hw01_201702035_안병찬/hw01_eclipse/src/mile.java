import java.util.Scanner;

public class mile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mile;
		Scanner input = new Scanner(System.in);
		
		System.out.print("마일을 입력하시오 :");
		mile = input.nextInt();
		double kilometer = 1.609*mile;
		System.out.println(mile+"마일은 "+kilometer+"킬로미터 입니다.");
				
		
	}

}
