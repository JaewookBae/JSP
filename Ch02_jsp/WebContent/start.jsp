<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
 String bookTitle = "Jsp 프로그래밍";
 String name ="홍길동";
 
 //java 출력
 System.out.println(name+"<br>");
 //jsp 출력
 out.println(name+"<br>");	
%>
<b><%=bookTitle %></b><%=name %>입니다.
</body>
</html>