<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>DETAIL</h1>

	<table border="1">
		<tr>
			<th>작성자</th>
			<td>${noticeBoardVO.notice_board_member_id }</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${noticeBoardVO.notice_board_title }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="10" cols="60" readonly="readonly">${noticeBoardVO.notice_board_content }</textarea></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
				<input type="button" value="수정" onclick="location.href='noticeboardupdateform.do?notice_board_seq=${noticeBoardVO.notice_board_seq}'" />
				<input type="button" value="삭제" onclick="location.href='noticeboarddelete.do?notice_board_seq=${noticeBoardVO.notice_board_seq}'" />
				<input type="button" value="목록" onclick="location.href='noticeselectlist.do'" />
			</td>
		</tr>
	</table>
</body>
</html>