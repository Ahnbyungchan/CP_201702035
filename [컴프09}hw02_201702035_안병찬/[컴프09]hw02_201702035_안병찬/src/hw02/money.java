package hw02;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int m1;
		int m2;
		int m3;
		int m4;
		
		System.out.print("500���� ����: ");
		m1 = input.nextInt();
		
		System.out.print("100���� ����: ");
		m2 = input.nextInt();
		
		System.out.print("50���� ����: ");
		m3 = input.nextInt();
		
		System.out.print("10���� ����: ");
		m4 = input.nextInt();
		
		int sum = 500*m1+100*m2+50*m3+10*m4;
		System.out.println("���� "+sum+"��");
	}

}
