package study.acorn;

public class Main {

	public static void main(String[] args) {
		//0.세상은 데이터(나이, 이름, 주소, 사회적정보) 구성
		//1.변수: 데이터타입, 변수명(규칙: 영문자 시작, 숫자로시작x)
		//1.1 (일반:원시변수)변수선언: 데이터타입 변수명
		int iValue;
		double dValue;
		String sValue;
		//1.2 초기화, 값할당(=할당연산자)
		iValue = 10;
		dValue = 11.1;
		sValue = "string";
		//1.3 변수의 기본값: 자동지정x
		//초기에 값 할당을 하지 않는 경우, 자바 허용x
		//정수:0 실수:0.0 문자열null(클래스에서)
		//1.2 특수변수: 배열, 클래스(오라클제공+사용자개발)
		//배열선언 -> 초기화
		//데이터타입[] 배열변수
		//1.2.1 배열변수 초기화방법1
		int[] iArrValue = {10, 20, 30, 40, 50};
		//1.2.2배열변수 초기화 방법2
		int[] iArrValue2 = new int[5]; // {0, 0, 0, 0, 0}
		//1.2.3 배열변수인 요소에 접근: 배열변수명[위치값]
		//시작위치 : 0, 마지막위치 : 배열사이즈-1
		//값을 할당
		iArrValue2[2] = 30;
		//2.제어문: 조건/반복문
		//2.0 연산: 산술연산(+ - * / %), 비교연산(> < >= <= == !=)
		//2.1 조건 : if(조건식) {참일때 실행할 명령문}  else {거짓일때 실행하는 명령문}
		if(iValue > 10) {크다} else {작거나같다}
		//2.2반복 while(조건식) {조건식이 참일동안 실행할명령문}
		//for(초기값; 조건식; 증감값)
		//1부터 5까지 출력
		//3. 체화된 기본 패턴 숙지
		//4. 산술연산
		//4.1 + - * /
		//4.2 %
		int iArithValue1 = 10;
		int iArithValue2 = 30;
		int iArithValue = iArthValue2 / iArithValue1;
		iResultVal = iArthValue2 % iArithValue1;
		//% 나머지 할수있는것 : 짝수/홀수 여부
		//어떤수 % 2, 어떤수 %4
		//5.계산기
		int iRet01 = 0; int iRet02 = 0; int iRet03 = 0; double dRet04 = 0;
		int iFirstVal = 15; int iSecondVal = 35;
		iRet01 = add(iFirstVal, iSecondVal);
		iRet02 = sub(iFirstVal, iSecondVal);
		iRet03 = mul(iFirstVal, iSecondVal);
		dRet04 = div(iFirstVal, iSecondVal);
		
		
		//5.1 연산의 결과는 양수, 나누기(분자와 분모에 조건에 맞는 값이 입력되는 것을 방지)

		//6. 함수
		//6.1 함수선언/정의
		//리턴타입 함수명(파라메터1, 파라메터2.....
		//6.2 함수호출: 함수명(아규먼트1, 아규먼트2);
		
			
	}
	
	public static int add(int ifirstVal, int iSecondVal) {
		int iRet01 = 0;
		iRet01 = iFirstVal + iSecondVal;
		return iRet01;
	}
	
	public static int sub(int iFirstVal, int iSecondVal) {
		int iRet02 = 0;
		if(iFirstVal >= iSecondVal) { iRet02 = iFirstVal - iSecondVal;}
		else {iRet02 = iSecondVal - iFirstVal;}
		return iRet02;
	}
	
	public static int mul(int iFirstVal, int iSecondVal)  {
		int iRet03 = iFirstVal * iSecondVal;
		return iRet03;
	}
	public static double div(int iFirstVal, int iSecondVal) {
		double dRet04 = 0.0;
		if(iFirstVal == 0) dRet04 = 0;
		else if(iSecondVal == 0) dRet04 = 0;
		else dRet04 = iFirstVal / iSecondVal;
		return dRet04;
	}
	
	public static void printArray(int[] iArrValue1) {
		iArrValue1[2] = 90;
		System.out.println(iArrValue1[2]);
	}
	
	public static void printAcumVal(int iStartNum, int iEndNum) {
		while(iStartNum <= iEndNum) {
			System.out.print(iStartNum + " ");
			iStartNum++;
		}
	}
	
	
}
