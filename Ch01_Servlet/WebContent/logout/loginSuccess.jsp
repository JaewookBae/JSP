<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인 성공(JSP)::id : <%=session.getAttribute("id") %>
로그인 성공(JSP)::pw : <%=session.getAttribute("pw") %><hr>
로그인 성공(EL)::   ${id }<br>
로그인 성공(EL)::   ${pw }<br>
</body>
</html>