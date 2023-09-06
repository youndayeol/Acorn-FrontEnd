package com.outstudy;

import java.util.Scanner;

public class Study01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("고객 예약번호를 입력해주세요 / 1 ~ 5 ");
		int crNum = sc.nextInt();
		
		String message =  CheckReservation(crNum);
	}
	
	
	public static String CheckReservation(int crNum) {
		int[] iArr = {1, 2, 3, 4, 5};
		String message = "예약정보가 없습니다";
		for(int i = 0; i < iArr.length; i++) {
			if(crNum == iArr[i]) {
				System.out.println("환영합니다");
				break;
			}
		}
		return message;
	}

}
