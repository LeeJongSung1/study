package com.test.statement;

import java.util.Scanner;

public class StatementTest {
	public static void main(String[] args) {

		int kor;
		int eng;
		int math;

		Scanner sc = new Scanner(System.in);

		System.out.print("���������Է�:");
		kor = Integer.parseInt(sc.nextLine());

		System.out.print("���������Է�:");
		eng = Integer.parseInt(sc.nextLine());

		System.out.print("���������Է�:");
		math = Integer.parseInt(sc.nextLine());

		float avg = (kor + eng + math) / 3f;

		System.out.print("��� : "+avg);
		System.out.print("���� : ");
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
