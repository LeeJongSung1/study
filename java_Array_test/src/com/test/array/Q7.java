package com.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		// Q7) ������ ����7���� �Է¹޾� ���� ū���� ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		/*
		 * ������)
		 * 1��������:
		 * 2��������:
		 * .......
		 * maxnum:
		 * minnum:
		 */
		int arr[]=new int[7];
		//arr-> ��������-> �ּҰ��� �����ºκ�
		//int[7]������ ���� �����ºκ� ���������� �̰��� �ּҰ��̿��Ͽ� ���� �ҷ��´�.
		
		//String�� �迭:��Ʈ���� �������ִ� ���۷���(�ּ�)�� �迭

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++){
			System.out.print((i+1)+" ���� ���� : ");
			arr[i]=Integer.parseInt(sc.nextLine());
			//arr �迭�� ���ڸ� �Է¹ް� �־��ش�.
		}
		Arrays.sort(arr);
		//������������ ��������
		
		System.out.println("max num : "+ arr[arr.length-1]);
		System.out.println("min num : "+ arr[0]);
		
	}
}
