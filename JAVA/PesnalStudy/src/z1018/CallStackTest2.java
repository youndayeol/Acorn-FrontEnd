package z1018;

public class CallStackTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main(Sting[] args)이 시작됨");
		firstMethod();
		System.out.println("main(Sting[] args)이 끝");
	}
	static void firstMethod() {
		System.out.println("firstMethod()이 시작됨");
		secondMethod();
		System.out.println("firstMethod()이 끝");
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()이 시작됨");
		System.out.println("secondMethod()이 끝");
	}
}
