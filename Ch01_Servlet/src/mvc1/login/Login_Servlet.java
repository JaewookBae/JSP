package mvc1.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login/login")
public class Login_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("passwd");
		
		response.setContentType("text/html;charset=utf-8");
		
		//java 출력
		System.out.println(id+" : "+pass);
		
		//화면출력(web)
		PrintWriter out = response.getWriter();
		out.println("아이디: "+id+"<br>");
		out.println("비밀번호: "+pass+"<br>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
