package team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Goods {
    private static String QUERY1 = "SELECT goodscode, goodsname, goodsprice FROM goods WHERE goodsname IS NOT NULL";
    private static String QUERY2 = 
    		"SELECT goodscode, goodsname, goodsprice\r\n"
    		+ "FROM goods\r\n"
    		+ "WHERE goodsname is not null\r\n";
    public void goods() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
        	// 데이터베이스 연결
            conn = DB.getConnection();
            stmt = conn.createStatement();

            // 질의 수행
            rs = stmt.executeQuery(QUERY1);
            System.out.println("상품 목록:");
            while (rs.next()) {
                System.out.print("상품코드: " + rs.getInt("goodscode") + "");
                System.out.print(" 상품이름: " + rs.getString("goodsname") + "");
                System.out.println(" 상품가격: " + rs.getString("goodsprice") + "");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void showMenu(Statement stmt, ResultSet rs) throws SQLException {
    	rs = stmt.executeQuery(QUERY2);
    	
    	while (rs.next()) {
    		
    		System.out.print("상품번호: " + rs.getInt(1) + "  ");
    		System.out.print("상품: " + rs.getString(2) + "  ");
    		System.out.println("가격: " + rs.getInt(3) + "  ");
    	}
    	
    	rs.close();
    	
    }
}