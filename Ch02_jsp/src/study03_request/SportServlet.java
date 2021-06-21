package study03_request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/study03/Sport") ==web.xml로 할땐 주석처리

public class SportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String[] sports = request.getParameterValues("sports");
		String gender = request.getParameter("gender");

		PrintWriter out = response.getWriter();

		out.println("<html><body>");

		for (String s : sports)
			out.println("좋아하는 운동:" + "[" + s + "] ");
		out.println("<br>" + "성별: " + gender);
		out.println("</body></html>");

	}

}
