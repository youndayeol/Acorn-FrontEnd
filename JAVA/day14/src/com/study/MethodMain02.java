package com.study;

public class MethodMain02 {

	public static void main(String[] args) {
		System.out.println("메서드");

		double dFirst = 11.1; double dSecond = 12.1;
		CalcDblJar calcDblJar = new CalcDblJar();
		double dRet = calcDblJar.add(dFirst, dSecond);
		System.out.println(dRet);
		dRet = calcDblJar.subtract(dFirst, dSecond); // => subtract
		System.out.println(dRet);
		dRet = calcDblJar.multiply(dFirst, dSecond); // => multiply
		System.out.println(dRet);
		dRet = calcDblJar.divide(dFirst, dSecond); // => divide
		System.out.println(dRet);

	}

	static double add(double dFirst, double dSecond) {
		double iRet = dFirst + dSecond;
		return iRet;
	}

	static double subtract(double dFirst, double dSecond) {
		double iRet = dFirst - dSecond;
		return iRet;
	}

	static double multiply(double dFirst, double dSecond) {
		double iRet = dFirst * dSecond;
		return iRet;
	}

	static double divide(double dFirst, double dSecond) {
		double iRet = 0.0;
		if(dFirst == 0.0) iRet = 0.0;
		if(dSecond == 0.0) iRet = 1.0;
		else {
			iRet = dFirst / dSecond;
		}
		return iRet;
	}
}
