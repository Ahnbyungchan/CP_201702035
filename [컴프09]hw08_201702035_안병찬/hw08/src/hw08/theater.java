package hw08;

import java.util.Scanner;

public class theater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("좌석을 예약하시겠습니까?(1 또는 0)");
		int a = input.nextInt();
		int[] arr = {0, 0, 0, 0, 0, 1, 1, 1, 0, 0};
		while (a==0)
			System.out.println("현재의 예약 상태는 다음과 같습니다.");
			System.out.println("------------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("------------------------");
			for (int i =0; i<10; i++)
				System.out.print(arr[i]+" ");
			System.out.println("몇번째 좌석을 예약하시겠습니까?");
			int b = input.nextInt();
			if (arr[b-1]==0){
				System.out.println("예약되었습니다");
				arr[b-1]=1;
			}
			else
				System.out.println("이미 예약된 자리입니다.");
		
	}

}
