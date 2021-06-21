package study02_request;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SportServlet
 */
@WebServlet("/study02/Sport")
public class SportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");

		String[] sports = request.getParameterValues("sports");
		String gender = request.getParameter("gender");

		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		if (sports == null) {
			out.println("선택한 항목이 없습니다.");
		} else {
			out.println("좋아하는 운동:");
			for (String s : sports) {
				out.print("[" + s + "] ");
			}
		}
		out.println("<br>" + "성별: " + gender);
		out.println("</body></html>");

	}

}
