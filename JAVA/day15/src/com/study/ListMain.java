package com.study;

public class ListMain {

	public static void main(String[] args) {
		int iValue01;
		int iValue02;
		int iValue03;
		
		iValue01 = 10;
		iValue02 = 20;
		iValue03 = 30;
		
		System.out.println(iValue01 + ":" + iValue02 + ":" + iValue03);
		
		int[] iValueArr = new int[10];
		iValueArr[4] = 5;
		
		System.out.println(iValueArr[4]);
	}

}