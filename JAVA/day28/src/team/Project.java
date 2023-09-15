package team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Project {
	private static String DB_URL = "jdbc:oracle:thin:@192.168.0.126:1521:xe"; // 가져올ip:포트번호:xe
	private static String USER = "teamora"; // 아이디
	private static String PASS = "1234"; // 패스워드
	private static String USERLOGIN = "SELECT usernumber,userid,userpassword,username\r\n"
			+ "FROM userinfo\r\n"
			+ "WHERE usernumber is not null";
	private static String ADMINLOGIN = "SELECT adminnumber,adminid,adminpassword,adminname "
			+ "FROM admininfo"
			+ "WHERE adminnumber is not null";
	// private static String QUERY1 = "SELECT goodsid"
	// + "FROM goods";

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;  //DB와 연결된 객체
		Statement stmt = null;  //SQL문을 담는 객체
		ResultSet rs = null;  //SQL문 결과를 담는 객체

		try {
			// 연결 설정
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// 구문객체 생성
			stmt = conn.createStatement();

			System.out.println("로그인 환경을 선택해주세요.");
			System.out.println("1. 사용자 로그인");
			System.out.println("2. 관리자 로그인");
			System.out.print("입력 >>> ");
			int loginNum = sc.nextInt();

			if (loginNum == 1) {
				int userId;
				System.out.println("사용자 로그인 화면입니다.");
				System.out.println("유저number를 입력 해주세요.");
				System.out.print("입력 >>> ");
				userId = sc.nextInt(); //변수를 쓸거면 prepare statement를 썻어야한다.

				//rs = stmt.executeQuery(USERLOGIN);
				String LOGINSQL = "SELECT usernumber FROM userinfo WHERE usernumber = '" + userId + "'";
				rs = stmt.executeQuery(LOGINSQL);

				while(rs.next()) {
					//String LOGINSQL = "SELECT usernumber FROM userinfo WHERE usernumber = userId";
					//ResultSet idData = stmt.executeQuery(LOGINSQL);

					//String idData = stmt.executeQuery("SELECT usernumber FROM userinfo WHERE usernumber = userId");
					if (userId == rs.getInt(1)) {
						// 주문가능상품 호출 부분();
						CanOrderGoodsTest gt = new CanOrderGoodsTest();
						gt.getgoods();
						gt.printGoods();
						break;
					}	
				}

			} else if (loginNum == 2) {
				int adminId;
				System.out.println("관리자 로그인 화면입니다.");
				System.out.println("관리자number를 입력 해주세요.");
				System.out.print("입력 >>> ");
				adminId = sc.nextInt();
				
				String LOGINSQL = "SELECT adminnumber FROM admininfo WHERE adminnumber = '" + adminId + "'";
				rs = stmt.executeQuery(LOGINSQL);
				
				while(rs.next()) {
					if(adminId == rs.getInt(1)) {
					
					//adminmebu 호출부분
					
					}
				}

			} else if (loginNum >= 3) {
				System.out.println("번호를 잘못 입력하셨습니다.");
				System.out.println("종료됩니다.");
			} 
			
//			queryUserLogin(stmt, rs);//유저 모든 정보 출력
			// queryAdminLogin(stmt, rs);//관리자 로그인
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("=====시스템 종료=====");
		//주문선택 호출
		sc.close();
	}

	public static void queryUserLogin(Statement stmt, ResultSet rs) throws SQLException {
		// 질의 수행
		rs = stmt.executeQuery(USERLOGIN);
		while (rs.next()) {
			System.out.println("유저Num: " + rs.getInt("usernumber"));
			System.out.println("유저id: " + rs.getString("userid"));
			System.out.println("유저pw: " + rs.getString("userpassword"));
			System.out.println("유저name: " + rs.getString("username"));
		}
		rs.close();
	} 

	public static void queryAdminLogin(Statement stmt, ResultSet rs) throws SQLException {
		// 질의 수행
		rs = stmt.executeQuery(ADMINLOGIN);
		while (rs.next()) {
			System.out.print("Num: " + rs.getInt("adminnumber"));
			System.out.print("id: " + rs.getString("adminid"));
			System.out.print("pw: " + rs.getString("adminpassword"));
			System.out.println("name: " + rs.getString("adminname"));
		}
		rs.close();
	}
}
