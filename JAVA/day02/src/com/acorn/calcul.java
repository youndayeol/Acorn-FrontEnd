package com.acorn;

import java.util.Scanner;

public class calcul {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("메뉴");
			System.out.println("1.더하기");
			System.out.println("2.빼기");
			System.out.println("3.곱하기");
			System.out.println("4.나누기");
			System.out.println("99.종료");
			System.out.println("원하는 메뉴를 선택하세요.:>>>_");
			int cal = sc.nextInt();
			
			if(cal == 99)
			break;
			
			if(cal == 1) {
				System.out.println("첫번째 숫자를 입력하세요");
				int num1 = sc.nextInt();
				System.out.println("두번째 숫자를 입력하세요");
				int num2 = sc.nextInt();
				System.out.println("결과는 " + (num1 + num2) + " 입니다.");
			}
			else if(cal == 2) {
				System.out.println("첫번째 숫자를 입력하세요");
				int num1 = sc.nextInt();
				System.out.println("두번째 숫자를 입력하세요");
				int num2 = sc.nextInt();
				System.out.println("결과는 " + (num1 - num2) + " 입니다.");
			}
			else if(cal == 3) {
				System.out.println("첫번째 숫자를 입력하세요");
				int num1 = sc.nextInt();
				System.out.println("두번째 숫자를 입력하세요");
				int num2 = sc.nextInt();
				System.out.println("결과는 " + (num1 * num2) + " 입니다.");
			}
			else if(cal == 4) {
				System.out.println("첫번째 숫자를 입력하세요");
				int num1 = sc.nextInt();
				System.out.println("두번째 숫자를 입력하세요");
				int num2 = sc.nextInt();
				System.out.println("결과는 " + (num1 / num2) + " 입니다.");
			}
			else if((cal != 1) && (cal !=2) && (cal != 3) && (cal != 4) && (cal != 99) ) {
				System.out.println("잘못된 메뉴를 선택하셨습니다");
				System.out.println("원하는 메뉴를 다시 선택하세요");
			}
			
		}
			
		
		//계산기 프로그램
		//메뉴
		//1.더하기
		//2.빼기
		//3.곱하기
		//4.나누기
		//99.종료
		//원하는 메뉴를 선택하세요:>>>_
		//선택된 기능으로 이동
		//첫번째 숫자를 입력하세요
		//두번째 숫자를 입력하세요
		//결과출력
		//메뉴로 이동
		//반복
	}

}
