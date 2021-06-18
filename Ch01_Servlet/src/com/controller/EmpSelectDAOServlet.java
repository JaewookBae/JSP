package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.EmpDAO;
import com.dto.EmpDTO;

@WebServlet("/EmpSelectDAO")
public class EmpSelectDAOServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");

//		ArrayList 내용 출력하기
		EmpDAO dao = new EmpDAO();
		ArrayList<EmpDTO> list = dao.select();
		for (EmpDTO dto : list) {
			String empno = dto.getEmpno();
			String ename = dto.getEname();
			int sal = dto.getSal();
			String deptno = dto.getDeptno();

			out.println(empno + "\t" + ename + "\t" + sal + "\t" + deptno + "<br>");
			out.println("</body></html>");
		}
	}

}
