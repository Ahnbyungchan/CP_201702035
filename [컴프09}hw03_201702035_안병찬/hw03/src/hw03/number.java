package hw03;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int A,B,C;
		System.out.println("ù��° ���� �Է��Ͻÿ�");
		A = input.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��Ͻÿ�");
		B = input.nextInt();
		System.out.println("����° ���ڸ� �Է��Ͻÿ�");
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
