package com.test.array;

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
		// Q4)
		// 아이디/ 패스워드
		// mimi/mimi
		// mamam/mama
		// mumu/mumu
		// 가입 + 패스워드 사용=> 무한반복이용
		//
		String[] idArray = new String[100];// id를 넣을 배열선언
		String[] pwdArray = new String[100];// password를 넣을 배열 선언
		String inPutID = "";
		String inPutPWD = "";

		idArray[0] = pwdArray[0] = "mimi";
		idArray[2] = pwdArray[1] = "mama";
		idArray[1] = pwdArray[2] = "mumu";
		int currentIndex = 3;
		int findIndex = -1;

		Scanner sc = new Scanner(System.in);

		// String idArray[]=new String[100];
		// String pwdArray[]=new String[100];
		String id_Pwd[][] = new String[100][100];
		while (true) {
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
				// msg = "로그인을 선택 하셧습니다.";
				System.out.println("로그인을 선택 하셧습니다.\n");
				System.out.print("아이디 : ");
				inPutID = sc.nextLine();
				findIndex = -1;
				for (int index = 0; index < currentIndex; index++) {
					if (idArray[index].equals(inPutID)) {
						findIndex = index;
						break;
					} /*
						 * else{//존재하지 않는 아이디 if(index==(currentIndex-1)){
						 * System.out.println("아이디가 존재하지 않습니다.\n"); } }
						 */
				}
				if (findIndex > -1) {
					System.out.print("비밀번호 : ");
					inPutPWD = sc.nextLine();
					if (pwdArray[findIndex].equals(inPutPWD)) {
						System.out.println("로그인에 성공하셧습니다.\n");
					} else {// 비밀번호 불일치
						System.out.println("로그인에 실패하셧습니다.\n");
					}
				} else {// 존재하지 않는 아이디
					System.out.println("아이디가 존재하지 않습니다.\n");
				}

				break;
			case "2":
				// msg = "회원가입을 선택하셧습니다.";
				System.out.println("회원가입을 선택하셧습니다.\n");
				System.out.print("아이디 : ");
				inPutID = sc.nextLine();
				if (currentIndex >= idArray.length) {// idArray배열이 끝가지 사용됬는지
														// 확인한다.
					String[] temp = new String[idArray.length + 20];
					// 새로운 temp배열을 선언하고 idArray의 길이보다 20크게 만들어준다.
					for (int i = 0; i < idArray.length; i++) {
						// 자료를 옮기기위해 idArray의길이만큼 for문을 반복한다.
						temp[i] = idArray[i];
						// idArray의 배열 데이터를 temp에 대입한다.
					}
					idArray = temp;
					// 새로운 idArray에 temp를 대입한다.
				}
				boolean exsistID = false;
				for (int index = 0; index < currentIndex; index++) {
					if (idArray[index].equals(inPutID)) {
						exsistID = true;
						break;
					}
				}
				if (!exsistID) {
					System.out.println("비밀번호 :");
					inPutPWD = sc.nextLine();
					idArray[currentIndex] = inPutID;
					pwdArray[currentIndex] = inPutPWD;
					currentIndex++;
					//아이디와 패스워드의 배열에 입력받은 값을 대입한다.
					System.out.println("가입에 성공하셧습니다.");
				} else {
					System.out.println("중복된 아이디입니다.");
					break;
				}

				break;
			case "3":
				// msg = "아이디/패스워드 찾기를 선택하셧습니다.";
				System.out.println("아이디/패스워드 찾기를 선택하셧습니다.\n");
				break;
			case "4":
				// msg = "종료를 선택하셧습니다.\n 프로그램을 종료합니다.";
				System.out.println("종료를 선택하셧습니다.\n 프로그램을 종료합니다.\n");
				return;
			default:
				// msg = "데이터를 잘못 입력하셧어요!";
				System.out.println("데이터를 잘못 입력하셧어요!\n");
				break;
			}

		}
	}
}



