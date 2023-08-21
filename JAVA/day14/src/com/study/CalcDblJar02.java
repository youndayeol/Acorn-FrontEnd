package com.study;

public class CalcDblJar02 {
	//필드 영역

	//생성자 영역

	//메소드 ㅕㅇ역
	//Getters/Setters 영역


	//정적메소드 영역

	//동적메소드 영역
	/*
	*두 실수값을 받아서 더하는 연산을 하는 메서드
	*@param dFirst
	*@param dSecond
	*@return dFirst + dSecond
	*
	*/
	public static double add(double dFirst, double dSecond) {
		double iRet = dFirst + dSecond;
		return iRet;
	}

	public static double subtract(double dFirst, double dSecond) {
		double iRet = dFirst - dSecond;
		return iRet;
	}

	public static double multiply(double dFirst, double dSecond) {
		double iRet = dFirst * dSecond;
		return iRet;
	}

	public static double divide(double dFirst, double dSecond) {
		double iRet = 0.0;
		if(dFirst == 0.0) iRet = 0.0;
		if(dSecond == 0.0) iRet = 1.0;
		else {
			iRet = dFirst / dSecond;
		}
		return iRet;
	}
}
