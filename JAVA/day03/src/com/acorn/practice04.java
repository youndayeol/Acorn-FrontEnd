package com.acorn;

import java.util.Scanner;

public class practice04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���");
		String str = sc.nextLine();
		
		System.out.println(str.substring(0,3));
		
		System.out.println("ù��° ���� : " + str.substring(0,1));
		System.out.println("�ι�° ���� : " + str.substring(1,2));
		System.out.println("����° ���� : " + str.substring(2,3));
		
		System.out.println("�ο� ��");
		int num1 = sc.nextInt();
		System.out.println("���� ����");
		int num2 = sc.nextInt();
		
		System.out.println("1�δ� ���� ���� : " + (num2 / num1));
		System.out.println("���� ���� ���� : " + (num2 % num1));
		
		
		
		
		
		
		
		sc.close();
		}
	}