<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page buffer="1kb" autoFlush="true" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
autoFlush="false" :: 출력 버퍼가 꽉차면(1kb) 에러 메시지 출력.<br>
<%
for(int i = 0; i <1000; i++)
	out.print(1234);
%>
</body>
</html>