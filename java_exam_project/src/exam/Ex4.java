package exam;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 4-1)������ ���ڵ��� ���ǽ����� ǥ���϶�.
		// 1.int�� ����x�� 10���� ũ�� 20���� ������ true�� ���ǽ�
		int x;
		char ch;
		System.out.println("���ڸ� �Է��ϼ���");
		x = Integer.parseInt(sc.nextLine());
		System.out.println(x > 10 && x < 20);
		if (x > 10 && x < 20) {
			System.out.println("true");
		}

		// 2.char�� ������ ch�� �����̳� ���� �ƴ� �� true�� ���ǽ�
		System.out.println("���ڸ� �ϳ� �Է��ϼ���");
		ch = sc.next().charAt(0);
		System.out.println(!(ch == ' ' || ch == '\t'));
		if (!(ch == ' ' || ch == '\t')) {
			System.out.println("true");

		}
		// 3.char�� ���� ch�� ��x'�Ǵ� ��X'�϶� true�� ���ǽ�
		System.out.println("���ڸ� �ϳ� �Է��ϼ���");
		ch = sc.next().toUpperCase().charAt(0);
		// ch=sc.next().charAt(0);
		System.out.println(ch == 'x' && ch == 'X');
		if (ch == 'x' && ch == 'X') {
			System.out.println("true");

		}

		// 4.char�� ���� ch�� ����('0'~'9')�� �� true�� ���ǽ�
		System.out.println("���ڸ� �ϳ� �Է��ϼ���");
		ch = sc.next().charAt(0);
		// ch=sc.next().charAt(0);
		System.out.println(ch >= '0' && ch <= '9');
		if (ch >= '0' && ch <= '9') {
			System.out.println("true");

		}

		// 5.char�� ���� ch�� ������ (�빮�� �Ǵ� �ҹ���)�϶� true�� ���ǽ�
		System.out.println((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));

		// 6.int�� ���� year�� 400 ���� �����������ų� �Ǵ� 4�� ������������ 100���� ������������������ true

		int year = 400;
		System.out.println((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
		// 7.boolean�� ���� powerOn�� false�϶� true�� ���ǽ�
		boolean powerOn=false;
		System.out.println(!powerOn);
		// 8.���ڿ� �������� str�� 'yes'�϶� true�� ���ǽ�
		String str="yes";
		System.out.println(str.equals("yes"));
		//----------------------------------------------------------
		//4-2)1���� 20������ �����߿��� 2�Ǵ� 3�� ������ƴ� ���� ������ ���Ͻÿ�.
		int sum=0;
		for(int i=1;i<21;i++){
			if(i%2!=0&&i%3!=0){
				sum=sum+i;
			}
		}System.out.println(sum);
		//4-4)
	
	
	
	}
}
