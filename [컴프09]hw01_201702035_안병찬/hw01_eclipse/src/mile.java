import java.util.Scanner;

public class mile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mile;
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ� :");
		mile = input.nextInt();
		double kilometer = 1.609*mile;
		System.out.println(mile+"������ "+kilometer+"ų�ι��� �Դϴ�.");
				
		
	}

}
