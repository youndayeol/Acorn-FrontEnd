package com._interface;

// 자바 버전에 따른 변화
// 1. JDK 7
// - public static final 필드(상수필드)
// - public abstract 메서드(추상메서드)

//1=2. JDK 8
// - public static final 필드(상수필드)
// - public abstract 메서드(추상메서드)
// - public default 메서드
// - public static 메서드

//3. JDK 9
// - public static final 필드(상수필드)
// - public abstract 메서드(추상메서드)
// - public default 메서드
// - public static 메서드
// - private static 메서드
public interface DatabaseMoudule {
	// ~ JDK 7
	int DB_VERSION = 1;
	
	int insert(String s);
	
	String select();
	//JDK 8
	public static int add(int a, int b) {
		int iRet = a + b;
		return iRet;
	}
	
	default int add(int a, int b, int c)
	{
		int iRet = a + b + c;
		return iRet;
	}
	//JDK 9
	private static int subAdd(int a, int b)
	{
		return a + b;
	}
}
