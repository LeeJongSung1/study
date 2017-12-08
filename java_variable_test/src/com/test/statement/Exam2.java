package com.test.statement;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {

		// 문제3)
		// 입력되는 값은 0~100사이의 정수만 가능하도록
		// '계속할래?(y/n)추가하고'n'일떄까지 반복하기.
		// for문을 이용하여 다시반복

		int kor2, eng2, math2;
		// 점수를 받을 kor,eng,math를 선언한다
		int fac;
		// 점수를 받을 임의의 변수 fac
		String subject = "";
		//과목명을 받을 문자열 변수 subject를 선언하고 초기값으로 ""을 줌
		Scanner scan = new Scanner(System.in);
		while (!scan.nextLine().equals("n")) {// while조건문이 틀릴떄까지 반복
			
			for (int i = 0; i < 3; i++) {
				if (i == 0) {// 국어
					subject = "국어";
				} else if (i == 1) {// 영어
					subject = "영어";
				} else if (i == 2) {// 수학
					subject = "수학";
				}
				System.out.print(subject + "점수 를 입력하세요.");
			
				fac = Integer.parseInt(scan.nextLine());
				if (fac >= 0 && fac <= 100) {
					if (i == 0) {// 국어
					} else if (i == 1) {// 영어
					} else if (i == 2) {// 수학
					}
					System.out.println(subject + "점수 : " + fac);
					// 점수가0이상이고 100이하이면 점수를 입력받는다.
				} else {
					System.out.println(subject + "점수를 다시입력하세요. ");
					i--;// 삑나면 다시 해당 점수를 다시받기위해 i++된것을 다시빼줌
				}
				
				System.out.print("계속할래요?(y/n");
			}
		}
		System.out.println("end");

	
			
		
	}
}
