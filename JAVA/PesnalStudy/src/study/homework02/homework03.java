package study.homework02;

public class homework03 {

	public static void main(String[] args) {
		
		for(int i = 2; i < 6; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.print( i + "x" + j + "=" + j*i + " ");
			}
			System.out.println();
		}
		
		System.out.println("=============================");
		
		for(int i = 1; i < 6; i++) {
			for(int j = i; j < 7; j++) {
				System.out.print( i + "x" + j + "=" + j*i + " ");
			}
			System.out.println();
		}
		
		System.out.println("=============================");
		
		int[] iArr = new int[100];
		iArr[0] = 10;
		
		System.out.println(iArr[0]);
		for(int i = 1; i < iArr.length; i++) {
			iArr[i] = iArr[i-1] + 10;
			System.out.println(iArr[i]);
		}
		
		System.out.println("=================================");
		
		int[] iValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		
		
		for(int i = 1; i <= iValue.length; i++) {
			System.out.print(i+"번째 줄 : " );
			for(int j = 0; j < i; j++) {
				System.out.print(iValue[j]);
			}
			System.out.println();
		}
		
	}
}
