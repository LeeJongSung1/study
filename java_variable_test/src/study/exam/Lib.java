package study.exam;

import java.util.Scanner;

public class Lib {
	public static void main(String[] args) {
		// Q4)
		// ���̵�/ �н�����
		// mimi/mimi
		// mamam/mama
		// mumu/mumu
		// ���� + �н����� ���=> ���ѹݺ��̿�
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
		int cnt=3;//ȸ�� ���Լ� üũ
		int loginCnt=0;//�α��� �õ��� üũ
		
		while (true) {
			loginCnt=0;//�α��� �õ��� �ʱ�ȭ
			System.out.println("*** �������� ���α׷� ***");
			System.out.println("[1]�α���");
			System.out.println("[2]ȸ������");
			System.out.println("[3]���̵�/�н����� ã��");
			System.out.println("[4]����");
			System.out.print("�޴��� �����ϼ���._");

			String menu = sc.nextLine();
			String msg = "";
			switch (menu) {
			case "1":
				msg = "�α����� ���� �ϼ˽��ϴ�.";
				loginExit=true;// �α��� üũ �ʱ�ȭ.
				if(cnt!=0){
					System.out.println(msg);
					while(loginExit){
						System.out.println("���̵� �Է����ּ���.");
						id_Chk=sc.nextLine();
						System.out.println("��й�ȣ�� �Է����ּ���.");
						pwd_Chk=sc.nextLine();
						loginCnt++;//�α��� �õ�Ƚ���� üũ�Ѵ�.
						for(int i=0;i<cnt;i++){
							//�迭�� ���̰��ƴ� �迭�� ����ִ� �������� ���̸�ŭ ī���͸� ������ �ױ��̸�ŭ�� for�ݺ����� �����ش�.
							if(id_Chk.equals(id_Pwd[i][0])&& pwd_Chk.equals(id_Pwd[i][1])){
								loginExit=false;
								break;
							}else{
								if(loginCnt==5){
									//�α��νõ��� üũ�Ͽ� 5ȸ�� �Ѿ����� ���α׷��� �����Ѵ�.
									System.out.println("�α��νõ��� 5ȸ�� ���������Ƿ� ���α׷��� ���� �����մϴ�.");
									return;
								}else if(i==cnt-1){
									//�迭�� �����Ͱ� ����ִ� �ִ������ cnt�� for���� ������i�ǰ��� ���ؼ� �����Ͱ� �ִ� ������ �κб��� ���н� �α��� ���� ������ ����Ѵ�.
									System.out.println("�α��ο� �����ϼ˽��ϴ�.�ٽ��Է��ϼ���.");
								}
							}
						}
					}					
					System.out.println("�α��ο� �����ϼ˽��ϴ�.");
				}else{
					System.out.println("������ȸ���� �����!");
				}
				break;
			case "2":
				msg = "ȸ�������� �����ϼ˽��ϴ�.";
				System.out.println(msg);
				System.out.println("ȸ�����̵� �Է����ּ���.");
				id_Pwd[cnt][0]=sc.nextLine();//���̵� �Է� �迭[cnt][0]
				System.out.println("ȸ����й�ȣ�� �Է����ּ���.");
				id_Pwd[cnt][1]=sc.nextLine();//��й�ȣ �Է� �迭[cnt][0]
				System.out.println("�Է��� �Ϸ�Ǿ����ϴ�.");
				cnt++;
				break;
			case "3":
				msg = "���̵�/�н����� ã�⸦ �����ϼ˽��ϴ�.";
				System.out.println(msg);
				break;
			case "4":
				msg = "���Ḧ �����ϼ˽��ϴ�.\n ���α׷��� �����մϴ�.";
				System.out.println(msg);
				return;
			default:
				msg = "�����͸� �߸� �Է��ϼ˾��!";
				break;
			}
			
		}
		
	}
}
