package com.acorn;

import java.util.Scanner;

public class study02 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("키(m)를 입력해 주세요");
//        float m = sc.nextFloat();
//        System.out.println("몸무게(kg)를 입력해 주세요");
//        float kg = sc.nextFloat();
//        
//        System.out.println("키는 " + m + "몸무게는 " + kg);
        
//        String str = "1234";
//        int iNumber01 = str.charAt(0);
//        System.out.println(iNumber01);
//        int iNumber02 = str.charAt(1);
//        int iNumber03 = str.charAt(2);
//        int iNumber04 = str.charAt(3);
//        System.out.println(iNumber01-48);
//        System.out.println(iNumber01-48);
//        System.out.println(iNumber01-48);
//        System.out.println(iNumber01-48);
        boolean matchFlag = false;
        System.out.println("생성하고자 하는 비밀번호 입력>>>");
        String iPassInputValue = sc.nextLine();
        
        	if( ((iPassInputValue.charAt(0)) < 48) || ((iPassInputValue.charAt(0)) > 57) )
        	{
        		System.out.println("비밀번호 첫자리가 1~10사이의 값이아닙니다.");
        	}
        	else
        	{
        		if(iPassInputValue.length() == 4)
        		{
        			for(int i = 1; i<iPassInputValue.length(); i++)
        			{
        				for(int j = i-1; j >= 0; j--)
        				{
        					if(iPassInputValue.charAt(i) == iPassInputValue.charAt(j)) {
        						matchFlag = true;
        						break;
        					}
        				}
        				if(matchFlag) { System.out.println("일치하는 값이 있습니다"); break; }
        			}
        		} else
        		{
        			System.out.println("비밀번호가 정해진 자리수에 부합하지 않습니다");
        		}
        	}
                sc.close();
        }
	}
