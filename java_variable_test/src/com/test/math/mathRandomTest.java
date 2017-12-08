package com.test.math;

public class mathRandomTest {
	public static void main(String[] args) {
		//0<=Math.random()<1인 임의의 실수
//		System.out.println(Math.random());
		
//		System.out.print((int)(Math.random()*100+1));
		boolean test=true;
		int testnum=0;
		while(test){
			testnum=(int)(Math.random()*3+1);
			System.out.println("testnum:"+testnum);	
			if(testnum<=0){
				test=false;
			}else if(testnum>=4){
				test=false;
				
			}
		}
		
//		int randomInt=(int)(Math.random()*100+1);
//		System.out.println(randomInt);
		
		
	
	
	}
}
