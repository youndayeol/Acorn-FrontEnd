package com.study;

public class MethodMain05 {

	public static void main(String[] args) {
		int iTotal = 0;
		int[] iSum = { 10, 20, 100, 200, 90, 70};
		iTotal = sum(iTotal, iSum);
		System.out.println(iTotal);
	}
	
	public static int sum(int iTotal, int[] iSum) {
		for(int i = 0; i < iSum.length; i++) {
			iTotal += iSum[i];
			}
		return iTotal;
	}
}
 