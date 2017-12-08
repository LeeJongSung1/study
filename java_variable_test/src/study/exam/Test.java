package study.exam;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String[] x=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("입력");
		for(int i=0;i<x.length;i++){
			System.out.print(i+":");
			x[i]=sc.nextLine();
		}
		System.out.println("출력");
		for(int i=0;i<x.length;i++){
			System.out.println(i+":"+x[i]);
		}
		System.out.println("입력2");
		for(int i=0;i<x.length;i++){
			System.out.print(i+":");
			x[i]=sc.nextLine();
		}
		System.out.println("출력2");
		for(int i=0;i<x.length;i++){
			System.out.println(i+":"+x[i]);
		}
		
	}
}
