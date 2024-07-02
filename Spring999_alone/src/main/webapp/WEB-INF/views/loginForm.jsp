<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>login</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container" style="margin-top: 200px; width: 500px; height: 350px; text-align: center;">
	<form action="./login.do" method="post">
		<table class="table table-striped">
			<tr>
				<td>아이디</td>
				<td>
					<input class="form-control" type="text" name="id" id="id" placeholder="아이디">
				</td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td>
					<input class="form-control" type="password" name="password" id="password" placeholder="비밀번호">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input class="btn btn-success" type="submit" value="로그인">
					<button class="btn btn-info" type="button" onclick="location.href='./registUser.do'">회원가입</button>
					<button class="btn btn-danger" type="button" onclick="findUserId()">아이디찾기</button>
				</td>
			</tr>
		</table>
	</form>
</div>
</body>
</html>