package com.test.array;

import java.util.Scanner;

public class ArrayTest03 {
	public static void main(String[] args) {
				//Q6)
				//�л� 3���� �̸� ,����, ����,������ ������ �Է¹޾�
				//������ �л��� ����� ����ϴ� ���α׷��� ���ÿ�
				//������)
			/*
			 * 1���л�
			 * �̸�:xxx
			 * ����:xx
			 * ����:xx
			 * ����:xx
			 * ......
			 * 
			 * 1�� �̸� ���:
			 * 2�� �̸� ���:
			 * ......
			 */
		String[][] student=new String[3][4];
		int sum=0;

		Scanner sc=new Scanner(System.in);
		//�Էºκ�
		for(int i=0;i<student.length;i++){
			System.out.println((i+1)+"���� �л��� �̸� ���� ���� ������ ������ �Է��ϼ���.");
			System.out.print("�̸� : ");
			student[i][0]=sc.nextLine();
			System.out.print("���� : ");
			student[i][1]=sc.nextLine();
			System.out.print("���� : ");
			student[i][2]=sc.nextLine();
			System.out.print("���� : ");
			student[i][3]=sc.nextLine();
		}
		
		//��ºκ�
		System.out.println("----���----");
		for(int i=0;i<student.length;i++){
			System.out.println((i+1)+"�����л� ");
			sum=0;
			sum=Integer.parseInt(student[i][1])+Integer.parseInt(student[i][2])+Integer.parseInt(student[i][3]);
			/*
			for(int j=1;j<student[i].length;j++){
				sum=sum+Integer.parseInt(student[i][j]);
			}
			*/
			System.out.println("��� : "+sum/(student[i].length-1)*1f);
			
		}
	}
}
