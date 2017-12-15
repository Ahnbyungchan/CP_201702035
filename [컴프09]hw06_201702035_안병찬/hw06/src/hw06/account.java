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
		System.out.println("<계정생성>");
		System.out.print("아이디를 입력하시오: ");
		id = input.nextLine();
		System.out.print("비밀번호를 입력하시오: ");
		pw = input.nextLine();
	}
	private void login(){
		
		Scanner input = new Scanner(System.in);
		System.out.println("<로그인>");
		System.out.print("ID: ");
		ID = input.nextLine();
		System.out.print("PW: ");
		PW = input.nextLine();
	}
	private void Check(){
		System.out.println("id"=="ID"&&"pw"=="PW" ? "로그인 성공":"로그인 실패");
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
	

