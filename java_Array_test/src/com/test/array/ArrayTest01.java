package com.test.array;

public class ArrayTest01 {
	int x = 30; // 메모리 영역이 heap에 잡힌다.->method영역과 다른 주소값을 가지기때문에
	// method영역에 있는 같은 이름의 변수와 중복값으로 측정되지 않는다.
	{
		int x = 100000;// 메모리 영역이 method영역에 잡힌다.->heap에서 잡히는 것과 주소값이 다르기때문에
		System.out.println(x);// 100000이 출력된다. 만약 지역변수가 없을시 클레스변수를 찾아서 가져온다.

		// int x;//같은 블록의 x선언이 있어서 중복오류다
		{
			int y;
			// int x;//상위의 x선언이 있어서 중복된다.
			{
				// int x;//상위의 x선언이 있어서 중복된다.

			}
		}

		{
			int y;// 같은 계층에 y가 선언되있지만 독립적이기때문에 중복이 되지 않는다.

		}
	}

	public static void main(String[] args) {
		// 1차원 배열
		int[] intArray = new int[5];
		// int형 배열intArray를 선언하고 의 길이를 5를 선언함
		int[] intArray2 = { 1, 2, 3, 4, 5 };
		// int형 배열intArray2를 선언하고 초기값1,2,3,4,5의 값을 넣어줌

		int[] intArray3 = new int[] { 1, 2, 3, 4, 5 };
		// int형 배열intArray3를 선언하고 초기값1,2,3,4,5의 값을 넣어줌

		intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// int형 배열intArray를 선언하고 초기값1,2,3,4,5,6,7,8,9,10의 값을 넣어줌

		int[] intArray4 = new int[100];
		// int형 배열을 선언하고 크기를 100으로 잡는다.

		for (int index = 0; index < intArray4.length; index++) {
			// intArray4.length ->intArray4배열에 해당하는 길이만큼 값을 반환한다.
			// 즉 for문이 0부터 intArray4의 길이까지 반복하게된다.
			intArray4[index] = index + 1;
			// for안에서 증가하는 int형 변수를 intArray4의 변수안에 넣으므로써 배열이 0~intArray4의 길이까지
			// 값을 넣을수 있다.

		}
		// Q1)
		for (int index = 0; index < intArray4.length; index++) {

			if (index % 10 != 0) {// for문의 변수인 index를 검사하여 10으로 나누었을떄 0으로 떨어지는지를
									// 검사하낟.
				System.out.print(",");// 10으로 나눠지지않을떄 ','을 출력한다.
			} else {
				System.out.println();// 10으로 나워질때 줄바꿈을 실행한다.
			}
			System.out.print(intArray4[index] + "" + ((intArray4[index] % 10 != 0) ? "," : "\n"));
			// 위의 if문을 삼다항으로 변경하였다. ntArray4[index]를출력후 'intArray4[index] % 10
			// !=0' 으로 질의를던져 10으로 나누어떨어지는지 검사후
			// 나누어 떨어지지않을시 ','를출력하고 나누어떨어질때 줄바꿈인'\n'을 실행한다.

			// System.out.println(intArray4[index]);
			// System.out.print((intArray4[index] % 10 != 0)?"\n":",");
			// System.out.print(intArray4[index] + ((intArray4[index] % 10 != 0)
			// ? "," : "\n"));
		}
		// 2차원 배열(행 X 열)→ 배열안에 배열
		int[][] intArrays = new int[3][3];// 3행 3열의 2차원 배열 생성

		int[][] intArrays2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// 2차원 배열을 선언하고 초기값을 1~9까지 대입함.
		int[][] scoreTable = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		// 2 차원 배열을 선언하고 테이블에 점수에 해당하는 값을 대입한다.

		// Q2)배열에 있는 값을 평균내기

		int sum;
		System.out.println("---------------------------------");//모양을내기위해 출력한------구문
		System.out.println("국어\t|영어\t|수학\t|평균");//국어 영어 수학 평균을 보여주는 텍스트구문
		for (int i = 0; i < scoreTable.length; i++) {// scoreTable의길이만큼 for문을 반복한다.
			sum = 0;//총합값을 초기화한다.
			for (int j = 0; j < scoreTable[i].length; j++) {
				sum = sum + scoreTable[i][j];
				//2차원배열인 scoreTable에서 i값이 0~scoreTable의 길이까지돌떄 안쪽의 값인 j가 0~scoreTable의 길이만큼 나오고
				// 그값을 sum에 더하여준다.
				System.out.print(scoreTable[i][j]+ (((j + 1) % 3 == 0) ? "\t|" + (sum * 1f / scoreTable[i].length) + "\n" : "\t|"));
				//scoreTable[i][j] 값을 출력후
				//scoreTable[i]의 길이가. 3으로 나누어서 떨어질시 '\t(tab)'과 평균값을 을출력 하고 그외의 경우일때  '\t(tab)'만을 출력한다.
				System.out.print(scoreTable[i][j] + "|");
				//scoreTable[i]값과 "|"구문을 지어주는 텍스트를 출력한다.
//				if ((j + 1) % 3 == 0) {//열이 3일때를 체크한다.
//					System.out.print(sum / 3f);//if조건이 참일때 평균값을 출력한다.
//				}
			}
			System.out.println("---------------------------------");//모양을내기위해 출력한------구문
		}

		/*
		 * System.out.println("---------------------------------");//모양을내기위해 출력한------구문
		 * System.out.println("국어\t|영어\t|수학\t|");//국어 영어 수학을 보여주는 텍스트구문
		 */
		int sumArr[] = new int[3];
		for (int i = 0; i < scoreTable.length; i++) {
			 sumArr[0]=sumArr[0]+scoreTable[i][0];
			//일차원 배열sumArr의 처음부분에 이차원 배열인 scoreTable의i행의 0열부분의 데이터를 더하여준다.
			 sumArr[1]=sumArr[1]+scoreTable[i][1];
			//일차원 배열sumArr의 처음부분에 이차원 배열인 scoreTable의i행의1열부분의 데이터를 더하여준다.
			 sumArr[2]=sumArr[2]+scoreTable[i][2];
			//일차원 배열sumArr의 처음부분에 이차원 배열인 scoreTable의i행의3열부분의 데이터를 더하여준다.
			 /*	for (int j = 0; j < scoreTable[i].length; j++) {
				sumArr[j] = sumArr[j] + scoreTable[i][j];
			}*/
		}
		// System.out.print(sumArr[0] / 3f + "|" + sumArr[1] / 3f + "|" +
		// sumArr[2] / 3f);

		int[] intarr = new int[4];
		// int 형 배열인 intarr[]를 4의 길이로 선언한다.
		for (int i = 0; i < intarr.length; i++) {// for문에 intarr의 길이만큼 반복한다.
			intarr[i] = i;
			// intarr에 i값을 입력한다(0~intarr 배열의 길이만큼)
		}

	}
}
