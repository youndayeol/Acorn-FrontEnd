package com.acorn;

import java.util.Scanner;

public class Study03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("援��뼱�젏�닔:>>>");
//		int nlpoint = sc.nextInt();
//		System.out.println("�쁺�뼱�젏�닔:>>>");
//		int elpoint = sc.nextInt();
//		System.out.println("�닔�븰�젏�닔:>>>");
//		int matlpoint = sc.nextInt();
//		
//		System.out.println("�쟾泥� �젏�닔�쓽 �빀:" + (nlpoint + elpoint + matlpoint));
		
		// 怨쇰ぉ蹂� 怨쇰씫(蹂�) �젏�닔瑜� 吏��젙
		int iSumpDropPoint = 160;
		int iAvgDropPoint = 60;
		int idropMarginPoint = 60;
		// �빀�궛/�룊洹� �젏�닔 ���옣
		int iSumPoint = 0;
		int iAvgPoint = 0;
		// �엫�쓽�쓽 怨쇰ぉ 3媛쒖뿉 ���빐 媛곴컖�쓽 �젏�닔瑜� �엯�젰諛쏅뒗�떎.
		System.out.println("A怨쇰ぉ:>>>");
		int iAPoint = sc.nextInt();
		System.out.println("B怨쇰ぉ:>>>");
		int iBPoint = sc.nextInt();
		System.out.println("C怨쇰ぉ:>>>");
		int iCPoint = sc.nextInt();
		// 紐⑤뱺 �젏�닔�쓽 �룊洹좎쓣 援ы븳�떎.
		iAvgPoint = (iAPoint + iBPoint + iCPoint) / 3;
		// 珥앹젏�뿉 �뵲瑜� �빀寃⑹뿬遺� �븿�닔 �샇異�
		passAtoTotalScore(iAPoint, iAPoint, iCPoint, iSumpDropPoint);
		
		// �룊洹� �빀�궛�뿉 �뵲瑜� �븿�닔 �샇異�
		passAtoAvg(iAvgPoint, iAvgDropPoint);
		
		// 怨쇰씫�뿉 �뵲瑜� �빀寃⑹뿬遺� �븿�닔 �샇異�
		passAtFalldownScore(iAPoint, iAPoint, iCPoint, idropMarginPoint);
	}
	
	// 珥앹젏�뿉 �뵲瑜� �빀寃⑹뿬遺�
	public static void passAtoTotalScore(
			int iApoint, int iBpoint, int iCpoint, int passLine) {
		int iSumPoint = 0;
		iSumPoint = iApoint + iBpoint + iCpoint;
		if(iSumPoint > passLine) System.out.println("�빀寃�:�빀�궛�젏�닔珥덇낵");
		else System.out.println("遺덊빀寃�:�빀�궛�젏�닔誘몃쭔");
	}

	// �룊洹� �빀�궛�뿉 �뵲瑜� �빀寃⑹뿬遺�
	public static void passAtoAvg(
			int iAvgResult, int passLine) {
		if(iAvgResult > passLine) System.out.println("�빀寃�:�룊洹좎젏�닔珥덇낵");
		else System.out.println("遺덊빀寃�:�룊洹좎젏�닔誘몃쭔");	
	}
	
	// 怨쇰씫�뿉 �뵲瑜� �빀寃⑹뿬遺�
	public static void passAtFalldownScore(
			int iApoint, int iBpoint, int iCpoint, int passLine) {
		if((iApoint > passLine) 
				&& (iBpoint > passLine) 
				&& (iCpoint > passLine)) System.out.println("�빀寃�:怨쇰씫�젏�닔�뾾�쓬");
		else System.out.println("遺덊빀寃�:怨쇰씫�젏�닔議댁옱");
	}
}