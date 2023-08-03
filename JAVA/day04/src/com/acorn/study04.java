package com.acorn;

import java.util.Scanner;

public class study04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str1 = new String[7];
		
		str1[0] = "월";
		str1[1] = "화";
		str1[2] = "수";
		str1[3] = "목";
		str1[4] = "금";
		str1[5] = "토";
		str1[6] = "일";
		
		int index = sc.nextInt();
		
		for(int i = 0; i < str1.length; i++)
		{
			if(str1[i]. )
				System.out.println(str1[i]);
		} else {
			System.out.println("잘못 입력하셨습니다");
		}
		sc.close();	
	}
}
