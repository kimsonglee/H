<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글쓰기 게시판</title>

</head>
<body>
	<h3>글쓰기 게시판</h3>
	<hr>
	<form action="/TomTest/healing/control?action=updateBoard&b_no=${hboard.b_no }" name="editBoard"
		method="post">

		<table>
			<tr>
				<td rowspan="3">content<br> <textarea rows="10" cols="10"
						name="contents">${hboard.b_contents }</textarea></td>
				<td>image <input type="file" value="추가" name="img">${hboard.b_img }</td>
			</tr>
			<tr>
				<td>hash <input type="text" name="hash">${hboard.b_hash }</td>
			</tr>
			<tr>
				<td><input type="submit" value="수정하기"></td>
			</tr>
















		</table>
	</form>
	<input type="button" value="돌아가기" onclick="b_move()">
</body>
</html>