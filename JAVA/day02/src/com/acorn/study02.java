package com.acorn;

import java.util.Scanner;

public class study02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("��������:>>>");
		int nlpoint = sc.nextInt();
		System.out.println("��������>>>");
		int elpoint = sc.nextInt();
		System.out.println("��������>>>");
		int matlpoint = sc.nextInt();
		
		int idropMarginPoint = 60;
		int iAPoint = 0;
		int iBPoint = 0;
		int iCPoint = 0;
		int iSumPoint = 0;
		
		

		
		System.out.println("��ü ������ ��" + (nlpoint + elpoint + matlpoint));
		System.out.println("��ü ������ ���" + (nlpoint + elpoint + matlpoint)/3);
		
		if(nlpoint < 80) {
			System.out.println("�������� ���հ�");
		}
		if(elpoint < 80) {
			System.out.println("�������� ���հ�");
		}
		if(matlpoint < 80) {
			System.out.println("�������� ���հ�");
		} 
		
		sc.close();
		
		// ���� ���� ������ ����
		// ������ ���� 3���� ���� ������ ������ �Է¹޴´�
		// ��� ������ �ջ�
		// ��� ������ ����� ���Ѵ�
		// �ջ� ������ �հ�/���հ� ���� ����
		// ��� ������ �հ�/���հ� ���� ����
		// ���� ���� ���� ��� �Ǵ� ���հ� ���ι� ���� ���		
		

	}

}
