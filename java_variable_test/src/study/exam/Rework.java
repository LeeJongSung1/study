package study.exam;

import java.util.Random;
import java.util.Scanner;

public class Rework {
	public static void main(String[] args) {
/*업다운 게임.
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
		
		System.out.println("업 다운 게임을 시작합니다.");
		System.out.println("----START----");
		while(regame){
			randumNum=(int)(Math.random()*100+1);
			System.out.println("i:"+randumNum);
			while(upDownChk){
				System.out.println("숫자를 입력해요!");
				playerNum=sc.nextLine();
				System.out.println("입력한 숫자(문자):"+playerNum);
				while(numchk){
					for(int i=0;i<playerNum.length();i++){
						char testChk= playerNum.charAt(i);
						if(!(testChk >= 48 && testChk<= 57)){
							//숫자가아님
							System.out.println("숫자가아니에요 숫자를입력해주세요.");
							playerNum=sc.nextLine();
							i=0;
							//for의 i를 0으로해서 다시 처음으로돌림
						}
					}
					System.out.println("입력한숫자는 : "+playerNum+"입니다.");
					pyNum=Integer.parseInt(playerNum);
					if(!(pyNum>=min && pyNum<=max)){
						//최소 최대값체크
						System.out.println(min+"~"+max+"사이의 숫자를 다시입력하세요");
						playerNum=sc.nextLine();
						numchk=true;
						//재입력부분
					}else{
						numchk=false;
					}
				}
				//업다운 체크
				if(randumNum==pyNum){
					System.out.println("맞췃어요");
					upDownChk=false;
				}else if(randumNum>pyNum){
					System.out.println("큽니다");
					min=pyNum;
					numchk=true;
				}else{
					System.out.println("작습니다");
					max=pyNum;
					numchk=true;
				}
			}
			System.out.println("또 할래요?(o/x)");
			xo=sc.nextLine().toUpperCase();
			if(xo.equals("X")){
				System.out.println("----END----");
				regame=false;
			}else{
				//재게임 설정 초기화
				numchk=true;
				upDownChk=true;
				min=0;
				max=101;
			}
			
		}
	}
}
