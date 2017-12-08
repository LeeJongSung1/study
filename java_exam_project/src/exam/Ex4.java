package exam;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 4-1)다음의 문자들을 조건식으로 표현하라.
		// 1.int형 변수x가 10보다 크고 20보다 작을때 true인 조건식
		int x;
		char ch;
		System.out.println("숫자를 입력하세요");
		x = Integer.parseInt(sc.nextLine());
		System.out.println(x > 10 && x < 20);
		if (x > 10 && x < 20) {
			System.out.println("true");
		}

		// 2.char형 변수가 ch가 공백이나 탭이 아닐 때 true인 조건식
		System.out.println("문자를 하나 입력하세요");
		ch = sc.next().charAt(0);
		System.out.println(!(ch == ' ' || ch == '\t'));
		if (!(ch == ' ' || ch == '\t')) {
			System.out.println("true");

		}
		// 3.char형 변수 ch가 ‘x'또는 ’X'일때 true인 조건식
		System.out.println("문자를 하나 입력하세요");
		ch = sc.next().toUpperCase().charAt(0);
		// ch=sc.next().charAt(0);
		System.out.println(ch == 'x' && ch == 'X');
		if (ch == 'x' && ch == 'X') {
			System.out.println("true");

		}

		// 4.char형 변수 ch가 숫자('0'~'9')일 떄 true인 조건식
		System.out.println("숫자를 하나 입력하세요");
		ch = sc.next().charAt(0);
		// ch=sc.next().charAt(0);
		System.out.println(ch >= '0' && ch <= '9');
		if (ch >= '0' && ch <= '9') {
			System.out.println("true");

		}

		// 5.char형 변수 ch가 영문자 (대문자 또는 소문자)일때 true인 조건식
		System.out.println((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'));

		// 6.int형 변수 year가 400 으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지않을때 true

		int year = 400;
		System.out.println((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
		// 7.boolean형 변수 powerOn가 false일때 true인 조건식
		boolean powerOn=false;
		System.out.println(!powerOn);
		// 8.문자열 참조변수 str이 'yes'일때 true인 조건식
		String str="yes";
		System.out.println(str.equals("yes"));
		//----------------------------------------------------------
		//4-2)1부터 20까지의 정수중에서 2또는 3의 배수가아닌 수의 총합을 구하시오.
		int sum=0;
		for(int i=1;i<21;i++){
			if(i%2!=0&&i%3!=0){
				sum=sum+i;
			}
		}System.out.println(sum);
		//4-4)
	
	
	
	}
}
