package study.exam;

import java.util.Scanner;

public class ABCDF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor;
		int eng;
		int math;
		int count;
		float div;
		char testChk;
		String hak;
		String chkYN;
		String chkNum;
		boolean hakStart = true;
		boolean reStart = true;
		
		while (reStart) {
			kor=0;
			eng=0;
			math=0;
			div=0f;
			testChk = ' ';
			chkYN="";
			chkNum="xxx";
			count=0;
			hak = "";
			while (hakStart) {
				for (int i = 0; i < chkNum.length(); i++) {
					System.out.print(((count == 0) ? "����" : (count == 1) ? "����" : "����") + "�������Է�:");
					chkNum = sc.nextLine();
					testChk = chkNum.charAt(i);
					if (!(testChk >= 48 && testChk <= 57)) {
						System.out.println("���ڰ��ƴϿ��� ���ڸ��Է����ּ���.");
						break;
					} else if (!(Integer.parseInt(chkNum) <= 100 && Integer.parseInt(chkNum) >= 0)) {
						System.out.println("0�̻� 100������ ���� ������ �Է��ϼ���.");
						break;
					} else {
						count++;
						switch(count){
						case 1:
							kor = Integer.parseInt(chkNum);
							break;
						case 2:
							eng = Integer.parseInt(chkNum);
							break;
						case 3:
							math = Integer.parseInt(chkNum);
							break;
						}
				/*		if (count == 1) {
							kor = Integer.parseInt(chkNum);
							break;
						} else if (count == 2) {
							eng = Integer.parseInt(chkNum);
							break;
						} else {
							math = Integer.parseInt(chkNum);
						}*/
					}
					if (count == 3) {
						hakStart = false;
						break;
					}
				}
			}

			if (kor == 0 && eng == 0 && math == 0) {// ��� 0���ϰ��
				hak = "F";
			} else {
				div = (float) (kor + eng + math) / 3.0f;
				// float�� ������ div�� ��������
				// �ʱⰪ����kor+eng+math�� ��ո� �����Ͽ���.

				switch ((int) (div / 10)) {// ���� �ο��κ�
				case 10:
				case 9:
					if (div % 10 >= 0.5) {
						hak = "A++";
					} else {
						hak = "A";
					}
					break;
				case 8:
					if (div % 10 >= 0.5) {
						hak = "B++";
					} else {
						hak = "B";
					}
					break;
				case 7:
					if (div % 10 >= 0.5) {
						hak = "C++";
					} else {
						hak = "C";
					}
					break;
				default:
					hak = "F";
					break;
				}
			}
			System.out.println("�������� ����:"+(kor + eng + math));
			System.out.println("�����:"+(int)div);
			System.out.println("������:"+hak);
			System.out.println("���Է��Ͻðڽ��ϱ�?(y/n)");
			chkYN = sc.nextLine().toUpperCase();
			if (chkYN.equals("N")) {
				System.out.println("--------END--------");
				reStart = false;
			} else {
				// ����� ���� �ʱ�ȭ
				hakStart = true;
			}
		}

	}
}
