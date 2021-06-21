<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<% 
request.setCharacterEncoding("utf-8");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	int result = Integer.parseInt(age);

	if (result >= 20) {
	//out.println(name + "님은 성인입니다." + result + "세는 20세 이상.");
%>
<%=name %>님은 성인입니다.<%= result%>세는 20세 이상.
<%	
	} else {
	//out.println(name + "님은" + result + "세 이므로 미성년 입니다.");
	}
%>
표현식(나이) : <%= age%>
</body>
</html>