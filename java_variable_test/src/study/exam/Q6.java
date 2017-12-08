package study.exam;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
				//Q6)
				//학생 3명의 이름 ,국어, 영어,수학의 점수를 입력받아
				//각각의 학생의 평균을 출력하는 프로그램을 쓰시오
				//실행결과)
			/*
			 * 1번학생
			 * 이름:xxx
			 * 국어:xx
			 * 영어:xx
			 * 수학:xx
			 * ......
			 * 
			 * 1번 이름 평균:
			 * 2번 이름 평균:
			 * ......
			 */
		Scanner sc=new Scanner(System.in);
		String[][] subject=new String[3][4];
		int sum=0;
		
		for(int i=0;i<subject.length;i++){
			System.out.println((i+1)+"번쨰 학생의 이름 국어 영어 수학의 점수를 입력하세요.");
			System.out.print("이름 : ");
			subject[i][0]=sc.nextLine();
			System.out.print("국어 : ");
			subject[i][1]=sc.nextLine();
			System.out.print("영어 : ");
			subject[i][2]=sc.nextLine();
			System.out.print("수학 : ");
			subject[i][3]=sc.nextLine();
		}
		System.out.println("----출력----");
		for(int i=0;i<subject.length;i++){
			System.out.println((i+1)+"번쨰학생 ");
			sum=0;
			
			for(int j=1;j<subject[i].length;j++){
				sum=sum+Integer.parseInt(subject[i][j]);
			}
			System.out.println("평균 : "+sum/(subject[i].length-1)*1f);
			
		}
	}
}
