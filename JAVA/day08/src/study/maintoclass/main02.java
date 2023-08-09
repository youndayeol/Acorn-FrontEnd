package study.maintoclass;

import java.util.Scanner;

import study.maintosub.Add;
import study.maintosub.Div;
import study.maintosub.Mul;
import study.maintosub.Sub;

public class main02 {

	public static void main(String[] args) {
		// 필드 영역
		// 개체 부분
		Scanner sc = new Scanner(System.in);
		// 공통 부분
		String sInputMsg01 = "첫 번째 수>>>";
		String sInputMsg02 = "두 번째 수>>>";
		// 결과 저장 부분


		// 더하기 부분
		int iAddResult = 0;
		int iAddFirstNum;
		int iAddSecondNum;
		// 빼기 부분
		int iSubResult = 0;
		int iSubFirstNum;
		int iSubSecondNum;

		// 곱하기 부분
		int iMulResult = 0;
		int iMulFirstNum;
		int iMulSecondNum;

		// 나누기 부분
		int iDivResult = 0;
		int iDivFirstNum;
		int iDivSecondNum;

		// 오퍼레이션 영역
		// 더하기 부분
		// 연산 대상 값 할당 : 직접 or 키보드 입력
		//				System.out.println("덧셈연산");
		System.out.println(sInputMsg01);
		iAddFirstNum = sc.nextInt();
		System.out.println(sInputMsg02);
		iAddSecondNum = sc.nextInt();
		//				
		//				addOperation(sc, sInputMsg01, sInputMsg02, sResultMsg);
		//				// + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
		iAddResult = iAddFirstNum + iAddSecondNum;
		System.out.println(iAddResult);

		// 제약 조건 : 값의 범위
		iAddResult = Add.addOperation(iAddFirstNum, iAddSecondNum);
		System.out.println(iAddResult);
		
		iSubResult = Sub.subOperation(iAddFirstNum, iAddSecondNum);
		System.out.println(iSubResult);
		
		iMulResult = Mul.mulOperation(iAddFirstNum, iAddSecondNum);
		System.out.println(iMulResult);
		
		iDivResult = Div.divOperation(iAddFirstNum, iAddSecondNum);
		System.out.println(iDivResult);
		
		
		

		// 빼기 부분
		// 연산 대상 값 할당 : 직접 or 키보드 입력
		//						System.out.println("뺄셈연산");
//		System.out.println(sInputMsg01);
//		iSubFirstNum = sc.nextInt();
//		System.out.println(sInputMsg02);
//		iSubSecondNum = sc.nextInt();

		//
		//				subOperation(sc, sInputMsg01, sInputMsg02, sResultMsg);

		//				// - 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1-변수2)
		//				iSubResult = iSubFirstNum - iSubSecondNum;
		//				System.out.println(iSubResult);
		// 제약 조건 : 값의 범위

		// 곱하기 부분
		// 연산 대상 값 할당 : 직접 or 키보드 입력
		//						System.out.println("곱셈연산");
//		iMulFirstNum = sc.nextInt();
//		System.out.println(sInputMsg01);
//		iMulSecondNum = sc.nextInt();
//		System.out.println(sInputMsg02);

		//				mulOperation(sc, sInputMsg01, sInputMsg02, sResultMsg);

		//				// * 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1*변수2)
		//				iMulResult = iMulFirstNum + iMulFirstNum;
		//
		//				System.out.println(iMulResult);
		// 제약 조건 : -결과 불가

		// 나누기 부분
		// 연산 대상 값 할당 : 직접 or 키보드 입력
		//				System.out.println("나누기연산");
//		iDivFirstNum = sc.nextInt();
//		iDivSecondNum = sc.nextInt();
//		System.out.println(iDivResult);

		//				divOperation(sc, sInputMsg01, sInputMsg02, sResultMsg);

		//				// / 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1/변수2)
		//				if(iDivFirstNum == 0) {iDivResult = 0; System.out.println("분자가 0이므로 연산결과0");}
		//				else if(iDivSecondNum == 0) {iDivResult = 0; System.out.println("분모가 0이므로 연산불가");}
		//
		//				// 제약 조건 : 예외 처리
		//				{iDivResult = iDivFirstNum / iDivSecondNum;}
		//				System.out.println(iDivResult);
		sc.close();
	}
//	public static int addOperation(int iAddFirstNum, int iAddSecondNum) {
//		int iAddResult = 0;
//		// + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
//		iAddResult = iAddFirstNum + iAddSecondNum;
//		return iAddResult;
//	}
//
//	public static int subOperation(int iAddFirstNum, int iAddSecondNum) {
//		int iSubResult = 0;
//		// + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
//		iSubResult = iAddFirstNum + iAddSecondNum;
//		return iSubResult;
//
//	}	
//
//	public static int mulOperation(int iAddFirstNum, int iAddSecondNum) {
//		int iMulResult = 0;
//		// + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
//		iMulResult = iAddFirstNum + iAddSecondNum;
//		return iMulResult;
//
//	}	
//
//	public static int divOperation(int iAddFirstNum, int iAddSecondNum) {
//		int iDivResult = 0;
//		// + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
//		iDivResult = iAddFirstNum + iAddSecondNum;
//		return iDivResult;
//
//	}





	//			public static void addOperation(Scanner sc, String sInputMsg01, String sInputMsg02, String sResultMsg) {
	//				int iAddResult = 0;
	//				int iAddFirstNum;
	//				int iAddSecondNum;
	//				
	//				System.out.println("덧셈연산");
	//				System.out.println(sInputMsg01);
	//				iAddFirstNum = sc.nextInt();
	//				System.out.println(sInputMsg02);
	//				iAddSecondNum = sc.nextInt();
	//				
	//				// + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
	//				iAddResult = iAddFirstNum + iAddSecondNum;
	//				System.out.println(iAddResult);
	//			}
	//			
	//			public static void subOperation(Scanner sc, String sInputMsg01, String sInputMsg02, String sResultMsg) {
	//				int iSubResult = 0;
	//				int iSubFirstNum;
	//				int iSubSecondNum;
	//				
	//				System.out.println("뺄셈연산");
	//				System.out.println(sInputMsg01);
	//				iSubFirstNum = sc.nextInt();
	//				System.out.println(sInputMsg02);
	//				iSubSecondNum = sc.nextInt();
	//
	//				// - 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1-변수2)
	//				iSubResult = iSubFirstNum - iSubSecondNum;
	//				System.out.println(iSubResult);
	//
	//			}
	//			
	//			public static void mulOperation(Scanner sc, String sInputMsg01, String sInputMsg02, String sResultMsg) {
	//				int iMulResult = 0;
	//				int iMulFirstNum;
	//				int iMulSecondNum;
	//				
	//				System.out.println("곱셈연산");
	//				iMulFirstNum = sc.nextInt();
	//				System.out.println(sInputMsg01);
	//				iMulSecondNum = sc.nextInt();
	//				System.out.println(sInputMsg02);
	//				// * 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1*변수2)
	//				iMulResult = iMulFirstNum * iMulSecondNum;
	//
	//				System.out.println(iMulResult);
	//
	//			}
	//			
	//			public static void divOperation(Scanner sc, String sInputMsg01, String sInputMsg02, String sResultMsg) {
	//				int iDivResult = 0;
	//				int iDivFirstNum;
	//				int iDivSecondNum;
	//				
	//				System.out.println("나누기연산");
	//				iDivFirstNum = sc.nextInt();
	//				iDivSecondNum = sc.nextInt();
	//				System.out.println(iDivResult);
	//				// / 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1/변수2)
	//				if(iDivFirstNum == 0) {iDivResult = 0; System.out.println("분자가 0이므로 연산결과0");}
	//				else if(iDivSecondNum == 0) {iDivResult = 0; System.out.println("분모가 0이므로 연산불가");}
	//
	//				// 제약 조건 : 예외 처리
	//				{iDivResult = iDivFirstNum / iDivSecondNum;}
	//				System.out.println(iDivResult);

}
