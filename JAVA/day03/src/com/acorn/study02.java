package com.acorn;

import java.util.Scanner;

public class study02 {
	
	public static void main(String[] args) {
		// ��� ���� �迭 ����: ������Ÿ��[] ������ = {};	
		int[] iRandomNum = new int[100];
		int iResult01 = 0;
		int iResult02 = 0;
		// �����߻��⸦ ����� �迭�� ���� �Ҵ�:  �ݺ���
		for(int i = 0; i < 100; i++)
		{
			iRandomNum[i] = (int)((Math.random()*100))+1;
		}		
		
		// Ÿ�� ����: 1(���), 2(��ǻ��)
		byte iType = 1;
		// Ű���� �Է� ��ü ����
		Scanner sc = new Scanner(System.in);
		while(true) {
			int iWinCondition = 0;
			System.out.println("�޴�");
			System.out.println("1.�������1");
			System.out.println("2.�������2");
			System.out.println("99.����");
			System.out.println("������� �����ϼ���:>>>");
	
			int iSelectNum = sc.nextInt();
			// ���Ῡ�� Ȯ��
			if(iSelectNum == 99) break;
			if(iSelectNum == 1) iWinCondition = 1;
			else if(iSelectNum == 2) iWinCondition = 2;
				
			// �� ���� ���ڸ� Ű���� �Է�
			System.out.println("�����Է�1:>>>");
			int iInputVal01 = iRandomNum[sc.nextInt()];
			System.out.println("�����Է�2:>>>");
			int iInputVal02 = iRandomNum[sc.nextInt()];
			
			// �Է��� �� ��� ��
			if( (iInputVal01 - iInputVal02) >= 0) { iResult01 = iInputVal01 - iInputVal02;}
			else { iResult01 = iInputVal02 - iInputVal01;}
			
			// �� ���� ������ ����
			int iRanNum01 = (int)((Math.random()*100))+1;
			int iRanNum02 = (int)((Math.random()*100))+1;
			
			// ���� ��� ��
			if( (iRanNum01 - iRanNum02) >= 0) { iResult02 = iRanNum01 - iRanNum02;}
			else { iResult02 = iRanNum02 - iRanNum01;}
			
			System.out.println("���:" + iInputVal01 + "," + iInputVal02);
			System.out.println("��ǻ��:" + iRanNum01 + "," + iRanNum02);
			
			if(iWinCondition == 1)
			{
				// �������: �� ���� ���� ���� ���� ���� ��
				if( iResult01 > iResult02 )
				{
					iType = 2;
				}				
			}
			else if(iWinCondition == 2)
			{
				if( iResult01 < iResult02 )
				{
					iType = 2;
				}	
			}
				
			// ��� ���� ���
			if(iType == 2) System.out.println("��ǻ�� ���");
			else System.out.println("��� ���");
			
			System.out.println("\n");
		}

		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
		
	}
}
