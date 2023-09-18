package team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderableTest {
	//주문가능상품보기
	Connection con;

	int goodsCodeArr[] = new int[16];
	String goodsNameArr[] = new String[16];
	int goodsPriceArr[] = new int[16];
	int rawmatArr[] = new int[16];

	public OrderableTest() {
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
		String query = "select goodsCode, goodsname, goodsprice\r\n"
				+ "from goods\r\n"
				+ "where goodsname is not null";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);

		String query2 = "select rawmatstock_quantity\r\n"
				+ "from rawmaterial\r\n"
				+ "where rawmatstock_quantity is not null";
		Statement stmt2 = con.createStatement();
		ResultSet rs2 = stmt2.executeQuery(query2);

		int index = 0;
		while(rs.next() && rs2.next()) {
			goodsCodeArr[index] = rs.getInt(1);
			goodsNameArr[index] = rs.getString(2);
			goodsPriceArr[index] = rs.getInt(3);
			rawmatArr[index] = rs2.getInt(1);

			index++;
		}
		con.close();
	}

	void OrderableGoods() throws Exception { 
		//주문가능상품목록
		if(rawmatArr[0] > 0 && rawmatArr[1] > 0) {
			System.out.println(goodsCodeArr[0] + ". 상품명: " + goodsNameArr[0] + ", 금액: " + goodsPriceArr[0]);
			System.out.println(goodsCodeArr[1] + ". 상품명: " + goodsNameArr[1] + ", 금액: " + goodsPriceArr[1]);
		}
		if(rawmatArr[0] > 0 && rawmatArr[1] > 0 && rawmatArr[2] > 0) {
			System.out.println(goodsCodeArr[2] + ". 상품명: " + goodsNameArr[2] + ", 금액: " + goodsPriceArr[2]);
		}
		if(rawmatArr[0] > 0 && rawmatArr[1] > 0 && rawmatArr[3] > 0) {
			System.out.println(goodsCodeArr[3] + ". 상품명: " + goodsNameArr[3] + ", 금액: " + goodsPriceArr[3]);
		}
		if(rawmatArr[0] > 0 && rawmatArr[1] > 0 && rawmatArr[4] > 0) {
			System.out.println(goodsCodeArr[4] + ". 상품명: " + goodsNameArr[4] + ", 금액: " + goodsPriceArr[4]);
		}
		if(rawmatArr[0] > 0 && rawmatArr[1] > 0 && rawmatArr[5] > 0) {
			System.out.println(goodsCodeArr[5] + ". 상품명: " + goodsNameArr[5] + ", 금액: " + goodsPriceArr[5]);
		}
		if(rawmatArr[0] > 0 && rawmatArr[6] > 0) {
			System.out.println(goodsCodeArr[6] + ". 상품명: " + goodsNameArr[6] + ", 금액: " + goodsPriceArr[6]);
		}
		if(rawmatArr[0] > 0 && rawmatArr[11] > 0) {
			System.out.println(goodsCodeArr[7] + ". 상품명: " + goodsNameArr[7] + ", 금액: " + goodsPriceArr[7]);
		}
		if(rawmatArr[0] > 0 && rawmatArr[7] > 0) {
			System.out.println(goodsCodeArr[8] + ". 상품명: " + goodsNameArr[8] + ", 금액: " + goodsPriceArr[8]);
		}
		if(rawmatArr[0] > 0 && rawmatArr[8] > 0 && rawmatArr[9] > 0) {
			System.out.println(goodsCodeArr[9] + ". 상품명: " + goodsNameArr[9] + ", 금액: " + goodsPriceArr[9]);
		}
		if(rawmatArr[0] > 0) {
			System.out.println(goodsCodeArr[10] + ". 상품명: " + goodsNameArr[10] + ", 금액: " + goodsPriceArr[10]);
		}
		if(rawmatArr[10] > 0) {
			System.out.println(goodsCodeArr[11] + ". 상품명: " + goodsNameArr[11] + ", 금액: " + goodsPriceArr[11]);
		}
		if(rawmatArr[15] > 0) {
			System.out.println(goodsCodeArr[12] + ". 상품명: " + goodsNameArr[12] + ", 금액: " + goodsPriceArr[12]);
		}
		if(rawmatArr[12] > 0) {
			System.out.println(goodsCodeArr[13] + ". 상품명: " + goodsNameArr[13] + ", 금액: " + goodsPriceArr[13]);
		}
		if(rawmatArr[13] > 0) {
			System.out.println(goodsCodeArr[14] + ". 상품명: " + goodsNameArr[14] + ", 금액: " + goodsPriceArr[14]);
		}
		if(rawmatArr[14] > 0) {
			System.out.println(goodsCodeArr[15] + ". 상품명: " + goodsNameArr[15] + ", 금액: " + goodsPriceArr[15]);
		}

	}

}
