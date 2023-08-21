package com.study;


//메서드 : 프로그램의 (반복되는) 기능을 코드 블럭으로 작성
//메서드는 클래스 안에 선언/정의함
//메서드는 다른 메서드 안에서 선언/정의 할 수 없음
//리턴타입: void, 파라메터(아규먼트)
//메모리 영역 : 스택
public class MethodMain01 {
	
	public static void main(String[] args) {
		
		System.out.println("1.");
		newLine(); //함수 호출
		System.out.println("2.");
		newLine(3);
		
	}

	private static void newLine(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println();
		}
		
	}

	private static void newLine() {
		System.out.println();
		
	}
}
