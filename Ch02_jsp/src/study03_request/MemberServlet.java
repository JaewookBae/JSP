package study03_request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/study03/Member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		PrintWriter out = response.getWriter();
		out.println("<html><body>");

		Enumeration<String> enu = request.getParameterNames();
		while (enu.hasMoreElements()) {
			String name = enu.nextElement(); // name
			String value = request.getParameter(name);// value:name에 들어 있는 값
			out.print(name + " : " + value + "<br>");
		}
		String action2 = request.getParameter("action2");
		out.println("action2: " + action2);
		out.println("</body></html>");
	}

}
