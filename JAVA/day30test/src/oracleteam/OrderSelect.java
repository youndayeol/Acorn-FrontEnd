package oracleteam;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderSelect {
	static Goods goods = new Goods();
	static Orderable orderable = new Orderable();
	static Login login = new Login();
	static Scanner sc = new Scanner(System.in);
	static Map<Integer, Integer> orderList = new HashMap<Integer, Integer>();
	// static ArrayList<Integer> orderIdList = new ArrayList<Integer>();
	static int orderNum; 
	static int orderQuantity; 
	static int menu;
	
	public void orderSelect() throws Exception {
		Connection conn = null;
        Statement stmt = null;
//        ResultSet rs = null;
        try {
            // 데이터베이스 연결
            conn = DB.getConnection();
            stmt = conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
		while (true) {
			orderable.getgoods();
	        orderable.OrderableGoods();
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
			System.out.println("999) 메인 홈");
			System.out.print("메뉴번호 입력 >> ");
			
			menu = sc.nextInt();			
			
			if (menu == 1) {
				continue;
			} else if (menu == 2) {
				updateOrderInfo(conn);
				System.out.println("\n----------------------------------------");
				System.out.println("이대로 주문하시겠습니까?");
				System.out.println("\n-----장바구니 목록-----");
				orderList.forEach((key, value)->{
			          System.out.println( String.format("제품번호 : %d, 수량 : %d", key, value) );
				});
				System.out.println("--------------------\n");
				System.out.println("1) 결제하기");
				System.out.println("2) 뒤로가기");
				System.out.println("999) 메인 홈");
				System.out.print("메뉴번호 입력 >> ");
				
				menu = sc.nextInt();
				
				if (menu == 1) {
					System.out.println("test");
					// confirmedOrder(conn, orderIdList);
					confirmedOrder(conn);
					System.out.println("test2");					
					buygoods(conn, orderList);
					System.out.println("주문이 완료되었습니다.\n\n\n");
					Login.main(null);
				} else if (menu == 2) {
					continue;
				} else if (menu == 999) {
					// 메인 홈
					Login.main(null);
				} else {
					System.out.println("잘못된 입력입니다.");
				}
			} else if (menu == 999) {
				//메인홈
				Login.main(null);
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}
	
	public static void updateOrderInfo(Connection conn) {
		// SQL 쿼리문에는 값을 넣지 않습니다.
		String sql = "INSERT INTO orderinfo (goodscode, orderqty) VALUES (?, ?)";

		try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
		    orderList.forEach((key, value) -> {
		        try {
		            // orderid_seq.nextval 값을 얻어옵니다.
		            // int nextOrderId = getNextOrderIdFromSequence(conn);
		            // 얻어온 값을 orderIdList에 추가합니다.
		            // orderIdList.add(nextOrderId);

		            // PreparedStatement에 값들을 설정합니다.
		            pstmt.setInt(1, key);
		            pstmt.setInt(2, value);

		            pstmt.executeUpdate();

		            System.out.println(String.format("제품번호 : %d, 수량 : %d", key, value));
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    });
		} catch (SQLException e) {
		    e.printStackTrace();
		}
			
	}
	
	// orderid_seq.nextval 값을 얻어오는 메소드를 정의합니다.
	public static int getNextOrderIdFromSequence(Connection conn) throws SQLException {
	    String sql = "SELECT orderid_seq.nextval FROM dual";
	    try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
	        if (rs.next()) {
	            return rs.getInt(1);
	        }
	    }
	    throw new SQLException("Failed to get next value from sequence");
	}
	
	public static void confirmedOrder(Connection conn) throws Exception {
	    // orderIdList가 비어있으면 아무 작업도 하지 않습니다.
//	    if (orderIdList.isEmpty()) {
//	        return;
//	    }

	    // SQL 쿼리문을 생성합니다.
	    String sql1 = "UPDATE orderinfo SET orderconfirmed = 'y' WHERE orderconfirmed = 'n'";
	    String sql2 = "INSERT INTO salesinfo (goodscode, orderqty) values(?, ?)";
	    try (PreparedStatement pstmt1 = conn.prepareStatement(sql1)) {
	        pstmt1.executeUpdate();
	        
	        try (PreparedStatement pstmt2 = conn.prepareStatement(sql2)) {
			    orderList.forEach((key, value) -> {
			    	try {
						pstmt2.setInt(1, key);
						pstmt2.setInt(2, value);
			            pstmt2.executeUpdate();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    });
			} catch (SQLException e) {
			    e.printStackTrace();
			}
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    // orderList.clear();
	}
	
	public static void buygoods(Connection conn, Map<Integer, Integer> orderList) {
		System.out.println(1);
        String sql = "UPDATE stockinfo " +
                     "SET rawmatstock_quantity = rawmatstock_quantity - ? " +
                     "WHERE rawmaterialcode = ?";
        System.out.println(2);
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            for (Map.Entry<Integer, Integer> entry : orderList.entrySet()) {
                int goodsCode = entry.getKey();
                int quantity = entry.getValue();
                System.out.println(3);
                // goods 테이블에서 rawmaterialcode 가져오기
                String rawMaterialCodeQuery = "SELECT rawmaterialcode FROM goods WHERE goodscode = ?";
                try (PreparedStatement rawMaterialCodeStmt = conn.prepareStatement(rawMaterialCodeQuery)) {
                    rawMaterialCodeStmt.setInt(1, goodsCode);
                    ResultSet rs = rawMaterialCodeStmt.executeQuery();
                    System.out.println(4);
                    if (rs.next()) {
                        int rawMaterialCode = rs.getInt(1);
                        System.out.println(5);
                        // PreparedStatement에 값 설정
                        pstmt.setInt(1, quantity);
                        pstmt.setInt(2, rawMaterialCode);
                        System.out.println("5-1");
                        // SQL 실행
                        pstmt.executeUpdate();
                        
                    }System.out.println(6);
                    rs.close();
                } catch (SQLException e) {
    			    e.printStackTrace();
    			}System.out.println(7);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(8);
        }
    }



}
