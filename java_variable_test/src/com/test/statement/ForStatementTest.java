package com.test.statement;

import java.util.Scanner;

public class ForStatementTest {
	public static void main(String[] args) {
		
		//for���� ����Ͼ�1~10������ ���� ���ϱ�
		int sum=0;
		for(int i=1;i<11;i++){
			sum=sum+i;
		}
		System.out.println("1~10����:"+sum);
		
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
		
		while(!sc.nextLine().equals("y")){//while���ǹ��� Ʋ�������� �ݺ�
			System.out.print("y�� ������������ �ݺ���.");
			
		}
		
		
	}
}
