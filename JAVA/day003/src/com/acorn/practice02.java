package com.acorn;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 정수를 입력");
		int num1 = sc.nextInt();
		System.out.println("두 번째 정수를 입력");
		int num2 = sc.nextInt();
		
		int sum = (num1 + num2);
		
		System.out.println("첫 번째 정수 : " + num1);
		System.out.println("두 번째 정수 : " + num2);
		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
		
		sc.close();
	}
	
}
