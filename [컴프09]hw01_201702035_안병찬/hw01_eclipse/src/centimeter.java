import java.util.Scanner;

public class centimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int h;
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		h = input.nextInt();
		double i = 1/2.54*h;
		double f = 1/(2.54*12)*h;
		System.out.println(h+"cm��"+f+"��Ʈ"+i+"��ġ�Դϴ�.");
		
	}

}
