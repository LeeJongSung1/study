package study.exam;

import java.util.Arrays;
import java.util.Scanner;

public class LOTTO {
	public static void main(String[] args) {
		//LOTTO
		//Q5) 1~45������ �����߿� �ߺ����� �ʴ� ������ 6���� �����ؼ� ����Ͻÿ�.
	
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
		//Q5)���� �� �ְ� �׸�ŭ ����ϱ�.
		int[] LOTTO=new int[45];
		int temp=0;
		int tempRandomIndex=0;
		int lottoCnt;
		int[] sort=new int[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("��ŭ �����ǲ�����?");
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
//			Arrays.sort(sort);//Arrays.sort->��ȣ���� �迭�� ������������ ����Ѵ�.
			//sort�� �迭�� Arrays.copyOfRange�� ����ؼ�,LOTTO �迭�� 0�����迭���� 6������ �迭���� �����Ͽ� �ִ´�
			for(int i=0;i<sort.length-1;i++){
				for(int j=i+1;j<sort.length;j++){
					if(sort[i]>sort[j]){
						temp=sort[i];
						sort[i]=sort[j];
						sort[j]=temp;
					}
				}
			}
			
			System.out.print((x+1)+"��° LOTTO ��ȣ : ");
			for(int i=0;i<6;i++){
				System.out.print(sort[i]);
				System.out.print((i==5)? "\n": ", " );
			}
		}
		
	}
}
