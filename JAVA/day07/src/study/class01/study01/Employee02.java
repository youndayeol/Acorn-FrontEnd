package study.class01.study01;

public class Employee02 {
	
	//필드(속성) 영역(전 변수)
	int iEmpNo;
	String sEmpName;
	double dSalary;
	
	//기본 생성자
	public Employee02() { }
	
	//인자있는 생성자
	public Employee02(int iEmpNo, 
			String sEmpName, double dSalary) { 
		this.iEmpNo = iEmpNo;
		this.sEmpName = sEmpName;
		this.dSalary = dSalary;
	}
	
	//메소드 영역 - 동적 메소드
	public double getReturnTax(double ratio) {
		//tax 금액을 계산
		//변수 선언
		double dRetResult;
		//리턴택스 계산 : dSalary * 0.075
		dRetResult = dSalary * ratio;
		//계산된 결과를 변수에 저장
		//return 변수명
		return dRetResult;
	}
	
}
