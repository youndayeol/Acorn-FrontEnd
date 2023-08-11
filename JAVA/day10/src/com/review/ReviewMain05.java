package com.review;

import java.util.Scanner;

public class ReviewMain05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("배열사이즈>>>");
		int iArrSize = sc.nextInt();
		dynamicMakeArr(sc, iArrSize);

		sc.close();
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