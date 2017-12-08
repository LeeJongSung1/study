package com.test.variable;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
		// 문제1) 1234.56789의 수의 소숫점 셋째자리에서 반올림 하시오.
		// 풀이방법 : 강제 캐스팅하면 소숫점을 다버리기대문에
		// 반올림에 해당하는0.5를 더하여 연산적 반올림을 해준후 소숫점2번쨰짜리까지
		// 소숫점을 내린후(X100)강제 캐스팅한후에 다시 (/100f)를하여 솟숫점자리로 자동캐스팅한다.
	
		float testNum = 1234.56789f;
		//반올림 할 변수
		
		float resultNum;
		//반올림 값을 저장할 변수

		System.out.println("1.문제:"+testNum);
		testNum=(testNum*100);

		System.out.println("2.반올림할 소수까지 소숫점을 이동:"+testNum);
		//123456.789=1234.56789X100
		//소수점을 2칸 오른쪽으로 옮기기 위해서 *100을 한다.
		
		testNum=(testNum+0.5f);
		System.out.println("3.반올림작업을위해 0.5를 더함(반올림1):"+testNum);
		//123457.289=123456.789+0.5
		//반올림은 0.5이상일시 그윗자리에+1이 되는형식이므로 0.5를 더한다.
		
		testNum=(int)testNum;
		System.out.println("4.강제캐스팅(int)를 통해\n소숫점이하를 버림(반올림2): "+testNum);
		
		resultNum=testNum/100f;
		System.out.println("5.소숫점을 다시 복귀시킴 : "+resultNum);
		
//		resultNum=(int)testNum/100f;
		
		//그후 소숫점이하를 int로 강제캐스팅한다(강제캐스팅시 소숫점을 모두버림)=반올림형식이됨,
		//거기에 나누기100을하면 소숫점이 다시 좌측으로2칸 가게되고 결론적으로 소숫점3째자리에서 반올림한것과 같은결과가 된다.
		System.out.println(resultNum);
		//결과
		
		// 문제 2) 삼항연산자를 사용하여
		// 평균이 90점이상이면 :A
		// 평균이 80점이상이면 :B
		// 평균이 80점미만이면 :F
		// 를 출력해라
		// 풀이방법: 삼항연산자안에 새로운 삼항연산자를 넣어서 이중 질의를 통해 결과를 출력한다.
		// 0~100사이의 숫자+종료
		// 숫자만.
		
		int kor = 10;
		//int형 변수인 kor을 선언하고 그 초기값을 대입하였다.
		int eng = 20;
		//int형 변수인 eng를 선언하고 그 초기값을 대입하였다.
		int math = 70;
		//int형 변수인 math를 선언하고 그 초기값을 대입하였다.
		float div=(float)(kor+eng+math)/3.0f;
		//float형 변수인 div를 선언한후
		//초기값으로kor+eng+math의 평균를 대입하였다.
		
		System.out.println("평균 :"+div);
		//평균값 div를 출력 한다.
		
		System.out.println((div>=90)? "A" :(div>=80)?"B":"F");
		//삼항연산자로 90이상일시 A를출력하고
		//그외의경우 (div>=80)연산후 'ture(참)'일때 : "B" 'false(거짓)'일떄 : 'F' 를 실행한다.
		
		
	
		
	}
}
