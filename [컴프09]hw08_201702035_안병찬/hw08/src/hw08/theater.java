package hw08;

import java.util.Scanner;

public class theater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0)");
		int a = input.nextInt();
		int[] arr = {0, 0, 0, 0, 0, 1, 1, 1, 0, 0};
		while (a==0)
			System.out.println("������ ���� ���´� ������ �����ϴ�.");
			System.out.println("------------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("------------------------");
			for (int i =0; i<10; i++)
				System.out.print(arr[i]+" ");
			System.out.println("���° �¼��� �����Ͻðڽ��ϱ�?");
			int b = input.nextInt();
			if (arr[b-1]==0){
				System.out.println("����Ǿ����ϴ�");
				arr[b-1]=1;
			}
			else
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
		
	}

}
