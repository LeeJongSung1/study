package com.test.statement;

import java.util.Scanner;

public class StatementTest {
	public static void main(String[] args) {

		int kor;
		int eng;
		int math;

		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수입력:");
		kor = Integer.parseInt(sc.nextLine());

		System.out.print("영어점수입력:");
		eng = Integer.parseInt(sc.nextLine());

		System.out.print("수학점수입력:");
		math = Integer.parseInt(sc.nextLine());

		float avg = (kor + eng + math) / 3f;

		System.out.print("평균 : "+avg);
		System.out.print("학점 : ");
		String grade = "";
		switch ((int) avg / 10) {
			case 10:
				grade = "A++";
			case 9:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
		}
		System.out.print(grade);
		int j=0;
		for(int i=0;i<10;i++){
			j++;
			System.out.println("j:"+j);
			if(j==5){
				break;
			}		
			
		}

	}
}
