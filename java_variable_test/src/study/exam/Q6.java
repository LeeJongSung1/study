package study.exam;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
				//Q6)
				//�л� 3���� �̸� ,����, ����,������ ������ �Է¹޾�
				//������ �л��� ����� ����ϴ� ���α׷��� ���ÿ�
				//������)
			/*
			 * 1���л�
			 * �̸�:xxx
			 * ����:xx
			 * ����:xx
			 * ����:xx
			 * ......
			 * 
			 * 1�� �̸� ���:
			 * 2�� �̸� ���:
			 * ......
			 */
		Scanner sc=new Scanner(System.in);
		String[][] subject=new String[3][4];
		int sum=0;
		
		for(int i=0;i<subject.length;i++){
			System.out.println((i+1)+"���� �л��� �̸� ���� ���� ������ ������ �Է��ϼ���.");
			System.out.print("�̸� : ");
			subject[i][0]=sc.nextLine();
			System.out.print("���� : ");
			subject[i][1]=sc.nextLine();
			System.out.print("���� : ");
			subject[i][2]=sc.nextLine();
			System.out.print("���� : ");
			subject[i][3]=sc.nextLine();
		}
		System.out.println("----���----");
		for(int i=0;i<subject.length;i++){
			System.out.println((i+1)+"�����л� ");
			sum=0;
			
			for(int j=1;j<subject[i].length;j++){
				sum=sum+Integer.parseInt(subject[i][j]);
			}
			System.out.println("��� : "+sum/(subject[i].length-1)*1f);
			
		}
	}
}
