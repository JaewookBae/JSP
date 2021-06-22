<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getParameterNames 실습</title>
</head>
<body>
<h2>getParameterValues 실습</h2>
<form action="Member" method="get">
<fieldset>
제목: <input type="text" name="subject" id="subject" ><br>
작성자: <input type="text" name="writer" id="writer"><br>
내용: <textarea class="content" rows=10 cols=30></textarea><br>
<input type="button" id="submit" value="저장">
</fieldset>
</form>
</body>
</html>