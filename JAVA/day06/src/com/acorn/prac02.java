package com.acorn;

import java.util.Scanner;

public class prac02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력");
		int num = sc.nextInt();
		
//		if( (num > 3) && (num > 6)) {
//			System.out.println(num + "봄");
//		}else if ((num >= 7) && (num <= 8)) {
//			System.out.println(num + "여름");
//		}else if ((num >= 9) && (num <= 11)) {
//			System.out.println(num + "가을");
//		}else if ((num == 12) || (num <= 2)) {
//			System.out.println(num + "겨울");
//		}else {
//			System.out.println(num + "잘못입력");
//		}
		
		switch (num) {
		case 1 : case 2 : case 3 : 
		System.out.println("봄");
		break;
		case 4 : case 5 : case 6 : 
		System.out.println("여름");
		break;
		case 7 : case 8 : case 9 : 
		System.out.println("가을");
		break;
		case 10 : case 11 : case 12 : 
		System.out.println("겨울");
		break;
		
		default: System.out.println("nono");
		}
		
		sc.close();
	}

}
