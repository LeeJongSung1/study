package com.test.statement;

import java.util.Scanner;

public class ForStatementTest {
	public static void main(String[] args) {
		
		//for문을 사용하야1~10까지의 값을 더하기
		int sum=0;
		for(int i=1;i<11;i++){
			sum=sum+i;
		}
		System.out.println("1~10의합:"+sum);
		
		int sum2=0;
		int sum2Accumulate=0;
		//1+(1+2)+(1+2+3)+...(1~+10)
		for(int i=1;i<11;i++){

			sum2=sum2+i;
			sum2Accumulate=sum2Accumulate+sum2;
		}
		System.out.println("1+(1+2)+(1+2+3)+...(1+2...+10):"+sum2Accumulate);
		
		
		//while
		Scanner sc=new Scanner(System.in);
		
		while(!sc.nextLine().equals("y")){//while조건문이 틀릴떄까지 반복
			System.out.print("y를 누르기전까지 반복함.");
			
		}
		
		
	}
}
