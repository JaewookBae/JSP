<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP::현재시간</title>
</head>
<body>
<%
Calendar c = Calendar.getInstance();
int hour = c.get(Calendar.HOUR_OF_DAY);
int minute = c.get(Calendar.MINUTE);
int second = c.get(Calendar.SECOND);

System.out.println(hour+"시(Java)");

//Servelet : JspWriter
// Jsp     : out

out.println(hour+"시(jsp)"+"<br>");

%>
현재시간은 <%=hour %>시 <%=minute %>분 <%=second %>초 입니다.

</body>
</html>