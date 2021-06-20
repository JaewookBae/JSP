<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="viewParameter.jsp" method="post">
	이름 : <input type="text" name="name" id="name"><br>
	주소 : <input type="text" name="address" id="address"><br>
	좋아하는 동물 : <input type="checkbox" name="pet" id="cat">고양이 &nbsp;&nbsp;
	좋아하는 동물 : <input type="checkbox" name="pet" id="dog">강아지&nbsp;&nbsp;
	좋아하는 동물 : <input type="checkbox" name="pet" id="pig">돼지<br> 
<input type="submit" id="전송">

</form>
</body>
</html>