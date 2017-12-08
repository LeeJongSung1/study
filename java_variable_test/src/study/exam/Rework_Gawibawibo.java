package study.exam;

import java.util.Random;
import java.util.Scanner;

public class Rework_Gawibawibo {

	public static void main(String[] args) {
		// 문제5)가위 바위 보만들기.
		// 가위-바위-보-가위 순으로 이김
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int com=0;
		int plyNm=0;
		boolean playerChk = true;
		boolean regame = true;
		String xo="";
		String player = "";
		System.out.println("가위 바위 보 게임을 시작하겠습니다.");
		System.out.println("----START----");
		while (regame) {
			while (playerChk) {
				com = (int) (Math.random() * 3 + 1);
				System.out.println("가위:1 바위:2 보:3");
				player = sc.nextLine();
				/* 유효성 테스트 */
				 for(int i = 0; i < player.length(); i++) {
					char testChk = player.charAt(i);
					if (!(testChk >= 48 && testChk <= 57)) {
						// 숫자가아님
						System.out.println("숫자가아니에요 숫자를입력해주세요.");
						break;
					} else if (!(Integer.parseInt(player) <= 3 && Integer.parseInt(player) > 0)) {
						System.out.println("0보다 크고 4보다 작은 정수를 입력하세요.");
						break;
					} else {
						playerChk = false;
					}
				 }
			}
			plyNm=Integer.parseInt(player);
			System.out.println("컴퓨터가 낸 것 : " + ((com == 1) ? "가위" : (com == 2) ? "바위" : "보"));
			System.out.println("당신이 낸 것 :  " + ((plyNm == 1) ? "가위" : (plyNm == 2) ? "바위" : "보"));
//			가위1 바위2 보3
//			이김=1,-2
//			짐=2,-1
			switch(com-plyNm){
				case 2:
				case -1:
					System.out.println("졋음");
					break;
				
				case 1:
				case-2:
					System.out.println("이김");
					break;
				
				case 0:
					System.out.println("비김");
					break;
			
			
			}
			/*
			switch (plyNm) {
			case 1:// 가위
				System.out.println("가위");
				System.out.println((com == 1) ? "비겻어요." : (com == 2) ? "졌습니다." : "이겻어요.");
				break;
			case 2:// 바위
				System.out.println("바위");
				System.out.println((com == 1) ? "이겻어요." : (com == 2) ? "비겻어요." : "졌습니다.");
				break;
			case 3:// 보
				System.out.println("보");
				System.out.println((com == 1) ? "졌습니다." : (com == 2) ? "이겻어요." : "비겻어요.");
				break;
			default:
				System.out.println("이게왜나오죠??");
				break;
			}*/
			
			System.out.println("다시하실껀가요?(o/x)");
			xo=sc.nextLine().toUpperCase();
			if(xo.equals("X")){
				System.out.println("--------END--------");
				regame=false;
			}else{
				//재게임 설정 초기화
				playerChk=true;
			}
		}
	}

}
