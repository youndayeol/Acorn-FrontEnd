package com.review;

import java.util.Scanner;

public class ReviewMain02 {

	public static void main(String[] args) {
		//입력된 네 개의 수
		Scanner sc = new Scanner(System.in);
		//두개는 실수 두개는 정수
		int iA, iB;
		double dC, dD;
		boolean aF = false;
		boolean bF = false;
		boolean cF = false;
		boolean dF = false;
		System.out.println("정수를 입력>>>");
		iA = sc.nextInt();
		System.out.println("정수를 입력>>>");
		iB = sc.nextInt();
		System.out.println("정수를 입력>>>");
		dC = sc.nextDouble();
		System.out.println("정수를 입력>>>");
		dD = sc.nextDouble();

		//세 수를 검사해서 5보다 작은 수를 출력
		if(iA < 5) {System.out.println(iA);}
		if(iB < 5) {System.out.println(iB);}
		if(dC < 5) {System.out.println(dC);}
		if(dD < 5) {System.out.println(dD);}
		
		sc.close();
	}

}
