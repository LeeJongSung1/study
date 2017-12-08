package study.exam;

import java.util.Arrays;
import java.util.Scanner;

public class LOTTO {
	public static void main(String[] args) {
		//LOTTO
		//Q5) 1~45까지의 정수중에 중복하지 않는 임의의 6개를 선택해서 출력하시오.
	
	/*	
	  	int[] LOTTO=new int[45];
		int temp=0;
		int tempRandomIndex=0;
		int cnt=0;
		for(int i=0;i<LOTTO.length;i++){
			LOTTO[i]=i+1;
		}
		while(true){
			cnt++;
			tempRandomIndex=(int)(Math.random()*LOTTO.length);
			temp=LOTTO[0];
			LOTTO[0]=LOTTO[tempRandomIndex];
			LOTTO[tempRandomIndex]=temp;
			if(cnt==200){
				break;
			}
		}
		for(int i=0;i<6;i++){
			System.out.print(LOTTO[i]);
			System.out.print((i==5)? "\n": ", " );
		}*/
		//Q5)갯수 를 넣고 그만큼 출력하기.
		int[] LOTTO=new int[45];
		int temp=0;
		int tempRandomIndex=0;
		int lottoCnt;
		int[] sort=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("얼만큼 뽑으실껀가요?");
		lottoCnt=Integer.parseInt(sc.nextLine());
		for(int x=0; x<lottoCnt;x++){
			
			for(int i=0;i<LOTTO.length;i++){
				LOTTO[i]=i+1;
			}
			for(int i=0;i<LOTTO.length*2;i++){
				tempRandomIndex=(int)(Math.random()*LOTTO.length);
				temp=LOTTO[0];
				LOTTO[0]=LOTTO[tempRandomIndex];
				LOTTO[tempRandomIndex]=temp;
				
			}

//			for(int i=0;i<sort.length;i++){
//				sort[i]=LOTTO[i];
//			}
			sort=Arrays.copyOfRange(LOTTO, 0, 6);
//			Arrays.sort(sort);//Arrays.sort->괄호안의 배열을 오름차순으로 출력한다.
			//sort의 배열에 Arrays.copyOfRange를 사용해서,LOTTO 배열의 0번쨰배열부터 6번쨰전 배열까지 복사하여 넣는다
			for(int i=0;i<sort.length-1;i++){
				for(int j=i+1;j<sort.length;j++){
					if(sort[i]>sort[j]){
						temp=sort[i];
						sort[i]=sort[j];
						sort[j]=temp;
					}
				}
			}
			
			System.out.print((x+1)+"번째 LOTTO 번호 : ");
			for(int i=0;i<6;i++){
				System.out.print(sort[i]);
				System.out.print((i==5)? "\n": ", " );
			}
		}
		
	}
}
