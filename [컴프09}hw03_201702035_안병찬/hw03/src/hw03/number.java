package hw03;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int A,B,C;
		System.out.println("첫번째 숫자 입력하시오");
		A = input.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		B = input.nextInt();
		System.out.println("세번째 숫자를 입력하시오");
		C = input.nextInt();
		if (A > B){
			if (C > A)
				System.out.println(C+" "+A+" "+B);
			else if (B > C)
				System.out.println(A+" "+B+" "+C);
			else
				System.out.println(A+" "+C+" "+B);
		}else if (C > A){
				if (C > B)
				System.out.println(C+" "+B+" "+A);
				else
				System.out.println(B+" "+C+" "+A);
		}else
			System.out.println(B+" "+A+" "+C);
			
	

	}
}
