package com.test.statement;

import java.util.Scanner;

public class ForstatementTest2 {
	public static void main(String[] args) {
	

		// ¦���� ���ϴ� for��(1~10���̿��ִ� ��)
		int sum = 0;
		System.out.println("¦���� ���ϴ� for��(1~10���̿��ִ� ��)");
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println("����������:" + i);
				sum = sum + i;
				// System.out.println(sum+"+"+i+"="+ (sum=sum+i));
			}
		}
		System.out.println(sum);

		// 2�ܱ������� �ۼ��ϼ���
		System.out.println("������2���� �ۼ��ϼ���");
		int gugutwo = 2;
		// ������ �ܼ��� ���� ���� ����� �ʱ�ȭ�� ����
		for (int i = 1; i < 10; i++) {
			// 1~9���� �־���i�� for���ȿ� �����ϰ�1~9���� �ݺ��ϵ��� ������
			System.out.println(gugutwo + "X" + i + "=" + gugutwo * i);
			// gugu X i = ��� ���� �������� print ���ȿ� �־���.
		}
		
		/* �м���� �ΰ��� ������ �ΰ� �������ΰͰ� �������� �Ǵ���.
		 *  �������� ������ ã�� �������� Ȥ�� �� ������ ã�ƺ�����
		 */
		// ������2~9�ܱ��� �����
		System.out.println("������2~9�ܱ��� �����");
		for (int i = 2; i < 10; i++) {
//			System.out.print("�ܼ� : " + i);
			for(int j=1;j<10;j++){
//				System.out.print(" ���� : " + j);
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
