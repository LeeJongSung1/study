package com.test.array;

public class ArrayTest01 {
	int x = 30; // �޸� ������ heap�� ������.->method������ �ٸ� �ּҰ��� �����⶧����
	// method������ �ִ� ���� �̸��� ������ �ߺ������� �������� �ʴ´�.
	{
		int x = 100000;// �޸� ������ method������ ������.->heap���� ������ �Ͱ� �ּҰ��� �ٸ��⶧����
		System.out.println(x);// 100000�� ��µȴ�. ���� ���������� ������ Ŭ���������� ã�Ƽ� �����´�.

		// int x;//���� ����� x������ �־ �ߺ�������
		{
			int y;
			// int x;//������ x������ �־ �ߺ��ȴ�.
			{
				// int x;//������ x������ �־ �ߺ��ȴ�.

			}
		}

		{
			int y;// ���� ������ y�� ����������� �������̱⶧���� �ߺ��� ���� �ʴ´�.

		}
	}

	public static void main(String[] args) {
		// 1���� �迭
		int[] intArray = new int[5];
		// int�� �迭intArray�� �����ϰ� �� ���̸� 5�� ������
		int[] intArray2 = { 1, 2, 3, 4, 5 };
		// int�� �迭intArray2�� �����ϰ� �ʱⰪ1,2,3,4,5�� ���� �־���

		int[] intArray3 = new int[] { 1, 2, 3, 4, 5 };
		// int�� �迭intArray3�� �����ϰ� �ʱⰪ1,2,3,4,5�� ���� �־���

		intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int�� �迭intArray�� �����ϰ� �ʱⰪ1,2,3,4,5,6,7,8,9,10�� ���� �־���

		int[] intArray4 = new int[100];
		// int�� �迭�� �����ϰ� ũ�⸦ 100���� ��´�.

		for (int index = 0; index < intArray4.length; index++) {
			// intArray4.length ->intArray4�迭�� �ش��ϴ� ���̸�ŭ ���� ��ȯ�Ѵ�.
			// �� for���� 0���� intArray4�� ���̱��� �ݺ��ϰԵȴ�.
			intArray4[index] = index + 1;
			// for�ȿ��� �����ϴ� int�� ������ intArray4�� �����ȿ� �����Ƿν� �迭�� 0~intArray4�� ���̱���
			// ���� ������ �ִ�.

		}
		// Q1)
		for (int index = 0; index < intArray4.length; index++) {

			if (index % 10 != 0) {// for���� ������ index�� �˻��Ͽ� 10���� ���������� 0���� ������������
									// �˻��ϳ�.
				System.out.print(",");// 10���� �������������� ','�� ����Ѵ�.
			} else {
				System.out.println();// 10���� �������� �ٹٲ��� �����Ѵ�.
			}
			System.out.print(intArray4[index] + "" + ((intArray4[index] % 10 != 0) ? "," : "\n"));
			// ���� if���� ��������� �����Ͽ���. ntArray4[index]������� 'intArray4[index] % 10
			// !=0' ���� ���Ǹ����� 10���� ������������� �˻���
			// ������ �������������� ','������ϰ� ����������� �ٹٲ���'\n'�� �����Ѵ�.

			// System.out.println(intArray4[index]);
			// System.out.print((intArray4[index] % 10 != 0)?"\n":",");
			// System.out.print(intArray4[index] + ((intArray4[index] % 10 != 0)
			// ? "," : "\n"));
		}
		// 2���� �迭(�� X ��)�� �迭�ȿ� �迭
		int[][] intArrays = new int[3][3];// 3�� 3���� 2���� �迭 ����

		int[][] intArrays2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// 2���� �迭�� �����ϰ� �ʱⰪ�� 1~9���� ������.
		int[][] scoreTable = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		// 2 ���� �迭�� �����ϰ� ���̺� ������ �ش��ϴ� ���� �����Ѵ�.

		// Q2)�迭�� �ִ� ���� ��ճ���

		int sum;
		System.out.println("---------------------------------");//������������� �����------����
		System.out.println("����\t|����\t|����\t|���");//���� ���� ���� ����� �����ִ� �ؽ�Ʈ����
		for (int i = 0; i < scoreTable.length; i++) {// scoreTable�Ǳ��̸�ŭ for���� �ݺ��Ѵ�.
			sum = 0;//���հ��� �ʱ�ȭ�Ѵ�.
			for (int j = 0; j < scoreTable[i].length; j++) {
				sum = sum + scoreTable[i][j];
				//2�����迭�� scoreTable���� i���� 0~scoreTable�� ���̱������� ������ ���� j�� 0~scoreTable�� ���̸�ŭ ������
				// �װ��� sum�� ���Ͽ��ش�.
				System.out.print(scoreTable[i][j]+ (((j + 1) % 3 == 0) ? "\t|" + (sum * 1f / scoreTable[i].length) + "\n" : "\t|"));
				//scoreTable[i][j] ���� �����
				//scoreTable[i]�� ���̰�. 3���� ����� �������� '\t(tab)'�� ��հ��� ����� �ϰ� �׿��� ����϶�  '\t(tab)'���� ����Ѵ�.
				System.out.print(scoreTable[i][j] + "|");
				//scoreTable[i]���� "|"������ �����ִ� �ؽ�Ʈ�� ����Ѵ�.
//				if ((j + 1) % 3 == 0) {//���� 3�϶��� üũ�Ѵ�.
//					System.out.print(sum / 3f);//if������ ���϶� ��հ��� ����Ѵ�.
//				}
			}
			System.out.println("---------------------------------");//������������� �����------����
		}

		/*
		 * System.out.println("---------------------------------");//������������� �����------����
		 * System.out.println("����\t|����\t|����\t|");//���� ���� ������ �����ִ� �ؽ�Ʈ����
		 */
		int sumArr[] = new int[3];
		for (int i = 0; i < scoreTable.length; i++) {
			 sumArr[0]=sumArr[0]+scoreTable[i][0];
			//������ �迭sumArr�� ó���κп� ������ �迭�� scoreTable��i���� 0���κ��� �����͸� ���Ͽ��ش�.
			 sumArr[1]=sumArr[1]+scoreTable[i][1];
			//������ �迭sumArr�� ó���κп� ������ �迭�� scoreTable��i����1���κ��� �����͸� ���Ͽ��ش�.
			 sumArr[2]=sumArr[2]+scoreTable[i][2];
			//������ �迭sumArr�� ó���κп� ������ �迭�� scoreTable��i����3���κ��� �����͸� ���Ͽ��ش�.
			 /*	for (int j = 0; j < scoreTable[i].length; j++) {
				sumArr[j] = sumArr[j] + scoreTable[i][j];
			}*/
		}
		// System.out.print(sumArr[0] / 3f + "|" + sumArr[1] / 3f + "|" +
		// sumArr[2] / 3f);

		int[] intarr = new int[4];
		// int �� �迭�� intarr[]�� 4�� ���̷� �����Ѵ�.
		for (int i = 0; i < intarr.length; i++) {// for���� intarr�� ���̸�ŭ �ݺ��Ѵ�.
			intarr[i] = i;
			// intarr�� i���� �Է��Ѵ�(0~intarr �迭�� ���̸�ŭ)
		}

	}
}
