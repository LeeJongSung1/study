package com.test.variable;

public class OpertorTest {

	public static void main(String[] args) {
		// ���׿�����
		int i = 0;

		i++;
		++i;
		// ++i,--i(��ġ������):�ش� ���� ����Ǳ�����++(Ȥ��--)������ �����ĵȴ�.
		// i++,i--(���뿬����):�ش� ���� ����� ++(Ȥ��--)�� ����ȴ�.

		System.out.println("++i : " + (++i));
		// ++i�� �ش� ���� ������ ++1�� ����ȴ�.

		i = 0;
		// ����i�� �ʱ�ȭ
		System.out.println("i++ : " + (i++));
		// i++�� �ش� ���� ������� +1�� ����ȴ�.

		i = 0;
		// ����i�� �ʱ�ȭ
		System.out.println("--i : " + (--i));
		// --i�� �ش� ���� ������ +1�� ����ȴ�.
		i = 0;
		// ����i�� �ʱ�ȭ
		System.out.println("i-- : " + (i--));
		// i--�� �ش� ���� ������� -1�� ����ȴ�.

		// ���������
		// ���׿�����.
		int x = 10, y = 2;
		// int �� ���� x�� ���� �ϰ� 10�� �Ͽ��� y������ 2�� �����Ͽ���.
		char ch = 'A';
		// char���� ch�� 'A'�� ����
		// ch = 65; 'A'�� ���Ե� ch�� ASCII���� 65�̴�.

		int sum = x + y;
		// int �� ������ sum�� x�� y���� ���� �����Ͽ���.
		int sub = x - y;
		// int �� ������ sub�� x�� y���� ���� �����Ͽ���.
		int multi = x * y;
		// int �� ������ multi�� x�� y���� ���� �����Ͽ���.
		int mock = x / y;
		// int �� ������ mock�� x�� y�� �������� ���� �����Ͽ���.
		int namuji = x % y;
		// int �� ������ namuji�� �� y�� �������� �������� �����Ͽ���.
		float div = x / (y * 1.0f);
		// float �� ������ div�� x�� y�� �������� �����Ͽ���.
		// (x�� y�� ��� int�� �����⶧���� ������� ������ int ���� �Ǳ⶧����
		// �Ҽ����� �������Եȴ� �װ��� �����ϱ����ؼ� �����ϳ��� ������ float��������
		// ������ �����.

		int chSumInt = ch + 3;
		// ����ch�� ���� 'A'�� �ش��ϴ�ASCII �ڵ尪�� 65�� ����3�� ���� 68�� int�� �ڵ�ĳ���õǾ� 68����µȴ�.

		char chSumInt2 = (char) chSumInt;
		// ASCII �ڵ��� 68�� �ش��ϴ� 'D'���� ��µȴ�.

		// System.out.println((float)x/y);
		// System.out.println(x/(y*1.0f));
		// x/y;->�Ѵ� ������ int���̹Ƿ� ����� int ���̴�.
		// x/(y*1.0f)->�Ѵ� ��Ʈ���̿����� y�� float���� ���آZ�⶧���� y�ǰ���� float������ �ڵ�ĳ���õǾ
		// ����� �Ҽ��� ù���ڸ��������δ�.
		// ? div=x/y;->int ���̵ȴ�.

		System.out.println("x+y=" + sum);
		//sum�ǰ��� ���
		System.out.println("x-y=" + sub);
		//sub�ǰ��� ���
		System.out.println("x*y=" + multi);
		//multi�� ���� ���
		System.out.println("��:x/y=" + mock);
		//mock�� ���� ���
		System.out.println("������:x/y=" + namuji);
		//namuji�� ���� ���
		System.out.println("x/y=" + div);
		//div�� ���� ���
		System.out.println("������A+3:" + chSumInt);
		//chsumInt�� ���� ���
		System.out.println("������A+3:" + chSumInt2);
		//chsumInt2�� ���� ���
		
		// ����1) 1234.56789�� ���� �Ҽ��� ��°�ڸ����� �ݿø� �Ͻÿ�.�� ���� ���
		// Ǯ�̹�� : ���� ĳ�����ϸ� �Ҽ����� �ٹ�����빮��
		// �ݿø��� �ش��ϴ�0.5�� ���Ͽ� ������ �ݿø��� ������ �Ҽ���2����¥������
		// �Ҽ����� ������(X100)���� ĳ�������Ŀ� �ٽ� (/100f)���Ͽ� �ڼ����ڸ��� �ڵ�ĳ�����Ѵ�.
		float testnum = 1234.56789f;

		System.out.println((int) 1.6521421);

		// ������
		System.out.println("x>y:" + (x > y));    
		//x>y�� �������� ������� true(��) false(����)�� ���� �ϳ��� ������ش�. 
		System.out.println("x>=y:" + (x >= y));   
		//x>=y�� �������� ������� true(��) false(����)�� ���� �ϳ��� ������ش�. 
		System.out.println("x<y:" + (x < y));     
		//x<y�� �������� ������� true(��) false(����)�� ���� �ϳ��� ������ش�. 
		System.out.println("x<=y:" + (x <= y));   
		//x<=y�� �������� ������� true(��) false(����)�� ���� �ϳ��� ������ش�. 
		System.out.println("x==y:" + (x == y));   
		//x==y�� �������� ������� true(��) false(����)�� ���� �ϳ��� ������ش�. 
		System.out.println("x!=y:" + (x != y));   
		//x!=y�� �������� ������� true(��) false(����)�� ���� �ϳ��� ������ش�. 

		// ���� ������
		// (���ǽ�) ? A(true) : B(false)
		int kor = 92;
		//int�� ������ kor�� 92�� �����Ͽ���.
		System.out.println("�������� ����: " + ((kor >= 90) ? "A" : "B"));
		//kor�� 90�̻��̸� A �׿��ǰ�� B�� ����Ѵ�.

		// ��������
		int k = 9;
		//int�� ������ k�� 9�� �����Ͽ���.
		int l = 10;
		//int�� ������ l�� 10�� �����Ͽ���.
		
		// &&(and������)
		System.out.println((k > 9) && ((l = 11) > 10));
		// (k>9)�� false�̱� ������&&����(and�����ڰ��ڸ� �����ؼ�) 1=11�� ��������ʾ� l�� 10�̵ȴ�.
		System.out.println(l);
		//10�� ��µȴ�.
		System.out.println((k >= 9) && ((l = 11) > 10));
		// (k>=9)�� true�̱� ������&&(and������) ���İ� ����Ǿ� 1=11�� ����Ǿ� l�� 11�̵ȴ�.
		System.out.println(l);
		//11�� ��µȴ�.
		
		// ||(or������)
		l = 10;
		//l�� �ʱⰪ 10�� �����Ѵ�.
		System.out.println((k >= 9) || ((l = 11) > 10));
		// (k>=9)�� true�̱� ������||(or������) ���İ� ��������ʾ� 1=11�� �������ʰ� l�̱⺻���� 10����µȴ�.
		System.out.println(l);
		//10�� ��µȴ�.
		System.out.println((k > 9) || ((l = 11) > 10));
		// (k>9)�� false�̱� ������||(or������) ���İ� �����dj 1=11�� ����� l=11�� ����Ǿ� 11�� ��µȴ�.
		System.out.println(l);
		//11�� ��µȴ�.
		
		// ���Կ�����(=)
		int m = 0;
		//int�� ���� m�������ϰ� �ʱⰪ���� 0�� �����Ͽ���.
		m = m + 1;
		// m+=1;(������ ������������ �߻�������ʴ´�.)
		System.out.println("m = m + 1 : " + m);
		// m=m+1�� ��������
		
	}

}
