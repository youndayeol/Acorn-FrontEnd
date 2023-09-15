package team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Goods {
	
	
	private static String DB_URL 
	= "jdbc:oracle:thin:@192.168.0.126:1521:xe";
	private static String USER = "teamora";
	private static String PASS = "1234";
	private static String QUERY = "select goodsid, goodsname, goodsprice, stockquantity\r\n"
			+ "from goods\r\n"
			+ "where goodsname is not null";


	public static void main(String[] args) {
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
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void queryGoods(
			Statement stmt, ResultSet rs) throws SQLException {
		// 질의 수행
		// Statement: true/false = execute,  
		// 갯수 = excuteUpdate(insert/update/delete)
		// , 행의집합 = executeQuery()
		rs = stmt.executeQuery(QUERY);
		while(rs.next()) {
			System.out.print("상품번호: " + rs.getInt(1) + "  ");
			System.out.print("상품이름: " + rs.getString(2) + "  ");
			System.out.print("상품가격: " + rs.getInt(3) + "  ");
			System.out.println("재고수량: " + rs.getInt(4));
		}
		
		
		
		rs.close();
		
	}

	

}



