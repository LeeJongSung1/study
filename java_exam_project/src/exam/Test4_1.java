package exam;

import java.util.Arrays;

import javax.naming.ldap.SortControl;

public class Test4_1 {
	public static void main(String[] args) {
		int x = 11;
		char ch = '4';
/*		System.out.println(10 < x && x < 20);// 1
		System.out.println(!(ch == (' ') || ch == ('\t')));// 2
		System.out.println(ch == ('x') || ch == ('x'));
		System.out.println(ch > '0' && ch < '9');
		System.out.println();
		*/
		/*
		 * int[] arr0[]; int[] arr1={1,2,3}; int[] arr2=new int[5]; int[]
		 * arr3=new int[5]{1,2,3,4,5}; int arr4[5]; int[] arr5[]=new int[3][];
		 */
		/*
		 * int[] coinUnit={500,100,50,10}; int money=2680;
		 * System.out.println("money="+money); for(int
		 * i=0;i<coinUnit.length;i++){
		 * System.out.println(coinUnit[i]+"원:"+money/coinUnit[i]);
		 * money=money%coinUnit[i];
		 * 
		 * }
		 */

		/*
		 * int[] ballarr={1,2,3,4,5,6,7,8,9}; int[] ball3=new int[3];
		 * 
		 * for(int i=0;i<ballarr.length;i++){ int
		 * j=(int)(Math.random()*ballarr.length); int temp=0; temp=ballarr[0];
		 * ballarr[0]=ballarr[j]; ballarr[j]=temp; }
		 * System.arraycopy(ballarr,0,ball3,0,3); for(int
		 * i=0;i<ball3.length;i++){ System.out.print(ball3[i]+"  "); }
		 * 
		 * Arrays.sort(ball3); System.out.println(); for(int
		 * i=0;i<ball3.length;i++){ System.out.print(ball3[i]+"  "); }
		 */
		/*
		 * int num=12345; int sum=0; while(num>0){ sum+=num%10; //
		 * System.out.println("sum+:"+num); num=num/10; //
		 * System.out.println("num+:"+num);
		 * System.out.println(sum+"+"+num+"="+sum); }
		 */

//		if (args.length != 1) {
//			System.out.println("USAGE: java Exercise5_7 3120");
//			System.exit(0);
//		}
		// . . 문자열을 숫자로 변환한다 입력한 값이 숫자가 아닐 경우 예외가 발생한다
		int money = Integer.parseInt("2700");
		System.out.println("money=" + money);
		int[] coinUnit = { 500, 100, 50, 10 }; // 동전의 단위
		int[] coin = { 5, 5, 5, 5 }; // 단위별 동전의 개수
		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			//1.
			coinNum=money/coinUnit[i];
			//2.
			if(coin[i]>=coinNum){
				coin[i]-=coinNum;
			}	else{
				coinNum=coin[i];
				coin[i]=0;
			}
			//3.
			money -=coinNum*coinUnit[i];
			/*
			 * (1) . 아래의 로직에 맞게 코드를 작성하시오 1. (money) (coinNum) . 금액 을 동전단위로 나눠서
			 * 필요한 동전의 개수 를 구한다 2. coin coinNum . 배열 에서 만큼의 동전을 뺀다 ( coin .) 만일
			 * 충분한 동전이 없다면 배열 에 있는 만큼만 뺀다 3. (coinNum) . 금액에서 동전의 개수 와 동전단위를 곱한
			 * 값을 뺀다
			 */
			
			
			System.out.println(coinUnit[i] + " 원: " + coinNum);
		}
		if (money > 0) {
			System.out.println(" 거스름돈이 부족합니다.");
			System.exit(0); // . 프로그램을 종료한다
		}
		System.out.println("= 남은 동전의 개수=");
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + " 원 :" + coin[i]);
		}

	}

}
