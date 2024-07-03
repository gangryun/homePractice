<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script type="text/javascript" src="./js/user.js"></script>
</head>
<body>

	<div class="container" style="margin-top: 150px;">
		<div>
			<input type="radio" name="type" value="N" onclick="checkRadio('N')" checked="checked">
			<span>이름으로 찾기</span>
			
			<table class="table" style="width: 400px;" id="nameTable">
				<tr>
					<td>이름</td>
					<td>
						<input type="text" name="userName" id="userName">
					</td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td>
						<input type="text" name="phone" id="phone">
						
					</td>
				</tr>
			</table>
		</div>
		<hr>
		<div>
			<input type="radio" name="type" value="E" onclick="checkRadio('E')">
			<span>이메일로 찾기</span>
			
			<table class="table" style="width: 400px;" id="emailTable">	
				<tr>
					<td>이메일</td>
					<td>
						<input type="text" name="email" id="email">
						
					</td>
				</tr>
			</table>
			<button onclick="findId()">찾기</button>
			<button onclick="location.href='./loginIntro.do'">로그인페이지</button>
		</div>
		
		<div>
			<p id="id" style="color: blue;"></p>
		</div>
		
	</div>

</body>
</html>