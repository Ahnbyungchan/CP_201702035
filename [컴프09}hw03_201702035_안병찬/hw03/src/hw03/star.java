package hw03;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,k,i;
		
		
		for(i = 0; i < 5; i++) {
			  for(j = 0; j < 5 - i ; j++) {
			   System.out.print(" ");
			  }
			  for(k = 0; k  < i * 2 + 1; k++) {
			   System.out.print("*");
			  }
			  System.out.println();
			 }
			 
			 for(i = 0; i <= 5; i++) {
			  for(j = 0; j < i; j++) {
			   System.out.print(" ");
			  }
			  for(k = 0 ; k < (5 - i) * 2 + 1 ; k++) {
			   System.out.print("*");
			  }
			  System.out.println();
			 }
			 }
			}

			



