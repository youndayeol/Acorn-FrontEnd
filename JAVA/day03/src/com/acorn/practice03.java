package com.acorn;

import java.util.Scanner;

public class practice03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int selectedBtnPrev = 0;
		int selectedBtnNow = 0;
		int userInputValueF = 0;
		int userInputValueS = 0;
		
		while(true)
		{
			System.out.println("=== �޴� ===");
			System.out.println("1. ���ϱ�");
			System.out.println("2. ����");
			System.out.println("3. ���ϱ�");
			System.out.println("4. ������");
			System.out.println("99. EXIT");
			System.out.print("���ϴ� ����� �����ϼ���:>>>");
			
			selectedBtnPrev = sc.nextInt();
			if(selectedBtnPrev == 99) break;
			else if( (selectedBtnPrev < 1) || (selectedBtnPrev > 4) ) { System.out.println("�߸��� �����Դϴ�. �ٽ�");  continue; }
			
			System.out.println("=== ���� Ÿ�� �޴� ===");
			System.out.println("1. ����");
			System.out.println("2. �Ǽ�");
			System.out.println("99. EXIT");
			System.out.print("���ϴ� ����� �����ϼ���:>>>");
			selectedBtnNow = sc.nextInt();
			if(selectedBtnNow == 99) continue;
			else if( (selectedBtnPrev < 1) || (selectedBtnPrev > 2) ) { System.out.println("�߸��� �����Դϴ�. �ٽ�");  continue; }
			
			System.out.println("�����Է�1:>>>");
			userInputValueF = sc.nextInt();
			System.out.println("�����Է�2:>>>");
			userInputValueS = sc.nextInt();
			
			if(selectedBtnPrev == 1) { System.out.println("���:" + (userInputValueF + userInputValueS)); }
			if(selectedBtnPrev == 2) { System.out.println("���:" + (userInputValueF - userInputValueS)); }
			if(selectedBtnPrev == 3) { System.out.println("���:" + (userInputValueF * userInputValueS)); }
			if(selectedBtnPrev == 4) { System.out.println("���:" + (userInputValueF / userInputValueS)); }
			
		}
		
		
		
		
		sc.close();
	}
	
}
