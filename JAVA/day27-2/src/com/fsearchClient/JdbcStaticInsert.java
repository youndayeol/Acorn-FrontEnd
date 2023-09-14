package com.fsearchClient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStaticInsert {
	private static String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String USER = "ydy123";
	private static String PASS = "ydy123";
	
	public static void main(String[] args) {
		// 데이터베이스 객체
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 연결 설정
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// 구문객체 생성
			stmt = conn.createStatement();
			// 재고 정보 테이블에 행 입력 
			// UPDATE 테이블명 SET 컬럼명=값,... WHERE 컬럼명=값
			// DELETE FROM 테이블명 WHERE 컬럼=값
			String sqlInsert = "INSERT INTO stockInfo(rawmaterialcode, rawmaterialqty) "
					+ "Values('123459', 100)";
			String sqlSelect = "SELECT rawmaterialcode, rawmaterialqty FROM stockInfo";
			int iRet = stmt.executeUpdate(sqlInsert);  //  입력한 행 수
			if(iRet >= 1) {
				rs = stmt.executeQuery(sqlSelect);
				while(rs.next()) {
					System.out.print(rs.getString(1) + " ");
					System.out.println(rs.getString(2));
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
