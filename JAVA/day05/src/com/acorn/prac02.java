package com.acorn;

import java.util.Scanner;

public class prac02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;

		while(true) {

			System.out.println("숫자를 입력");
			num1 = sc.nextInt();

			if(num1 > 0) {
				break;
			} else {
			}
		}
		for(int i = num1; i >= 1; i--)
		{
			System.out.print(i);
		}
		System.out.println();
		for(int i = 1; i <= num1; i++)
		{
			System.out.print(i);
		}

		sc.close();

		//		System.out.println("숫자를 입력");
		//		int num1 = sc.nextInt();
		//		
		//		if( num1 <= 0) {
		//			System.out.println("1이상입력");
		//		} else {
		//		for(int i = num1; i >= 1; i--)
		//		{
		//			System.out.print(i);
		//		}
		//		System.out.println();
		//		for(int i = 1; i <= num1; i++)
		//		{
		//			System.out.print(i);
		//		}
		//		
		//		}
		//		sc.close()	;
	}
}