package com.acorn;

import java.util.Scanner;

public class practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
		
		System.out.println("������ �Է��ϼ���(��/��)");
		String gen = sc.nextLine();
		
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		
		System.out.println("Ű�� �Է��ϼ���(cm)");
		float cm = sc.nextFloat();
		
		System.out.println("Ű "+ cm + "cm�� " + age + "�� " + gen + "�� " + name + "�� �ݰ����ϴ�");
		
		sc.close();
	}
	
}
