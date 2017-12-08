package study.exam;

import java.util.Random;
import java.util.Scanner;

//가위바위보
public class Gawibawibo {
	public static void main(String[] args) {
		// 문제5)가위 바위 보만들기.
		// 가위-바위-보-가위 순으로 이김
		Random ran= new Random();
		Scanner sc=new Scanner(System.in);
		
		int com=ran.nextInt()+2;
		int player;
		
		System.out.println("가위:1 바위:2 보:3");
		player=Integer.parseInt(sc.nextLine());
		System.out.println("컴퓨터가 낸 것 : "+((com==1)?"가위" : (com==2)? "바위" : "보"));
		
		switch(player){
			case 1://가위
				System.out.println("가위냈음");
				System.out.println((com==1)?"비겻음" : (com==2)? "졋음" : "이겻음" );
				break;
			case 2://바위
				System.out.println("바위냈음");
				System.out.println((com==1)?"이김" : (com==2)? "비김" : "졋음" );
				break;
			case 3://보
				System.out.println("보냈음");
				System.out.println((com==1)?"졋음" : (com==2)? "이김" : "비겻음" );
				break;
			default:
				System.out.println("이게왜나옴????");
		break;
		}
	}
}
