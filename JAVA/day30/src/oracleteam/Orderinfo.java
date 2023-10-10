package oracleteam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Orderinfo {
    private static String DB_URL = "jdbc:oracle:thin:@192.168.0.126:1521:xe";
    private static String USER = "teamora";
    private static String PASS = "1234";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {          
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            
            String selectQuery = "SELECT orderid, goodscode, orderconfirmed, orderdate FROM orderinfo WHERE orderconfirmed = 'n'";
            rs = stmt.executeQuery(selectQuery);
           
            while (rs.next()) {
                int orderId = rs.getInt("orderid");
                String goodsCode = rs.getString("goodscode");
                String orderConfirmed = rs.getString("orderconfirmed");
                java.sql.Date orderDate = rs.getDate("orderdate");

                System.out.println("Order ID: " + orderId);
                System.out.println("Goods Code: " + goodsCode);
                System.out.println("Order Confirmed: " + orderConfirmed);
                System.out.println("Order Date: " + orderDate);
                System.out.println("------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
