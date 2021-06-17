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

@WebServlet("/login/login2")
public class Login2_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("passwd");

		// request.setCharacterEncoding("utf-8");//post방식에서 추가
		response.setContentType("text/html;charset=utf-8");// get방식에서 사용
		// id:java, pass:java
		if (id.equals("java") && pass.equals("java")) {
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			session.setAttribute("pw", pass);
            //상대경로1
			RequestDispatcher d1 = request.getRequestDispatcher("../logout/loginSuccess.jsp");
			//절대경로2
			RequestDispatcher d2 = request.getRequestDispatcher("/logout/loginSuccess.jsp");
			d2.forward(request, response);
		} else {
			System.out.println("아이디나 비밀번호가 일치 하지 않습니다.");
			
			//화면출력1
			PrintWriter out = response.getWriter();
			out.write("아이디나 비밀번호가 일치 하지 않습니다.");
			
			//자바스크립트 
			out.println("<script>");
			out.println("alert('아이디나 비빌번호가 일치하지않습니다.')");
			out.println("history.back()");
			out.println("</script>");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
