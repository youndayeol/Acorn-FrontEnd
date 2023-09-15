package team;

// import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderSelect {
	
	static Scanner sc = new Scanner(System.in);
//	static ArrayList<Integer> orderArr = new ArrayList<Integer>(); // 타입 지정
	static Map<Integer, Integer> orderList = new HashMap<Integer, Integer>();
	static int orderNum; 
	static int orderQuantity; 
	static int menu;
	
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 데이터베이스 연결
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
		while (true) {
			Goods.showMenu(stmt, rs);
			
			System.out.println("----------------------------------------");
			System.out.println("주문할 제품의 번호를 입력해주세요.");
			System.out.print("제품번호 입력 >> ");
			orderNum = sc.nextInt();
			System.out.print("제품수량 입력 >> ");
			orderQuantity = sc.nextInt();
			orderList.put(orderNum, orderQuantity);
			
			System.out.println("\n----------------------------------------");
			System.out.println("추가로 주문하시겠습니까?");
			System.out.println("\n-----장바구니 목록-----");
			orderList.forEach((key, value)->{
		          System.out.println( String.format("제품번호 : %d, 수량 : %d", key, value) );
		    });
			System.out.println("--------------------\n");
			System.out.println("1) 수정/추가하기");
			System.out.println("2) 이대로 주문하기");
			System.out.print("메뉴번호 입력 >> ");
			
			menu = sc.nextInt();			
			
			if (menu == 1) {
				continue;
			} else if (menu == 2) {
				System.out.println("\n----------------------------------------");
				System.out.println("이대로 주문하시겠습니까?");
				System.out.println("\n-----장바구니 목록-----");
				orderList.forEach((key, value)->{
			          System.out.println( String.format("제품번호 : %d, 수량 : %d", key, value) );
				});
				System.out.println("--------------------\n");
				System.out.println("1) 주문하기");
				System.out.println("2) 뒤로가기");
				System.out.print("메뉴번호 입력 >> ");
				
				menu = sc.nextInt();
				
				if (menu == 1) {
					System.out.println("주문이 완료되었습니다.");
					// 초기화면으로 이동
				} else if (menu == 2) {
					continue;
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}

}
