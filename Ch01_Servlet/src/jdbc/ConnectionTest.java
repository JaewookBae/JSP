package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 1. DB연결하기
public class ConnectionTest {

	// static 초기화 블럭 - main 메소드가 실행될 때 가장 먼저 실행
	static {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("ojdbc6_g.jar가 해당 위치에 없습니다.");
		}
	}

	public void connect() {
	
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";//
			Connection conn = DriverManager.getConnection(url, "java", "java");
			System.out.println("Connection Success!");
		} catch (SQLException e) {
			System.out.println("주소 및 id&pw가 다릅니다.");
		}
	}

	public static void main(String[] args) {

		ConnectionTest ct = new ConnectionTest();
		ct.connect();

	}
}
