package com.acorn;

import java.util.Scanner;

public class prac03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String sPassMsg = "축하합니다 합격입니다";
		String sFailMsg = "불합격입니다";
		
		System.out.println("국어점수");
		int iNlScore = sc.nextInt();
		System.out.println("영어점수");
		int iEngScore = sc.nextInt();
		System.out.println("수학점수");
		int iMathScore = sc.nextInt();
//		int iNlScore = 0; int iEngScore = 0; int iMathScore = 0;
		
		int iSum = iNlScore + iEngScore + iMathScore;
		int iAvg= (iNlScore + iEngScore + iMathScore) / 3;
		float fAvg = 0.0f;
		
		if( ((iNlScore >= 40) && (iEngScore >= 40) && (iMathScore >= 40))
				&& (iAvg >= 60)) {
			System.out.println("평균" + iAvg + sPassMsg);
		} else {
			System.out.println("평균" + iAvg + sFailMsg);
		}

	}

}
