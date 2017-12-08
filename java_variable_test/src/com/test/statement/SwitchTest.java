package com.test.statement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		// Q4)
		// 아이디/ 패스워드
		// mimi/mimi
		// mamam/mama
		// mumu/mumu
		// 가입 + 패스워드 사용=> 무한반복이용
		//
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		// String idArray[]=new String[100];
		// String pwdArray[]=new String[100];
		String id_Pwd[][] = new String[100][100];
		while (exit) {
			System.out.println("*** 도서관리 프로그램 ***");
			System.out.println("[1]로그인");
			System.out.println("[2]회원가입");
			System.out.println("[3]아이디/패스워드 찾기");
			System.out.println("[4]종료");
			System.out.print("메뉴를 선택하세요._");

			String menu = sc.nextLine();
			String msg = "";
			switch (menu) {
			case "1":
				msg = "로그인을 선택 하셧습니다.";
				break;
			case "2":
				msg = "회원가입을 선택하셧습니다.";
				break;
			case "3":
				msg = "아이디/패스워드 찾기를 선택하셧습니다.";
				break;
			case "4":
				msg = "종료를 선택하셧습니다.\n 프로그램을 종료합니다.";
				System.out.println(msg);
				return;
			default:
				msg = "데이터를 잘못 입력하셧어요!";
				break;
			}
			System.out.println(msg);
			
		}
	}
}
