package com.test.array;

import java.util.Scanner;

public class ArrayTest02 {
	public static void main(String[] args) {
		// Q4)
		// ���̵�/ �н�����
		// mimi/mimi
		// mamam/mama
		// mumu/mumu
		// ���� + �н����� ���=> ���ѹݺ��̿�
		//
		String[] idArray = new String[100];// id�� ���� �迭����
		String[] pwdArray = new String[100];// password�� ���� �迭 ����
		String inPutID = "";
		String inPutPWD = "";

		idArray[0] = pwdArray[0] = "mimi";
		idArray[2] = pwdArray[1] = "mama";
		idArray[1] = pwdArray[2] = "mumu";
		int currentIndex = 3;
		int findIndex = -1;

		Scanner sc = new Scanner(System.in);

		// String idArray[]=new String[100];
		// String pwdArray[]=new String[100];
		String id_Pwd[][] = new String[100][100];
		while (true) {
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
				// msg = "�α����� ���� �ϼ˽��ϴ�.";
				System.out.println("�α����� ���� �ϼ˽��ϴ�.\n");
				System.out.print("���̵� : ");
				inPutID = sc.nextLine();
				findIndex = -1;
				for (int index = 0; index < currentIndex; index++) {
					if (idArray[index].equals(inPutID)) {
						findIndex = index;
						break;
					} /*
						 * else{//�������� �ʴ� ���̵� if(index==(currentIndex-1)){
						 * System.out.println("���̵� �������� �ʽ��ϴ�.\n"); } }
						 */
				}
				if (findIndex > -1) {
					System.out.print("��й�ȣ : ");
					inPutPWD = sc.nextLine();
					if (pwdArray[findIndex].equals(inPutPWD)) {
						System.out.println("�α��ο� �����ϼ˽��ϴ�.\n");
					} else {// ��й�ȣ ����ġ
						System.out.println("�α��ο� �����ϼ˽��ϴ�.\n");
					}
				} else {// �������� �ʴ� ���̵�
					System.out.println("���̵� �������� �ʽ��ϴ�.\n");
				}

				break;
			case "2":
				// msg = "ȸ�������� �����ϼ˽��ϴ�.";
				System.out.println("ȸ�������� �����ϼ˽��ϴ�.\n");
				System.out.print("���̵� : ");
				inPutID = sc.nextLine();
				if (currentIndex >= idArray.length) {// idArray�迭�� ������ �������
														// Ȯ���Ѵ�.
					String[] temp = new String[idArray.length + 20];
					// ���ο� temp�迭�� �����ϰ� idArray�� ���̺��� 20ũ�� ������ش�.
					for (int i = 0; i < idArray.length; i++) {
						// �ڷḦ �ű������ idArray�Ǳ��̸�ŭ for���� �ݺ��Ѵ�.
						temp[i] = idArray[i];
						// idArray�� �迭 �����͸� temp�� �����Ѵ�.
					}
					idArray = temp;
					// ���ο� idArray�� temp�� �����Ѵ�.
				}
				boolean exsistID = false;
				for (int index = 0; index < currentIndex; index++) {
					if (idArray[index].equals(inPutID)) {
						exsistID = true;
						break;
					}
				}
				if (!exsistID) {
					System.out.println("��й�ȣ :");
					inPutPWD = sc.nextLine();
					idArray[currentIndex] = inPutID;
					pwdArray[currentIndex] = inPutPWD;
					currentIndex++;
					//���̵�� �н������� �迭�� �Է¹��� ���� �����Ѵ�.
					System.out.println("���Կ� �����ϼ˽��ϴ�.");
				} else {
					System.out.println("�ߺ��� ���̵��Դϴ�.");
					break;
				}

				break;
			case "3":
				// msg = "���̵�/�н����� ã�⸦ �����ϼ˽��ϴ�.";
				System.out.println("���̵�/�н����� ã�⸦ �����ϼ˽��ϴ�.\n");
				break;
			case "4":
				// msg = "���Ḧ �����ϼ˽��ϴ�.\n ���α׷��� �����մϴ�.";
				System.out.println("���Ḧ �����ϼ˽��ϴ�.\n ���α׷��� �����մϴ�.\n");
				return;
			default:
				// msg = "�����͸� �߸� �Է��ϼ˾��!";
				System.out.println("�����͸� �߸� �Է��ϼ˾��!\n");
				break;
			}

		}
	}
}



