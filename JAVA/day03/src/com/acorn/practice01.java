package com.acorn;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println("성별을 입력하세요(남/여)");
		String gen = sc.nextLine();
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		System.out.println("키를 입력하세요(cm)");
		float cm = sc.nextFloat();
		
		System.out.println("키 "+ cm + "cm인 " + age + "살 " + gen + "자 " + name + "님 반갑습니다");
		
		sc.close();
	}
	
}
