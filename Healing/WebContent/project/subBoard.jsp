<%@page import="thehealing.time.DTO.HBoard"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function b_move(){
	
	location.href='control?action=board';
}
function b_remove(){
	location.href='control?action=delBoard&b_nick=test&b_no=${hboard.b_no }';
}
</script>

</head>
<body>
<center>
<h3>subBoard</h3>
<hr>
<form action="control?action=editCompare&b_nick=test&b_no=${hboard.b_no }" method="post">
<table>


<tr><td align="center" background="/TomTest/healingimg/${hboard.b_img}" width="200" height="200">${hboard.b_contents }</td><td><textarea rows="15" cols="50" readonly>${hboard.b_hash }</textarea></td></tr>

</table>
<input type="text" name="comment">
<input type="button" value="돌아가기" onclick="b_move()">
<input type="button" value="삭제하기" onclick="b_remove()">
<input type="submit" value="수정하기">
</form>
</center>
</body>
</html>