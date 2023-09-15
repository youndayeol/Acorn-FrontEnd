package team;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AdminMenu {
	private static String DB_URL = "jdbc:oracle:thin:@192.168.0.126:1521:xe";
	private static String USER = "teamora";
	private static String PASS = "1234";
	private static String QUERY = "SELECT goodsid, goodsname, goodsprice, stockquantity FROM goods WHERE goodsname IS NOT NULL";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			stmt = conn.createStatement();
			Scanner scanner = new Scanner(System.in);

			while (true) {
				System.out.println("메뉴를 선택하세요:");
				System.out.println("1. 상품 조회");
				System.out.println("2. 재고 추가/제거");
				System.out.println("3. 종료");
				System.out.print("선택: ");
				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
					queryGoods(stmt, rs);
					break;
				case 2:
					while (true) {
						System.out.print("상품번호를 입력하세요 (0 입력 시 종료): ");
						int goodsId = scanner.nextInt();
						if (goodsId == 0) {
							break;
						}
						System.out.print("조절할 재고 수량을 입력하세요 (음수 값으로 빼기 가능): ");
						int stockToAdjust = scanner.nextInt();
						updateStockQuantity(stmt, goodsId, stockToAdjust);
						queryGoods(stmt, rs);
					}
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못된 선택입니다. 다시 선택하세요.");
				}
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

	public static void queryGoods(Statement stmt, ResultSet rs) throws SQLException {
		rs = stmt.executeQuery(QUERY);

		while (rs.next()) {
			int goodsId = rs.getInt("goodsid");
			String goodsName = rs.getString("goodsname");
			int goodsPrice = rs.getInt("goodsprice");
			int stockQuantity = rs.getInt("stockquantity");

			String result = "상품번호: " + goodsId + " 상품이름: " + goodsName + " 상품가격: " + goodsPrice + " 재고수량: " + stockQuantity;

			System.out.println(result);
		}
	}

	public static void updateStockQuantity(Statement stmt, int goodsId, int stockToAdjust) throws SQLException {
		String updateQuery = "UPDATE goods SET stockquantity = stockquantity + " + stockToAdjust + " WHERE goodsid = " + goodsId;

		int rowsUpdated = stmt.executeUpdate(updateQuery);

		if (rowsUpdated > 0) {
			System.out.println("상품번호 " + goodsId + "의 재고수량이 업데이트되었습니다.");
		} else {
			System.out.println("상품번호 " + goodsId + "을(를) 찾을 수 없거나 업데이트에 실패했습니다.");
		}
	}

}