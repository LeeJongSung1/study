package com.string.test;

public class StringTest {
	public static void main(String[] args) {
		String msg = "반갑습니다.";
		String msg2 = "Hello";
		System.out.println(msg);
		System.out.println("문자열길이:" + msg.length());
		// 문자열의 길이를 정수로 반환한다.

		System.out.println("문자열길이:" + msg.equals("바바바"));
		System.out.println("문자열길이:" + msg.equals("반갑습니다."));
		// .equals()->괄호안의 문자열과 .
		// equals 앞의 변수에 대입한 문자열이 같은지 비교한후
		// ture false로 반환한다.

		System.out.println("문자탐색 : " + msg.contains("반갑"));
		// 해당되는 문자열이 있는지 검색후 true false로 반환.

		System.out.println("비교 인덱스 반환 : " + msg.indexOf("니다"));
		// 문자열에 있는지 검색후 해당문자가 있는 맨처음 위치를 정수로 반환한다.

		System.out.println("index의 글자 반환 : " + msg.charAt(2));
		// 해당 정수에 있는 문자를 해당 문자열에서 찾아 반환한다.

		System.out.println("빈문자열 확인 : " + msg.isEmpty());
		// 문자열이 비어있는지 유무확인(비어있지않으면 false가 출력된다.)

		System.out.println("문자열 변경 : " + msg.replace("반갑습", "감사합"));
		// 문자열을 검색후 같은문자열을 ,뒤의 문자열로 교체한다.

		System.out.println("문자열 잘라내기 : " + msg.substring(0, 3));
		// index 앞의 숫자부터 두번째 숫자 이전까지의 문자를 반환한다.

		System.out.println("대문자 변환 : " + msg2.toUpperCase());
		// 소문자를 대문자로 변환

		System.out.println("소문자 변환 : " + msg2.toLowerCase());
		// 대문자를 소문자로 변환

		String testmsg = "1반2갑3습4니5다6.";
		boolean isNumber=true;
		for (int i = 0; i < testmsg.length(); i++) {
			char chk= testmsg.charAt(i);
			if(!(chk >= 48 && chk<= 57)){
			System.out.println("2");
				isNumber=false;
			}
//			if (chk >= 48 && chk<= 57) {
//				System.out.println("숫자입니다:"+testmsg.charAt(i));
//			}else{
//				System.out.println("문자입니다:"+testmsg.charAt(i));
//			}
////			
		}

	}
}
