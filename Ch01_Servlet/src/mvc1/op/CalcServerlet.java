package mvc1.op;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/study01/calc")
public class CalcServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1,num2, result;
		String op;
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter p = response.getWriter();
		
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		op = request.getParameter("operator");
		
		result = calc(num1,num2,op);
		
		p.println("<html><head><title>계산기</title></head><body><h2>계산결과</h2><hr>");
		p.println(num1+op+num2+" = "+result);
	}
	
	//사칙연산 메소드
	public int calc(int num1, int num2, String op){
		int result = 0;
		if(op.equals("+"))
			result = num1+num2;
		else if(op.equals("-"))
			result = num1-num2;
		else if(op.equals("/"))
			result = num1/num2;
		else if(op.equals("*"))
			result = num1*num2;
		return result;
		
	}

}
