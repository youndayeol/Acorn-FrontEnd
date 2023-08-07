package com.acorn;

import java.util.Scanner;

public class prac01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("1.입력");
		System.out.println("2.수정");
		System.out.println("3.조회");
		System.out.println("4.삭제");
		System.out.println("7.종료");
		int InputNum = sc.nextInt();
		if(InputNum == 7) {
			System.out.println("프로그램이 종료됩니다.");
			break;
		}
		else if(InputNum == 1) {
			System.out.println("입력 메뉴입니다");
			while(true) {
				System.out.println("가. 조건식");
				System.out.println("나. 실행문자 : 입력메뉴입니다");
				
				String InputNum2 = sc.next();
				if(InputNum2.equals("가")) {
				break;
				}
				else if(InputNum2.equals("나")) {
					break;
				}
			}
		}
		else if(InputNum == 2) {
			System.out.println("수정 메뉴입니다");
		}
		
		else if(InputNum == 3) {
			System.out.println("조회 메뉴입니다");
		}
		
		else if(InputNum == 4) {
			System.out.println("삭제 메뉴입니다");
		}
		else if((InputNum != 1) && (InputNum !=2) && (InputNum != 3) && (InputNum != 4) && (InputNum != 7) ) {
			System.out.println("실행할 수 없는 메뉴입니다");
		}
		}
		sc.close();
	}
}
