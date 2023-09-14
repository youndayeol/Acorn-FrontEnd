package team;

import java.util.Scanner;

public class TeamOraMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
			System.out.println("로그인 환경을 선택해주세요.");
			System.out.println("1. 사용자 로그인"); 
			System.out.println("2. 관리자 로그인"); 
			System.out.println("입력 >>> "); 
			int loginNum = sc.nextInt();
			
			if(loginNum == 1) {
				String userId;
					System.out.println("사용자 로그인 화면입니다.");
					System.out.println("ID를 입력 해주세요.");
					sc.nextLine();
					userId = sc.nextLine();
					
					if(userId.equalsIgnoreCase("user")) {
						//주문가능상품 호출();
						System.out.println("주문가능상품호출");
					}
					
			} else if(loginNum == 2) {
				System.out.println("관리자 로그인 화면입니다.");
				System.out.print("ID를 입력 해주세요.");
				sc.nextLine();
				String adminId = sc.nextLine();
				
				if(adminId.equalsIgnoreCase("admin")) {
					System.out.println("관리자 로그인 완료");
					System.out.println("관리자님 환영합니다.");
					
					while(true) {
						System.out.println("1. 상품정보");
						System.out.println("2. 판매정보확인");
						System.out.println("3. 재고관리");
						int adProduct = sc.nextInt();
						
						if(adProduct == 1) {
							// 상품정보 호출
							System.out.println(11);
							break;
						}
						else if(adProduct == 2) {
							//판매정보확인 호출
							System.out.println(22);
							break;
						}
						else if(adProduct == 3) {
							//재고관리 호출
							System.out.println(33);
							break;
						}
						
					}//while문 끝
				}
			} else if (loginNum >= 3) {
				System.out.println("번호를 잘못 입력하셨습니다.");
				System.out.println("종료됩니다.");
			}
			sc.close();
		}
	
	}

