package study.exam;

import java.util.Random;
import java.util.Scanner;

//업다운
public class UpDownGame {
	public static void main(String[] args) {
		// 문제4)업다운 렌덤함수 + if while문정도 쓰면될듯
		/*	기본적인 매커니즘
		while(나갈떄확인){
			랜덤수
			입력수
			if(	랜덤수==입력수){
				끝
			}else if(랜덤수>입력수){
				업
			}else{
				다운
			}
		}
	*/
		Random ran=new Random();
	
		int randumNum=randumNum=ran.nextInt()*100+1;
		System.out.println("i:"+randumNum);
		Scanner sc=new Scanner(System.in);
		String playerNum="";
		
		boolean chk=true;
		System.out.println("숫자를 입력해요!");
		//숫자 체크
		while(chk){
			playerNum=sc.nextLine();
			if(playerNum.isEmpty()){
				System.out.println("비어있습니다.");
			}else{
				
				for(int i=0;i<playerNum.length();i++){
					char testChk= playerNum.charAt(i);
					
					if(!(testChk >= 48 && testChk<= 57)){//숫자인지 아닌지만체크
						System.out.println("숫자가아님");
						System.out.println("숫자를 적어주세요.");
//						System.out.println(min+"~"+max+"의숫자를 적어주세요.");
						//숫자가아닐경우반복
					}else{
						System.out.println("입력한 숫자:"+playerNum);
						
						int pyNum=Integer.parseInt(playerNum);
						
						while(randumNum!=pyNum){
							
							if(randumNum==pyNum){
								System.out.println("맞췃어요");
								chk=false;
							}else if(randumNum>pyNum){
								System.out.println("큽니다");
								
							}else{
								System.out.println("작습니다");
								
							}
						}
						System.out.println("끝이에요.");
						
						chk=false;
						//숫자일경우 나감
					}
				}
			}
		}
		
		
	}
}
