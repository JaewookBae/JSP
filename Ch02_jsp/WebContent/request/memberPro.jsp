<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<% 
request.setCharacterEncoding("utf-8");
%>

	<%
	String sno = request.getParameter("sno");
	String name = request.getParameter("name");
	String grade = request.getParameter("grade");
	String subject = request.getParameter("subject");

	out.println(sno+" : "+name+" : "+grade+" : "+subject);
	%><br>
	
	학번(Jsp):<%=sno %><br>
	이름(EL): ${param.name }<br>
	학년(EL): ${param.grade }<br>
	과목(Jsp): <%= subject %>
	<hr>
	
	요청 URI : <%=request.getRequestURI() %><br>
	context path : <%=request.getContextPath() %><br>
	서버이름 : <%=request.getServerName() %>
	포트번호 : <%=request.getServerPort() %>
		
	