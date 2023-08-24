package study.homework;

public class HomeWork02 {

	public static void main(String[] args) {

		System.out.println("가. 5개의 크기를 가진 정수 배열을 선언하고 값을 대입하는 방법으로 직접 값을 할당");
		int[] iArr1 = {1, 2, 3, 4, 5};

		System.out.println("나. 10개의 크기를 가진 정수 배열을 선언하고 new 연산자를 사용해 배열을 초기화");
		int[] iArr2 = new int[10];

		System.out.println("다. 나에 이어 6번째 요소에 값을 할당하고, 첫 번째 요소부터 6번째 요소까지의 값을 출력");
		iArr2[5] = 5;
		for(int i = 0; i < 6; i++) {
			System.out.print((i+1) + "번째 : " + iArr2[i] + " ");
		}
		System.out.println();
		System.out.println("라. 6개의 크기를 가진 실수 배열을 new 연산자로 생성하고, 배열의 6번째 요소부터 8번째 요소까지를 각각 40.1, 50.1, 60.1의 값을 할당하라");
		
		double[] dArr1 = new double[6];
		dArr1[5] = 40.1;
		dArr1[6] = 50.1;
		dArr1[7] = 60.1;
		System.out.println("마. 라의 결과를 출력");
		for(double i = 5; i < 8; i++) {
			System.out.print(((int)i+1) + "번째 : " + dArr1[(int)i] + " ");
		}
		System.out.println();
		System.out.println("바. 4의 크기를 가진 문자열 배열을 선언하면서 동시에" + "korea, " + "england, " + "japan, " + "china" + "로 값을 할당하고 그 결과를 출력하라");
		String[] sArr1 = {"korea", "england", "japan", "china"};
		
		for(int i = 0; i < sArr1.length; i++) {
			System.out.println(sArr1[i]);
		
		}

	}

}
