import java.util.Scanner;

public class Volume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int r;
		int h;
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		r = input.nextInt();
		System.out.print("원기둥의 높이를 입력하시오: ");
		h = input.nextInt();
		double v = r*r*3.141592*h;
		System.out.println("원기둥의 부피는"+v+"입니다.");
	}

}
