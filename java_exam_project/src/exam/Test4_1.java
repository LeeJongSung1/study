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
		 * System.out.println(coinUnit[i]+"��:"+money/coinUnit[i]);
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
		// . . ���ڿ��� ���ڷ� ��ȯ�Ѵ� �Է��� ���� ���ڰ� �ƴ� ��� ���ܰ� �߻��Ѵ�
		int money = Integer.parseInt("2700");
		System.out.println("money=" + money);
		int[] coinUnit = { 500, 100, 50, 10 }; // ������ ����
		int[] coin = { 5, 5, 5, 5 }; // ������ ������ ����
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
			 * (1) . �Ʒ��� ������ �°� �ڵ带 �ۼ��Ͻÿ� 1. (money) (coinNum) . �ݾ� �� ���������� ������
			 * �ʿ��� ������ ���� �� ���Ѵ� 2. coin coinNum . �迭 ���� ��ŭ�� ������ ���� ( coin .) ����
			 * ����� ������ ���ٸ� �迭 �� �ִ� ��ŭ�� ���� 3. (coinNum) . �ݾ׿��� ������ ���� �� ���������� ����
			 * ���� ����
			 */
			
			
			System.out.println(coinUnit[i] + " ��: " + coinNum);
		}
		if (money > 0) {
			System.out.println(" �Ž������� �����մϴ�.");
			System.exit(0); // . ���α׷��� �����Ѵ�
		}
		System.out.println("= ���� ������ ����=");
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + " �� :" + coin[i]);
		}

	}

}
