package study.homework;

public class HomeWork01 {

	public static void main(String[] args) {
		
		int Num01 = 10;
		int Num02 = 20;
		
		double dNum01 = 10.1;
		double dNum02 = 20.2;
		
		String sNum01 = "A";
		String sNum02 = "B";
		
		
		System.out.println("가. 일반 변수(+산술연산) 활용 과제");
		System.out.println(Num01 + Num02);
		System.out.println(dNum01 + dNum02);
		System.out.println(sNum01 + sNum02);
		System.out.println("======================================================");
		
		System.out.println("나. 나누기 연산 결과 테스트 과제");
		
		double dNum03 = Num02 / Num01;
		System.out.println(dNum03);
		
		int Num03 = (int) (dNum02 / dNum01);
		System.out.println(Num03);
		System.out.println("=======================================================");
		System.out.println("다. 데이터 타입 범위 초과 과제");
		
		int i = Integer.MAX_VALUE;
		double d = Double.MAX_VALUE;
//		float f = Float.MAX_VALUE;
		
		System.out.println(i + " ====== " + (i + 1));
		System.out.println(i + 1);
		System.out.println(d + " ====== " + (d + 1));
		System.out.println(d + 1);
//		System.out.println(f);
		

	}

}
