package com.acorn;

import java.util.Scanner;

public class prac04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		

		while(true) {
			int Num = sc.nextInt();
			if(Num > 0) {
				for (int i = 1; Num >= i; Num--) {
					System.out.println(Num);}
				break;
			} else {
				System.out.print("다시");
			}
		}
		sc.close();
	}	
}
