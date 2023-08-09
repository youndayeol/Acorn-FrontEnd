package study.static01;

//클래스 멤버 접근 수식(Access modifier)
//1.private, (pakage), protcted, public
//가. 기능 : 클래스 멤버에 대한 접근 권한 설정
//나. 의미
//1) private: 선언된 클래스 안에서만 직접 접근 가능
//2) (packge): 같은 패키지의 클래스들엥서 직접 접근 가능
//3) protected: 같은 패키지에 있거나 상속하는 클래스에서 직접 접근 가능
//4) public: 어디서라도 직접 접근 가능
//2.클래스 파일 이름 : public클래스 이름과 동일

public class Main {
	static int iMainValue = 0;
	public static void main(String[] args) {
		System.out.println(StaticTest.number1);
		StaticTest.number1 = 100;
		StaticTest.printInfo();
		
		StaticTest sTest = new StaticTest();
		sTest.printInfo2();
	}

}
