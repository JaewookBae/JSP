package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Create/Read/Update/Delete
public class CRUDTest {

	Connection con;
	Statement stmt;
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
			con = DriverManager.getConnection(url, "java", "java");
			System.out.println("Connection Success!");
		} catch (SQLException e) {
			System.out.println("주소 및 id&pw가 다릅니다.");
		}
	}

	public void insert() {
		try {
			stmt = con.createStatement();
			String sql = "insert into member1 values('aaa', 'bbb', '홍길동', 22,'서울시', 'a@a.com')";
			int count = stmt.executeUpdate(sql);
			if (count > 0)
				System.out.println("Insert Success!");
			else
				System.out.println("Insert Fail!");
		} catch (SQLException e1) {
			System.out.println("Insert Fail!");
		}
		try {
			con.close();
			stmt.close();
		} catch (SQLException e) {

		}
	}

	public void select() {
		try {
			stmt = con.createStatement();
			String sql = "select * from member1";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next())
				System.out.println("아이디 : " + rs.getString(1) + ", 비밀번호 : " + rs.getString(2) + ", 이름 : "
						+ rs.getString("name") + ", 나이 : " + rs.getString("age") + ", 주소 : " + rs.getString(5)
						+ ", 이메일 : " + rs.getString(6));
		} catch (SQLException e) {

		} finally {
			try {
				stmt.close();
				con.close();
			} catch (SQLException e) {

			}
		}

	}

	public void update() {
		try {
			stmt = con.createStatement();
			String sql = "update member1 set address = '부산시' where id = 'aaa'";
			int count = stmt.executeUpdate(sql);
			if (count > 0)
				System.out.println("Update Success!");
			else
				System.out.println("Update Fail!");
		} catch (SQLException e1) {
			System.out.println("Update Fail!");
		}
		try {
			con.close();
			stmt.close();
		} catch (SQLException e) {

		}
	}

	public void delete() {

		try {
			stmt = con.createStatement();
			String sql = "delete member1 where id = 'aaa'";
			int count = stmt.executeUpdate(sql);
			if (count > 0)
				System.out.println("Delete Success!");
			else
				System.out.println("Delete Fail!");
		} catch (SQLException e1) {
			System.out.println("Delete Fail!");
		}
		try {
			con.close();
			stmt.close();
		} catch (SQLException e) {

		}
	}

	public static void main(String[] args) {

		CRUDTest ct = new CRUDTest();
		ct.connect();
		ct.insert();

		System.out.println("Insert 수행 후");
		ct.connect();
		ct.select();

		ct.connect();
		ct.update();

		System.out.println("Update 수행 후");
		ct.connect();
		ct.select();

		ct.connect();
		ct.delete();

		System.out.println("Delete 수행 후");
		ct.connect();
		ct.select();
	}
}
