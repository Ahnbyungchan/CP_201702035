import java.util.Scanner;

public class celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int F;
		double C;
		Scanner input = new Scanner(System.in);
		System.out.print("ȭ���µ��� �Է��Ͻÿ�:");
		F = input.nextInt();
		C = (5 / 9.0) * (F-32);
		System.out.println("�����µ���:"+C);
		
		
	}

}
