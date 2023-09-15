package team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Goodstest {
	
	static int goodsIdArr[] = new int[20];
	static String goodsNameArr[] = new String[20];
	static int goodsPriceArr[] = new int[20];
	static int goodsStockArr[] = new int[20];
	
	private static String DB_URL 
	= "jdbc:oracle:thin:@192.168.0.126:1521:xe";
	private static String USER = "teamora";
	private static String PASS = "1234";
	private static String QUERY = "select goodsid, goodsname, goodsprice, stockquantity\r\n"
			+ "from goods\r\n";
			
	
		
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 연결 설정
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// 구문객체 생성
			stmt = conn.createStatement();
			//	         queryOrdergoods(stmt, rs);
			queryGoods(stmt, rs);
			printGoods();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void queryGoods(
			Statement stmt, ResultSet rs) throws SQLException {
		// 질의 수행
		// Statement: true/false = execute,  
		// 갯수 = excuteUpdate(insert/update/delete)
		// , 행의집합 = executeQuery()
		rs = stmt.executeQuery(QUERY);
		int index = 0;
		while(rs.next() && index < 20) {
			goodsIdArr[index] = rs.getInt("goodsid");
			if(rs.wasNull()) {
				goodsIdArr[index] = 0;
			}
			goodsNameArr[index] = rs.getString("goodsname");
			if(rs.wasNull()) {
				goodsNameArr[index] = "";
			}
			goodsPriceArr[index] = rs.getInt("goodsprice");
			if(rs.wasNull()) {
				goodsPriceArr[index] = 0;
			}
			goodsStockArr[index] = rs.getInt("goodsstock");
			if(rs.wasNull()) {
				goodsIdArr[index] = 0;
			}
			
			index++;
		}
		
//		while(rs.next()) {
//			System.out.print("상품이름: " + rs.getString(1) + "  ");
//			System.out.print("상품가격: " + rs.getInt(2) + "  ");
//			System.out.println("재고수량: " + rs.getInt(3));
//		}
//		
//		rs.close();
		
	}
	public static void printGoods() throws Exception {
		for(int i = 0; i < 20; i++) {
			System.out.println(goodsIdArr[i] + ", " + goodsNameArr[i] + ", " + goodsPriceArr[i] + ", " + goodsStockArr[i]);
		}
	}
}