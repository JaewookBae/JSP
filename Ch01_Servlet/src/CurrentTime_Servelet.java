

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Web.xml 방식으로 동작시키기
//@WebServlet("/current")
public class CurrentTime_Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		System.out.println(hour+"시(Java)");
		//out.println(hour+"시(jsp)"+"<br>");
		PrintWriter out = response.getWriter();
		out.write("<html><head><title>CurrentTime(Servlet)</title></head> ");
		out.write("<body><h3>Servlet::현재시간? <br>");
		out.write(hour+"시"+minute+"분"+second+"초입니다.");
		out.write("<h3></body></html>");
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
