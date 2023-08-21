package com.study;

import java.util.Scanner;

//메소드 오버로딩
public class MethodMain07 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] iFindMinValArr = {};
		int[] iTargetValArr = {};
		
		int iMaxVal = 0;
//		int iMinVal = 0;
		
//		iMinVal = getFindMinVal(iFindMinValArr);
		iMaxVal = getFindMaxVal(iTargetValArr);
		System.out.println("최대값: " + iMaxVal);
	}
	
	public static int getFindMaxVal(int[] iTargetValArr) {
		int iTempMaxVal = iTargetValArr[0];
		for(int i = 0; i < iTargetValArr.length; i++) {
			if(iTempMaxVal < iTargetValArr[i]) {
				
			}
		}
		return iTempMaxVal;
	}
}
 