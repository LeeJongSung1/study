package com.test.statement;

import java.util.Scanner;

public class ForstatementTest2 {
	public static void main(String[] args) {
	

		// 짝수를 더하는 for문(1~10사이에있는 수)
		int sum = 0;
		System.out.println("짝수를 더하는 for문(1~10사이에있는 수)");
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println("더해진정수:" + i);
				sum = sum + i;
				// System.out.println(sum+"+"+i+"="+ (sum=sum+i));
			}
		}
		System.out.println(sum);

		// 2단구구단을 작성하세여
		System.out.println("구구단2단을 작성하세여");
		int gugutwo = 2;
		// 구구단 단수를 위한 변수 선언및 초기화값 대입
		for (int i = 1; i < 10; i++) {
			// 1~9까지 넣어줄i를 for문안에 선언하고1~9까지 반복하도록 설정함
			System.out.println(gugutwo + "X" + i + "=" + gugutwo * i);
			// gugu X i = 결과 값이 나오도록 print 문안에 넣어줌.
		}
		
		/* 분석방법 두개의 문제를 두고 공통적인것과 차이점을 판단함.
		 *  공통점의 이유를 찾고 차이점은 혹시 모를 패턴을 찾아봐야함
		 */
		// 구구단2~9단까지 만들기
		System.out.println("구구단2~9단까지 만들기");
		for (int i = 2; i < 10; i++) {
//			System.out.print("단수 : " + i);
			for(int j=1;j<10;j++){
//				System.out.print(" 곱수 : " + j);
				System.out.print(i+"X"+j+"="+i*j+"	");
			}
			System.out.println("");
		}
		
		
		for(int i=0;i<11;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.println("");
		
		for(int i=11;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		int row=10;
		for(int i=0;i<row+1;i++){
			for(int j=0;j<row-i+1;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		int count=0;
		for(int i=0;i<8;i++){
			for(int j=0;j<i;j++){
				System.out.print(" "+ (++count)+"	");
			}
			System.out.println("");
		}
		
	}
}
