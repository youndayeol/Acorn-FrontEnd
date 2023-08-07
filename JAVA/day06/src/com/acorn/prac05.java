package com.acorn;

public class prac05 {

	public static void main(String[] args) {
//정방향
		int iArr[] = new int[10];
//		for(int i = 0; i < 10; i++) {
//			iArr[i] = i +1;
//			System.out.println(iArr[i] + " ");
			
			//역방향
			for(int i = 9, j = 0; i >= 0; i--, j++) {
				iArr[j] = i + 1;
			}
			
			for(int i = 0; i < 10; i++) {
				System.out.println(iArr[i] + " ");
			}
			
			
		}
		
	}


