package com.test.statement;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {

		// ����3)
		// �ԷµǴ� ���� 0~100������ ������ �����ϵ���
		// '����ҷ�?(y/n)�߰��ϰ�'n'�ϋ����� �ݺ��ϱ�.
		// for���� �̿��Ͽ� �ٽùݺ�

		int kor2, eng2, math2;
		// ������ ���� kor,eng,math�� �����Ѵ�
		int fac;
		// ������ ���� ������ ���� fac
		String subject = "";
		//������� ���� ���ڿ� ���� subject�� �����ϰ� �ʱⰪ���� ""�� ��
		Scanner scan = new Scanner(System.in);
		while (!scan.nextLine().equals("n")) {// while���ǹ��� Ʋ�������� �ݺ�
			
			for (int i = 0; i < 3; i++) {
				if (i == 0) {// ����
					subject = "����";
				} else if (i == 1) {// ����
					subject = "����";
				} else if (i == 2) {// ����
					subject = "����";
				}
				System.out.print(subject + "���� �� �Է��ϼ���.");
			
				fac = Integer.parseInt(scan.nextLine());
				if (fac >= 0 && fac <= 100) {
					if (i == 0) {// ����
					} else if (i == 1) {// ����
					} else if (i == 2) {// ����
					}
					System.out.println(subject + "���� : " + fac);
					// ������0�̻��̰� 100�����̸� ������ �Է¹޴´�.
				} else {
					System.out.println(subject + "������ �ٽ��Է��ϼ���. ");
					i--;// �೪�� �ٽ� �ش� ������ �ٽùޱ����� i++�Ȱ��� �ٽû���
				}
				
				System.out.print("����ҷ���?(y/n");
			}
		}
		System.out.println("end");

	
			
		
	}
}
