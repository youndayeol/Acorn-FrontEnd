package com.fsearchClient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDynamicInsert2 {
	private static String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String USER = "ydy123";
	private static String PASS = "ydy123";
	
	public static void main(String[] args) {
		// 데이터베이스 객체
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 연결 설정
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// 구문객체 생성
			String sqlInsert = "INSERT INTO stockInfo(rawmaterialcode, rawmaterialqty) "
					+ "Values(?, ?)";
			String rawmatcode = "123556";
			int qty = 200;
			pstmt = conn.prepareStatement(sqlInsert);
			pstmt.setString(1, rawmatcode);
			pstmt.setInt(2, qty);
			int iRet = pstmt.executeUpdate();
			
			String sqlSelect = "SELECT rawmaterialcode, rawmaterialqty "
					 + "FROM stockInfo WHERE rawmaterialcode = ?";
			
			if(iRet >= 1) {
				pstmt = conn.prepareStatement(sqlSelect);
				pstmt.setString(1,  rawmatcode);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getString(1) + " ");
					System.out.println(rs.getString(2));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
