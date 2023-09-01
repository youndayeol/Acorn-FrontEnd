package study.homework02;

public class homework02 {

	public static void main(String[] args) {
		//		과제3. 가와 나 차이를 살명하시오
		//		가 = 참일때만 결과가 나온다.
		//		나 = 참일때 나오는 명령문과 거짓일때 나오는 명령문이 있다.

		int[] iArr = new int[10];
		int price = 10000;
		String sValue1 = "Bronze";
		String sValue2 = "Silver";
		String sValue3 = "Vip";



		if (0 < 1) iArr[0] = 1;
		if (1 < 2) iArr[1] = 2;
		if (2 < 3) iArr[2] = 3;
		if (3 < 4) iArr[3] = 4;
		if (4 < 5) iArr[4] = 5;
		if (5 >= 5 && 5 <= 10) iArr[5] = 6;
		if (6 >= 5 && 6 <= 10) iArr[6] = 7;
		if (7 >= 5 && 7 <= 10) iArr[7] = 8;
		if (8 >= 5 && 8 <= 10) iArr[8] = 9;
		if (9 >= 5 && 9 <= 10) iArr[9] = 10;

		for(int i = 0; i < 10; i++) {
			System.out.println(iArr[i]);
		}

		if(sValue1.equals("Bronze")) {
			System.out.println("할인 후 금액은 " + (int)(price * 1) + "원");
		}
		if (sValue2.equals("Silver")) {
			System.out.println("할인 후 금액은 " + (int)(price * 0.95) + "원");
		}
		if (sValue3.equals("Vip")) {
			System.out.println("할인 후 금액은 " + (int)(price * 0.9) + "원");
		}

		int price2 = 9200;

		if(price2 < 8900) {
			System.out.println("8900보다 작은 금액");
		}
		else if(price2 < 9300) {
			System.out.println("9300보다 작은 금액");
		}
		else if(price2 < 9800) {
			System.out.println("9800보다 작은 금액");
		} else {
			System.out.println("9800보다 큰 금액");
		}
	}




}
