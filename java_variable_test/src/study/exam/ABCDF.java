package study.exam;

import java.util.Scanner;

public class ABCDF {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int kor;
		int eng;
		int math;
		int count;
		float div;
		char testChk;
		String hak;
		String chkYN;
		String chkNum;
		boolean hakStart = true;
		boolean reStart = true;
		
		while (reStart) {
			kor=0;
			eng=0;
			math=0;
			div=0f;
			testChk = ' ';
			chkYN="";
			chkNum="xxx";
			count=0;
			hak = "";
			while (hakStart) {
				for (int i = 0; i < chkNum.length(); i++) {
					System.out.print(((count == 0) ? "국어" : (count == 1) ? "영어" : "수학") + "점수를입력:");
					chkNum = sc.nextLine();
					testChk = chkNum.charAt(i);
					if (!(testChk >= 48 && testChk <= 57)) {
						System.out.println("숫자가아니에요 숫자를입력해주세요.");
						break;
					} else if (!(Integer.parseInt(chkNum) <= 100 && Integer.parseInt(chkNum) >= 0)) {
						System.out.println("0이상 100이하인 작은 정수를 입력하세요.");
						break;
					} else {
						count++;
						switch(count){
						case 1:
							kor = Integer.parseInt(chkNum);
							break;
						case 2:
							eng = Integer.parseInt(chkNum);
							break;
						case 3:
							math = Integer.parseInt(chkNum);
							break;
						}
				/*		if (count == 1) {
							kor = Integer.parseInt(chkNum);
							break;
						} else if (count == 2) {
							eng = Integer.parseInt(chkNum);
							break;
						} else {
							math = Integer.parseInt(chkNum);
						}*/
					}
					if (count == 3) {
						hakStart = false;
						break;
					}
				}
			}

			if (kor == 0 && eng == 0 && math == 0) {// 모두 0점일경우
				hak = "F";
			} else {
				div = (float) (kor + eng + math) / 3.0f;
				// float형 변수인 div를 선언한후
				// 초기값으로kor+eng+math의 평균를 대입하였다.

				switch ((int) (div / 10)) {// 학점 부여부분
				case 10:
				case 9:
					if (div % 10 >= 0.5) {
						hak = "A++";
					} else {
						hak = "A";
					}
					break;
				case 8:
					if (div % 10 >= 0.5) {
						hak = "B++";
					} else {
						hak = "B";
					}
					break;
				case 7:
					if (div % 10 >= 0.5) {
						hak = "C++";
					} else {
						hak = "C";
					}
					break;
				default:
					hak = "F";
					break;
				}
			}
			System.out.println("국영수의 총점:"+(kor + eng + math));
			System.out.println("평균은:"+(int)div);
			System.out.println("학점은:"+hak);
			System.out.println("재입력하시겠습니까?(y/n)");
			chkYN = sc.nextLine().toUpperCase();
			if (chkYN.equals("N")) {
				System.out.println("--------END--------");
				reStart = false;
			} else {
				// 재게임 설정 초기화
				hakStart = true;
			}
		}

	}
}
