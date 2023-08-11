package com.review;

import java.util.Scanner;
//반복문
//for(초기값; 조건식; 증감값) {
//	반복적으로 실행할명령문;
public class ReviewMain07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("배열사이즈>>>");
		
		int iArrSize = sc.nextInt();
		int[] iArr01 = new int[iArrSize];
		int[] iArr02 = new int[iArrSize];
		System.out.println("배열값>>>");
		int iValue = sc.nextInt();
		
		//iArr02를 반복문 이용해 짝수 인덱스 값을 저장
			
		dynamicMakeArr(iArr01, iArr02);
		
		sc.close();
	}
	public static void dynamicMakeArr(int[] iArr01, int[] iArr02) {
		
		for(int i = 0; i < iArr01.length; i++) {
			if( i % 2 == 0 ) {
				iArr01[i] = iArr02[i];
			}
		}

//		int[] iArr = new int[iArrSize];
//		//배열의 가운데 위치에 키보드 입력받은
//		int halfIdx = iArrSize / 2;
//		System.out.println("입력배열값>>");
//		int iValue = sc.nextInt();
//		//값을 저장
//		iArr[halfIdx] = iValue;

	}
	
	
}