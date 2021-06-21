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
	pageContext.setAttribute("page", "p1");
	request.setAttribute("request", "req1");
	session.setAttribute("sess", "session1");
	application.setAttribute("app", "application1");
	%>


	pageScope::<%=pageContext.getAttribute("page")%><br>
	requestScope::<%=request.getAttribute("request")%><br>
	sessionScope::<%=session.getAttribute("sess")%><br>
	applicationScope::<%=application.getAttribute("app")%>
	<hr>
	pageScope::${pageScope.page}<br>
	requestScope::${requestScope.request}<br>
	sessionScope::${sessionScope.sess}<br>
	applicationScope::${applicationScope.app}
	<hr>
	<jsp:forward page="otherScope.jsp"></jsp:forward>
</body>
</html>