package com.test.variable;

import java.util.Scanner;

public class VariableTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// Ű���� �Է��� �ޱ����� ScannerŬ���� �ҷ��Դ�.
		// �������� scan�� ������.

		/*
		 * int kor=90; //int kor:���� //kor=90 �ʱⰩ ����; //System.out.println(kor);
		 * ���� ���� int eng=80; //int �� ������ eng�� �ʱⰪ80�� �����Ͽ���. int math=100; //int
		 * �� ������ math�� �ʱⰪ80�� �����Ͽ���.
		 * 
		 */
		int kor, eng, math;
		// kor,eng,math�� �����Ѵ�

		// ����3)
		// �ԷµǴ� ���� 0~100������ ������ �����ϵ���
		// for���� �̿��Ͽ� �ٽùݺ�
		System.out.print("�������� : ");
		kor = Integer.parseInt(scan.nextLine());

		System.out.print("�������� : ");
		eng = Integer.parseInt(scan.nextLine());

		System.out.print("�������� : ");
		math = Integer.parseInt(scan.nextLine());

		int total = kor + eng + math;
		// kor,eng,math�� ���� ����� total�� �����Ѵ�.
		float avg = total / 3.0f;
		/*
		 * total�� ���� ����� �����ϴµ� �Ѵ� ������int�����̶� �ϳ��� float�� ĳ���� Ȥ�� float�������� �����Ͽ�
		 * ����ϰ�Ǹ� int���� ������ ūfloat�� ������� �����Եȴ�. (�׳��ϸ� �����float���ص� ��������
		 * int�����̵Ǳ⶧���� �����ϳ��� ����ĳ�������������ν� ������� float�θ�����ش�)
		 */

		System.out.println("����:" + total);
		// �����Ǻ����� total���� ����Ѵ�.
		System.out.println("���:" + avg);
		// ����� ������ avg���� ����Ѵ�.

		// ���� 2) ���׿����ڸ� ����Ͽ�
		// ����� 90���̻��̸� :A
		// ����� 80���̻��̸� :B
		// ����� 80���̸��̸� :F
		// �� ����ض�
		char grade = (avg >= 90) ? 'A' : ((avg >= 80) ? 'B' : 'F');
		// System.out.println((avg>=90)? "A" :(avg>=80)?"B":"F");
		System.out.println("���� : " + grade);
		// if���� ����Ͽ� �ϱ�.
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

		System.out.println("if���� : " + gradeIf);
	}
}
