<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	입력한 id가 "admin"이 맞으면, redirect: index.jsp 찾아가기
	<br> 파라미터로 name = hong 전달하기
	<%
	String id = request.getParameter("memberid");
if (id != null && id.equals("admin")) {
	response.sendRedirect("index.jsp?name=hong");
} else {
	out.println("잘못된 ID입니다.");
}
%>

</body>
</html>