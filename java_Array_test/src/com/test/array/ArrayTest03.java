package com.test.array;

import java.util.Scanner;

public class ArrayTest03 {
	public static void main(String[] args) {
				//Q6)
				//학생 3명의 이름 ,국어, 영어,수학의 점수를 입력받아
				//각각의 학생의 평균을 출력하는 프로그램을 쓰시오
				//실행결과)
			/*
			 * 1번학생
			 * 이름:xxx
			 * 국어:xx
			 * 영어:xx
			 * 수학:xx
			 * ......
			 * 
			 * 1번 이름 평균:
			 * 2번 이름 평균:
			 * ......
			 */
		String[][] student=new String[3][4];
		int sum=0;

		Scanner sc=new Scanner(System.in);
		//입력부분
		for(int i=0;i<student.length;i++){
			System.out.println((i+1)+"번쨰 학생의 이름 국어 영어 수학의 점수를 입력하세요.");
			System.out.print("이름 : ");
			student[i][0]=sc.nextLine();
			System.out.print("국어 : ");
			student[i][1]=sc.nextLine();
			System.out.print("영어 : ");
			student[i][2]=sc.nextLine();
			System.out.print("수학 : ");
			student[i][3]=sc.nextLine();
		}
		
		//출력부분
		System.out.println("----출력----");
		for(int i=0;i<student.length;i++){
			System.out.println((i+1)+"번쨰학생 ");
			sum=0;
			sum=Integer.parseInt(student[i][1])+Integer.parseInt(student[i][2])+Integer.parseInt(student[i][3]);
			/*
			for(int j=1;j<student[i].length;j++){
				sum=sum+Integer.parseInt(student[i][j]);
			}
			*/
			System.out.println("평균 : "+sum/(student[i].length-1)*1f);
			
		}
	}
}
