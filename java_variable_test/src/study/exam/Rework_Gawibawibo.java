package study.exam;

import java.util.Random;
import java.util.Scanner;

public class Rework_Gawibawibo {

	public static void main(String[] args) {
		// ����5)���� ���� �������.
		// ����-����-��-���� ������ �̱�
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int com=0;
		int plyNm=0;
		boolean playerChk = true;
		boolean regame = true;
		String xo="";
		String player = "";
		System.out.println("���� ���� �� ������ �����ϰڽ��ϴ�.");
		System.out.println("----START----");
		while (regame) {
			while (playerChk) {
				com = (int) (Math.random() * 3 + 1);
				System.out.println("����:1 ����:2 ��:3");
				player = sc.nextLine();
				/* ��ȿ�� �׽�Ʈ */
				 for(int i = 0; i < player.length(); i++) {
					char testChk = player.charAt(i);
					if (!(testChk >= 48 && testChk <= 57)) {
						// ���ڰ��ƴ�
						System.out.println("���ڰ��ƴϿ��� ���ڸ��Է����ּ���.");
						break;
					} else if (!(Integer.parseInt(player) <= 3 && Integer.parseInt(player) > 0)) {
						System.out.println("0���� ũ�� 4���� ���� ������ �Է��ϼ���.");
						break;
					} else {
						playerChk = false;
					}
				 }
			}
			plyNm=Integer.parseInt(player);
			System.out.println("��ǻ�Ͱ� �� �� : " + ((com == 1) ? "����" : (com == 2) ? "����" : "��"));
			System.out.println("����� �� �� :  " + ((plyNm == 1) ? "����" : (plyNm == 2) ? "����" : "��"));
//			����1 ����2 ��3
//			�̱�=1,-2
//			��=2,-1
			switch(com-plyNm){
				case 2:
				case -1:
					System.out.println("����");
					break;
				
				case 1:
				case-2:
					System.out.println("�̱�");
					break;
				
				case 0:
					System.out.println("���");
					break;
			
			
			}
			/*
			switch (plyNm) {
			case 1:// ����
				System.out.println("����");
				System.out.println((com == 1) ? "�����." : (com == 2) ? "�����ϴ�." : "�̰���.");
				break;
			case 2:// ����
				System.out.println("����");
				System.out.println((com == 1) ? "�̰���." : (com == 2) ? "�����." : "�����ϴ�.");
				break;
			case 3:// ��
				System.out.println("��");
				System.out.println((com == 1) ? "�����ϴ�." : (com == 2) ? "�̰���." : "�����.");
				break;
			default:
				System.out.println("�̰Կֳ�����??");
				break;
			}*/
			
			System.out.println("�ٽ��Ͻǲ�����?(o/x)");
			xo=sc.nextLine().toUpperCase();
			if(xo.equals("X")){
				System.out.println("--------END--------");
				regame=false;
			}else{
				//����� ���� �ʱ�ȭ
				playerChk=true;
			}
		}
	}

}
