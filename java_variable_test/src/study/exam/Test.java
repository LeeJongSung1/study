package study.exam;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String[] x=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("�Է�");
		for(int i=0;i<x.length;i++){
			System.out.print(i+":");
			x[i]=sc.nextLine();
		}
		System.out.println("���");
		for(int i=0;i<x.length;i++){
			System.out.println(i+":"+x[i]);
		}
		System.out.println("�Է�2");
		for(int i=0;i<x.length;i++){
			System.out.print(i+":");
			x[i]=sc.nextLine();
		}
		System.out.println("���2");
		for(int i=0;i<x.length;i++){
			System.out.println(i+":"+x[i]);
		}
		
	}
}
