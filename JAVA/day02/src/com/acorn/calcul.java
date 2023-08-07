package com.acorn;

import java.util.Scanner;

public class calcul {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�޴�");
			System.out.println("1.���ϱ�");
			System.out.println("2.����");
			System.out.println("3.���ϱ�");
			System.out.println("4.������");
			System.out.println("99.����");
			System.out.println("���ϴ� �޴��� �����ϼ���.:>>>_");
			int cal = sc.nextInt();
			
			if(cal == 99)
			break;
			
			if(cal == 1) {
				System.out.println("ù��° ���ڸ� �Է��ϼ���");
				int num1 = sc.nextInt();
				System.out.println("�ι�° ���ڸ� �Է��ϼ���");
				int num2 = sc.nextInt();
				System.out.println("����� " + (num1 + num2) + " �Դϴ�.");
			}
			else if(cal == 2) {
				System.out.println("ù��° ���ڸ� �Է��ϼ���");
				int num1 = sc.nextInt();
				System.out.println("�ι�° ���ڸ� �Է��ϼ���");
				int num2 = sc.nextInt();
				System.out.println("����� " + (num1 - num2) + " �Դϴ�.");
			}
			else if(cal == 3) {
				System.out.println("ù��° ���ڸ� �Է��ϼ���");
				int num1 = sc.nextInt();
				System.out.println("�ι�° ���ڸ� �Է��ϼ���");
				int num2 = sc.nextInt();
				System.out.println("����� " + (num1 * num2) + " �Դϴ�.");
			}
			else if(cal == 4) {
				System.out.println("ù��° ���ڸ� �Է��ϼ���");
				int num1 = sc.nextInt();
				System.out.println("�ι�° ���ڸ� �Է��ϼ���");
				int num2 = sc.nextInt();
				System.out.println("����� " + (num1 / num2) + " �Դϴ�.");
			}
			else if((cal != 1) && (cal !=2) && (cal != 3) && (cal != 4) && (cal != 99) ) {
				System.out.println("�߸��� �޴��� �����ϼ̽��ϴ�");
				System.out.println("���ϴ� �޴��� �ٽ� �����ϼ���");
			}
			
		}
			
		
		//���� ���α׷�
		//�޴�
		//1.���ϱ�
		//2.����
		//3.���ϱ�
		//4.������
		//99.����
		//���ϴ� �޴��� �����ϼ���:>>>_
		//���õ� ������� �̵�
		//ù��° ���ڸ� �Է��ϼ���
		//�ι�° ���ڸ� �Է��ϼ���
		//������
		//�޴��� �̵�
		//�ݺ�
		sc.close();
	}

}
