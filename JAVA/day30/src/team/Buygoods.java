package team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Buygoods {
	private static String QUERY3 = "SELECT goodscode "
			+ "FROM goods WHERE goodscode = ?";
	private static String QUERY4 = "UPDATE rawmaterial "
			+ "SET rawmatstock_quantity = ? WHERE rawmaterialcode = ?"; //바꿀재고, 코드값
	
	public void buygoods() {
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 데이터베이스 연결
	        conn = DB.getConnection();
	        stmt = conn.createStatement();

			// 질의 수행
			//rs = stmt.executeQuery(QUERY3); //상품코드 검색
			System.out.println("살 상품의 코드를 입력하세요.(원자제 개수 줄어듬)");
            System.out.print("입력 >>> ");
            int goodsNum = scanner.nextInt(); //살 상품코드
            QUERY3 = "SELECT goodscode,goodsname,goodsprice FROM goods WHERE goodscode = '" + goodsNum + "'"; //입력한 상품검색
            rs = stmt.executeQuery(QUERY3); //상품코드 검색
            while (rs.next()) { //해당 상품만 출력
            	System.out.println("선택한 상품: " + goodsNum);
            	System.out.print("상품코드: " + rs.getInt("goodscode") + "");
                System.out.print(" 상품이름: " + rs.getString("goodsname") + "");
                System.out.println(" 상품가격: " + rs.getString("goodsprice") + "");
			}
            
            String QUERY5 = "SELECT rawmaterialcode,rawmaterialname,rawmatstock_quantity "
            		+ "FROM rawmaterial WHERE rawmaterialcode is not null";
            
            //rs = stmt.executeQuery(QUERY5); //원재료 감소할건데
            if (goodsNum == 1) {
            	QUERY4 = "UPDATE rawmaterial "
            			+ "SET rawmatstock_quantity = rawmatstock_quantity - 1"
            			+ "WHERE rawmaterialcode = 101";
                stmt.executeUpdate(QUERY4);
                QUERY4 = "UPDATE rawmaterial "
            			+ "SET rawmatstock_quantity = rawmatstock_quantity - 1"
                		+ "WHERE rawmaterialcode = 102";
                stmt.executeUpdate(QUERY4);
                System.out.println("\n=======상품 재고 감소=======");
                rs = stmt.executeQuery(QUERY5);
                while (rs.next()) {
                	System.out.print("상품코드: " + rs.getInt("RAWMATERIALCODE") + "");
                    System.out.print(" 상품이름: " + rs.getString("RAWMATERIALNAME") + "");
                    System.out.println(" 재고수량: " + rs.getString("RAWMATSTOCK_QUANTITY") + "");
                }
            }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
