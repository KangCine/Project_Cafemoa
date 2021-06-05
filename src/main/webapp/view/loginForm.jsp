<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style>
body{
	width: 100%;
	displqy: flex;
	align-items: center;
}
.login {
	width: 400px;
	height: 50px;
}
label {
	position: relative;
	padding: 10px;
	display: flex;
	width: 100%;
	cursor: text;
}
input {
	width: 390px;
}
.userid {
	width: 400px;
	border: 1px solid;
}
.password {
	width: 400px;
	border: 1px solid;
}
</style>
</head>
<body>
	<h1>Login page</h1>
	<form action="../login.do" method="post">
		<div class="userid">
			<label for="userid">아이디</label>
			<input type="text" id="userid" name="userid"> 
		</div>
		<div class="password">
			<label for="password">비밀번호</label>
			<input type="password" id="password" name="password"> 
		</div>
		<button class="login" type="submit">Log in</button>
	</form>

</body>
</html>