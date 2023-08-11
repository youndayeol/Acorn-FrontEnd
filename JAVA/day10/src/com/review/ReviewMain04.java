package com.review;

import java.util.Scanner;

public class ReviewMain04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//배열:같은 타입의 요소값을 저장하는 변수
		//하나 이상의 요소값을 하나의 변수로 저장
		//문법: 위치값 : 0~배열사이즈-1
		//선언: 데이터타입[] 배열변수명;
		//초기화: 배열변수 = new 데이터타입[사이즈]; -> 사이즈 < 0
		//값을 대입 : 배열변수명[위치값] = 값(변수);
		//값을 추출 : int IArrValue = 배열변수명[위치값];
		//키보드에서 생상받고자 하는
		//배열사이즈를 받아 배열하는
		System.out.println("숫자 입력");
		int iArrSize = sc.nextInt();
		dynamicMakeArr(sc, iArrSize);
		
		int[] iArr = new int[iArrSize];
		//배열의 가운데 위치에 키보드 입력받은
		int halfIdx = iArrSize / 2;
		System.out.println("입력배열값>>");
		int iValue = sc.nextInt();
		//값을 저장
		iArr[halfIdx] = iValue;
		
		//입력한 값을 출력
		System.out.println(iArr[halfIdx-1] + ":" + iArr[halfIdx] + ":" + iArr[halfIdx+1]);
		
	}
	public static void dynamicMakeArr(Scanner sc, int iArrSize) {
		
		int[] iArr = new int[iArrSize];
		//배열의 가운데 위치에 키보드 입력받은
		int halfIdx = iArrSize / 2;
		System.out.println("입력배열값>>");
		int iValue = sc.nextInt();
		//값을 저장
		iArr[halfIdx] = iValue;
		
		//입력한 값을 출력
		System.out.println(iArr[halfIdx-1] + ":" + iArr[halfIdx] + ":" + iArr[halfIdx+1]);
	}
}