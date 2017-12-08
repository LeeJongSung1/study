package com.test.variable;

import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// 키보드 입력을 받기위해 Scanner클래스 불러왔다.
		// 변수명은 scan로 선언함.

		/*
		 * int kor=90; //int kor:선언 //kor=90 초기갑 대입; //System.out.println(kor);
		 * 변수 실행 int eng=80; //int 형 변수인 eng에 초기값80을 대입하였다. int math=100; //int
		 * 형 변수인 math에 초기값80을 대입하였다.
		 * 
		 */
		int kor, eng, math;
		// kor,eng,math를 선언한다

		// 문제3)
		// 입력되는 값은 0~100사이의 정수만 가능하도록
		// for문을 이용하여 다시반복
		System.out.print("국어점수 : ");
		kor = Integer.parseInt(scan.nextLine());

		System.out.print("영어점수 : ");
		eng = Integer.parseInt(scan.nextLine());

		System.out.print("수학점수 : ");
		math = Integer.parseInt(scan.nextLine());

		int total = kor + eng + math;
		// kor,eng,math의 합의 결과를 total에 대입한다.
		float avg = total / 3.0f;
		/*
		 * total의 값을 평균을 내야하는데 둘다 정수인int형식이라서 하나를 float로 캐스팅 혹은 float형식으로 변경하여
		 * 계산하계되면 int보다 형식이 큰float로 결과값이 나오게된다. (그냥하면 선언시float라해도 대입전에
		 * int형식이되기때문에 둘중하나에 강제캐스팅을해줌으로써 결과값을 float로만들어준다)
		 */

		System.out.println("총점:" + total);
		// 총점의변수인 total값을 출력한다.
		System.out.println("평균:" + avg);
		// 평균의 변수인 avg값을 출력한다.

		// 문제 2) 삼항연산자를 사용하여
		// 평균이 90점이상이면 :A
		// 평균이 80점이상이면 :B
		// 평균이 80점미만이면 :F
		// 를 출력해라
		char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
		// System.out.println((avg>=90)? "A" :(avg>=80)?"B":"F");
		System.out.println("학점 : " + grade);
		// if문을 사용하여 하기.
		String gradeIf = "";
		if (avg >= 90) {
			gradeIf = "A";
			if (avg >= 95) {
				// gradeIf+="+";
				gradeIf = gradeIf + "+";
			}
		} else if (avg >= 80) {
			gradeIf = "B";
			if (avg >= 85) {
				gradeIf = gradeIf + "+";
			}
		} else {
			gradeIf = "F";
		}

		System.out.println("if학점 : " + gradeIf);
	}
}
