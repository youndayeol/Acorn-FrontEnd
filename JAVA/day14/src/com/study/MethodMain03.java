package com.study;

public class MethodMain03 {

	public static void main(String[] args) {
		countdown(10);

	}
	public static void countdown(int count) {
		if(count <= 0) {
			System.out.println("count는 0보다 커야합니다");
			return;
		}
		for(int i = count; i > 0; i-- ) {
			System.out.println(i + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
