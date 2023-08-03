package com.acorn;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요");
		String str = sc.nextLine();
		
		System.out.println(str.substring(0,3));
		
		System.out.println("첫번째 문자 : " + str.substring(0,1));
		System.out.println("두번째 문자 : " + str.substring(1,2));
		System.out.println("세번째 문자 : " + str.substring(2,3));
		
		System.out.println("인원 수");
		int num1 = sc.nextInt();
		System.out.println("사탕 갯수");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (num2 / num1));
		System.out.println("남는 사탕 개수 : " + (num2 % num1));
		
		
		
		
		
		
		
		sc.close();
		}
	}