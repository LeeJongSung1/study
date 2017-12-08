package com.test.variable;

public class OpertorTest {

	public static void main(String[] args) {
		// 단항연산자
		int i = 0;

		i++;
		++i;
		// ++i,--i(전치연산자):해당 행이 실행되기전에++(혹은--)가먼저 실행후된다.
		// i++,i--(후취연산자):해당 행이 실행우 ++(혹은--)가 실행된다.

		System.out.println("++i : " + (++i));
		// ++i은 해당 행이 실행전 ++1이 실행된다.

		i = 0;
		// 변수i의 초기화
		System.out.println("i++ : " + (i++));
		// i++은 해당 행이 실행된후 +1이 실행된다.

		i = 0;
		// 변수i의 초기화
		System.out.println("--i : " + (--i));
		// --i은 해당 행이 실행전 +1이 실행된다.
		i = 0;
		// 변수i의 초기화
		System.out.println("i-- : " + (i--));
		// i--은 해당 행이 실행된후 -1이 실행된다.

		// 산술연산자
		// 이항연산자.
		int x = 10, y = 2;
		// int 형 변수 x를 선언 하고 10을 하였고 y변수에 2를 대입하였다.
		char ch = 'A';
		// char변수 ch에 'A'를 대입
		// ch = 65; 'A'가 삽입된 ch의 ASCII값은 65이다.

		int sum = x + y;
		// int 형 변수인 sum에 x와 y값의 합을 대입하였다.
		int sub = x - y;
		// int 형 변수인 sub에 x와 y값의 차을 대입하였다.
		int multi = x * y;
		// int 형 변수인 multi에 x와 y값의 곱을 대입하였다.
		int mock = x / y;
		// int 형 변수인 mock에 x을 y로 나눈값의 몫을 대입하였다.
		int namuji = x % y;
		// int 형 변수인 namuji에 을 y로 나눈값의 나머지를 대입하였다.
		float div = x / (y * 1.0f);
		// float 형 변수인 div에 x를 y로 나눈값을 대입하였다.
		// (x와 y가 모두 int형 변수기때문에 결과값이 강제로 int 형이 되기때문에
		// 소숫점이 버려지게된다 그것을 방지하기위해서 둘중하나의 변수를 float형식으로
		// 형변한 해줬다.

		int chSumInt = ch + 3;
		// 변수ch의 값인 'A'에 해당하는ASCII 코드값인 65와 정수3의 합인 68이 int로 자동캐스팅되어 68로출력된다.

		char chSumInt2 = (char) chSumInt;
		// ASCII 코드의 68에 해당하는 'D'값이 출력된다.

		// System.out.println((float)x/y);
		// System.out.println(x/(y*1.0f));
		// x/y;->둘다 변수가 int형이므로 결과가 int 형이다.
		// x/(y*1.0f)->둘다 인트형이였지만 y에 float형을 곱해줫기때문에 y의결과가 float형으로 자동캐스팅되어서
		// 결과가 소숫점 첫재자리까지보인다.
		// ? div=x/y;->int 형이된다.

		System.out.println("x+y=" + sum);
		//sum의값을 출력
		System.out.println("x-y=" + sub);
		//sub의값을 출력
		System.out.println("x*y=" + multi);
		//multi의 값을 출력
		System.out.println("몫:x/y=" + mock);
		//mock의 값을 출력
		System.out.println("나머지:x/y=" + namuji);
		//namuji의 값을 출력
		System.out.println("x/y=" + div);
		//div의 값을 출력
		System.out.println("정수형A+3:" + chSumInt);
		//chsumInt의 값을 출력
		System.out.println("문자형A+3:" + chSumInt2);
		//chsumInt2의 값을 출력
		
		// 문제1) 1234.56789의 수의 소숫점 셋째자리에서 반올림 하시오.의 값을 출력
		// 풀이방법 : 강제 캐스팅하면 소숫점을 다버리기대문에
		// 반올림에 해당하는0.5를 더하여 연산적 반올림을 해준후 소숫점2번쨰짜리까지
		// 소숫점을 내린후(X100)강제 캐스팅한후에 다시 (/100f)를하여 솟숫점자리로 자동캐스팅한다.
		float testnum = 1234.56789f;

		System.out.println((int) 1.6521421);

		// 연산자
		System.out.println("x>y:" + (x > y));    
		//x>y의 참거짓의 결과값을 true(참) false(거짓)의 값중 하나로 출력해준다. 
		System.out.println("x>=y:" + (x >= y));   
		//x>=y의 참거짓의 결과값을 true(참) false(거짓)의 값중 하나로 출력해준다. 
		System.out.println("x<y:" + (x < y));     
		//x<y의 참거짓의 결과값을 true(참) false(거짓)의 값중 하나로 출력해준다. 
		System.out.println("x<=y:" + (x <= y));   
		//x<=y의 참거짓의 결과값을 true(참) false(거짓)의 값중 하나로 출력해준다. 
		System.out.println("x==y:" + (x == y));   
		//x==y의 참거짓의 결과값을 true(참) false(거짓)의 값중 하나로 출력해준다. 
		System.out.println("x!=y:" + (x != y));   
		//x!=y의 참거짓의 결과값을 true(참) false(거짓)의 값중 하나로 출력해준다. 

		// 삼항 연산자
		// (조건식) ? A(true) : B(false)
		int kor = 92;
		//int형 변수인 kor에 92를 대입하였다.
		System.out.println("국어점수 레벨: " + ((kor >= 90) ? "A" : "B"));
		//kor이 90이상이면 A 그외의경우 B를 출력한다.

		// 논리연산자
		int k = 9;
		//int형 변수인 k에 9를 대입하였다.
		int l = 10;
		//int형 변수인 l에 10를 대입하였다.
		
		// &&(and연산자)
		System.out.println((k > 9) && ((l = 11) > 10));
		// (k>9)가 false이기 때문에&&이후(and연산자가뒤를 무시해서) 1=11이 실행되지않아 l이 10이된다.
		System.out.println(l);
		//10이 출력된다.
		System.out.println((k >= 9) && ((l = 11) > 10));
		// (k>=9)가 true이기 때문에&&(and연산자) 이후가 실행되어 1=11이 실행되어 l이 11이된다.
		System.out.println(l);
		//11이 출력된다.
		
		// ||(or연산자)
		l = 10;
		//l에 초기값 10을 대입한다.
		System.out.println((k >= 9) || ((l = 11) > 10));
		// (k>=9)가 true이기 때문에||(or연산자) 이후가 실행되지않아 1=11이 실행지않고 l이기본값은 10이출력된다.
		System.out.println(l);
		//10이 출력된다.
		System.out.println((k > 9) || ((l = 11) > 10));
		// (k>9)가 false이기 때문에||(or연산자) 이후가 실행되dj 1=11이 실행어 l=11이 실행되어 11이 출력된다.
		System.out.println(l);
		//11이 출력된다.
		
		// 대입연산자(=)
		int m = 0;
		//int형 변수 m을선언하고 초기값으로 0을 대입하였다.
		m = m + 1;
		// m+=1;(오류와 가독성때문에 잘사용하지않는다.)
		System.out.println("m = m + 1 : " + m);
		// m=m+1의 결과값출력
		
	}

}
