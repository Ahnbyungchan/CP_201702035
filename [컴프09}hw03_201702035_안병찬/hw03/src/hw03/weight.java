package hw03;

import java.util.Scanner;

public class weight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s,h,w;
		Scanner input = new Scanner(System.in);
		System.out.println("키을 입력하시오");
		h = input.nextDouble();
		s = (h-100)*0.9;
		System.out.println("체중을 입력하시오");
		w = input.nextDouble();
		if (w<=s*110/100){
			if (w>=s*90/100)
				System.out.println("정상입니다.");
			else
			System.out.println("저체중입니다.");
		}else
			System.out.println("과체중입니다.");
		
		
			
	}

}
