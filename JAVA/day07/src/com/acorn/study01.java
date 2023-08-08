package com.acorn;

import java.util.Scanner;

public class study01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//배열 : 동일 데이터 타입의 값 열
		//선언 : 데이터타입 배열명(변수명) :
		//초기화 : 배열명 = {}, new 데이터타입[사이즈];
		//초기화시점의 기본값
		//정수 :0, 실수: 0.0, 문자 : '' or null, 문자열 :"" or null
		//대입:배열요소(배열명[인덱스]:시작(0)
		//배열명[0] = 값
		
		int iArraySize = 0;
		int[] iArray;
		// 1. 사용자에게 입력받은
		System.out.println("배열크기입력");
		iArraySize = sc.nextInt();
		// 2. 양의 정수만큼
		//		배열 크기를 할당
		iArray = new int[iArraySize];
		// 3. 1부터 입력받은 값까지
		//		배열에 저장
		for(int i = 0; i < iArraySize; i++)
		{
			iArray[i] = i + 1;
		}
		// 4. 출력
		for(int i = 0; i < iArraySize; i++)
		{
			System.out.println(iArray[i] + " ");
		}
		sc.close();
	}

}
