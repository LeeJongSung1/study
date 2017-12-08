package com.test.array;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
	public static void main(String[] args) {
		// Q7) 임의의 숫자7개를 입력받아 가장 큰수와 가장 작은수를 출력하는 프로그램을 작성하시오
		/*
		 * 실행결과)
		 * 1번쨰숫자:
		 * 2번쨰숫자:
		 * .......
		 * maxnum:
		 * minnum:
		 */
		int arr[]=new int[7];
		//arr-> 참조변수-> 주소값을 가지는부분
		//int[7]실질적 값을 가지는부분 참조변수가 이것의 주소값이용하여 값을 불러온다.
		
		//String형 배열:스트링을 받을수있는 레퍼런스(주소)의 배열

		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++){
			System.out.print((i+1)+" 번쨰 숫자 : ");
			arr[i]=Integer.parseInt(sc.nextLine());
			//arr 배열에 숫자를 입력받고 넣어준다.
		}
		Arrays.sort(arr);
		//오름차순으로 정렬해줌
		
		System.out.println("max num : "+ arr[arr.length-1]);
		System.out.println("min num : "+ arr[0]);
		
	}
}
