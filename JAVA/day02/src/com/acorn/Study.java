package com.acorn;

public class Study {

	//�ڵ� �Է� ��Ʈ1
	
		public static void main(String[] args)
		{
			
		int[] iEvenOddCountArr = {0, 0};
//			iEvenOddCountArr[0]: ¦�� ����, iEvenOddCountArr[1]: Ȧ�� ����
		int iWhileValue = 1;
		while(iWhileValue <= 30) {
//			System.out.println(iWhileValue);
			if(iWhileValue %2 == 0) 
				iEvenOddCountArr[0]++;
				 else iEvenOddCountArr[1]++;
			iWhileValue++;
			//¦�� /Ȧ�� �Ǵ�
		}
		System.out.println("¦���� ����" + iEvenOddCountArr[0] + "��");
		System.out.println("Ȧ���� ����" + iEvenOddCountArr[1] + "��");
		
		//¦�� /Ȧ�� ���� ���
	
			
			
			
			
			
			
			
			
			
			// �ڵ� �Է� ��Ʈ 2
			// ���� ����(�ʱ�ȭ)
//			byte bNumber = 0; System.out.println(bNumber);
//			short sNumber = 0; System.out.println(sNumber);
//			int iNumber = 0; System.out.println(iNumber);
//			sNumber = (short)iNumber;
//			long lNumber = 0; System.out.println(lNumber);
//			float fNumber = 0.0F; System.out.println(fNumber);
//			char cChar = 'c'; System.out.println(cChar);
//			String str = "str"; System.out.println(str);
//			
//			//Ư������
//			byte[] bNumberArr = {1, 2, 3, 4, 5};
//			System.out.println(bNumberArr.length);
//			int size = bNumberArr.length;
//			System.out.println(bNumberArr[3]);
//			System.out.println(bNumberArr[size-2]);
//			
//			// ���ǹ� : if/switch-case
//			// 1~10
//			int[] iNumberArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//			int iIndex = 0;
//			
//			if(iNumberArr[iIndex] % 1 == 0) {
//				System.out.println("1�� ���");
//			} else if(iNumberArr[iIndex] % 2 == 0){
//				System.out.println("even");
//			 if(iNumberArr[iIndex] % 4 == 0){
//				System.out.println("4�� ���");
//			} else if(iNumberArr[iIndex] % 6 == 0){
//				System.out.println("6�� ���");
//			} else if(iNumberArr[iIndex] % 8 == 0){
//				System.out.println("8�� ���");
//			} else if(iNumberArr[iIndex] % 10 == 0){
//				System.out.println("10�� ���");
//			}
//			  else {
//				System.out.println("2�� ���");
//			  }
//			}
//			else if(iNumberArr[iIndex] % 3 == 0) {
//			System.out.println("3�� ���");
//		}
//		else if(iNumberArr[iIndex] % 5 == 0){
//			System.out.println("5�� ���");
//		}
//		else if(iNumberArr[iIndex] % 7 == 0){
//			System.out.println("7�� ���");
//		}
//		else if(iNumberArr[iIndex] % 9 == 0){
//			System.out.println("9�� ���");
//		}
//		
//		iIndex++;
		
		
		// �ݺ��� : for((����Ⱥ�����)�ʱ�ȭ; ���ǽ�; ������) {}
		
//		for(int i = 1; i <= 10; i++) {System.out.print(i + " ");}
////		System.out.println();
//		System.out.println("����� �Ϸ��Ͽ����ϴ�.");
//		
//		for(int i = 1; i <= 9; i++) {
//			System.out.print(i + ": ");
//			for(int j = 1; j <= 9; j++) {
//				System.out.print(j + " ");
//				
//			}
//			System.out.println("����� ����Ǿ����ϴ�");
			//2�� " i * j 2 3 4 ... 9
			//9�� : 
			//�������� ����Ǿ����ϴ�
//			for(int i = 2; i <= 9; i++) {
//				System.out.print(i + ": ");
//				for(int j = 1; j <= 9; j++) {
//					System.out.print((i*j) + " ");
//				}
//				System.out.println();
//			}
//			System.out.println("�������� ����Ǿ����ϵ�");
		
		
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
		// �ڵ� �Է� ��Ʈ 3
		public static void printVerifyNumber(int iIndex) {
			int[] iNumberArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			
		}
		
}

