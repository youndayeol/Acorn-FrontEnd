package com.study;

import java.util.Scanner;

public class SnackMenu {
	private Scanner sc;
	private SnackController snackController;

	public void menu() {
		sc = new Scanner(System.in);
		snackController = new SnackController();
		//스낵류를 입력하세요
		System.out.println("스낵류를 입력하세요");
		// 종류:
		System.out.println("kind");
//		sc.next();
		//이름
		System.out.println("name");
		sc.next();
		//맛
		System.out.println("flavor");
		sc.next();
		//개수
		System.out.println("numOf");
		sc.nextInt();
		//가격
		System.out.println("price");
		sc.nextInt();
		snackController.saveData(null, null, null, null, null);
	}

}
