package com.string.test;

public class StringTest {
	public static void main(String[] args) {
		String msg = "�ݰ����ϴ�.";
		String msg2 = "Hello";
		System.out.println(msg);
		System.out.println("���ڿ�����:" + msg.length());
		// ���ڿ��� ���̸� ������ ��ȯ�Ѵ�.

		System.out.println("���ڿ�����:" + msg.equals("�ٹٹ�"));
		System.out.println("���ڿ�����:" + msg.equals("�ݰ����ϴ�."));
		// .equals()->��ȣ���� ���ڿ��� .
		// equals ���� ������ ������ ���ڿ��� ������ ������
		// ture false�� ��ȯ�Ѵ�.

		System.out.println("����Ž�� : " + msg.contains("�ݰ�"));
		// �ش�Ǵ� ���ڿ��� �ִ��� �˻��� true false�� ��ȯ.

		System.out.println("�� �ε��� ��ȯ : " + msg.indexOf("�ϴ�"));
		// ���ڿ��� �ִ��� �˻��� �ش繮�ڰ� �ִ� ��ó�� ��ġ�� ������ ��ȯ�Ѵ�.

		System.out.println("index�� ���� ��ȯ : " + msg.charAt(2));
		// �ش� ������ �ִ� ���ڸ� �ش� ���ڿ����� ã�� ��ȯ�Ѵ�.

		System.out.println("���ڿ� Ȯ�� : " + msg.isEmpty());
		// ���ڿ��� ����ִ��� ����Ȯ��(������������� false�� ��µȴ�.)

		System.out.println("���ڿ� ���� : " + msg.replace("�ݰ���", "������"));
		// ���ڿ��� �˻��� �������ڿ��� ,���� ���ڿ��� ��ü�Ѵ�.

		System.out.println("���ڿ� �߶󳻱� : " + msg.substring(0, 3));
		// index ���� ���ں��� �ι�° ���� ���������� ���ڸ� ��ȯ�Ѵ�.

		System.out.println("�빮�� ��ȯ : " + msg2.toUpperCase());
		// �ҹ��ڸ� �빮�ڷ� ��ȯ

		System.out.println("�ҹ��� ��ȯ : " + msg2.toLowerCase());
		// �빮�ڸ� �ҹ��ڷ� ��ȯ

		String testmsg = "1��2��3��4��5��6.";
		boolean isNumber=true;
		for (int i = 0; i < testmsg.length(); i++) {
			char chk= testmsg.charAt(i);
			if(!(chk >= 48 && chk<= 57)){
			System.out.println("2");
				isNumber=false;
			}
//			if (chk >= 48 && chk<= 57) {
//				System.out.println("�����Դϴ�:"+testmsg.charAt(i));
//			}else{
//				System.out.println("�����Դϴ�:"+testmsg.charAt(i));
//			}
////			
		}

	}
}
