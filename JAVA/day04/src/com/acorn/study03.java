package com.acorn;

import java.util.Scanner;

public class study03 {

	public static void main(String[] args) {

		
		//배열을 선언
//		int[] iArr = new int[10];
//		System.out.println();
//		//길이가 10
//		//반복문을 이용
//		for(int i = 0; i < 10; ++i) {
//			iArr[i] = i +1; 
//		}
//		for(int i = 0; i < 10; ++i) {
//			System.out.println(iArr[i]);
//		}
		//배열 인덱스에 넣은 후
		//순서대로
		//값을 출력
		
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};    
//		for(int i = 0; i < arr.length; i++) {
//		       System.out.print(arr[i]);
//		}
		
		//배열 선언
//		int[] iArr03;
//		//사용자에게 입력
		Scanner sc = new Scanner(System.in);
//		System.out.println("입력>>>");
//		int arrSize = sc.nextInt();
//		//입력크기 배열 할당
//		iArr03 = new int[arrSize];
//		//1부터 입력 받은 값까지 배열에
//		for(int i = 1; i < arrSize; ++i)
//		{
//			iArr03[i] = i + 1;
//		}
//		//출력
//		for(int i = 0; i < arrSize; ++i)
//		{
//			System.out.println(iArr03[i]);
//		}
		
		
		///////////////////////////////////////////////////////
		//String배열을 선언
		String[] sArray = new String[5];
		//길이가 5
		//초기화
		//"사과", "귤", "포도", "복숭아", "참외"
		sArray[0] = "사과";
		sArray[1] = "귤";
		sArray[2] = "포도";
		sArray[3] = "복숭아";
		sArray[4] = "참외";
		//출력
		//귤`
		for(int i = 0; i < sArray.length; i++)
		{
			if(sArray[i].equals("귤")) {
				System.out.println(sArray[i]);
				break;
			} else {
				System.out.println("귤이 아닙니다");
			}
		}
		
		////////////////////////////////////////////////////
		//문자열을 입력 받아
		System.out.println("문자열입력>>>");
		String str = sc.nextLine();
		//문자 하나하나 배열에 넣고 str.charAt(인덱스)
		char[] cArr = new char[str.length()];
		for(int i = 0; i < str.length(); i++)
		{
			cArr[i] = str.charAt(i);
		}
		//검색할 문자를 입력 받아 
		System.out.println("검색할 문자>>>");
		String cData = sc.nextLine();
		char cTarget = cData.charAt(0);
		int matchCnt = 0;
		for(int i = 0; i < cArr.length; i++)
		{
			//일치 문자열 갯수 증감연산자
			if(cTarget == cArr[i]) { matchCnt++; }
		}
		//출력
		System.out.println("일치문자갯수: " + matchCnt);
		sc.close();
	}
		
}