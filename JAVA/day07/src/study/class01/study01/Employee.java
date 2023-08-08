package study.class01.study01;

public class Employee {
	
	//필드(속성) 영역(전 변수)
	private int iEmpNo;
	private String sEmpName;
	private double dSalary;
	
	//클래스를 작성할때 생성자를 만들지 않으면
	//자바 컴파일러가 기본성성자를 자동으로 생성
	//생성자 리턴타입이 없고 클래스이름과 동일
	//
	
	//기본 생성자
	public Employee() { }
	
	//인자있는 생성자
	public Employee(int iEmpNo, 
			String sEmpName, double dSalary) { 
		this.iEmpNo = iEmpNo;
		this.sEmpName = sEmpName;
		this.dSalary = dSalary;
	}
	
	//Getters/Setters 메소드

	
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
