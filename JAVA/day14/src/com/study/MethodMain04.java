package com.study;

public class MethodMain04 {

	public static void main(String[] args) {
		overLoadingTest();
		overLoadingTest("korea");
		overLoadingTest(2023);
		overLoadingTest("korea", 2023);
	}

	private static void overLoadingTest() {
		System.out.println("안녕하세요");
	}

	private static void overLoadingTest(String national) {
		System.out.println("안녕하세요 저는 " + national + "입니다");
	}

	private static void overLoadingTest(int year) {
		System.out.println("금년은 " + year + "년 입니다");
	}

	private static void overLoadingTest(String national, int year) {
		System.out.println("안녕하세요 저는 " + national + "이고, 올해는 " + year + "년 입니다");
		
	}
	
	
}
