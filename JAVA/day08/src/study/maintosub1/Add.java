package study.maintosub1;

public class Add {
	//필드 (속성) 영역


	/////////////////////////////////////////////////////////////////////
	//생성자 영역 : public 클래스명(): 기본 생성자/인자가 있는 생성자
	public Add() {}


	///////////////////////////////////////////////////////////////////
	//Getters/Setters 메소드 영역


	//////////////////////////////////////////////////////////////////////////
	//일반 메소드영역 : 정적/동적

	//정적 메소드 영역

	public static int addOperation(int iAddFirstNum, int iAddSecondNum) {
		int iAddResult = 0;
		iAddResult = iAddFirstNum + iAddSecondNum;
		return iAddResult;

	}
	///////////////////////////////////////////////////////////
	// 동적 메소드 영역
	public double addOperation(double iAddFirstNum, double iAddSecondNum) {
		double iAddResult = 0;
		iAddResult = iAddFirstNum + iAddSecondNum;
		return iAddResult;

	}
	///////////////////////////////////////////////////////
	//메서드 오버로딩 영역



}
