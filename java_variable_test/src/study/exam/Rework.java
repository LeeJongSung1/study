package study.exam;

import java.util.Random;
import java.util.Scanner;

public class Rework {
	public static void main(String[] args) {
/*¾÷´Ù¿î °ÔÀÓ.
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
		
		System.out.println("¾÷ ´Ù¿î °ÔÀÓÀ» ½ÃÀÛÇÕ´Ï´Ù.");
		System.out.println("----START----");
		while(regame){
			randumNum=(int)(Math.random()*100+1);
			System.out.println("i:"+randumNum);
			while(upDownChk){
				System.out.println("¼ıÀÚ¸¦ ÀÔ·ÂÇØ¿ä!");
				playerNum=sc.nextLine();
				System.out.println("ÀÔ·ÂÇÑ ¼ıÀÚ(¹®ÀÚ):"+playerNum);
				while(numchk){
					for(int i=0;i<playerNum.length();i++){
						char testChk= playerNum.charAt(i);
						if(!(testChk >= 48 && testChk<= 57)){
							//¼ıÀÚ°¡¾Æ´Ô
							System.out.println("¼ıÀÚ°¡¾Æ´Ï¿¡¿ä ¼ıÀÚ¸¦ÀÔ·ÂÇØÁÖ¼¼¿ä.");
							playerNum=sc.nextLine();
							i=0;
							//forÀÇ i¸¦ 0À¸·ÎÇØ¼­ ´Ù½Ã Ã³À½À¸·Îµ¹¸²
						}
					}
					System.out.println("ÀÔ·ÂÇÑ¼ıÀÚ´Â : "+playerNum+"ÀÔ´Ï´Ù.");
					pyNum=Integer.parseInt(playerNum);
					if(!(pyNum>=min && pyNum<=max)){
						//ÃÖ¼Ò ÃÖ´ë°ªÃ¼Å©
						System.out.println(min+"~"+max+"»çÀÌÀÇ ¼ıÀÚ¸¦ ´Ù½ÃÀÔ·ÂÇÏ¼¼¿ä");
						playerNum=sc.nextLine();
						numchk=true;
						//ÀçÀÔ·ÂºÎºĞ
					}else{
						numchk=false;
					}
				}
				//¾÷´Ù¿î Ã¼Å©
				if(randumNum==pyNum){
					System.out.println("¸Â­Ÿ¾î¿ä");
					upDownChk=false;
				}else if(randumNum>pyNum){
					System.out.println("Å®´Ï´Ù");
					min=pyNum;
					numchk=true;
				}else{
					System.out.println("ÀÛ½À´Ï´Ù");
					max=pyNum;
					numchk=true;
				}
			}
			System.out.println("¶Ç ÇÒ·¡¿ä?(o/x)");
			xo=sc.nextLine().toUpperCase();
			if(xo.equals("X")){
				System.out.println("----END----");
				regame=false;
			}else{
				//Àç°ÔÀÓ ¼³Á¤ ÃÊ±âÈ­
				numchk=true;
				upDownChk=true;
				min=0;
				max=101;
			}
			
		}
	}
}
