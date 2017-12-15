package hw10;

import java.util.Scanner;

public abstract class Shape {
	public static int width;
	public static int height;
	public void Shape(int width, int height){
	this.height = height;
	this.width = width;
	}
	public abstract int area();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Shape s;
		System.out.println("너비를 입력하세요");
		width = input.nextInt();
		System.out.println("높이를 입력하세요");
		height = input.nextInt();
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Shape shape[];
		shape = new Shape[3];
		
		for (int i = 0; i<shape.length; i++){
			shape[0] = new Triangle();
			shape[1] = new Rectangle();
			shape[2] = new Circle();
			
			System.out.println(shape[i].area());
		}
	}
	}


