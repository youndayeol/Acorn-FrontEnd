package com.acorn;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//적정재고 초기화(4종류상품)
		
		//현재재고 초기화(4종류상품)
		int iAd1  = 10;
		int iAd2  = 0;
		int iCs1 = 10;
		int iCs2 = 0;
		//반복문(10)
		for(int i = 0; i < 10; ++i)
		{//현재재고와 적정재고 확인
			//현재재고가 적정재고보다 작은지
			if(iCs1 < iAd1)
			{//적정재고와의 차이만큼 현재 재고를 보충
				iCs1 += (iAd1 - iCs1);
			}
			//사용자 주문 시뮬레이션(랜덤사용)
			int iCustomerOrderQty = (int)(Math.random()*iAd1);
			//현재재고 - 사용자주문량
			iCs1 -= iCustomerOrderQty;
			//출력 : 적정재고, 현재재고
			System.out.println("적정재고 : " + iAd1 + "현재재고 : " +  iCs1);
			
			if(iCs2 < iAd2)
			{
				//적정재고와의 차이만큼 현재 재고를 보충
				iCs2 += (iAd2 - iCs2);
			}
			
			//사용자 주문 시뮬레이션(랜덤사용)
			iCustomerOrderQty = (int)(Math.random()*iAd2);
			iCs2 -= iCustomerOrderQty;
			System.out.println("적정재고 : " + iAd1 + "현재재고 : " +  iCs1);
			
			//입력대기(Thread.sleep(1000))
			System.out.println("계속하려면 아무키나 누르세요...");
			sc.nextLine();
		}
			System.out.println("적정재고 : " + iAd1 + "현재재고 : " +  iCs1);
			System.out.println("적정재고 : " + iAd2 + "현재재고 : " +  iCs2);
			sc.close();
			
//		public static int goodStockProcess(int iCs, int iPs) {
//			if(iCs < iPs) {
//				iCs += (iPs - iCs);
//			}
		}
			
			
			
		//최종적인 출력 : 적정재고, 현재재고
		 
//		System.out.println("1.재고확인");
//		int aItem = ran.nextInt(10);
//		int bItem = ran.nextInt(10);
//		int cItem = ran.nextInt(10);
//		int dItem = ran.nextInt(10);
//		System.out.println("a물건의 재고는 : " + aItem + "개 입니다");
//		System.out.println("b물건의 재고는 : " + bItem + "개 입니다");
//		System.out.println("c물건의 재고는 : " + cItem + "개 입니다");
//		System.out.println("d물건의 재고는 : " + dItem + "개 입니다");
//		System.out.println("적정 수량 입력하기>>>");
//		int inputNum = sc.nextInt();
//		
//		
//		if(aItem < inputNum)
//		{
//			
//		}
		
	}

//}
