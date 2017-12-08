package study.exam;

import java.util.Scanner;

public class Lib {
	public static void main(String[] args) {
		// Q4)
		// 아이디/ 패스워드
		// mimi/mimi
		// mamam/mama
		// mumu/mumu
		// 가입 + 패스워드 사용=> 무한반복이용
		//
		Scanner sc = new Scanner(System.in);
		boolean loginExit = true;
		// String idArray[]=new String[100];
		// String pwdArray[]=new String[100];
		String id_Pwd[][] = new String[100][2];
		id_Pwd[0][0]="mimi";
		id_Pwd[1][0]="mama";
		id_Pwd[2][0]="mumu";
		id_Pwd[0][1]="mimi";
		id_Pwd[1][1]="mama";
		id_Pwd[2][1]="mumu";
		String id_Chk="";
		String pwd_Chk="";
		int cnt=3;//회원 가입수 체크
		int loginCnt=0;//로그인 시도수 체크
		
		while (true) {
			loginCnt=0;//로그인 시도수 초기화
			System.out.println("*** 도서관리 프로그램 ***");
			System.out.println("[1]로그인");
			System.out.println("[2]회원가입");
			System.out.println("[3]아이디/패스워드 찾기");
			System.out.println("[4]종료");
			System.out.print("메뉴를 선택하세요._");

			String menu = sc.nextLine();
			String msg = "";
			switch (menu) {
			case "1":
				msg = "로그인을 선택 하셧습니다.";
				loginExit=true;// 로그인 체크 초기화.
				if(cnt!=0){
					System.out.println(msg);
					while(loginExit){
						System.out.println("아이디를 입력해주세요.");
						id_Chk=sc.nextLine();
						System.out.println("비밀번호를 입력해주세요.");
						pwd_Chk=sc.nextLine();
						loginCnt++;//로그인 시도횟수를 체크한다.
						for(int i=0;i<cnt;i++){
							//배열의 길이가아닌 배열에 들어있는 데이터의 길이만큼 카운터를 세놓고 그길이만큼만 for반복문을 돌려준다.
							if(id_Chk.equals(id_Pwd[i][0])&& pwd_Chk.equals(id_Pwd[i][1])){
								loginExit=false;
								break;
							}else{
								if(loginCnt==5){
									//로그인시도를 체크하여 5회가 넘었을시 프로그램을 종료한다.
									System.out.println("로그인시도가 5회를 넘으셧으므로 프로그램을 강제 종료합니다.");
									return;
								}else if(i==cnt-1){
									//배열에 데이터가 들어있는 최대길이인 cnt와 for문의 변수인i의값을 비교해서 데이터가 있는 마지막 부분까지 실패시 로그인 실패 문장을 출력한다.
									System.out.println("로그인에 실패하셧습니다.다시입력하세요.");
								}
							}
						}
					}					
					System.out.println("로그인에 성공하셧습니다.");
				}else{
					System.out.println("가입한회원이 없어요!");
				}
				break;
			case "2":
				msg = "회원가입을 선택하셧습니다.";
				System.out.println(msg);
				System.out.println("회원아이디를 입력해주세요.");
				id_Pwd[cnt][0]=sc.nextLine();//아이디 입력 배열[cnt][0]
				System.out.println("회원비밀번호를 입력해주세요.");
				id_Pwd[cnt][1]=sc.nextLine();//비밀번호 입력 배열[cnt][0]
				System.out.println("입력이 완료되었습니다.");
				cnt++;
				break;
			case "3":
				msg = "아이디/패스워드 찾기를 선택하셧습니다.";
				System.out.println(msg);
				break;
			case "4":
				msg = "종료를 선택하셧습니다.\n 프로그램을 종료합니다.";
				System.out.println(msg);
				return;
			default:
				msg = "데이터를 잘못 입력하셧어요!";
				break;
			}
			
		}
		
	}
}
