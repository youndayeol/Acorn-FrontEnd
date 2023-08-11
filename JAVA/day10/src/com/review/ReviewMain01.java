package com.review;

import java.util.Scanner;

public class ReviewMain01 {

	public static void main(String[] args) {
		//입력된 네 개의 수
		Scanner sc = new Scanner(System.in);
		//두개는 실수 두개는 정수
		int iA, iB, iC;
		int iType = 3;
//		함수명A(sc, 1); // 함수명A(1)1

		//네 개 중 하나라도 5보다 작은 수가 출력, 프로그램 종료
		if(iA < 5) {System.out.println(iA + "는 5보다 작은 수");
		} else if (iB < 5) {System.out.println(iB + "는 5보다 작은 수");
		} else if (iC < 5) {System.out.println(iC + "는 5보다 작은 수");
		} else {System.out.println("5보다 작은 수가 없습니다"); }
		sc.close();
	}
	
	//키 입력 처리 함수
//	public static void 함수명A(Scanner sc, 파라미터1, 파라미터2 ...)
//	// 변수선언 == 파라미터 지정방법 => int a
//	{
//		조건
//		명령문;
//	}
}