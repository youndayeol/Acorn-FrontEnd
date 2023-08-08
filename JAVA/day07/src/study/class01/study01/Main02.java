package study.class01.study01;

public class Main02 {

	
	public static void main(String[] args) {
		//변수선언과 동시에 초기화
		// 사원번호, 사원이름, 월급
		//사원정보
		int iEmpNo = 2;
		String sEmpName = "홍길동2";
		double dSalary = 2000.0;
		//리턴세금
		double dRetTax = 0.0;
		double dRatio = 0.075;
		
		
		//1안
		// 리턴세금 = 월급 * 비율;
		dRetTax = dSalary * dRatio;
		System.out.println("회수세금: " + dRetTax);
		//2안 정적 메소드 사용
		//메소드명
		dRatio = 0.09;
		dRetTax = getReturnTaxStatic(dSalary, dRatio);
		System.out.println("회수세금: " + dRetTax);
		
		//3안 Main02 객체를 생성
		//메인객체.메소드명
		Main02 main02 = new Main02();
		dRatio = 0.1;
		dRetTax = main02.getReturnTaxDynamic(dSalary, dRatio);
		System.out.println("회수세금: " + dRetTax);
	}
	// 2안
	public static double getReturnTaxStatic(double dSalary, double dRatio) {
		double dRetTax = dSalary * dRatio;
		return dRetTax;
	}
	
	
	//3안
//	public double 함수이름(월급, 비율) {
	public double getReturnTaxDynamic(double dSalary, double dRatio) {
		double dRetTax = dSalary * dRatio;
		return dRetTax;
	}
//	
//}
}
