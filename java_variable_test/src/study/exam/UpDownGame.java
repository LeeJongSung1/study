package study.exam;

import java.util.Random;
import java.util.Scanner;

//���ٿ�
public class UpDownGame {
	public static void main(String[] args) {
		// ����4)���ٿ� �����Լ� + if while������ ����ɵ�
		/*	�⺻���� ��Ŀ����
		while(������Ȯ��){
			������
			�Է¼�
			if(	������==�Է¼�){
				��
			}else if(������>�Է¼�){
				��
			}else{
				�ٿ�
			}
		}
	*/
		Random ran=new Random();
	
		int randumNum=randumNum=ran.nextInt()*100+1;
		System.out.println("i:"+randumNum);
		Scanner sc=new Scanner(System.in);
		String playerNum="";
		
		boolean chk=true;
		System.out.println("���ڸ� �Է��ؿ�!");
		//���� üũ
		while(chk){
			playerNum=sc.nextLine();
			if(playerNum.isEmpty()){
				System.out.println("����ֽ��ϴ�.");
			}else{
				
				for(int i=0;i<playerNum.length();i++){
					char testChk= playerNum.charAt(i);
					
					if(!(testChk >= 48 && testChk<= 57)){//�������� �ƴ�����üũ
						System.out.println("���ڰ��ƴ�");
						System.out.println("���ڸ� �����ּ���.");
//						System.out.println(min+"~"+max+"�Ǽ��ڸ� �����ּ���.");
						//���ڰ��ƴҰ��ݺ�
					}else{
						System.out.println("�Է��� ����:"+playerNum);
						
						int pyNum=Integer.parseInt(playerNum);
						
						while(randumNum!=pyNum){
							
							if(randumNum==pyNum){
								System.out.println("�­����");
								chk=false;
							}else if(randumNum>pyNum){
								System.out.println("Ů�ϴ�");
								
							}else{
								System.out.println("�۽��ϴ�");
								
							}
						}
						System.out.println("���̿���.");
						
						chk=false;
						//�����ϰ�� ����
					}
				}
			}
		}
		
		
	}
}
