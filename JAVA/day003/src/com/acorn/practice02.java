package com.acorn;

import java.util.Scanner;

public class practice02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ù ��° ������ �Է�");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ������ �Է�");
		int num2 = sc.nextInt();
		
		int sum = (num1 + num2);
		
		System.out.println("ù ��° ���� : " + num1);
		System.out.println("�� ��° ���� : " + num2);
		System.out.println("���ϱ� ��� : " + sum);
		System.out.println("���� ��� : " + (num1 - num2));
		System.out.println("���ϱ� ��� : " + (num1 * num2));
		System.out.println("������ �� ��� : " + (num1 / num2));
		
		sc.close();
	}
	
}
