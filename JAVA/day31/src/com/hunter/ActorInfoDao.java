package com.hunter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ActorInfoDao {
	private final static String DB_URL =
			"jdbc:oracle:thin:@localhost:1521:xe";
	private final static String USER = "c##study001";
	private final static String PASS = "1234";
	
	public List<HunterTab> getUserInfo() {	
		HunterTab hunterTab				= null;
		List<HunterTab> hunterTabsList 	= null;

		String sql = "SELECT id, health, attackpower,"
				+ "defencepower, cash, speed, x, y,"
				+ "type FROM huntertab";
		
		Connection 	conn 			= null;
		PreparedStatement pstmt 	= null;
		ResultSet 	rs 				= null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			hunterTabsList = new ArrayList<HunterTab>();
			
			while(rs.next()) {
				hunterTab = new HunterTab();

				hunterTab.setId(rs.getInt("id"));
				hunterTab.setHealth(rs.getInt("health"));
				hunterTab.setAttackpower(rs.getInt("attackpower"));
				hunterTab.setDefencepower(rs.getInt("defencepower"));
				hunterTab.setCash(rs.getInt("cash"));
				hunterTab.setSpeed(rs.getInt("speed"));
				hunterTab.setX(rs.getInt("x"));
				hunterTab.setY(rs.getInt("y"));
				hunterTab.setType(rs.getInt("type"));

				hunterTabsList.add(hunterTab);
				hunterTab = null;
			}
			
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return hunterTabsList;
	}
}
