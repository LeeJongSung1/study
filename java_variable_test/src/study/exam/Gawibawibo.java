package study.exam;

import java.util.Random;
import java.util.Scanner;

//����������
public class Gawibawibo {
	public static void main(String[] args) {
		// ����5)���� ���� �������.
		// ����-����-��-���� ������ �̱�
		Random ran= new Random();
		Scanner sc=new Scanner(System.in);
		
		int com=ran.nextInt()+2;
		int player;
		
		System.out.println("����:1 ����:2 ��:3");
		player=Integer.parseInt(sc.nextLine());
		System.out.println("��ǻ�Ͱ� �� �� : "+((com==1)?"����" : (com==2)? "����" : "��"));
		
		switch(player){
			case 1://����
				System.out.println("��������");
				System.out.println((com==1)?"�����" : (com==2)? "����" : "�̰���" );
				break;
			case 2://����
				System.out.println("��������");
				System.out.println((com==1)?"�̱�" : (com==2)? "���" : "����" );
				break;
			case 3://��
				System.out.println("������");
				System.out.println((com==1)?"����" : (com==2)? "�̱�" : "�����" );
				break;
			default:
				System.out.println("�̰Կֳ���????");
		break;
		}
	}
}
