package hw03;

import java.util.Scanner;

public class weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s,h,w;
		Scanner input = new Scanner(System.in);
		System.out.println("Ű�� �Է��Ͻÿ�");
		h = input.nextDouble();
		s = (h-100)*0.9;
		System.out.println("ü���� �Է��Ͻÿ�");
		w = input.nextDouble();
		if (w<=s*110/100){
			if (w>=s*90/100)
				System.out.println("�����Դϴ�.");
			else
			System.out.println("��ü���Դϴ�.");
		}else
			System.out.println("��ü���Դϴ�.");
		
		
			
	}

}
