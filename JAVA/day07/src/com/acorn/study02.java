package com.acorn;

import java.util.Scanner;

public class study02 {

	public static void main(String[] args) {

		//길이가 5인
		//	String배열을 선언
		Scanner sc = new Scanner(System.in);
		String[] sArray = new String[5];
		String sInputMsg = "";
		// "사과" "귤" "포도" "복숭아 " "참외"
		//	문자열 값을 저장
		sArray[0] = "사과"; sArray[1] = "귤"; 
		sArray[2] = "포도"; sArray[3] = "복숭아"; 
		sArray[4] = "참외"; 
		//배열 인덱스를 활용해서 귤을 출력
		System.out.println(sArray[1]);

		System.out.println("좋아하는 과일은");
		sInputMsg = sc.nextLine();
		for(int i = 0; i < sArray.length; i++) {
			if(sInputMsg.equals(sArray)) {
				System.out.println("당신이 좋아하는 과일" + sArray[i]);
			}else {
				System.out.println((sArray[i]) + "은 당신이 좋아하지않는 과일입니다");
			}
		}
		sc.close();
	}

}
