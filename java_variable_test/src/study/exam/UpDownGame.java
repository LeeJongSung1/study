package study.exam;

import java.util.Random;
import java.util.Scanner;

//¾÷´Ù¿î
public class UpDownGame {
	public static void main(String[] args) {
		// ¹®Á¦4)¾÷´Ù¿î ·»´ıÇÔ¼ö + if while¹®Á¤µµ ¾²¸éµÉµí
		/*	±âº»ÀûÀÎ ¸ÅÄ¿´ÏÁò
		while(³ª°¥‹šÈ®ÀÎ){
			·£´ı¼ö
			ÀÔ·Â¼ö
			if(	·£´ı¼ö==ÀÔ·Â¼ö){
				³¡
			}else if(·£´ı¼ö>ÀÔ·Â¼ö){
				¾÷
			}else{
				´Ù¿î
			}
		}
	*/
		Random ran=new Random();
	
		int randumNum=randumNum=ran.nextInt()*100+1;
		System.out.println("i:"+randumNum);
		Scanner sc=new Scanner(System.in);
		String playerNum="";
		
		boolean chk=true;
		System.out.println("¼ıÀÚ¸¦ ÀÔ·ÂÇØ¿ä!");
		//¼ıÀÚ Ã¼Å©
		while(chk){
			playerNum=sc.nextLine();
			if(playerNum.isEmpty()){
				System.out.println("ºñ¾îÀÖ½À´Ï´Ù.");
			}else{
				
				for(int i=0;i<playerNum.length();i++){
					char testChk= playerNum.charAt(i);
					
					if(!(testChk >= 48 && testChk<= 57)){//¼ıÀÚÀÎÁö ¾Æ´ÑÁö¸¸Ã¼Å©
						System.out.println("¼ıÀÚ°¡¾Æ´Ô");
						System.out.println("¼ıÀÚ¸¦ Àû¾îÁÖ¼¼¿ä.");
//						System.out.println(min+"~"+max+"ÀÇ¼ıÀÚ¸¦ Àû¾îÁÖ¼¼¿ä.");
						//¼ıÀÚ°¡¾Æ´Ò°æ¿ì¹İº¹
					}else{
						System.out.println("ÀÔ·ÂÇÑ ¼ıÀÚ:"+playerNum);
						
						int pyNum=Integer.parseInt(playerNum);
						
						while(randumNum!=pyNum){
							
							if(randumNum==pyNum){
								System.out.println("¸Â­Ÿ¾î¿ä");
								chk=false;
							}else if(randumNum>pyNum){
								System.out.println("Å®´Ï´Ù");
								
							}else{
								System.out.println("ÀÛ½À´Ï´Ù");
								
							}
						}
						System.out.println("³¡ÀÌ¿¡¿ä.");
						
						chk=false;
						//¼ıÀÚÀÏ°æ¿ì ³ª°¨
					}
				}
			}
		}
		
		
	}
}
