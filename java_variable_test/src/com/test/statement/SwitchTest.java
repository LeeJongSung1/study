package com.test.statement;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		// Q4)
		// ���̵�/ �н�����
		// mimi/mimi
		// mamam/mama
		// mumu/mumu
		// ���� + �н����� ���=> ���ѹݺ��̿�
		//
		Scanner sc = new Scanner(System.in);
		boolean exit = true;
		// String idArray[]=new String[100];
		// String pwdArray[]=new String[100];
		String id_Pwd[][] = new String[100][100];
		while (exit) {
			System.out.println("*** �������� ���α׷� ***");
			System.out.println("[1]�α���");
			System.out.println("[2]ȸ������");
			System.out.println("[3]���̵�/�н����� ã��");
			System.out.println("[4]����");
			System.out.print("�޴��� �����ϼ���._");

			String menu = sc.nextLine();
			String msg = "";
			switch (menu) {
			case "1":
				msg = "�α����� ���� �ϼ˽��ϴ�.";
				break;
			case "2":
				msg = "ȸ�������� �����ϼ˽��ϴ�.";
				break;
			case "3":
				msg = "���̵�/�н����� ã�⸦ �����ϼ˽��ϴ�.";
				break;
			case "4":
				msg = "���Ḧ �����ϼ˽��ϴ�.\n ���α׷��� �����մϴ�.";
				System.out.println(msg);
				return;
			default:
				msg = "�����͸� �߸� �Է��ϼ˾��!";
				break;
			}
			System.out.println(msg);
			
		}
	}
}
