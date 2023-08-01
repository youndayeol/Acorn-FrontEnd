package com.acorn;

public class Study {

	//코드 입력 파트1
	
		public static void main(String[] args)
		{
			
		int[] iEvenOddCountArr = {0, 0};
//			iEvenOddCountArr[0]: 짝수 갯수, iEvenOddCountArr[1]: 홀수 갯수
		int iWhileValue = 1;
		while(iWhileValue <= 30) {
//			System.out.println(iWhileValue);
			if(iWhileValue %2 == 0) 
				iEvenOddCountArr[0]++;
				 else iEvenOddCountArr[1]++;
			iWhileValue++;
			//짝수 /홀수 판단
		}
		System.out.println("짝수의 갯수" + iEvenOddCountArr[0] + "개");
		System.out.println("홀수의 갯수" + iEvenOddCountArr[1] + "개");
		
		//짝수 /홀수 갯수 출력
	
			
			
			
			
			
			
			
			
			
			// 코드 입력 파트 2
			// 변수 선언(초기화)
//			byte bNumber = 0; System.out.println(bNumber);
//			short sNumber = 0; System.out.println(sNumber);
//			int iNumber = 0; System.out.println(iNumber);
//			sNumber = (short)iNumber;
//			long lNumber = 0; System.out.println(lNumber);
//			float fNumber = 0.0F; System.out.println(fNumber);
//			char cChar = 'c'; System.out.println(cChar);
//			String str = "str"; System.out.println(str);
//			
//			//특수변수
//			byte[] bNumberArr = {1, 2, 3, 4, 5};
//			System.out.println(bNumberArr.length);
//			int size = bNumberArr.length;
//			System.out.println(bNumberArr[3]);
//			System.out.println(bNumberArr[size-2]);
//			
//			// 조건문 : if/switch-case
//			// 1~10
//			int[] iNumberArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//			int iIndex = 0;
//			
//			if(iNumberArr[iIndex] % 1 == 0) {
//				System.out.println("1의 배수");
//			} else if(iNumberArr[iIndex] % 2 == 0){
//				System.out.println("even");
//			 if(iNumberArr[iIndex] % 4 == 0){
//				System.out.println("4의 배수");
//			} else if(iNumberArr[iIndex] % 6 == 0){
//				System.out.println("6의 배수");
//			} else if(iNumberArr[iIndex] % 8 == 0){
//				System.out.println("8의 배수");
//			} else if(iNumberArr[iIndex] % 10 == 0){
//				System.out.println("10의 배수");
//			}
//			  else {
//				System.out.println("2의 배수");
//			  }
//			}
//			else if(iNumberArr[iIndex] % 3 == 0) {
//			System.out.println("3의 배수");
//		}
//		else if(iNumberArr[iIndex] % 5 == 0){
//			System.out.println("5의 배수");
//		}
//		else if(iNumberArr[iIndex] % 7 == 0){
//			System.out.println("7의 배수");
//		}
//		else if(iNumberArr[iIndex] % 9 == 0){
//			System.out.println("9의 배수");
//		}
//		
//		iIndex++;
		
		
		// 반복문 : for((선언된변수를)초기화; 조건식; 증감값) {}
		
//		for(int i = 1; i <= 10; i++) {System.out.print(i + " ");}
////		System.out.println();
//		System.out.println("출력을 완료하였습니다.");
//		
//		for(int i = 1; i <= 9; i++) {
//			System.out.print(i + ": ");
//			for(int j = 1; j <= 9; j++) {
//				System.out.print(j + " ");
//				
//			}
//			System.out.println("출력이 종료되었습니다");
			//2단 " i * j 2 3 4 ... 9
			//9단 : 
			//구구단이 종료되었습니다
//			for(int i = 2; i <= 9; i++) {
//				System.out.print(i + ": ");
//				for(int j = 1; j <= 9; j++) {
//					System.out.print((i*j) + " ");
//				}
//				System.out.println();
//			}
//			System.out.println("구구단이 종료되었습니디ㅏ");
		
		
//		#*
//		##**
//		###***
//		####****
//		#####*****
//		
		for(int i = 1; i <= 5; i++ ) {
//			if(i == 1) System.out.print(" ");
//			if(i == 2) System.out.print("  ");
//			if(i == 3) System.out.print("   ");
//			if(i == 4) System.out.print("    ");
//			if(i == 5) System.out.print("     ");
			for(int j = 1; j <= 1; j++) {
//				System.out.print("* ");
			}
//			System.out.println();
		}
		
		
	}
		// 코드 입력 파트 3
		public static void printVerifyNumber(int iIndex) {
			int[] iNumberArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			
		}
		
}

