package study.exam;

import java.util.Random;
import java.util.Scanner;

public class Rework {
	public static void main(String[] args) {
/*���ٿ� ����.
 * */
		Random ran=new Random();
		Scanner sc=new Scanner(System.in);
		
		String playerNum="";
		int pyNum=0;
		int min=0;
		int max=100;
		boolean numchk=true;
		boolean upDownChk=true;
		boolean regame=true;
		String xo="";
		
		int randumNum;
		
		System.out.println("�� �ٿ� ������ �����մϴ�.");
		System.out.println("----START----");
		while(regame){
			randumNum=(int)(Math.random()*100+1);
			System.out.println("i:"+randumNum);
			while(upDownChk){
				System.out.println("���ڸ� �Է��ؿ�!");
				playerNum=sc.nextLine();
				System.out.println("�Է��� ����(����):"+playerNum);
				while(numchk){
					for(int i=0;i<playerNum.length();i++){
						char testChk= playerNum.charAt(i);
						if(!(testChk >= 48 && testChk<= 57)){
							//���ڰ��ƴ�
							System.out.println("���ڰ��ƴϿ��� ���ڸ��Է����ּ���.");
							playerNum=sc.nextLine();
							i=0;
							//for�� i�� 0�����ؼ� �ٽ� ó�����ε���
						}
					}
					System.out.println("�Է��Ѽ��ڴ� : "+playerNum+"�Դϴ�.");
					pyNum=Integer.parseInt(playerNum);
					if(!(pyNum>=min && pyNum<=max)){
						//�ּ� �ִ밪üũ
						System.out.println(min+"~"+max+"������ ���ڸ� �ٽ��Է��ϼ���");
						playerNum=sc.nextLine();
						numchk=true;
						//���Էºκ�
					}else{
						numchk=false;
					}
				}
				//���ٿ� üũ
				if(randumNum==pyNum){
					System.out.println("�­����");
					upDownChk=false;
				}else if(randumNum>pyNum){
					System.out.println("Ů�ϴ�");
					min=pyNum;
					numchk=true;
				}else{
					System.out.println("�۽��ϴ�");
					max=pyNum;
					numchk=true;
				}
			}
			System.out.println("�� �ҷ���?(o/x)");
			xo=sc.nextLine().toUpperCase();
			if(xo.equals("X")){
				System.out.println("----END----");
				regame=false;
			}else{
				//����� ���� �ʱ�ȭ
				numchk=true;
				upDownChk=true;
				min=0;
				max=101;
			}
			
		}
	}
}
