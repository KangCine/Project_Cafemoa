<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>UPDATE</h1>

	<form action="noticeboardupdateres.do" method="post">
	<input type="hidden" name="notice_board_seq" value="${noticeBoardVO.notice_board_seq }" />
		<table border="1">
			<tr>
				<th>작성자</th>
				<td>${noticeBoardVO.notice_board_member_id }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="notice_board_title" value="${noticeBoardVO.notice_board_title }"/></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="10" cols="60" name="notice_board_content">${noticeBoardVO.notice_board_content }</textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="수정" />
					<input type="button" value="취소" onclick="location.href='noticeboardselectone.do?notice_board_seq=${noticeBoardVO.notice_board_seq}'" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>