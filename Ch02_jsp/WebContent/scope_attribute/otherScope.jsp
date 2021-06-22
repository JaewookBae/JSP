<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>otherScope</h3>
	pageScope::<%=pageContext.getAttribute("page")%><br>
	requestScope::<%=request.getAttribute("request")%><br>
	sessionScope::<%=session.getAttribute("sess")%><br>
	applicationScope::<%=application.getAttribute("app")%>
</body>
</html>