<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
function wb_move(){
	location.href='control?action=writeBoard';
}
function timeline(){
	location.href='control?action=timeline_select';
}
</script>
</head>
<body>
	<center></center>
	<h3>익명게시판</h3>
	<hr>
	
		<input type="button" value="Top Line"> <input type="button"
			value="Time Line" onclick="timeline()">
	
	<table>

		<tr>

			<c:forEach items="${list }" var="list">

				<td align="center" background="/TomTest/healingimg/${list.b_img}"
					width="200" height="300"><a
					href="/TomTest/healing/control?action=sb_select&b_no=${list.b_no }"><br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>${list.b_contents }<br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br>
					<br></a>
					<button>조회수</button>
					<button>댓글수</button>
					<button>좋아요</button></td>

			</c:forEach>
		</tr>



	</table>
	<form action="control?action=h_search" method="post">
	<input type="text" name="search"><input type="submit" value="검색"> 
	</form>
	<input type="button" value="글쓰기버튼" onclick="wb_move()">
	</center>
</body>
</html>