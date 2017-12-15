package hw04;

import java.util.Random;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0,num2=0,num3=0,num4=0,num5=0,num6=0;
		Random rand = new Random (System.currentTimeMillis());
		System.out.println("<로또 생성 프로그램>");
		
		for (int i =1;i<7;i++)
			
			switch(i){
			case 1:
				num1 =1+rand.nextInt(45);
				break;
			case 2:
				num2 =1+rand.nextInt(45);
				while(num2 == num1)
					num2 =1+rand.nextInt(45);
				break;
			case 3:
				  num3 =1+rand.nextInt(45);
		            while (num3 == num1||num3 == num2)
		               num3 =1+rand.nextInt(45);
		               break;
			case 4:
			      num4 =1+rand.nextInt(45);
		            while (num4 == num1||num4 == num2||num4 == num3)
		               num4 =1+rand.nextInt(45);
		               break;
			case 5:
			    num5 =1+rand.nextInt(45);
	            while (num5 == num1||num5 == num2||num5 == num3||num5 == num4)
	               num5 =1+rand.nextInt(45);
	               break;
			case 6:
				 num6 =1+rand.nextInt(45);
		            while (num6 == num1||num6 == num2||num6 == num3||num6 == num4||num6 == num5)
		               num6 =1+rand.nextInt(45);
		               break;
			default:
	            break;
			}
			
			System.out.println("로또 번호:"+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);
			
		
		}
	}


