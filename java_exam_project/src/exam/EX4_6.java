package exam;

import java.util.Scanner;

public class EX4_6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		//2���� �ֻ����� ��������, ���� ���� 6�̵Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�/
		int sum=0;
		sum=Integer.parseInt(sc.nextLine());

		sumResult(sum);
	
		/*
		sum=0;
		for(int i=1;i<7;i++){
			for(int j=1;j<7;j++){
				if(i+j==6){
					System.out.print("i="+i);
					System.out.print("j="+j);
					sum++;
				}
				System.out.println();
			}
		}
		System.out.println(sum);
		
		sum=0;
		int j=0;
		
		for(int i=1;i<6;i++){
			j=6-i;
			if(i+j==6){
				System.out.println(i+"+"+j+"="+(i+j));
				sum++;
			}
		}
		System.out.println(sum);
		 */
	}
	public static void sumResult(int sum){
		for(int num1=1;num1<7;num1++){
			for(int num2=1;num2<7;num2++){
				System.out.println("("+num1+","+num2+")");
			}
		}
	}
}
