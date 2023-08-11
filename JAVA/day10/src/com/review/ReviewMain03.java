package com.review;

import java.util.Scanner;

public class ReviewMain03 {

	public static void main(String[] args) {
		//입력된 네 개의 수
		Scanner sc = new Scanner(System.in);
		//두개는 실수 두개는 정수
		int iType = 1;  //1:정수로, 2:실수로
		//함수명A(sc, 어떤값1, 어떤값2);
		int iRetNum = keyInputProcess(sc);//함수호출
		//세 수를 검사해서 5보다 작은 수를 출력

	}

	public static int keyInputProcess(
			Scanner sc) 	//함수선언
	{
		//함수정의
		int iInputValue;
		System.out.println("정수>>");
		iInputValue = sc.nextInt();
		return iInputValue;
	}
}