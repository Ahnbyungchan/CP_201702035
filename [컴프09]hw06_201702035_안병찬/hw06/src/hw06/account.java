package hw06;

import java.util.Scanner;

public class account {
	String id;
	String pw;
	String ID;
	String PW;
	private void accountPut() {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("<��������>");
		System.out.print("���̵� �Է��Ͻÿ�: ");
		id = input.nextLine();
		System.out.print("��й�ȣ�� �Է��Ͻÿ�: ");
		pw = input.nextLine();
	}
	private void login(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("<�α���>");
		System.out.print("ID: ");
		ID = input.nextLine();
		System.out.print("PW: ");
		PW = input.nextLine();
	}
	private void Check(){
		System.out.println("id"=="ID"&&"pw"=="PW" ? "�α��� ����":"�α��� ����");
	}
	public void startLogin(){
		accountPut();
		login();
		Check();
	}
	public static void main(String[] args){
		account test = new account();
		test.startLogin();
	}
	}
	

