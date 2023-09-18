package team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GoodsList {
	
	Connection con;
	
	int goodsIdArr[] = new int[20];
	String goodsNameArr[] = new String[20];
	int goodsPriceArr[] = new int[20];
	int goodsStockArr[] = new int[20];
	
	public GoodsList() {
		String DB_URL 
		= "jdbc:oracle:thin:@192.168.0.126:1521:xe";
		String USER = "teamora";
		String PASS = "1234";
		
		//Connection conn = null;
		Statement stmt = null;	
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = con.createStatement();
//			queryGoods(stmt, rs);
		} catch (SQLException e) {
			
		}
	}
	
	void getgoods() throws Exception {
		String query = "select goodsid, goodsname, goodsprice\r\n"
				+ "from goods\r\n"
				+ "where goodsname is not null";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		int index = 0;
		while(rs.next()) {
			goodsIdArr[index] = rs.getInt(1);
			goodsNameArr[index] = rs.getString(2);
			goodsPriceArr[index] = rs.getInt(3);
			goodsStockArr[index] = rs.getInt(4);
			
			index++;
		}
		con.close();
	}
	void printGoods() throws Exception {
		for(int i = 0; i < 20; i++) {
			System.out.println(goodsIdArr[i] + ". 상품명: " + goodsNameArr[i] + ", 금액: " + goodsPriceArr[i]);
		}
	}

}
	