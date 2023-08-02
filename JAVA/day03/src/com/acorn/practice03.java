package com.acorn;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selectedBtnPrev = 0;
		int selectedBtnNow = 0;
		int userInputValueF = 0;
		int userInputValueS = 0;
		
		while(true)
		{
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("99. EXIT");
			System.out.print("원하는 기능을 선택하세요:>>>");
			
			selectedBtnPrev = sc.nextInt();
			if(selectedBtnPrev == 99) break;
			else if( (selectedBtnPrev < 1) || (selectedBtnPrev > 4) ) { System.out.println("잘못된 선택입니다. 다시");  continue; }
			
			System.out.println("=== 연산 타입 메뉴 ===");
			System.out.println("1. 정수");
			System.out.println("2. 실수");
			System.out.println("99. EXIT");
			System.out.print("원하는 기능을 선택하세요:>>>");
			selectedBtnNow = sc.nextInt();
			if(selectedBtnNow == 99) continue;
			else if( (selectedBtnPrev < 1) || (selectedBtnPrev > 2) ) { System.out.println("잘못된 선택입니다. 다시");  continue; }
			
			System.out.println("숫자입력1:>>>");
			userInputValueF = sc.nextInt();
			System.out.println("숫자입력2:>>>");
			userInputValueS = sc.nextInt();
			
			if(selectedBtnPrev == 1) { System.out.println("결과:" + (userInputValueF + userInputValueS)); }
			if(selectedBtnPrev == 2) { System.out.println("결과:" + (userInputValueF - userInputValueS)); }
			if(selectedBtnPrev == 3) { System.out.println("결과:" + (userInputValueF * userInputValueS)); }
			if(selectedBtnPrev == 4) { System.out.println("결과:" + (userInputValueF / userInputValueS)); }
			
		}
		
		
		
		
		sc.close();
	}
	
}
