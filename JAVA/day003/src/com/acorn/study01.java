package com.acorn;

public class study01 {

	public static void main(String[] args) {
		
		System.out.println("JAVA 1");
		System.out.println("JAVA 2");
		System.out.println("JAVA 3");
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println("JAVA " + (i+1));
		}
		
		int[] iCountArr = {3, 4, 5, 4, 5, 6, 7};
		char[] cInfoArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
			
		for(int i = 0; i < iCountArr.length; i++)
		{
			System.out.print(iCountArr[i]);
			for(int j = 0; j < iCountArr[i]; j++) {
				System.out.print(cInfoArr[j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		char[] cInfoArr1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g',
							'g', 'f', 'e', 'd', 'c', 'b', 'a',
							'a', 'b', 'c', 'd', 'e', 'f', 'g',
							'g', 'f', 'e', 'd', 'c', 'd', 'a',
							'a', 'b', 'c', 'd', 'e', 'f', 'g',
							'a', 'b', 'c', 'd', 'e', 'f', 'g'
							};

		int iStartIndex = 0;
		int iEndIndex = 0;
		for(int i = 0; i < iCountArr.length; i++)
		{
			for(int j = iStartIndex; j < (iCountArr[i]+iStartIndex); j++)
			{
				System.out.println(cInfoArr1[j]);
			}
			System.out.println();
			
			iStartIndex = iStartIndex + iCountArr[i];
				
				System.out.println();
					
		}
		//JAVA 1
		//JAVA 2
		//JAVA 3
		
		// for

	}

}
