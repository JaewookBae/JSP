<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>계산기</h2>
<form action="calc" method="post" name="f1">
<input type="text" name="num1" width="12" size="10">
	<select name="operator">
	 	<option selected>+</option>
	 	<option >-</option>
	 	<option >*</option>
	 	<option >/</option>
	
	</select>
<input type="text" name="num2" width="12" size="10">
<input type="submit" value="계산" >
<input type="reset" value="다시입력">
</form>
</body>
</html>