<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!		
		//선언문 - 전역변수(메소드 안에서 쓸수있는 변수)
		String str = "나는 (전역) 변수입니다.";
	%>
	
	<%!
		//선언문 - 매소드 선언
		String getStr(){
		return str;
	}
	%>
	
	<%
		String str1 = "나는 (지역)변수입니다.";
	%>
	<br>
	선언문에서 선언한 변수 str는 <%=str%><br>
	선언문에서 선언한 함수 출력은 <%=getStr() %><br>
	scriptlet에서 선언한 변수 str1는 <%=str1%><br>
	
	<hr>
	<%!
	public int multiply(int a, int b){
	int c = a*b;
	return c;
	}
	%>
	10*25=<%=multiply(10, 25) %>
</body>
</html>