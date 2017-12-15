package hw06;

import java.util.Scanner;

public class letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		String str;
		System.out.print("문자열을 입력하시오: ");
		str = Input.nextLine();
		
		System.out.println(reverse(str));
	}
	public static String reverse(String str){
		String str2 = "";
		int i = str.length()-1;
		do{
			str2 += str.charAt(i);
			i--;
		}while (i>=0);
		  return str2;
	}
	}


	


