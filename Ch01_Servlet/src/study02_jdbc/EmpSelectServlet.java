package study02_jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/study02/EmpSelect")
public class EmpSelectServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "scott");
			stmt = conn.createStatement();
			String sql = "select empno,ename,sal,deptno from emp";
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String empno = rs.getString("empno");
				String ename = rs.getString(2);
				String sal = rs.getString("sal");
//				int sal = rs.getInt("sal");				
				String deptno = rs.getString("deptno");
				out.println(empno + "\t" + ename + "\t" + sal + "\t" + deptno + "<br>");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("driver가 없습니다.");
		} catch (SQLException e) {
			System.out.println("SQL에 문제가 있습니다.");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {

			}
		}
		out.println("</body></html>");
	}// end doPost

}// end class
