package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.dto.EmpDTO;

public class EmpDAO {

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";

	// DB 접속
	public EmpDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver가 맞지 않습니다.");
		}

	}

	// select
	public ArrayList<EmpDTO> select() {

		ArrayList<EmpDTO> list = new ArrayList<EmpDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DriverManager.getConnection(url, "scott", "scott");
			String sql = "select empno,ename,sal,deptno from emp"; // dnlcl
			pstmt = conn.prepareStatement(sql); // sql o
			rs = pstmt.executeQuery(sql); // sql x

			while (rs.next()) {
				String empno = rs.getString("empno");
				String ename = rs.getString(2);
//				String sal = rs.getString("sal");
				int sal = rs.getInt("sal");				
				String deptno = rs.getString("deptno");

				EmpDTO dto = new EmpDTO(empno, ename, sal, deptno);
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("SQL에 문제가 있습니다.");
		}
		return list;
	}
}
