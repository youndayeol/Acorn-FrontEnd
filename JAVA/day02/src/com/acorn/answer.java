package com.acorn;

import java.util.Scanner;

public class answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("��������:>>>");
//		int nlpoint = sc.nextInt();
//		System.out.println("��������:>>>");
//		int elpoint = sc.nextInt();
//		System.out.println("��������:>>>");
//		int matlpoint = sc.nextInt();
//		
//		System.out.println("��ü ������ ��:" + (nlpoint + elpoint + matlpoint));
		
		// ���� ����(��) ������ ����
		int iSumpDropPoint = 160;
		int iAvgDropPoint = 60;
		int idropMarginPoint = 60;
		// �ջ�/��� ���� ����
		int iSumPoint = 0;
		int iAvgPoint = 0;
		// ������ ���� 3���� ���� ������ ������ �Է¹޴´�.
		System.out.println("A����:>>>");
		int iAPoint = sc.nextInt();
		System.out.println("B����:>>>");
		int iBPoint = sc.nextInt();
		System.out.println("C����:>>>");
		int iCPoint = sc.nextInt();
		// ��� ������ ����� ���Ѵ�.
		iAvgPoint = (iAPoint + iBPoint + iCPoint) / 3;
		// ������ ���� �հݿ��� �Լ� ȣ��
		passAtoTotalScore(iAPoint, iBPoint, iCPoint, iSumpDropPoint);
		
		// ��� �ջ꿡 ���� �Լ� ȣ��
		passAtoAvg(iAvgPoint, iAvgDropPoint);
		
		// ������ ���� �հݿ��� �Լ� ȣ��
		passAtFalldownScore(iAPoint, iBPoint, iCPoint, idropMarginPoint);
	}
	
	// ������ ���� �հݿ���
	public static void passAtoTotalScore(
			int iApoint, int iBpoint, int iCpoint, int passLine) {
		int iSumPoint = 0;
		iSumPoint = iApoint + iBpoint + iCpoint;
		if(iSumPoint > passLine) System.out.println("�հ�:�ջ������ʰ�");
		else System.out.println("���հ�:�ջ������̸�");
	}

	// ��� �ջ꿡 ���� �հݿ���
	public static void passAtoAvg(
			int iAvgResult, int passLine) {
		if(iAvgResult > passLine) System.out.println("�հ�:��������ʰ�");
		else System.out.println("���հ�:��������̸�");	
	}
	
	// ������ ���� �հݿ���
	public static void passAtFalldownScore(
			int iApoint, int iBpoint, int iCpoint, int passLine) {
		if((iApoint > passLine) 
				&& (iBpoint > passLine) 
				&& (iCpoint > passLine)) System.out.println("�հ�:������������");
		else System.out.println("���հ�:������������");
	}
}