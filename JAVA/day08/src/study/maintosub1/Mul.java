package study.maintosub1;

public class Mul {
	//필드 (속성) 영역
	
	
/////////////////////////////////////////////////////////////////////
	//생성자 영역 : public 클래스명(): 기본 생성자/인자가 있는 생성자
	public Mul() {}
	
	
///////////////////////////////////////////////////////////////////
	//Getters/Setters 메소드 영역
	
	
//////////////////////////////////////////////////////////////////////////
	//일반 메소드영역 : 정적/동적

	//정적 메소드 영역

	public static int mulOperation(int iAddFirstNum, int iAddSecondNum) {
		int iMulResult = 0;
		iMulResult = iAddFirstNum * iAddSecondNum;
		return iMulResult;

	}
///////////////////////////////////////////////////////////
	// 동적 메소드 영역
	public int addOperation(int iAddFirstNum, int iAddSecondNum) {
		int iMulResult = 0;
		iMulResult = iAddFirstNum * iAddSecondNum;
		return iMulResult;
		
	}
	///////////////////////////////////////////////////////
	//메서드 오버로딩 영역
	
	
	
}
