package study.class01.study01;

//OOP(Object-Oriented Programming)
//객체(개체:Object) : new 생성자()
//클래스 : 필드(속성) + 생성자 + 메소드
//인스턴스(Instance)
//클래스 선언(정의)
//[수식어] class 클래스명 {}

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee();

		
		Employee employee1 = new Employee(1, "홍길동", 1000.0);

		
		double dRet = employee1.getReturnTax(0.075);
		System.out.println("회수세금:" + dRet);
		
		//Manager manager = new Manager(10, "홍길동관리자", 5000.0);
		//dRet = manager.getReturnTax(0.2);
		//System.out.println("회수세금:" + dRet);
	}
}
