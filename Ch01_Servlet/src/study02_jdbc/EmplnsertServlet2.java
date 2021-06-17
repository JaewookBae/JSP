package study02_jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/study02/EmpInsert2")
public class EmplnsertServlet2 extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		String empno = request.getParameter("emp_id");
		String ename = request.getParameter("ename");
		String sal = request.getParameter("salary");
		String deptno = request.getParameter("depart");

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;

		try {

			Class.forName(driver);
			conn = DriverManager.getConnection(url, "scott", "scott");

			String sql = "insert into emp(empno,ename,sal,deptno) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, empno);
			pstmt.setString(2, ename);
			pstmt.setInt(3, Integer.parseInt(sal));
			pstmt.setString(4, deptno);

			int n = pstmt.executeUpdate(); // 변경
			if (n == 1)
				out.println("저장 성공");
			else
				out.println("저장 실패");
		} catch (ClassNotFoundException e) {
			System.out.println("driver가 없습니다.");
		} catch (SQLException e) {
			System.out.println("SQL에 문제가 있습니다.");
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {

			}
		}
		out.println("</body></html>");
	}// end doPost

}// end class
