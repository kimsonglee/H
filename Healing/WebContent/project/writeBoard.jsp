<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글쓰기 게시판</title>
<script type="text/javascript">
function b_move(){
	
	location.href='control?action=board';
}


</script>
</head>
<body>
	<h3>글쓰기 게시판</h3>
	<hr>
	<form action="/TomTest/healing/control?action=insert" name="writeBoard"
		method="post">

		<table>
			<tr>
				<td rowspan="3">content<br> <textarea rows="10" cols="10"
						name="contents"></textarea></td>
				<td>image <input type="file" value="추가" name="img"></td>
			</tr>
			<tr>
				<td>hash <input type="text" name="hash"></td>
			</tr>
			<tr>
				<td><input type="submit" value="글올리기"></td>
			</tr>
















		</table>
	</form>
	<input type="button" value="돌아가기" onclick="b_move()">
</body>
</html>