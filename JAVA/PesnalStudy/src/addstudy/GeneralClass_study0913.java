package addstudy;

public class GeneralClass_study0913 {
	
		//일반 변수 영역 - 필드 영역
		private int iFirst;
		private int iSecond;
		private double dFirst;
		private double dSecond;
		
		//생성자 영역
		//기본생성자 == 디폴트 생성자
		public GeneralClass_study0913() {}
		//인자가 있는 생성자
		public GeneralClass_study0913(int iFirst, int iSecond,
				double dFirst, double dSecond) {
			this.iFirst = iFirst;
			this.iSecond = iSecond;
			this.dFirst = dFirst;
			this.dSecond = dSecond;
		}
		//메소드 영역
		//public 리턴타입(원시데이터(void, int, float, String),사용자데이터타입(클래스)
		//메소드 이름(인자1, 인자2, ..)
		public int add(int iFirst, int iSecond) {

			int iResult;
			iResult = iFirst + iSecond;
			return iResult;
		}
		
		public int add() {

			int iResult;
			iResult = iFirst + iSecond;
			return iResult;
		}
		
		public int sub(int iNum01, int iNum02) {
			
			int iResult2;
//			iResult2 = iNum02 - iNum01;
			//큰값에서 작은값을 빼도록
			if(iNum01 > iNum02) {
				iResult2 = iNum01 - iNum02;
			} else {
				iResult2 = iNum02 - iNum01;
			}
			return iResult2;
		}
		public int mul(int iNum03, int iNum04) {
			int iResult3;
			iResult3 = iNum03 * iNum04;
			return iResult3;
		}
		public double div(int iNum05, int iNum06) {
			
			//분모 분자 중 하나가 0이면 0을 되돌려준다
//			double iResult4;
//			iResult4 = iNum06 / iNum05;
//			
//			if(iNum05 == 0) {
//				iResult4 = 0;
//			} else if(iNum06 == 0) {
//				iResult4 = 0;
//			}
//			return iResult4;
			double iResult4;
			if(check(iNum05, iNum06)) {
				return 0;
			} else {
				iResult4 = iNum05 / iNum06;
				return iResult4;
			}
		}
		public boolean check(int iFirst4, int iSecond4) {
			if( (iFirst4 == 0) || (iSecond4 == 0))
			{
				return true;
			} else {
				return false;
			}
		}

}
