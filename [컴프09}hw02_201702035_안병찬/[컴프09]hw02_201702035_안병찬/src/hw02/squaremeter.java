package hw02;

import java.util.Scanner;

public class squaremeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int p;
		
		System.out.print("평수: ");
		p = input.nextInt();
		
		double m = p*3.3058;
		System.out.println("제곱미터: "+m);
		
	}

}
