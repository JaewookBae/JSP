<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4>Forward</h4>
<img src="forward.png">
<h4>SendRedirect</h4>
<img src="sendredirect.png">
<hr>
name(Jsp):<%=request.getParameter("name") %> <br>
name(EL):${param.name}<br>
</body>
</html>