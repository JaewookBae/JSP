package mvc2.loginSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login/logininSession")
public class logininSession_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("passwd");
		
		request.setCharacterEncoding("utf-8");//post방식에서 추가
		response.setContentType("text/html;charset=utf-8");//get방식에서 사용
		
		HttpSession session = request.getSession();
		session.setAttribute("id", id);
		//http://localhost:8080/Ch01_Servlet/login/logininSession
		RequestDispatcher d = request.getRequestDispatcher("../menu.jsp");//상대경로
		d.forward(request, response);
		
//		PrintWriter out = response.getWriter();
//		out.println("아이디: "+id+"<br>");
//		out.println("비밀번호: "+pass+"<br>");
	}	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
