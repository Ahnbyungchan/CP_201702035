import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int r;
		int h;
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		r = input.nextInt();
		System.out.print("������� ���̸� �Է��Ͻÿ�: ");
		h = input.nextInt();
		double v = r*r*3.141592*h;
		System.out.println("������� ���Ǵ�"+v+"�Դϴ�.");
	}

}
