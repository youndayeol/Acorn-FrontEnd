package com.acorn;

import java.util.Scanner;

public class study02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("국어점수:>>>");
		int nlpoint = sc.nextInt();
		System.out.println("영어점수>>>");
		int elpoint = sc.nextInt();
		System.out.println("수학점수>>>");
		int matlpoint = sc.nextInt();
		
		int idropMarginPoint = 60;
		int iAPoint = 0;
		int iBPoint = 0;
		int iCPoint = 0;
		int iSumPoint = 0;
		
		

		
		System.out.println("전체 점수의 합" + (nlpoint + elpoint + matlpoint));
		System.out.println("전체 점수의 평균" + (nlpoint + elpoint + matlpoint)/3);
		
		if(nlpoint < 80) {
			System.out.println("국어점수 불합격");
		}
		if(elpoint < 80) {
			System.out.println("영어점수 불합격");
		}
		if(matlpoint < 80) {
			System.out.println("수학점수 불합격");
		} 
		
		sc.close();
		
		// 과목별 과락 점수를 지정
		// 임의의 과목 3개에 대해 각각의 점수를 입력받는다
		// 모든 점수를 합산
		// 모든 점수의 평균을 구한다
		// 합산 점수의 합격/불합격 여부 결정
		// 평균 점수의 합격/불합격 여부 결정
		// 과락 기준 여부 출력 또는 불합격 여부및 이유 출력		
		

	}

}
